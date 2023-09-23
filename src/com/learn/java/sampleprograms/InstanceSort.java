package com.learn.java.sampleprograms;

import java.util.*;

public class InstanceSort {
    public static void main(String[] args) {
        Object arr[]=new Object[]{"ab",'f',1,"vd",5,'a'};
        //output : {1,5,'a','f',"ab","vd"}
        //Object arr[]=new Object[]{"ab",1,"vd",5};
        Arrays.sort(arr,new Comparator<Object>(){
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 == null)
                    return -1;// o1 is null, should be less than any value
                if (o2 == null)
                    return -1;// o2 is null, should be less than any non-null value
                if (o1 instanceof Integer) {
                    if (o2 instanceof Integer) {
                        return ((Integer) o1).compareTo((Integer) o2);// Compare by int
                    } else {
                        return -1;// int < String
                    }
                } else if (o1 instanceof Character){
                    if (o2 instanceof Character){
                        return ((Character) o1).compareTo((Character) o2);
                    }else if (o2 instanceof Integer){
                        return 1;
                    }else {
                        return -1;
                    }
                }else {
                    if(o2 instanceof String){
                        return ((String)o1).compareTo((String) o2);
                    }else {
                        return 1;
                    }
                }

            }
        });
        Arrays.stream(arr).forEach(System.out::println);
    }

}

