class Solution {
    
    public void swap(int[] nums, int s , int e){
        while(s < e){
            int temp = nums[s];
            nums[s] = nums[e];
            nums[e] = temp;
            s++;
            e--;
        }
        return;
    }
    
    public void rotate(int[] nums, int k) {
        int i = 0, n = nums.length;
        k = k%n;
        for( i = 0; i < n /2 ;i++){
            int temp = nums[i];
            nums[i] = nums[n-1-i];
            nums[n-i-1] = temp;
        }
        swap(nums, 0,k-1);
        swap(nums,k, n-1);
        return;
    }
}