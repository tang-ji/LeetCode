class Solution {
    public int climbStairs(int n) {
        if(n == 1) return 1;
        if(n == 2) return 2;
        int s = 2, p = 1, ret = 0;
        while(n > 2) {
            ret = s + p;
            p = s;
            s = ret;
            n--;
        }
        return ret;
    }
}