class Solution {
    public int trap(int[] height) {
        int n = height.length;
        if(n < 3) return 0;
        int s = 0, hmax = 0, sum = 0;
        for (int i = 0; i < height.length; i++) {
            hmax = Math.max(hmax, height[i]);
            sum += height[i];
        }

        for(int h = 1; h <= hmax; h++) {
            int l = -1, r = -1;
            for(int i = 0; i < n; i++) {
                if(height[i] >= h) {
                    l = i;
                    break;
                }
            }
            for(int j = n - 1; j >= 0; j--) {
                if(height[j] >= h) {
                    r = j;
                    break;
                }
            }
            if(l != -1) s += r - l + 1;
        }
        return s - sum;
    }
}