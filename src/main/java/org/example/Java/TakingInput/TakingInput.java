package org.example.Java.TakingInput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) throws IOException {

        System.out.println("Input Data");
        //Old Style to take input
//        InputStreamReader in = new InputStreamReader(System.in);
//        BufferedReader bf = new BufferedReader(in);
//
//        int input = Integer.parseInt(bf.readLine());
//        System.out.println(input);
        //New Style to take input :: After java 1.5
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(input);

    }
}
