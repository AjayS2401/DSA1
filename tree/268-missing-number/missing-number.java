class Solution {
    public int missingNumber(int[] nums) {
       
       int n=nums.length;
       int eSum=n*(n+1)/2;
       int actualS=0;
       for(int num:nums){
            actualS+=num;
       }
       return eSum-actualS;
    }
}