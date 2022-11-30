public class CoffeeKioskTest {
    public static void main(String[] args){
        CoffeeKiosk kiosk1 = new CoffeeKiosk();
        Item item1 = new Item("banana", 3.00);
        Item item2 = new Item("apple", 4.20);
        Item item3 = new Item("kiwi", 6.90);
        Item item4 = new Item("pear", 2.50);
        Item item5 = new Item("strawberries", 5.90);

        kiosk1.addItemToMenu(item1);
        kiosk1.addItemToMenu(item2);
        kiosk1.addItemToMenu(item3);
        kiosk1.addItemToMenu(item4);
        kiosk1.addItemToMenu(item5);


        kiosk1.newOrder();
    }
}