public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int n = n1 + n2;
        int i = 0, j = 0;
        int[] num = new int[n];
        while (i + j < n) {
            while (i < n1 && j < n2) {
                if (nums1[i] <= nums2[j]) num[i + j] = nums1[i++];
                else num[i + j] = nums2[j++];
            }
            if (i == n1) num[i + j] = nums2[j++];
            else num[i + j] = nums1[i++];
        }
        
        if (n % 2 == 1) return num[n / 2];
        else return (double)(num[(n - 1) / 2] + num[(n - 1) / 2 + 1]) / 2;
    }
}