class Solution {
    public String simplifyPath(String path) {
        StringBuilder ret = new StringBuilder();
        boolean begin = false;
        for(int i = path.length() - 1; i >= 0; i--) {
            if(!begin) {
                if(path.charAt(i) == '/') begin = true;
                else continue;
            }
            if(path.charAt(i) != '/') ret.append(path.charAt(i));
            else if(ret.length() != 0) {
                ret.append(path.charAt(i));
                break;
            }
            else if(i == 0) ret.append(path.charAt(i));
        }
        ret.reverse();
        return ret.toString();
    }
}