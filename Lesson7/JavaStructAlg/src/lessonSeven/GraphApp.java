package lessonSeven;

/**
 * @author holnievvitalii@outlook.com
 * @version dated Oct 26, 2019
 */
public class GraphApp {
    public static void main(String[] args) {
        Graph graph = new Graph();
        /**
         * add vertices to search
         */
        graph.addVertex('A');
        graph.addVertex('B');
        graph.addVertex('C');
        graph.addVertex('D');
        graph.addVertex('E');
        graph.addVertex('F');
        graph.addVertex('G');
        graph.addVertex('H');
        graph.addVertex('I');
        graph.addVertex('J');

        /**
         * add edges to search
         */
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(0, 3);
        graph.addEdge(3, 4);
        graph.addEdge(4, 5);
        graph.addEdge(3, 6);
        graph.addEdge(6, 7);
        graph.addEdge(6, 9);
        graph.addEdge(8, 9);

        /**
         * Find the shortest path using breadth-first search.
         */
        graph.bfs();
    }
}
