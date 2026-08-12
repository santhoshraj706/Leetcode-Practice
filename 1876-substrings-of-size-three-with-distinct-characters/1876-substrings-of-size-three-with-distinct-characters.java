class Solution {
    public int countGoodSubstrings(String s) {
        HashMap<Character, Integer> freq = new HashMap<>();
        int left = 0;
        int c = 0;

        for (int i = 0; i < s.length(); i++) {
            
            char rightChar = s.charAt(i);
            freq.put(rightChar, freq.getOrDefault(rightChar, 0) + 1);

            
            if (i - left + 1 == 3) {
                
                if (freq.size() == 3) {
                    c++;
                }

                char leftChar = s.charAt(left);
                freq.put(leftChar, freq.get(leftChar) - 1);
                if (freq.get(leftChar) == 0) {
                    freq.remove(leftChar);
                }

                left++; 
            }
        }

        return c;
    }
}