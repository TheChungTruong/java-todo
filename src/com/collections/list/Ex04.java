package com.collections.list;

import java.util.ArrayList;
import java.util.List;

public class Ex04 {
    public static void main(String[] args) {
        List<Integer> storeAItems = new ArrayList<>();
        storeAItems.add(1);
        storeAItems.add(2);
        storeAItems.add(3);
        storeAItems.add(4);
        storeAItems.add(5);
        storeAItems.add(6);
        List<Integer> storeBItems = new ArrayList<>();
        storeBItems.add(5);
        storeBItems.add(6);
        storeBItems.add(7);
        storeBItems.add(8);
        List<Integer> combinedStoreItems = new ArrayList<>();
//        hợp hai tập hợp
        combinedStoreItems.addAll(storeAItems);
//        hiệu giữa hai tập hợp
        combinedStoreItems.removeAll(storeAItems);
//        giao giữa hai tập hợp
        combinedStoreItems.retainAll(storeBItems);
        printf(combinedStoreItems);
    }
    private static void printf(List<Integer> items){
        for(Integer item: items){
            System.out.println(item + " ");
        }
        System.out.println();
    }
}
