package Graph;
import java.util.*;
import java.util.ArrayList;

public class DirectedGraph {

    // Edge class
    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    // Create Graph
    static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 1));
        graph[4].add(new Edge(4, 1));
        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));
    }

    // Print all paths from src to dest
    static void printAllPaths(ArrayList<Edge> graph[], int src, int dest, boolean[] visited, String path) {
        if (src == dest) {
            System.out.println(path + dest);
            return;
        }

        visited[src] = true;

        for (Edge e : graph[src]) {
            if (!visited[e.dest]) {
                printAllPaths(graph, e.dest, dest, visited, path + src + " -> ");
            }
        }

        visited[src] = false; // backtrack
    }

    public static void main(String args[]) {
        int V = 6;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        int src = 5, dest = 1;
        boolean[] visited = new boolean[V];
        System.out.println("All paths from " + src + " to " + dest + ":");
        printAllPaths(graph, src, dest, visited, "");
    }
}
