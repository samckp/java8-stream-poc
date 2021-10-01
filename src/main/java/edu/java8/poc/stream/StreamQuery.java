package edu.java8.poc.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Item{
    int id;
    String name;
    float price;
    public Item(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
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

         itemsList.stream()
                .filter(p-> p.price > 50000)
                .map(p->p.price)
                .collect(Collectors.toList())
                .forEach(System.out::println);

         // sorted order by price
        List<Item> prices = itemsList.stream().sorted(
                Comparator.comparingDouble(Item::getPrice))
                .collect(Collectors.toList())
                ;

        for (Item item : prices) {
            System.out.println("ITEMS ::"+ item.getPrice());
        }

    }
}
