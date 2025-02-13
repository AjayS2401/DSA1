class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int left=0;
        int right=n-1;
        int res=0;
        int leftMax=height[left];
        int rightMax=height[right];
        while(left<right){
             if(height[left]<height[right]){
                left++;
                 leftMax= Math.max(leftMax,height[left]);
                res+=leftMax-height[left];
              
             }
             else{
                    right--;
                     rightMax= Math.max(rightMax,height[right]);
                res+=rightMax-height[right];
              
             }
        }
        return res;

    }
}