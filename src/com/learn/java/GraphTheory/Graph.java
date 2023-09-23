package com.learn.java.GraphTheory;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Graph {
    private  int v;
    private LinkedList<Integer> adj[];
    Graph(int v){
        this.v=v;
        adj=new LinkedList[v];
        for(int i=0;i<v;i++){
            adj[i]=new LinkedList<>();
        }
    }
    public void addEdge(int v,int w){
        adj[v].add(w);
    }
    //
    boolean isReachable(int s, int d){
        boolean visted[]=new boolean[v];
        Queue<Integer> queue=new LinkedList<>();
        visted[s]=true;
        queue.add(s);
        while (!queue.isEmpty()){
            s=queue.poll();
            int n;
            Iterator<Integer> i=adj[s].iterator();
            while (i.hasNext()){
                n=i.next();
                if(n==d)
                    return true;
                if(!visted[n]){
                  visted[n]=true;
                  queue.add(n);
                }
            }
        }
        return false;
    }
    boolean DFS(int s, int d, boolean visited[]){
        visited[s]=true;
        if(s==d)
            return true;
        Iterator<Integer> it= adj[s].iterator();
        while (it.hasNext()){
            int n=it.next();
//            if(n==d)
//                return true;
            if(!visited[n]){
                DFS(n,d,visited);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Graph g=new Graph(4);
        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(1,2);
        g.addEdge(2,0);
        g.addEdge(2,3);
        g.addEdge(3,3);
        int u = 1;
        int v = 3;
        if (g.isReachable(u, v))
            System.out.println("There is a path from " + u +" to " + v);
        else
            System.out.println("There is no path from " + u +" to " + v);;

        u = 3;
        v = 1;
        if (g.isReachable(u, v))
            System.out.println("There is a path from " + u +" to " + v);
        else
            System.out.println("There is no path from " + u +" to " + v);

    }
}
