class Solution {
    int getdigit(int n){
        // while(n>=10){
            int sum=0;
            while(n>0){
                sum+=n%10;
                n=n/10;
            }
           
        // }
        return sum;
    }
    public int maximumSum(int[] nums) {
        Map<Integer,List<Integer>> hm=new HashMap<>();
        for(int n:nums){
            int dig=getdigit(n);
            hm.computeIfAbsent(dig,key->new ArrayList()).add(n);
        }
        int maxS=-1;

        // for(Map.Entry<Integer,List<Integer>> entry:hm.entrySet())
        for(List<Integer> al:hm.values()){
            if(al.size()>=2){
                al.sort((a,b)->b-a);
                int sum=al.get(0)+al.get(1);
                if(sum>maxS)
                maxS=sum;
            }
            
        }
        return maxS;
    }
}