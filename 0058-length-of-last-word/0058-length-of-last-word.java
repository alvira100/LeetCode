class Solution {
    public int lengthOfLastWord(String s) {
        String[] l = s.split(" ");
        int n = l.length - 1;
        String str = l[n];
        return str.length();
    }
}