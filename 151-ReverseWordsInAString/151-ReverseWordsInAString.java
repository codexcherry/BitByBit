// Last updated: 9/17/2025, 9:28:42 PM
class Solution {
    public String reverseWords(String s1) {
        // Trim leading/trailing spaces and split by one or more spaces
        String[] reverse = s1.trim().split("\\s+");
        
        StringBuilder str = new StringBuilder();
        
        for (int i = reverse.length - 1; i >= 0; i--) {
            str.append(reverse[i]);
            if (i != 0) {
                str.append(" ");
            }
        }
        
        return str.toString();
    }
}
