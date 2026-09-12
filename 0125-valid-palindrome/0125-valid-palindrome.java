class Solution {
    public boolean isPalindrome(String s) {
        char[] arr=new char[s.length()];
        int l=0;
        for(int i=0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                arr[l++]=Character.toLowerCase(s.charAt(i));
            }
        }
        int first=0;
        int last=l-1;
        while(first<last){
            if(arr[first]!=arr[last]){
                return false;
            }
            first++;
            last--;
        }
        return true;
    }
}