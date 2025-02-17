class Solution {
    public int numTilePossibilities(String tiles) {
        boolean[] used =new boolean[tiles.length()];
        HashSet<String> visit=new HashSet<>();
        generateseq(tiles,"",used,visit);
        return visit.size()-1;
    }
    void generateseq(String tiles,String curr,boolean[] used,HashSet<String> seq){
        seq.add(curr);
        for(int i=0;i<tiles.length();i++){
            if(!used[i]){
                used[i]=true;
                generateseq(tiles,curr+tiles.charAt(i),used,seq);
                 used[i]=false;
            }
           
        }
    }
}