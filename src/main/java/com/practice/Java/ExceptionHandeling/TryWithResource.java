package com.practice.Java.ExceptionHandeling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResource {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Input Data");
            String input = br.readLine();
            System.out.println(input);
        }
    }
}
