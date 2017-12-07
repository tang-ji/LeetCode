//Moore voting algorithms

public class Solution {
    public int majorityElement(int[] nums) {
        int n = 0, ret = 0;
        for (int i : nums) {
            if (n == 0) ret = i;
            if (ret == i) n++;
            else n--;
        }
        return ret;
    }
}