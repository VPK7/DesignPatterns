package com.learn.java.sampleprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int[] arr=new int[]{1,2,3};
        int target=7;
       // System.out.println(threeSum(arr,target));
        List<List<Integer>> result=new ArrayList<>();
        result=threeSum(new int[]{-1,0,1,2,-1,-4});
        result.forEach(System.out::println);
    }
    public static void  permute(){

        //i:0 tp n
        //

    }
    public static boolean threeSum(int a[],int k){
        Arrays.sort(a);//1,2,3,5,6,7//12

        for(int i=0;i<a.length-2;i++) {
            int l = i + 1, r = a.length - 1;
            while (l < r) {
                int sum = a[i] + a[l] + a[r];
                if (sum > k) {
                    r--;
                } else if( sum<k){
                    l++;
                }
                else
                return true;
            }
        }
        return  false;
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result =new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            int l=i+1,r=nums.length-1;
            while(l<r){
                int sum=nums[i]+nums[l]+nums[r];
                if( sum == 0){
                    //Integer a[]=new Integer[]{nums[i],nums[l],nums[r]};
                    //List<Integer> list=new ArrayList<Integer>(Arrays.asList(list));
                    List<Integer> list=new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[l]);
                    list.add(nums[r]);
                    result.add(list);
                }
                else if(sum>0)
                    r--;
                else
                    l++;
            }
        }
        return result;

    }
}
