package BehavioralPattern.StrategyPattern;


import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> items;

    public ShoppingCart()
    {
        this.items = new ArrayList<>();
    }
    public void addItem(Item item)
    {
        this.items.add(item);
    }
    public void removeItem(Item item)
    {
        this.items.remove(item);
    }
    public double calculateTotal(){
        double total=0;
        for(Item item : items)
        {
            total+=item.getPrice();
        }
        return total;
    }

    public void pay(PaymentStrategy paymentStrategy)
    {
        double amount = calculateTotal();
        paymentStrategy.pay(amount);
    }


}
