package edu.java8.poc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConcurrentModiExceptionExample {

    public static void main(String[] args) {

        List<String> listOfBooks = new ArrayList<>();
        listOfBooks.add("Programming in Java");
        listOfBooks.add("Clean Code");
        listOfBooks.add("Improve Java");
        listOfBooks.add("Complete learning");

        System.out.println("iterateList --->");
        iterateList(listOfBooks);

        System.out.println("traditionalLoop --->");
        traditionalLoop(listOfBooks);

        System.out.println("Use java 8 removeIf method --->");
        removeIfMethod(listOfBooks);

    }
    public static void  iterateList(List<String> listOfBooks){

        // Traversing the list by Iterator
        Iterator<String> it = listOfBooks.iterator();
        while(it.hasNext())
        {
            String book = it.next();
            System.out.println(book);
            // Removing the object if condition is true
            if(book.contains("Clean Code"))
            {
//                listOfBooks.remove(book);  // ConcurrentModificationException
                it.remove();        // solve CocurrentModificationException
            }
        }
    }

    public static void  traditionalLoop(List<String> listOfBooks){

        for (int i = 0; i < listOfBooks.size(); i++)
        {
            String book = listOfBooks.get(i);
            System.out.println(book);
            if(book.equals("Clean Code"))
                listOfBooks.remove(i);
        }

        System.out.println(listOfBooks);
    }

    public static void removeIfMethod(List<String> listOfBooks){

        System.out.println("Before ::" + listOfBooks);

        listOfBooks.removeIf(name -> name.equals("Clean Code"));

        System.out.println("After ::" + listOfBooks);

    }
}
