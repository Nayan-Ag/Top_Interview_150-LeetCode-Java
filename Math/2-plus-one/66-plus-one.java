class Solution {
    public int[] plusOne(int[] digits) {
        int[] arr;

        int l = digits.length-1 ;
        while( l>=0 && digits[l] == 9){
            l--;
        }

        if(l == -1){
            arr = new int[digits.length + 1];
            arr[0]=1;
            for(int i = 1 ; i<digits.length+1 ; i++){
               arr[i] = 0;
           }  
           return arr ;
        }
        
        digits[digits.length-1]= digits[digits.length-1]+1 ;
        for(int k=digits.length-1 ;k>0 ;k--){
            if(digits[k]==10){
                digits[k] = 0;
                digits[k-1] = digits[k-1] + 1;
            }
            else{
                digits[k] = digits[k];
            }
        }
        
        return digits;
    }
}