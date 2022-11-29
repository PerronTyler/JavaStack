public class Item {
    // attributes
    private String name;
    private double price;

    // constructor
    public Item(){
        this.name = "no name yet";
        this.price = 0;
    }
    public Item(String name, double price){
        this.name = name;
        this.price = price;
    }
    // methods
    public String displayInfo(){
        String output = "name: " + this.name + "\n";
        output += "price: " + this.price + "\n";
        return output;
    }
    public double getPrice(){
        return this.price;
    }
}