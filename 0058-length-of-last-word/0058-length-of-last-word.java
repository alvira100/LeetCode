class Solution {
    public int lengthOfLastWord(String s) {
        /*String[] l = s.split(" ");
        int n = l.length - 1;
        String str = l[n];
        return str.length();*/
        int len = 0;
        for(int i = s.length() - 1; i>=0; i--) {
            if(s.charAt(i) != ' ') len++;
            else if(len > 0) break;
        }
        return len;
    }
}