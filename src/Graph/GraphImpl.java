package Graph;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class GraphImpl {
    static class Edge {
        int src;
        int des;

        public Edge(int s, int d) {
            this.src = s;
            this.des = d;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 6));

        graph[6].add(new Edge(6, 5));


        graph[7].add(new Edge(7, 8));
//
        graph[8].add(new Edge(8, 7));
    }

    public static void bfs(ArrayList<Edge>[] graph, int rootVertex) {
        Queue<Integer> vertexQ = new LinkedList<>();

        vertexQ.add(graph[rootVertex].getFirst().src);
        HashSet<Integer> visited = new HashSet<>(); // this works only with connected graph.so...
        while (!vertexQ.isEmpty()) {
            int currentVertex = vertexQ.remove();
            if (visited.add(currentVertex)) {
                rootVertex++;
                System.out.print(currentVertex + " ");
                for (Edge edge : graph[currentVertex]) {
                    vertexQ.add(edge.des);
                }
            }
        }
        System.out.println();
        if (graph.length != rootVertex) {
            bfs(graph, rootVertex);
        }

    }

    public static void dfs(ArrayList<Edge>[] graph, int currentVertex, boolean[] visited) {

        System.out.print(currentVertex + " ");
        visited[currentVertex] = true;

        for (Edge edge : graph[currentVertex]) {
            if (!visited[edge.des]) {
                dfs(graph, edge.des, visited);
            }
        }

    }

    public static void paths(ArrayList<Edge>[] graph, int current, boolean[] visited, int target, String path) {
        if (current == target) {
            path += current;
            System.out.println(path);
            return;
        }
        if (!visited[current]) {
            visited[current] = true;
            path += current;
            for (Edge edge : graph[current]) {
                paths(graph, edge.des, visited, target, path);
            }
            visited[current] = false;
        }
    }

    public static void main(String[] args) {
        int vertices = 9;
        ArrayList<Edge>[] graph = new ArrayList[vertices];
        boolean[] visited = new boolean[vertices];
        createGraph(graph);
        System.out.println("Graph created");
//        System.out.println("Graph BFS");
//        System.out.println(graph[1].getFirst().des);
//        bfs(graph, 0);

//        dfs(graph, 0);
//        for (int i = 0; i < visited.length; i++) {
//            if (!visited[i]) {
//                dfs(graph, i, visited);
//            }
//        }
//        dfs(graph, 0, visited);
        paths(graph,0,visited,5,"");


    }
}
