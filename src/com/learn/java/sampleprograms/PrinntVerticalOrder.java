package com.learn.java.sampleprograms;

import java.util.Arrays;

public class PrinntVerticalOrder {
    public static void main(String[] args) {
        String s = "my name is dheeraj";
        //Expected Output
        //  M N I D j=0, i=0,1,2,3
        //  y a s h j=1
        //    m   e j=2
        //    e   e 3
        //        r 4
        //        a 5
        //        j 6
     //   printVertical(s);
        System.out.println(findMedianSortedArrays(new int[]{1,2},new int[]{3,4}));
    }
    public static void printVertical(String s){
        String[] words=s.split(" ");
        int c=words.length;
        int r=longestLength(words);
        char m[][]=new char[r][c];
        for(int i=0;i<r ;i++){
            for(int j=0;j<words.length;j++){
                if(i<words[j].length())
                    m[i][j]=words[j].charAt(i);
                else
                    m[i][j]=' ';
            }
        }
//        int rows= words.length;;
//        int cols=words[0]
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[0].length;j++)
                System.out.print(m[i][j]+" ");
            System.out.println();
        }
        System.out.println("hi "+m[1][0]);
        // Loop through all rows
        for (char[] row : m)

             //converting each row as string
             //and then printing in a separate line
            System.out.println(Arrays.toString(row));

    }
    public static int longestLength(String[] words){
        int max=Integer.MIN_VALUE;
        for(int i=0;i< words.length;i++){
            if(words[i].length()>max)
                max=words[i].length();
        }
        return max;
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int nums[]=new int[nums1.length+nums2.length];
        int i;
        for( i=0;i<nums1.length;i++){
            nums[i]=nums1[i];
        }
        for(int j=0;j<nums2.length;j++,i++){
            nums[i]=nums2[j];
        }
        Arrays.sort(nums);
        int p=0,q=0;
        int n=nums.length;
        while(q<n && q+1<n){
            p=p+1;
            q=q+2;
        }
        for (int k=0;k<nums.length;k++){
            System.out.println(nums[k]);
        }
        if(n%2==0)
            return ((double)(nums[p]+nums[p-1]))/2;
        return nums[p];
    }
}
