class Solution:
    def search2(self, nums, target, start, end):
        if end < start:
            return -1
        mid = int(start + (end - start) / 2)
        if nums[mid] == target:
            return mid
        if nums[start] < nums[end]:
            if nums[mid] > target:
                return self.search2(nums, target, start, mid - 1)
            else:
                return self.search2(nums, target, mid + 1, end)
            return -1
        else:
            return max(self.search2(nums, target, start, mid - 1), self.search2(nums, target, mid + 1, end))
        
    def search(self, nums, target):
        return self.search2(nums, target, 0, len(nums) - 1)
        