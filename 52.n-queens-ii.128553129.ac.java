class Solution {
    public int totalNQueens(int n) {
        StringBuilder S = new StringBuilder();
        for(int i = 0; i < n; i++) {
            S.append('?');
        }
        List<String> l = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            l.add(S.toString());
        }
        
        return solveNQueens(l, 0);
    }
    
    public int solveNQueens(List<String> l, int n) {
        if(n >= l.size()) {
            return 1;
        }
        else {
            int sum = 0;
            String s = l.get(n);
            for(int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == '?') {
                    StringBuilder temp = new StringBuilder(s);
                    temp.setCharAt(i, 'Q');
                    List<String> ltemp = new ArrayList<String>(l);
                    ltemp.set(n, temp.toString());
                    regular(ltemp, n, i);
                    sum += solveNQueens(ltemp, n + 1);
                }
            }
            return sum;
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