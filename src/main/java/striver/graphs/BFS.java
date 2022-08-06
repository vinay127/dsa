package striver.graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {

    public static void main(String[] args) {

        List<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();

        int nodes = 7;
        for (int i = 0; i <= nodes; i++) {
            adj.add(new ArrayList<Integer>());
        }

        // edge between 1-->2
        adj.get(1).add(2);
        adj.get(2).add(1);

        // edge between 1-->3
        adj.get(1).add(3);
        adj.get(3).add(1);

        // edge between 2-->4
        adj.get(2).add(4);
        adj.get(4).add(2);

        // edge between 2-->5
        adj.get(2).add(5);
        adj.get(5).add(2);

        // edge between 3-->6
        adj.get(3).add(6);
        adj.get(6).add(3);

        // edge between 3-->7
        adj.get(3).add(7);
        adj.get(7).add(3);

        List<Integer> bfsList = bfs(nodes, adj);
        System.out.println(bfsList                                                                                                                                                                                                                               );

    }


    /*
     * TC : O(N) for adding the number to q. + 2(E) for traversing to the neighbours.
     * SC : O(N) - q + O(N) - visited + O(N) - bfs for storing the bfs results
     * */
    public static List<Integer> bfs(int numberOfNodes, List<ArrayList<Integer>> adj) {

        boolean[] visited = new boolean[numberOfNodes + 1];
        List<Integer> bfs = new ArrayList<>();

        Queue<Integer> queue = new LinkedList<>();
        visited[3] = true;
        queue.add(3);

        while (!queue.isEmpty()) {
            Integer firstNum = queue.poll();
            bfs.add(firstNum);

            //get the neighbours of firstNum.
            ArrayList<Integer> neighbours = adj.get(firstNum);
            for (Integer neighbour : neighbours) {
                if (!visited[neighbour]) {
                    visited[neighbour] = true;
                    queue.add(neighbour);
                }
            }
        }
        return bfs;
    }

}
