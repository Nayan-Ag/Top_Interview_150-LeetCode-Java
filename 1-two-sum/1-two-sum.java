class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0 ; i<nums.length; i++){ 
            if(nums[i]==(target/2) && map.containsKey(nums[i])){
                ans[0] = map.get(target/2);
                ans[1] = i;
                return ans;
            }
            map.put(nums[i],i);
        }
        
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            int num = entry.getKey();
            if(map.containsKey(target - num) ){
                ans[0] = entry.getValue();
                ans[1] = map.get(target-entry.getKey());
                break;
            }
        }
        return ans;
    }
}