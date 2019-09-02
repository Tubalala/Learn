package cn.function.domain;

import java.util.LinkedList;

/**
 * 无向图
 */
public class Graph {
    private int v;
    private LinkedList<Integer> adj[];

    public Graph(int v) {
        this.v = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();
        }
    }
    public void addEdge(int s,int t) {
        adj[s].add(t);
        adj[t].add(s);
    }
    public static void bfs(int s,int t){

    }
}
