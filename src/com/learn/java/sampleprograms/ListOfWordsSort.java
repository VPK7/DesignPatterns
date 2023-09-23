package com.learn.java.sampleprograms;

import java.util.*;

public class ListOfWordsSort {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("K Murugesan","K varaprasad" ,"S Sankaran"  , "Y Anand", "ch prasanna sai"));
        //output : [ "Y Anand" , "K Murugesan" , "S Sankaran" ,"ch prasanna sai","K varaprasad" ]
        list.sort((o1, o2) -> {
            String[] s1 = o1.split(" ");
            String[] s2 = o2.split(" ");
            return s1[1].compareTo(s2[1]);
        });
        list.forEach(System.out::println);
    }
}
