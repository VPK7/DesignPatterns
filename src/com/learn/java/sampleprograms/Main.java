package com.learn.java.sampleprograms;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int nums[]=new int[]{1,1,2};
        HashMap<Integer, Integer> counter = new HashMap<>();
        for (int num : nums) {
            if (!counter.containsKey(num))
                counter.put(num, 0);
            counter.put(num, counter.get(num) + 1);
        }
       /* counter.forEach( (key,value)-> System.out.println(
                "key :" +key +" "+"val : "+value
        ));*/
        PriorityQueue<Integer> queue=new PriorityQueue<>();
        queue.add(5);
        queue.add(10);
        queue.add(1);
        queue.add(15);
        queue.add(7);

        queue.forEach(System.out::println);
        System.out.println(" === ");
        System.out.println(queue.poll());
        System.out.println(" === ");
        queue.forEach(System.out::println);

    }


}
