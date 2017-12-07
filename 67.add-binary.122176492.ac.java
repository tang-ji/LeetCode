class Solution {
    public String addBinary(String a, String b) {
        if(b.length() > a.length()) {
            String temp = a;
            a = b;
            b = temp;
        }
        
        int i = a.length() - 1, j = b.length() - 1, bit = 0, temp;
        StringBuilder ret = new StringBuilder();
        while(i >= 0) {
            if(j >= 0) temp = (int)a.charAt(i) + b. charAt(j) - '0' * 2;
            else temp = (int)a.charAt(i) - '0';
            if(bit == 1) {
                temp++;
                bit--;
            }
            ret.append(temp % 2 + "");
            bit += temp / 2;
            i--;
            j--;
        }
        if(bit == 1) ret.append("1");
        ret.reverse();
        return ret.toString();
    }
}