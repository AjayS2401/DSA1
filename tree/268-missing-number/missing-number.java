class Solution {
    public int missingNumber(int[] nums) {
       

       //Using actaula and expected sum formula 
       int n=nums.length;
       int eSum=n*(n+1)/2;
       int actualS=0;
       for(int num:nums){
            actualS+=num;
       }
       return eSum-actualS;

        //USing hashSet
    // HashSet<Integer> hs=new HashSet<>();
    // for(int num:nums){
    //     hs.add(num);
    // }

    // for(int i=0;i<=nums.length;i++){
    //     if(!hs.contains(i)){
    //         return i;
    //     }
    // }
    // return -1;
    }
}