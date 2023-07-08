class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<magazine.length();i++){
            map.put(magazine.charAt(i) , map.getOrDefault(magazine.charAt(i) , 0) + 1);
        }
        for(int j=0;j<ransomNote.length();j++){
            if(!map.containsKey(ransomNote.charAt(j)) || map.get(ransomNote.charAt(j)) <=0) return false;
            map.put(ransomNote.charAt(j) , map.get(ransomNote.charAt(j))-1);
        }
        return true;
    }
}