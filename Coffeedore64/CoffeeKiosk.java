import java.util.ArrayList;

public class CoffeeKiosk {
    //attributes
    private ArrayList<Item> menu = new ArrayList<Item>();
    private ArrayList<Order> orders = new ArrayList<Order>();

    // constructor
    public CoffeeKiosk(){
        this.menu = new ArrayList<Item>();
        this.orders = new ArrayList<Order>();
    }
    // methods

    //getters
    public String getMenu(){
        String output = "";
        for(Item item: menu){
            output += item.getIndx() + ": " + item.getName() + " --- ";
            output += "price: " + item.getPrice() + "\n";
        }
            return output;
    }
    //setters
    public void addItemToMenu(Item item){
        this.menu.add(item);
    }
    public void addOrder(Order order){
        this.orders.add(order);
    }
        public void newOrder() {
        
    	// Shows the user a message prompt and then sets their input to a variable, name
        System.out.println("Please enter customer name for new order:");
        String name = System.console().readLine();

        Order incomingOrder = new Order(name);
        System.out.println(getMenu());
    	// Prompts the user to enter an item number
        System.out.println("Please enter a menu item index or q to quit:");
        String itemNumber = System.console().readLine();
        
        // Write a while loop to collect all user's order items
        while(!itemNumber.equals("q")) {
            for(Item item: menu){
                if(item.getIndx() == (Integer.parseInt(itemNumber))){
                    incomingOrder.addItem(item);
                }
            }
            System.out.println("Please enter a menu item index or q to quit:");
            itemNumber = System.console().readLine();
            // Get the item object from the menu, and add the item to the order
            // Ask them to enter a new item index or q again, and take their input
        }
        System.out.println(incomingOrder.getOrderInfo());
        // After you have collected their order, print the order details 
    	// as the example below. You may use the order's display method.
        
    }

}