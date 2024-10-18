//31. Create an insufficientBalanceException Class with the message "Insufficient Balance X for withdrawal of Y".

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(double balance, double amount) {
        super("Insufficient Balance " + balance + " for withdrawal of " + amount);
    }
}
public class AccountException {
    private double balance;
    public AccountException(double intialbalance)
    {
        if(intialbalance<0)
        {
            throw new IllegalArgumentException("Initial balance cannot be negative.");
        }
        this.balance=intialbalance;
    }
    public void Deposit(double amount)
    {
        if(amount<=0)
        {
            throw new IllegalArgumentException("deposite amount must be positive.");
        }
        balance+=amount;
        System.out.println("Suceessfully deposited:"+amount);
    }
    public void withdraw(double amount) throws InsufficientBalanceException{
        if(amount<=0)
        {
            throw new IllegalArgumentException("withdraw amount must be positive");
        }
        if(amount>balance)
        {
            throw new InsufficientBalanceException(balance,amount);
        }
        balance-=amount;
        System.out.println("Successfully withdrew : "+amount);
    }
    public double getBalance()
    {
        return balance;
    }
    public static void main(String[] args)
    {
        try{
            AccountException a=new AccountException(1000);
            System.out.println("Initial balance: " +a.getBalance());
            a.Deposit(500.0);
            System.out.println("Updated balance: " +a.getBalance());
        
        a.withdraw(2000.0);
        }
     catch (InsufficientBalanceException e) {
        System.out.println("Error: " + e.getMessage());
    } catch (IllegalArgumentException e) {
        System.out.println("Error: " + e.getMessage());
    }
    }
}
