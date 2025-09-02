public static void dfs(ArrayList<Edge>[] graphs,boolean[] visited,int curr){
        System.out.println(curr);
        visited[curr] = true;
        for(int i=0;i<graphs[curr].size();i++){
            Edge e = graphs[curr].get(i);
            if(!visited[e.des]){
                dfs(graphs, visited, e.des);
            }
        }
    }
