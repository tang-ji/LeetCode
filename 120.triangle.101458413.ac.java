public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int min = 0;
        if (triangle.size() == 1) {
            for (int k = 0; k < triangle.get(0).size(); k++) {
                if (k == 0) min = triangle.get(0).get(k);
                else min = Math.min(triangle.get(0).get(k), min);
            }
            return min;
        }
        for (int i = 1; i < triangle.size(); i++) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                if (j == 0) triangle.get(i).set(j, triangle.get(i).get(j) + triangle.get(i - 1).get(j));
                else if (j == triangle.get(i).size() - 1) triangle.get(i).set(j, triangle.get(i).get(j) + triangle.get(i - 1).get(j - 1));
                else triangle.get(i).set(j, triangle.get(i).get(j) + Math.min(triangle.get(i - 1).get(j), triangle.get(i - 1).get(j - 1)));
                if (i == triangle.size() - 1) {
                    if (j == 0) min = triangle.get(i).get(j);
                    else min = Math.min(triangle.get(i).get(j), min);
                }
            }
        }
        return min;
    }
}