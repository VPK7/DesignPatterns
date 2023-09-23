package com.learn.java;

import java.util.Arrays;

public class Matrix {
    public static int count=0;
    public static void main(String []args){
        System.out.println("Hello, World!");
        int[][] a=new int[][]{
                {0,0,1,0,0,0,0,1,0,0,0,0,0},{0,0,0,0,0,0,0,1,1,1,0,0,0},{0,1,1,0,1,0,0,0,0,0,0,0,0},
                {0,1,0,0,1,1,0,0,1,0,1,0,0},{0,1,0,0,1,1,0,0,1,1,1,0,0},{0,0,0,0,0,0,0,0,0,0,1,0,0},
                {0,0,0,0,0,0,0,1,1,1,0,0,0},{0,0,0,0,0,0,0,1,1,0,0,0,0}
        };
        int r=a.length;
        int c=a[0].length;
        int count =dfs(a,r,c);
        System.out.println("count : ");
        int arr[]=new int[]{1,2,3,4,3};
        //       [2,3,4,-1,4]
        Arrays.stream(nextGreater(arr)).forEach(System.out::println);
    }

    public static int dfs(int[][] a, int r, int c){
        if(r<0 || r>=a.length || c<0 || c>=a[0].length || a[r][c]!=1){
            return 0;
        }
        return 1+
            dfs(a,r+1,c)+
            dfs(a,r,c+1)+
            dfs(a,r-1,c)+
            dfs(a,r,c-1);
    }
    public static int[] nextGreater(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i==j)
                    continue;
                if(arr[j]>arr[i]){
                    arr[i]=arr[j];
                    break;
                }else {
                    arr[i]=-1;
                }

            }
        }
        return arr;
    }
}
