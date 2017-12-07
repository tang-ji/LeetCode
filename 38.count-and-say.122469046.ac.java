class Solution {
    public String countAndSay(int n) {
        if(n == 1) return "1";
        if(n == 2) return "11";
        if(n == 3) return "21";
        if(n == 4) return "1211";
        if(n == 5) return "111221";
        String temp = countAndSay(n - 1);
        int s = 1;
        char c = temp.charAt(0);
        StringBuffer ret = new StringBuffer();
        
        for(int i = 1; i < temp.length(); i++) {
            if(temp.charAt(i) == c) {
                s++;
            }
            else{
                ret.append(s);
                ret.append(c);
                c = temp.charAt(i);
                s = 1;
            }
        }
        ret.append(s);
        ret.append(c);
        
        return ret.toString();
    }
}