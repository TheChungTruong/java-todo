package com.collections.list;

import java.util.ArrayList;
import java.util.List;

public class Ex02 {
    public static void main(String[] args) {
        List<Integer> digits = new ArrayList<>();
        digits.add(2000);
        digits.add(3000);
        digits.add(4000);
        for (Integer digit : digits) {
            System.out.println(digit * 2);
        }
        ;
        List<String> students = new ArrayList<>();
        students.add("John");
        students.add("chun");
        for (String student : students) {
            System.out.println(student);
        }
    }
}
