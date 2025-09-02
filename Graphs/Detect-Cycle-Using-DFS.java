// import java.util.*;

// public class detectcycledfs {
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

    public static boolean detectcycle(ArrayList<Edge>[] graph) {
        int v = graph.length;
        boolean[] visited = new boolean[v];
        for (int i = 0; i < v; i++) {
            if (!visited[i]) { 
                if (dfshelper(graph, visited, i, -1)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean dfshelper(ArrayList<Edge>[] graph, boolean[] visited, int curr, int par) {
        visited[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);

            // case 1
            if (visited[e.des] && e.des != par) {
                return true;
            }

            // case 2: if visited[e.des] == true && e.des == par -------------------> continue

            // case 3
            else if (!visited[e.des] && dfshelper(graph, visited, e.des, curr)) {
                return true;
            }
        }
        return false;
    }

//     @SuppressWarnings("unchecked")
//     public static void main(String[] args) {
//         // total number of vertices
//         int v = 3;

//         // creating a graph with Adjacency List
//         ArrayList<Edge>[] graph = new ArrayList[v];

//         // converting null to empty ArrayList
//         for (int i = 0; i < v; i++) {
//             graph[i] = new ArrayList<>();
//         }

//         // adding data to graph
//         graph[0].add(new Edge(0, 1, 5));
//         graph[1].add(new Edge(1, 0, 5));
//         // Uncomment below to create a cycle
//         // graph[1].add(new Edge(1, 2, 4));
//         // graph[2].add(new Edge(2, 1, 4));
//         // graph[2].add(new Edge(2, 0, 4));
//         // graph[0].add(new Edge(0, 2, 4));

//         System.out.println(detectcycle(graph)); // false with current edges
//     }
// }
