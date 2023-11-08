// implementation of prims algorithm to find mst and display the edgeset(i.e, path followed to calculate mst)
// representing graph using adjacency matrix
// calculate the time of execution of the algorithm in nanoseconds

import java.util.Arrays;

public class PrimsMST {
    public static void main(String[] args) {
        int[][] graph = {
            {0, 3, 0, 0, 6, 5},
            {3, 0, 1, 0, 0, 4},
            {0, 1, 0, 6, 0, 4},
            {0, 0, 6, 0, 8, 5},
            {6, 0, 0, 8, 0, 2},
            {5, 4, 4, 5, 2, 0}
        };

        int n = graph.length;
        int[] parent = new int[n];
        int[] key = new int[n];
        boolean[] mstSet = new boolean[n];

        Arrays.fill(key, Integer.MAX_VALUE);
        Arrays.fill(mstSet, false);

        key[0] = 0; // Start from the first vertex

        for (int i = 0; i < n - 1; i++) {
            int u = minKey(key, mstSet);
            mstSet[u] = true;

            for (int v = 0; v < n; v++) {
                if (graph[u][v] != 0 && !mstSet[v] && graph[u][v] < key[v]) {
                    parent[v] = u;
                    key[v] = graph[u][v];
                }
            }
        }

        printMST(parent, graph);
        mstValue(parent, graph);
    }

    public static int minKey(int[] key, boolean[] mstSet) {
        int min = Integer.MAX_VALUE;
        int minIndex = -1;

        for (int v = 0; v < key.length; v++) {
            if (!mstSet[v] && key[v] < min) {
                min = key[v];
                minIndex = v;
            }
        }

        return minIndex;
    }

    public static void printMST(int[] parent, int[][] graph) {
        System.out.println("Edge   Weight");
        for (int i = 1; i < parent.length; i++) {
            System.out.println(parent[i] + " - " + i + "   " + graph[i][parent[i]]);
        }
    }

    public static void mstValue(int[] parent, int[][] graph) {
        int sum = 0;
        for (int i = 1; i < parent.length; i++) {
            sum += graph[i][parent[i]];
        }
        System.out.println("MST Value: " + sum);
    }
}



// Enter the number of vertices
// 4
// Enter the adjacency matrix
// 0 3 0 7 
// 8 0 2 0
// 5 0 0 1
// 2 0 0 0

// Time Complexity: O(V^2)
// Space Complexity: O(V)