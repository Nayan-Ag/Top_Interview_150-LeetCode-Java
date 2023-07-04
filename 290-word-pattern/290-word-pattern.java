class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] strArray = null;  
        strArray = s.split(" ");
        if(strArray.length != pattern.length()) return false;
        HashMap<Character,Character> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();
        for(int i=0;i<pattern.length();i++){
            set.add(strArray[i]);
            if(!map.containsKey(pattern.charAt(i))){
                map.put(pattern.charAt(i) , strArray[i].charAt(0));
            }
            else{
                if(strArray[i].charAt(0) != map.get(pattern.charAt(i))) return false;
            }
        }
        if(set.size() != map.size()) return false;
        return true;
    }
}