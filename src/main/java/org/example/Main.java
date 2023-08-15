package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(5);
        insertValue(arr);
        System.out.println(arr);
    }

    private static void insertValue(ArrayList<Integer> arr) {
        arr.add(6);
    }

    private static void doSomething(Student st1) {
        st1=null;
        System.out.println("DEBUG");
    }
}