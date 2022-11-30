public class TestBankAccount {
    public static void main(String[] args){
        BankAccount account1 = new BankAccount("Cindy", 5000, 5000);
        account1.getName();
        account1.getSavingsBalence();
        account1.getCheckingBalence();
        System.out.println(account1.getName() + "\n" + account1.getSavingsBalence() + "\n" + account1.getCheckingBalence());
        System.out.println("number of Accounts: " + BankAccount.getAccounts() + "\n" + "Total Money in Vault: " + BankAccount.getTotalMoney());
        
        // Cindy withdraws 300$ from her checking
        account1.withdrawChecking(300);
        System.out.println("Checking Balence :" + account1.getCheckingBalence());
    }
}