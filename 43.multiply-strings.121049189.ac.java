class Solution {
    public String multiply(String num1, String num2) {
        if(num1.equals("0") || num2.equals("0")) return "0";
        int n1 = num1.length(), n2 = num2.length();
        int[] product = new int[n1 + n2];
        for(int i = n1 - 1; i >= 0; i--) {
            for(int j = n2 - 1; j >= 0; j--) {
                int s = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                product[n1 + n2 - 2 - i - j] += s % 10;
                product[n1 + n2 - 1 - i - j] += s / 10;
            }
        }
        StringBuffer ret = new StringBuffer();
        for(int k = 0; k < n1 + n2 - 1; k++) {
            product[k + 1] += product[k] / 10;
            product[k] = product[k] % 10;
        }
        if(product[n1 + n2 - 1] != 0) {
            ret.append((char)(product[n1 + n2 - 1] + '0'));
        }
        for(int l = n1 + n2 - 2; l >= 0; l--) {
            ret.append((char)(product[l] + '0'));
        }
        return ret.toString();
    }
}