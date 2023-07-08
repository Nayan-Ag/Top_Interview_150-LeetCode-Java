class Solution {
    public int maxArea(int[] height) {
        int a = 0;
        int b = height.length-1;
        int ans = Math.min(height[0] , height[b]) * b;
        while(a<=b){
            int p = Math.min(height[a] , height[b]) * (b-a);
            if(p>ans) ans = p;
            if(height[a] >= height[b]) b--;
            else if(height[a] < height[b]) a++;
        }
        return ans;
    }
}