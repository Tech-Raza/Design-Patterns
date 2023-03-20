package BehavioralPattern.IteratorPattern;

import java.util.Iterator;

public class IteratorPattern {
    public static void main(String[] args) {
        ItemCollection itemCollection = new ItemCollection();
        itemCollection.addItem(new Item("Computer",25000.0));
        itemCollection.addItem(new Item("Mobile",15000.0));
        itemCollection.addItem(new Item("Laptop",35000.0));

        Iterator<Item> iterator = itemCollection.iterator();
        while (iterator.hasNext())
        {
            Item item = iterator.next();
            System.out.println(item.getName()+": "+item.getPrice());

        }
    }

}
