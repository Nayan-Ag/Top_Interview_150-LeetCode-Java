class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        HashMap<Character , Integer> map = new HashMap<>();
        for(int i=0;i<t.length();i++) map.put(t.charAt(i) , map.getOrDefault(t.charAt(i) , 0) + 1);
        for(int i=0;i<s.length();i++){
            if(!map.containsKey(s.charAt(i)) || map.get(s.charAt(i))<=0) return false;
            map.put(s.charAt(i) , map.get(s.charAt(i))-1);
        }
        return true;
    }
}