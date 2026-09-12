class Solution {
    public String reverseVowels(String s) {
        int first=0;
        int last=s.length()-1;
        String vow="aeiouAEIOU";
        char[] word=s.toCharArray();
        while(last>first){
            while(first<last && vow.indexOf(word[first])==-1){
                first++;
            }
            while(first<last && vow.indexOf(word[last])==-1){
                last--;
            }
            char temp=word[first];
            word[first]=word[last];
            word[last]=temp;
            first++;
            last--;
        }
        return String.valueOf(word);
    }
}