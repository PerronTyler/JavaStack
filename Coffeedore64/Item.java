public class Item {
    // attributes
    private String name;
    private double price;
    private int indx;
    private static int count;
    // constructor
    public Item(){
        this.name = "no name yet";
        this.price = 0;
        this.indx = count;
        count++;
    }
    public Item(String name, double price){
        this.name = name;
        this.price = price;
        this.indx = count;
        count++;
    }
    // methods
    public String getItem(){
        String output = "item: " + this.name + "\n";
        output += "price: " + this.price;
        return output;
    }
    public String getName(){
        return this.name;
    }
    public double getPrice(){
        return this.price;
    }
    public int getIndx(){
        return this.indx;
    }
    
}