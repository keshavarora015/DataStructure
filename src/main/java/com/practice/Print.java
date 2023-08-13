package com.practice;

import java.util.List;

public class Print {

    public void print(List<Integer> list) {
        for (int data : list){
            System.out.print(data+" ");
        }
    }

    public void print(int[] list) {
        for (int data : list){
            System.out.print(data+" ");
        }
    }

    public <T> void print2DList(List<List<T>> list) {
        for (List<T> innerList : list) {
            for (T data : innerList) {
                System.out.print(data + " ");
            }
            System.out.println();
        }
    }

    public void print2array(int[][] list) {
        for (int[] l: list ){
            for (int data : l){
                System.out.print(data+" ");
            }
            System.out.println();
        }
    }

    public void print(char[] s) {
        for (char data : s){
            System.out.print(data+" ");
        }
    }
}
