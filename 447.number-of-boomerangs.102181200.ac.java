import java.util.*;

public class Solution {
    public int numberOfBoomerangs(int[][] points) {
        Map<Integer, Integer> hmap = new HashMap<Integer, Integer>();
        if (points.length < 3) return 0;
        int sum = 0;
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points.length; j++) {
                if (i == j) continue;
                int d = d2(points[i], points[j]);
                hmap.put(d, hmap.getOrDefault(d, 0) + 1);
            }
            for (int k : hmap.values()) {
                sum += k * (k - 1);
            }
            hmap.clear();
        }
        return sum;
    }
    
    public int d2 (int[] p1, int[] p2) {
        return (int)(Math.pow(p1[0] - p2[0], 2) + Math.pow(p1[1] - p2[1], 2));
    }
}