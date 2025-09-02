import java.util.*;

public class buildgraph {
    private static class Edge {
        int src;
        int des;
        int wt;

        public Edge(int src, int des, int wt) {
            this.src = src;
            this.des = des;
            this.wt = wt;
        }
    }

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        // total number of vertices
        int v = 3;

        // creating a graph with Adjacency List
        ArrayList<Edge>[] graph = new ArrayList[v];
        
        // converting null to empty ArrayList
        for(int i = 0; i < v; i++) {
            graph[i] = new ArrayList<>();
        }

        // adding data to graph
        graph[0].add(new Edge(0, 1, 5));
        graph[1].add(new Edge(1, 0, 5));
        graph[1].add(new Edge(1, 2, 4));
        graph[2].add(new Edge(2, 1, 4));

        // 1's Neighbors
        System.out.println("Neighbors of vertex 1:");
        for(int i = 0; i < graph[1].size(); i++) {
            Edge e = graph[1].get(i);
            System.out.println("src: " + e.src + ", des: " + e.des + ", wt: " + e.wt);
        }
    }
}
