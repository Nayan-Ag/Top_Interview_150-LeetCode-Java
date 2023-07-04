class Solution {
    public boolean isPalindrome(String s) {
        int i=0;
        int j = s.length()-1;
        s = s.toLowerCase();
        while(i<=j){
            if( (s.charAt(i)>=58 && s.charAt(i)<=96) || (s.charAt(i)<48 || s.charAt(i)>122) ) {
                i++;
            }
            else if( (s.charAt(j)>=58 && s.charAt(j)<=96) || (s.charAt(j)<48 || s.charAt(j)>122) )  {
                j--;
            }
            else {
                if(s.charAt(i)!=s.charAt(j)) return false;
                i++;
                j--;
            }
        }
        return true;
    }
}