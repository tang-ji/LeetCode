class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> L = new ArrayList<>();
        StringBuilder S = new StringBuilder();
        for(int i = 0; i < n; i++) {
            S.append('?');
        }
        List<String> l = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            l.add(S.toString());
        }
        solveNQueens(L, l, 0);
        return L;
    }
    
    public void solveNQueens(List<List<String>> L, List<String> l, int n) {
        if(n >= l.size()) {
            L.add(l);
        }
        else {
            String s = l.get(n);
            for(int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == '?') {
                    StringBuilder temp = new StringBuilder(s);
                    temp.setCharAt(i, 'Q');
                    List<String> ltemp = new ArrayList<String>(l);
                    ltemp.set(n, temp.toString());
                    regular(ltemp, n, i);
                    solveNQueens(L, ltemp, n + 1);
                }
            }
        }
    }
    
    private void regular(List<String> l, int n, int i) {
        for(int c = 0; c < l.size(); c++) {
            StringBuilder temp = new StringBuilder(l.get(c));
            for(int k = 0; k < l.size(); k++) {
                if((c == n || k == i || c - n == k - i || n + i == c + k) && temp.charAt(k) == '?') temp.setCharAt(k, '.');
            }
            l.set(c, temp.toString());
        }
    }
    
    private boolean isValid(List<String> l) {
        for(String s : l) {
            for(char c : s.toCharArray()) {
                if(c == '?') return false;
            }
        }
        return true;
    }
}