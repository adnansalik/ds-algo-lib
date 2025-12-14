import java.util.ArrayList;
import java.util.Scanner;

class GraphRepresentation {

    static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Graph Representation in Java");
        System.out.print("Input number of nodes: ");
        int nodes = sc.nextInt();
        System.out.print("Input number of edges: ");
        int edges = sc.nextInt();

       /*
            Adjacency Matrix Representation
            We first take the number of nodes and edges as input.
            Then we create a 2D array (matrix) of size (nodes+1)x(nodes+1) initialized to 0 if it is 1 based indexing.
            For each edge, we update the matrix at positions [a][b] and [b][a] to 1 (for undirected graph).
            Finally, we display the adjacency matrix.
        */
        System.out.println("Adjacency Matrix Representation:");
        AdjacencyMatrix adjMatrix = new AdjacencyMatrix(nodes, edges);

        for(int i=0;i<edges;i++){
            System.out.println("Input edge " + (i+1) + " (format: a b): ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            adjMatrix.addEdge(a, b);
        }
        System.out.println("Adjacency Matrix:");
        adjMatrix.display();

        /*
            Adjacency List Representation
            We first take the number of nodes and edges as input.
            Then we create an ArrayList of ArrayLists to represent the adjacency list.
            For each edge, we add the destination node to the source node's list and vice versa (for undirected graph).
            Finally, we display the adjacency list.
        */

        System.out.println("Adjacency List Representation:");
        AdjacencyList adjList = new AdjacencyList(nodes, edges);

        for(int i=0;i<edges;i++){
            System.out.println("Input edge " + (i+1) +  "(format : a b)");
            int a = sc.nextInt();
            int b = sc.nextInt();
            adjList.addEdge(a, b);
        }

        System.out.println("Adjacency List:");
        adjList.display();

    }
}

class AdjacencyMatrix {
    int[][] matrix;
    int nodes;
    int edges;

    public AdjacencyMatrix(int nodes,int edges) {
        this.nodes = nodes;
        this.edges = edges;
        matrix = new int[nodes+1][nodes+1];
    }

    public void addEdge(int a, int b) {
        matrix[a][b] = 1;
        matrix[b][a] = 1; // For undirected graph
    }

    public void display() {
        for (int i = 1; i < nodes+1; i++) {
            for(int j=1;j<nodes+1;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }


}

class AdjacencyList{
     ArrayList <ArrayList<Integer>> adjList;
     int nodes;
     int edges;

     public AdjacencyList(int nodes, int edges) {
         this.nodes = nodes;
         this.edges = edges;
         adjList = new ArrayList<>(nodes+1);
         for (int i = 0; i < nodes+1; i++) {
             adjList.add(new ArrayList<>());
         }
     }

    public void addEdge(int a, int b) {
        adjList.get(a).add(b);
        adjList.get(b).add(a); // For undirected graph
    }

    public void display() {
        for (int i = 1; i < nodes + 1; i++) {
            System.out.print(i + ": ");
            for (Integer neighbor : adjList.get(i)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }
}