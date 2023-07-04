class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length - 1 ;
        return nums[n/2];
         
    }
}