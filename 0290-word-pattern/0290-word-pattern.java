class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        HashMap<Character,String> map1=new HashMap<>();
        HashMap<String,Character> map2=new HashMap<>();
        String[] word=s.split(" ");
        if (pattern.length() != word.length) {
            return false;
        }
        for(int i=0;i<pattern.length();i++){
            char a=pattern.charAt(i);
            String b=word[i];
            if(map1.containsKey(a) && !b.equals(map1.get(a))){
                return false;
            }
            if(map2.containsKey(b) && map2.get(b)!=a){
                return false;
            }
            map1.put(a,b);
            map2.put(b,a);
        }
        return true;
    }
}