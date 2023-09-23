package com.learn.java.sampleprograms;

import java.util.Arrays;

public class  StringPrgm {
    public static void main(String[] args) {

        String name = "Myname is varaprasad kallepalli";
       // oput: "MyNamE iS vAraPraSad kaLlePalLi

        char nameArr[]=new char[name.length()];//MyNamE
        int count=0;
        int j=0;
        for(int i=0;i<name.length();i++){
            count++;//123//123
            if(count==3){
                char c=Character.toUpperCase(name.charAt(i));
                nameArr[j]= c;
                j++;
                count=0;
            }
            else{
                nameArr[j]=name.charAt(i);
                j++;
            }
        }
        System.out.println(" output ===" +String.valueOf(nameArr));
//        nameArr.toString();

    }

}
