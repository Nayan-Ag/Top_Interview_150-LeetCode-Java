class Solution {
    public int removeElement(int[] nums, int val) {
        int a = 0;
        int b = nums.length-1;
        while(a<=b){
            if(nums[b]==val) b--;
            else if(nums[a]!=val) a++ ;
            else{
                nums[a] = nums[b];
                nums[b] = val;
                a++;
                b--;
            }
        }
        return a;
    }
}