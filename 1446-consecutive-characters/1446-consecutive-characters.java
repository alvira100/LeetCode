class Solution {
    public int maxPower(String s) {
        int c = 1;
        int m = 1;
        for(int i = 0; i < s.length()-1; i++) {
            if(s.charAt(i) != s.charAt(i+1)) { c = 1; }
            else { c++; }
            m = Math.max(c,m);
        }
        return m;
    }
}