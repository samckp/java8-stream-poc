package edu.java8.poc;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Item{
    int id;
    String name;
    float price;
    public Item(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class StreamQuery {

    public static void main(String[] args) {

        List<Item> itemsList = new ArrayList<Item>();
        //Adding Products
        itemsList.add(new Item(1,"IBM Laptop",35000f));
        itemsList.add(new Item(2,"Dell Laptop",40000f));
        itemsList.add(new Item(3,"Lenevo Laptop",38000f));
        itemsList.add(new Item(4,"Sony Laptop",48000f));
        itemsList.add(new Item(5,"LG Laptop",91000f));
        itemsList.add(new Item(6,"HP Laptop",71000f));
        itemsList.add(new Item(7,"Acer Laptop",41000f));


        List<Float> prices = itemsList.stream()
                .filter(p-> p.price > 50000)
                .map(p->p.price)
                .collect(Collectors.toList());

        System.out.println("less than 50000 ::"+ prices);
    }
}
