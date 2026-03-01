class BankAccount{
    int accountnumber;
    double balance;

    BankAccount(int accountnumber,double balance){
        this.accountnumber=accountnumber;
        this.balance=balance;
    }

    void deposit(double amount){
        balance=balance+amount;
    }
    void withdraw(double amount){
        if(balance>=amount){
            balance=balance-amount;
        }
        else{
            System.out.println("Insufficient Balance");
        }
    }
    void display()
    {
        System.out.println("Account Number:"+accountnumber);
        System.out.println("Balance:"+balance);
    }

}
public class ConstructorProblem1{
    public static void main(String args[]){
        BankAccount ba=new BankAccount(101,5000);
        ba.deposit(1000);
        ba.withdraw(2000);
        ba.display();
    }
}