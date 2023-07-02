class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int num = x;
        int rem = 0 ;
        int newnum = 0;
        while(num !=0){
            rem = num%10;
            newnum = (newnum*10) + rem ;
            num = num/10 ;
        }
        if(newnum == x){
            return true;
        }
        else{
            return false;
        }
    }
}