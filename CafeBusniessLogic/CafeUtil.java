import java.util.ArrayList;

public class CafeUtil{
    public int getStreakGoal(int weeks) {
        int count = 0;
        int total = 0;
        while(count < weeks){
            count += 1;
            total += count;
        }
    return total;
    }
    public double getOrderTotal(double[] prices) {
        double total = 0;
        for(double order : prices) {
            total += order;
        }
        return total;
    }
    public void displayMenu(ArrayList<String> menuitems){
        int count = 0;
        for(String item:menuitems){

            System.out.println(count + " " + item);
            count++;
        }
    }
    public void addCustomer(ArrayList<String> customers){
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.println("Hello," + userName + "!");
        System.out.println("There are " + customers.size() + " people in front of you");
        customers.add(userName);
        System.out.println(customers);
    }
}