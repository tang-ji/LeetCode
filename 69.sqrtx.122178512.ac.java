class Solution {
    public int mySqrt(int x) {
        if(x == 0) return 0;
        
        int l = 1, r = x;
        while(true) {
            int m = l + (r - l) / 2;
            if(m > x / m) r = m - 1;
            else {
                if(m + 1 > x / (m + 1)) return m;
                l = m + 1;
            }
        }
    }
}