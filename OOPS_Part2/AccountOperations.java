//27. Write a program to create an interface called account operation with methods deposit(), getBalance().Implement this interface in Account class.
interface Account{
    void deposit(double amount);
    double getBalance();
}
class AccountOperations implements Account{
    private double balance;
    public AccountOperations(double intialBalance)
    {
        this.balance=intialBalance;
    }
    public void deposit(double amount)
    {
        if(amount>0)
        {
            balance+=amount;
            System.out.println("Successfully deposited : "+amount);
        }
        else{
            System.out.println("deposit amount must be posisitve");
        }
    }
    public double getBalance()
    {
        return balance;
    }
    public static void main(String[] args)
    {
        AccountOperations a1=new AccountOperations(1000);
        System.out.println("Initial account balance : "+a1.getBalance());
        a1.deposit(700);
        System.out.println("Updated balance : "+a1.getBalance());
    }
}