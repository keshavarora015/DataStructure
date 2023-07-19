package org.example.Java.StreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class demo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

//        Stream<Integer> list2 = list.stream().filter(x->x%2==0);
//
//        list2.forEach(
//                x-> System.out.println(x));

        list.stream().filter(x->x%2==0).forEach(x -> System.out.println(x));



        int sum = list.stream().mapToInt(Integer::intValue).sum();

        System.out.println(sum);
    }
}
