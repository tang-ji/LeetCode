class Solution {
    public int countSegments(String s) {
        s.trim();
        String[] S = s.split(" ");
        int n = 0;
        for(String i : S) {
            if(i.length() != 0) n++;
        }
        return n;
    }
}