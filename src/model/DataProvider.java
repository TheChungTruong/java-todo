package model;

import bean.Item;

import java.util.ArrayList;
import java.util.List;

public  class DataProvider {
    private DataProvider() {
    }

    public static List<Item> getItems() {
        List<Item> items = new ArrayList<>();
        items.add(new Item(1, 1, "Strore 1 - Item 1", 120));
        items.add(new Item(1, 2, "Strore 1 - Item 2", 260));
        items.add(new Item(1, 3, "Strore 1 - Item 3", 170));
        items.add(new Item(2, 3, "Strore 2 - Item 3", 110));
        items.add(new Item(2, 4, "Strore 2 - Item 4", 90));
        items.add(new Item(3, 5, "Strore 3 - Item 6", 120));
        items.add(new Item(3, 6, "Strore 3 - Item 6", 290));
        return items;
    }

    public static void printf(List<Item> items) {
        for (Item item : items) {
            System.out.println(item);
        }
    }
}
