package com.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex03 {
    public static void main(String[] args) {
        List<String> statuses = new ArrayList<>();
        statuses.add("ORDER");
        statuses.add("PACKAGE");
        statuses.add("DELIVERY");
//        statuses.set(3, "Boom");
        System.out.println("size: " + statuses.size());
        System.out.println("statusus[1]: " + statuses.get(1));

        for (String status: statuses){
            System.out.println(status);
        }
        Iterator<String> iterator = statuses.iterator();
        while (iterator.hasNext()){
            String status = iterator.next();
            System.out.println("iterator: " + status);

        }
        String word = "PACKAGE";
        System.out.println(" có ton tai phan tu trong mang khong: " +statuses.contains(word));
        statuses.remove(0);
        for (String status: statuses){
            System.out.println(status);
        }
        statuses.removeIf(status ->status.length()<6);
        for (String status: statuses){
            System.out.println(status);
        }

    }
}
