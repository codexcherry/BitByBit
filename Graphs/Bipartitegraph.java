// import java.util.*;

// public class Bipartitegraph {
//     public static class Edge {
//         int src;
//         int des;
//         int wt;

//         public Edge(int src, int des, int wt) {
//             this.src = src;
//             this.des = des;
//             this.wt = wt;
//         }
//     }

    public static boolean bipartite(ArrayList<Edge>[] graph){
        int[] color = new int[graph.length];
        for(int i=0;i<color.length;i++){
            color[i] = -1;
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<graph.length;i++){
            if(color[i] == -1){
                q.add(i);
                color[i] = 0;
                while(!q.isEmpty()){
                    int curr = q.remove();
                    for(int j=0;j<graph[curr].size();j++){
                        Edge e = graph[curr].get(j);
                        if(color[e.des] == -1){
                            if(color[curr] == 0){
                                color[e.des] = 1;
                            }else{
                                color[e.des] = 0;
                            }
                            q.add(e.des);
                        }else if (color[curr] == color[e.des]) {
                            return false;                            
                        }
                    }
                }
            }
        }

        return true;
    }

    // @SuppressWarnings("unchecked")
    // public static void main(String[] args) {
    //     // total number of vertices
    //     int v = 6; // Example bipartite graph with 6 vertices

    //     // adjacency list
    //     ArrayList<Edge>[] graph = new ArrayList[v];
    //     for (int i = 0; i < v; i++) {
    //         graph[i] = new ArrayList<>();
    //     }

    //     // U = {0,1,2}, V = {3,4,5}
    //     // edges only between U and V
    //     graph[0].add(new Edge(0, 3, 1));
    //     graph[0].add(new Edge(0, 4, 1));

    //     graph[1].add(new Edge(1, 3, 1));
    //     graph[1].add(new Edge(1, 5, 1));

    //     graph[2].add(new Edge(2, 4, 1));
    //     graph[2].add(new Edge(2, 5, 1));

    //     /*
        
    //     Visualization of Bipartite Graph:

    //         U Set             V Set
    //      {0, 1, 2}         {3, 4, 5}

    //         0 -------- 3
    //         | \
    //         |  \
    //         |   \
    //         |    4
    //         |
    //         1 -------- 3
    //         |         \
    //         |          \
    //         |           5
    //         |
    //         2 -------- 4
    //          \ 
    //           \
    //            5

    //     */
    //    System.out.println(bipartile(graph));
    // }
// }
