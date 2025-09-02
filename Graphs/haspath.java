public static boolean haspathh(ArrayList<Edge>[] graphs,boolean[] visited,int src,int des ){
        if(src == des){
            return true;
        }
        visited[src] = true;
        for(int i=0;i<graphs[src].size();i++){
            Edge e = graphs[src].get(i);
            if(!visited[e.des] && haspathh(graphs, visited, e.des, des)){
                return true;
            }
        }

        return false;
  }
