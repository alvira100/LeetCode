class Solution {
    public String reverseVowels(String s) {
        if(s == null || s.length() == 1) return s;
        char[] chars = s.toCharArray();
        boolean[] isVowel = new boolean[128];
        for(char c : "aieouAEIOU".toCharArray()) {
            isVowel[c] = true;
        }
        int low = 0;
        int high = chars.length - 1;
        while(low < high) {
            if(!isVowel[chars[low]]) {
                low++;
            }
            else if(!isVowel[chars[high]]) {
                high--;
            }
            else {
                char temp = chars[low];
                chars[low] = chars[high];
                chars[high] = temp;
                low++;
                high--;
            }
        }
        return new String(chars);
    }
}