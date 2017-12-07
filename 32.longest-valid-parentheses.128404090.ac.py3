class Solution:
    def longestValidParentheses(self, s):
        left, dp, maxlength = -1, [], 0
        for i in range(len(s)):
            if s[i] == '(':
                dp.append(i)
            else:
                if dp:
                    dp.pop()
                    if dp:
                        maxlength = max(maxlength, i - dp[-1])
                    else:
                        maxlength = max(maxlength, i - left)
                else:
                    left = i
        return maxlength