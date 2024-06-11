class Solution {

    void BFS(   ArrayList<ArrayList<Integer>> list, int i , boolean[] visited){
        Queue<Integer> q = new LinkedList<>();
        visited[i] = true;
        q.add(i);
        while(q.isEmpty()== false){
            int u = q.poll();
            for(int v: list.get(u)){
                if(visited[v]==false){
                    visited[v] = true;
                    q.add(v);
                }
            }
        }
    }


    public int findCircleNum(int[][] isConnected) {
        // to get no. of nodes
        int n = isConnected.length;


        // to convert the matrix into the list
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();


        
        for(int i=0; i<n;i++){
            list.add(new ArrayList<>());
            for(int j=0;j<n;j++){
                if(i!=j && isConnected[i][j]==1){
                    list.get(i).add(j);
                }
            }
        }

       boolean[] visited = new boolean [n];
       int count =0;
       for(int i=0;i<n;i++){
        if(visited[i]==false){
            BFS(list,i,visited);
            count++;
        }

       
       }
         return count;

    }
}