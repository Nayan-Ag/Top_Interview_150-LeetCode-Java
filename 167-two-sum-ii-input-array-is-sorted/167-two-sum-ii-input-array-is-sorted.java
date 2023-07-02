class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] ans = new int[2];
        int i=0;
        int j=numbers.length-1;
        while(i<j){
            int sum = numbers[i] + numbers[j];
            if(sum==target){
                ans[0] = i+1;
                ans[1] = j+1;
                return ans;
            }
            else if(sum<target){
                i++;
            }
            else if(sum>target){
                j--;
            }
        }
        return ans;
    }
}