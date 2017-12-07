class Solution {
    public int largestRectangleArea(int[] heights) {
        if(heights.length == 0) return 0;
        Stack<Integer> h = new Stack<>();
        int max = 0;
        for(int i = 0; i < heights.length; i++) {
            if(i == 0 || heights[i] > heights[h.peek()]) h.add(i);
            else{
                while(true) {
                    int l = h.pop();
                    max = Math.max(max, (i - l) * heights[l]);
                    if(h.empty() || heights[i] > heights[h.peek()]) {
                        heights[l] = heights[i];
                        h.add(l);
                        break;
                    }
                }
            }
        }
        while(!h.empty()) {
            int temp = h.pop();
            max = Math.max(max, (heights.length - temp) * heights[temp]);
        }
        return max;
    }
}