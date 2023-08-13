package com.practice.Java.StreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class demo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(22);
        list.add(33);
        list.add(45);

        //filter(Predicate)
                //boolean value function
        //map(Function)
        /**
         *  each element pr operation perform krta hai
         * */

        //Filter all even number from list
        Stream<Integer> stream = list.stream();
        List<Integer> output = stream.filter(e->e%2 == 0).collect(Collectors.toList());
        System.out.println(output);

        //Filter all number greater than 20
        List<Integer> output1 = list.stream().filter(e->e>20).collect(Collectors.toList());
        System.out.println(output1);


        List<Integer> output2 = list.stream().map(i->i*i).collect(Collectors.toList());
        System.out.println(output2);

       list.stream().forEach(e->{
           System.out.print(e+" ");
       });














////        Stream<Integer> list2 = list.stream().filter(x->x%2==0);
////
////        list2.forEach(
////                x-> System.out.println(x));
//
//        list.stream().filter(x->x%2==0).forEach(x -> System.out.println(x));
//
//
//
//        int sum = list.stream().mapToInt(Integer::intValue).sum();
//
//        System.out.println(sum);
    }
}
