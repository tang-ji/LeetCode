class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> L = new ArrayList<>();
        List<String> temp = new ArrayList<>();
        int l = 0;
        StringBuilder pack = new StringBuilder();
        for(String s : words) {
            if(l + s.length() <= maxWidth) {
                temp.add(s);
                l += s.length() + 1;
            }
            else {
                if(temp.size() == 1) {
                    pack.append(temp.get(0));
                    pack.append(space(maxWidth - l + 1));
                }
                else {
                    int sp = maxWidth - l + 1;
                    for(int i = 0; i < temp.size() - 1; i++) {
                        pack.append(temp.get(i));
                        if(i < sp % (temp.size() - 1)) pack.append(space(sp / (temp.size() - 1) + 2));
                        else pack.append(space(sp / (temp.size() - 1) + 1));
                    }
                    pack.append(temp.get(temp.size() - 1));
                }
                L.add(pack.toString());
                l = 0;
                pack = new StringBuilder();
                temp = new ArrayList<>();
                temp.add(s);
                l += s.length() + 1;
            }
        }
        if(!temp.isEmpty()) {
            for(String s : temp) {
                pack.append(s);
                if(pack.length() < maxWidth)pack.append(' ');
            }
            pack.append(space(maxWidth - l));
            L.add(pack.toString());
        }
        return L;
    }
    
    public StringBuilder space(int n) {
        StringBuilder s = new StringBuilder();
        while(n-- > 0) s.append(' ');
        return s;
    }
}