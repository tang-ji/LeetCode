class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> l = new ArrayList<String>();
        if(n == 0) return l;
        add(l, 0, 0, n, "");
        return l;
    }
    
    public void add(List<String> l, int open, int close, int num, String str) {
        if(str.length() == num * 2) {
            l.add(str);
            return;
        }
        if(open < num) {
            add(l, open+1, close, num, str + "(");
        }
        if(close < open) {
            add(l, open, close+1, num, str + ")");
        }
    }
}