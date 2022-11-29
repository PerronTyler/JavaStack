import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
    
        // Menu items
            Item item1 = new Item("mocha", 4.5);
            Item item2 = new Item("latte", 5.0);
            Item item3 = new Item("drip coffee", 3.5);
            Item item4 = new Item("capuccino", 6.5);

        // Order variables -- order1, order2 etc.
            Order order1 = new Order("Cindhuri");
            order1.addItem(item1);
            Order order2 = new Order("Jimmy");
            order2.addItem(item1);
            Order order3 = new Order("Noah");
            order3.addItem(item4);
            Order order4 = new Order("Sam");
            order4.addItem(item2);
        // Application Simulations
        // Use this example code to test various orders' updates
        System.out.printf("Name: %s\n", order1.getName());
        System.out.printf("Total: %s\n", order1.getTotal());
        System.out.printf("Ready: %s\n", order1.isReady());
        order1.setIsReady();
        order4.addItem(item2).addItem(item2);
        order2.setIsReady();
    }
}
