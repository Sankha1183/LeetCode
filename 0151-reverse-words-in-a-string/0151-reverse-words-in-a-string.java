class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();  // Reverse the entire string
        int i = 0;
        int l = 0, r = 0;
        int n = sb.length();

        while (i < n) {
            
            while (i < n && sb.charAt(i) == ' ') {
                i++;
            }

            
            if (r < n && i < n && sb.charAt(i) != ' ') {
                l = r;
                while (i < n && sb.charAt(i) != ' ') {
                    sb.setCharAt(r++, sb.charAt(i++));
                }
                reverse(sb, l, r - 1); 
            }

            
            if (i < n) {
                sb.setCharAt(r++, ' ');
            }
        }

        
        if (r > 0 && sb.charAt(r - 1) == ' ') {
            sb.setLength(r - 1);
        } else {
            sb.setLength(r);
        }

        return sb.toString();
    }

    private void reverse(StringBuilder sb, int l, int r) {
        while (l < r) {
            char temp = sb.charAt(l);
            sb.setCharAt(l, sb.charAt(r));
            sb.setCharAt(r, temp);
            l++;
            r--;
        }
    }
}
