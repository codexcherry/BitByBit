public static void bfs(ArrayList<Edge>[] graphs){  
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[graphs.length];
        q.add(0);

        while(!q.isEmpty()){
            int curr = q.remove();
            if(!visited[curr]){
                System.out.println(curr);
                visited[curr] = true;
                for(int i=0;i<graphs[curr].size();i++){
                    Edge e = graphs[curr].get(i);
                    q.add(e.des);
                }
            }
        }

    }
