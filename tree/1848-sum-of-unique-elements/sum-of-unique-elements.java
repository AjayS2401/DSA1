class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int n:nums){
            hm.put(n,hm.getOrDefault(n,0)+1);
        }
        int sum=0;
        for(Map.Entry<Integer,Integer> entry: hm.entrySet()){
            int val=entry.getValue();
            if(val==1){
                    sum+=entry.getKey();
            }
        }
        return sum;
    }
}