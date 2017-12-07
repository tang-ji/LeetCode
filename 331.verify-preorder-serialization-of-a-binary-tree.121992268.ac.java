class Solution {
    public boolean isValidSerialization(String preorder) {
        int bran = 1;
        for(int i = 0; i < preorder.length(); i++) {
            if(bran <= 0) return false;
            if(preorder.charAt(i) <= '9' && preorder.charAt(i) >= '0' && (i == preorder.length() - 1 || (preorder.charAt(i + 1) > '9' || preorder.charAt(i + 1) < '0'))) bran++;
            else if(preorder.charAt(i) == '#') bran--;
        }
        if(bran != 0) return false;
        return true;
    }
}