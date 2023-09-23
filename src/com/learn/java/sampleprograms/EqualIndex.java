package com.learn.java.sampleprograms;

import java.util.Arrays;

public class EqualIndex {
    /**
     * For a given integer array, find an index such that the sum of the elements on to its left is equal to sum of the elements
     * on the right. if no such element exists, return a -1
     * A = {1,1,1,1,8,4} => 4
     * //t=16
     * //
     */
    public static void main(String[] args) {
        //int arr[]=new int[]{10,5,15,3,4,21,2};//1,2,3,4,12,16//
        int arr[]=new int[]{1,1,1,1,8,4};//1,2,3,4,12,16//
        //16
        //15,14,13,12
        System.out.println("equal index "+findIndex(arr));
    }
    public static int findIndex(int arr[]){
        int tot_sum=0;
        for(int i=0;i< arr.length;i++){
            tot_sum+=arr[i];
        }
        System.out.println(" toatal "+tot_sum);
        //int lsum=0;
        int sum_arr[]=new int[arr.length];
        sum_arr[0]=arr[0];
        for (int i=1;i< arr.length;i++){
            sum_arr[i]=sum_arr[i-1]+arr[i];
        }
        for (int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
        for (int i=0;i<sum_arr.length;i++)
            System.out.print(sum_arr[i]+" ");
        System.out.println();
        for (int i=0;i< arr.length;i++){

            System.out.println(tot_sum+" "+sum_arr[i]);
             if(tot_sum==sum_arr[i]){
                 return i;
             }
            tot_sum-=arr[i];

        }
        return -1;
    }
}
