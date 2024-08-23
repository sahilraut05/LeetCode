class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder normalizedString = new StringBuilder();
        
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                normalizedString.append(Character.toLowerCase(c));
            }
        }
        String normalized = normalizedString.toString();
        String reversed = normalizedString.reverse().toString();
        
        return normalized.equals(reversed);
    }
}