package com.functionalProgramming.java;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //String s = scan.nextLine();
       String s = "How the Avocado Became the Fruit of the Global Trade";
         getHashTags(s);


        scan.close();
    }

    private static void getHashTags(String s) {
        String str[] = s.split(" ");
        Map<String, Integer> map = new TreeMap<String, Integer>();

        for (String str1 : str) {
             int size=str1.length();
             map.put(str1,size);

        }
        System.out.println(map);
        Map<String, Integer> sortedmap = new TreeMap<>(new Comparator<String>()
        {
            @Override
            public int compare(String o1, String o2)
            {
                if(o2.length() == o1.length())
                     return o1.compareTo(o2);
                return o2.length() - o1.length();
            }
        });
        sortedmap.putAll(map);
        for(Map.Entry<String, Integer> map1:sortedmap.entrySet()){

                System.out.print("#"+map1.getKey() +",");


        }







    }
}