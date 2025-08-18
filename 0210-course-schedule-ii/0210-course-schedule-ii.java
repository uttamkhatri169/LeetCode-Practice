class Solution {
    public int[] findOrder(int n, int[][] prerequisites) {
        int[] inDegree = new int[n];
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++) adj.add(new ArrayList<>());
        for(int[] row : prerequisites){
            int v = row[0];
            int u = row[1];
            adj.get(u).add(v);
            inDegree[v]++;
        }
        return bfs(adj, inDegree, n);
    }
    public int[] bfs( ArrayList<ArrayList<Integer>> adj, int[] inDegree, int n){
        int[] res = new int[n];
        Queue<Integer> q = new LinkedList<>();
        int cnt=0, idx=0;
        for(int i=0;i<n;i++){
            if(inDegree[i]==0){
                q.add(i);
                res[idx++]=i;
                cnt++;
            }
        }
        while(q.isEmpty()==false){
            int u = q.poll();
            for(int v: adj.get(u)){
                inDegree[v]--;
                if(inDegree[v]==0){
                    q.add(v);
                    res[idx++]=v;
                    cnt++;
                }
            }
        }
        return cnt==n ? res : new int[]{};
    }
}