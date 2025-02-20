class Solution {
    public int findCircleNum(int[][] isConnected) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        int n=isConnected.length;
        for(int i=0;i<n;i++){
            adj.add(new ArrayList());
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
            if(isConnected[i][j]==1 && i!=j){

            adj.get(i).add(j);
            adj.get(j).add(i);
            }
            }
        }
        boolean []visit=new boolean[n];
        Arrays.fill(visit,false);
        int count=0;
        for(int i=0;i<n;i++){
                if(!visit[i]){
                     count++;
                    DFSG(adj,visit,i);
                }
               
        }
        return count;

    }
    void DFSG(ArrayList<ArrayList<Integer>> adj,boolean[] visit,int u){
        visit[u]=true;

        for(int v:adj.get(u)){
            if(!visit[v])
            DFSG(adj,visit,v);
        }
    }
}