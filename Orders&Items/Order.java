import java.util.ArrayList;
public class Order {
    // attributes
    private String name;
    private double total;
    private boolean ready;
    private ArrayList<Item> items = new ArrayList<Item>();

    //constructor
    public Order(){
        this.name = "no name yet";
        // this.items = new Arraylist<Item>();
    }
    public Order(String name){
        this.name = name;
        this.ready = false;
    }
    // methods
    public double getTotal(){
        double sum = 0;
        for(Item item:items){
            sum += item.getPrice();
        }
        this.total = sum;
        return this.total;
    }
    public void addItem(Item item){
        this.items.add(item);
    }
    public void setName(String name){
        this.name = name;
    }
    public boolean isReady(){
        return this.ready;
    }
    public void setIsReady(){
        this.ready = true;
    }
    public String getName(){
        return this.name;
    }
}