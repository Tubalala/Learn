package cn.function.sort;

import javafx.util.Pair;

import java.util.LinkedList;
import java.util.Queue;

public class Find {
    /*public int minPathLengthDemo(int[][] grids, int tr, int tc) {
        int m = grids.length;
        int n = grids[0].length;
        boolean[][] flag = new boolean[m][n];


    }*/
    public int minPathLength(int[][] grids, int tr, int tc) {
        final int[][] direction = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        final int m = grids.length, n = grids[0].length;
        Queue<Pair<Integer, Integer>> queue = new LinkedList<>();
        queue.add(new Pair<>(0, 0));
        int pathLength = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            pathLength++;
            while (size-- > 0) {
                Pair<Integer, Integer> cur = queue.poll();
                int cr = cur.getKey(), cc = cur.getValue();
                grids[cr][cc] = 0; // 标记
                for (int[] d : direction) {
                    int nr = cr + d[0], nc = cc + d[1];
                    if (nr < 0 || nr >= m || nc < 0 || nc >= n || grids[nr][nc] == 0) {
                        continue;
                    }
                    if (nr == tr && nc == tc) {
                        return pathLength;
                    }
                    queue.add(new Pair<>(nr, nc));
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[][] grids = {   {1, 6, 3},
                            {5, 7, 8},
                            {9, 4, 0}};

        System.out.println(new Find().minPathLength(grids,1,6));
    }

}
