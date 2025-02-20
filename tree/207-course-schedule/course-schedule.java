class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        boolean[] visit=new boolean[numCourses];
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        Arrays.fill(visit,false);
        boolean[] rec=new boolean[numCourses];
        Arrays.fill(rec,false);

        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }

        for (int[] edge : prerequisites) {
            int course = edge[0];
            int prerequisite = edge[1];
            adj.get(prerequisite).add(course); // Add edge from prerequisite to course
        }


        for(int i=0;i<numCourses;i++){
            if(!visit[i] && Top(adj,i,visit,rec)){
                return false;
            }
        }
        return true;

    }
    boolean Top(ArrayList<ArrayList<Integer>> adj,int u,boolean[] visit,boolean[] rec){
        visit[u]=true;
        rec[u]=true;

        for(int v:adj.get(u)){
         if(visit[v] == false && Top(adj, v, visit, rec))
                return true;
            else if(rec[v] == true)
                return true;
        }
        rec[u]=false;

                return false;
    }

}