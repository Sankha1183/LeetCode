class Solution {
    public int lengthOfLastWord(String s) {
        int n = s.length();
        int count = 0;
        
        // Start from the end of the string and skip any trailing spaces
        int i = n - 1;
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }
        
        // Count the length of the last word
        while (i >= 0 && s.charAt(i) != ' ') {
            count++;
            i--;
        }
        
        return count;
    }
}
