package com.collections.list;

import bean.Item;

import java.util.List;

import static model.DataProvider.getItems;
import static model.DataProvider.printf;

public class Ex05 {

    private static Item item;

    static {
        item = new Item(1, 2, "Strore 1 - Item 2", 260);
    }

    public static void main(String[] args) {
        List<Item> items = getItems();
        System.out.println("Is Exist ? " + items.contains(item));
        System.out.println("=======================");
        items.remove(item);
        printf(items);
    }


}
