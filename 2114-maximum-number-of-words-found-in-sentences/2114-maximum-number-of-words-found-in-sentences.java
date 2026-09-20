class Solution {
    public int mostWordsFound(String[] sentences) {
        int m = 0;
        int n = 0;
        for(int i = 0; i< sentences.length; i++){
            n = sentences[i].split(" ").length;
            m = Math.max(m,n);
        }
        return m;
    }
}