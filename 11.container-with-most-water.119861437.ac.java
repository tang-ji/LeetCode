class Solution {
    public int maxArea(int[] height) {
        int volume = 0;
        int n = height.length;
        int i = 0;
        int j = n - 1;
        while(i != j) {
            volume = Math.max(volume, (j - i) * Math.min(height[j], height[i]));
            if(height[i] > height[j]) j--;
            else i++;
        }
        return volume;
    }
}