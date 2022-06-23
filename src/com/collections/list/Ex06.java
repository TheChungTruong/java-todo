package com.collections.list;

import bean.Item;
import model.DataProvider;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ex06 {
    /**
     *
     */
    public static void main(String[] args) {
        List<Item> items = DataProvider.getItems();
        Collections.sort(items, Comparator.comparing(Item::getStoreId)
                    .thenComparing(Item::getItemId,Comparator.reverseOrder()));
        DataProvider.printf(items);
      }
}
