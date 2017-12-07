class Solution {
    public String minWindow(String s, String t) {
        int[] m = new int[128];
        for(char c : t.toCharArray()) m[c]++;
        int counter = t.length();
        int head = 0, tail = 0, tiny = 0, length = Integer.MAX_VALUE;
        
        while(tail < s.length()) {
            if(m[s.charAt(tail++)]-- > 0) counter--;
            while(counter == 0) {
                if(tail - tiny < length) length = tail - (head = tiny);
                if(m[s.charAt(tiny++)]++ >= 0) counter++;
            }
        }
        
        return length == Integer.MAX_VALUE ? "" : s.substring(head, head + length);
    }
}