class Solution {
    public int majorityElement(int[] nums) {

        //     int l=nums.length;
        // HashMap<Integer,Integer> hm=new HashMap<>();
        // for(int num:nums){
        //     hm.put(num,hm.getOrDefault(num,0)+1);
        // }

        // for(Map.Entry<Integer,Integer> entry:hm.entrySet()){
        //     int num=entry.getKey();
        //     int val=entry.getValue();
        //     if(val > l/2){
        //         return num;
        //     }

        // }
        // // for(int n:hm.values()){
                
        // return -1;

        int n=nums.length;
        Arrays.sort(nums);
       int res=0;
        for(int i=0;i<=n/2;i++){
            res=nums[i];
        }
        return res;
    }
}