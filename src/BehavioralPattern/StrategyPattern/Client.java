package BehavioralPattern.StrategyPattern;

import BehavioralPattern.IteratorPattern.Item;

public class Client {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.addItem(new Item("Book",10));
        cart.addItem(new Item("Pen",2));
        cart.addItem(new Item("NoteBook",5));

        //Make a payment using Credit Card
        PaymentStrategy creditCardPayment = new CreditCardPayment("John Rozer","786543219","567","02/25");
        cart.pay(creditCardPayment);

        //Make a payment using PayPal
        PaymentStrategy payPalPayment = new PayPalPayment("johnrozer@gmail.com","password");
        cart.pay(payPalPayment);

    }
}
