public class BankAccount{
    //attributes
    private static int accounts;
    private static double totalMoney;
    private String name;
    private double checkingBalence;
    private double savingsBalence;

    // constructors
    public BankAccount(){
        this.name = "no name yet";
        this.checkingBalence = 0;
        this.savingsBalence = 0;
        accounts++;
    }
    public BankAccount(String name, double checkingBalence, double savingsBalence){
        this.name = name;
        this.checkingBalence = checkingBalence;
        this.savingsBalence = savingsBalence;
        accounts++;
        totalMoney += checkingBalence + savingsBalence;
    }

    // methods

    // getters
    public String getName(){
        return this.name;
    }

    public double getCheckingBalence(){
        return this.checkingBalence;
    }

    public double getSavingsBalence(){
        return this.savingsBalence;
    }
    
    public static int getAccounts(){
        return accounts;
    }

    public static double getTotalMoney(){
        return totalMoney;
    }
    
    public double getTotalBalences(){
        return this.checkingBalence + this.savingsBalence;
    }

    // setters
    public void setName(String name){
        this.name = name;
    }

    public void setCheckingBalence(double checkingBalence){
        totalMoney -= this.checkingBalence;
        this.checkingBalence = checkingBalence;
        totalMoney += checkingBalence;
    }
    public void setSavingsBalence(double savingsBalence){
        totalMoney -= this.savingsBalence;
        this.savingsBalence = savingsBalence;
        totalMoney += savingsBalence;
    }
    public void depositSavings(double request){
            totalMoney += request;
            this.savingsBalence += request;
    }
    public void depositChecking(double request){
            totalMoney += request;
            this.checkingBalence += request;
    }
    public void withdrawSavings(double request){
        if (this.savingsBalence >= request){
            totalMoney -= request;
            this.savingsBalence -= request;
        } else {    
            System.out.println("not enough funds for request");
        }
    }
    public void withdrawChecking(double request){
        if (this.checkingBalence >= request){
            totalMoney -= request;
            this.checkingBalence -= request;
        } else {
            System.out.println("not enough funds for request");
        }
    }
}   