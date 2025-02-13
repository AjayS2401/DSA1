class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int n:nums){
          if(n<k) 
           pq.add(n);
        }
        int res=0;
        while(!pq.isEmpty()){
            int x=pq.poll();
             res++;
            if(pq.isEmpty())
            break;
            int y=pq.poll();

            long s=2l * x+y;
            if(s<k) pq.add((int)s);
           
            
        }
      return res;
    }
}