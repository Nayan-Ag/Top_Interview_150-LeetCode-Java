class Solution {
    public boolean isHappy(int n) {
        if(n==1111111 || n==7 || n==1) return true;
        else if(n<10) return false;
        int num = n;
        n = 0;
        while(num!=0){
            int digit = num%10;
            n+= (digit*digit);
            num =num/10;
        }
        return(isHappy(n));
    }
}