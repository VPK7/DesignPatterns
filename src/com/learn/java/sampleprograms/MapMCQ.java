package com.learn.java.sampleprograms;

import java.util.HashMap;

public class MapMCQ {
    public static class Person{
        String name;
        int id;

        public Person(String name, int id) {
            this.name = name;
            this.id = id;
        }

        Person(){

        }
    }
    public static void main(String[] args) {

        Person person=new Person("Varaprasad",37);
        HashMap<Person,Integer> map= new HashMap<>();
        map.put(person,1);
        Person person1=new Person("Varaprasad",37);
        System.out.println(map.get(person1));
        System.out.println(map.get(person));

    }
}

