class Solution {
    public boolean isValid(String s) {
        if(s == null) return true;
        Stack<Character> pile = new Stack<Character>();
        for(int i = 0; i < s.length(); i++) {
            if("([{".indexOf(s.charAt(i)) >= 0) pile.push(s.charAt(i));
            else if(pile.empty()) return false;
            else if(s.charAt(i) == ')') {
                if(pile.pop() != '(') return false;
            }
            else if(s.charAt(i) == ']') {
                if(pile.pop() != '[') return false;
            }
            else if(s.charAt(i) == '}') {
                if(pile.pop() != '{') return false;
            }
        }
        if(pile.empty()) return true;
        else return false;
    }
}