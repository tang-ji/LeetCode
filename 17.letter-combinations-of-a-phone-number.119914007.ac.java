class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ret = new ArrayList<String>();
        List<String> temp = new ArrayList<String>();
        if(digits == null) return ret;
        int n = digits.length() - 1;
        Map<Character, String> table = new HashMap<Character, String>();
        table.put('2', "abc");
        table.put('3', "def");
        table.put('4', "ghi");
        table.put('5', "jkl");
        table.put('6', "mno");
        table.put('7', "pqrs");
        table.put('8', "tuv");
        table.put('9', "wxyz");
        table.put('0', " ");
        while(n >= 0) {
            char cn = digits.charAt(n);
            if(cn == '0' || ('2' <= cn && cn <= '9')) {
                String w = table.get(cn);
                for(int i = 0; i < w.length(); i++) {
                    if(n == digits.length() - 1) {
                        temp.add(w.charAt(i) + "");
                    }
                    else {
                        for(String s : ret) {
                            temp.add(w.charAt(i) + s);
                        }
                    }
                }
                ret = temp;
                temp = new ArrayList<String>();
            }
            n--;
        }
        return ret;
    }
}