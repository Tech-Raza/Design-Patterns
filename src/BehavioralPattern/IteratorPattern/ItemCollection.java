package BehavioralPattern.IteratorPattern;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ItemCollection implements Iterable<Item>{

    private List<Item> items = new ArrayList<>();


    public void addItem(Item item){
        items.add(item);
    }

    @Override
    public Iterator<Item> iterator() {
        return new ItemIterator();
    }

    private class ItemIterator implements Iterator<Item>{

        private int currentIndex=0;

        @Override
        public boolean hasNext() {
            return currentIndex<items.size();
        }

        @Override
        public Item next() {
            if(!hasNext())
            {
                try {
                    throw new NoSuchFieldException();
                } catch (NoSuchFieldException e) {
                    throw new RuntimeException(e);
                }
            }
            Item item = items.get(currentIndex);
            currentIndex++;
            return item;
        }

        @Override
        public void remove() {
            items.remove(--currentIndex);
        }
    }
}
