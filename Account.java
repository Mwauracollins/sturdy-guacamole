import java.util.Scanner;
public class Account {
    public class BankAccount{
        public String accountNo;
        public float balance;
        public String accountType;
        public BankAccount(String accountNo, String accountType, float balance){
            this.accountNo = accountNo;
            this.accountType = accountType;
            this.balance = balance;

            }
        Scanner input = new Scanner(System.in);
        public void deposit(float amount){
            System.out.print("Enter amount to be deposited:");
            amount= input.nextFloat();
            balance += amount;
            System.out.println("You have successfully deposited: amount ");
        }
        public void withdraw(float amount){
            if (balance < amount){
                System.out.println("You have insufficient balance in your account.");

            }else{
                System.out.println("You have withdrawn amount");

            }

        }
        public float checkBal(){
            return balance;

        }
        
        }
    class CurrentAccount extends BankAccount{
        public CurrentAccount(String accountNo, float balance){
        super(accountNo, "CurrentAccount", balance);
    }
    public void deposit(float amount){
        balance += amount;
        System.out.println("You have successfully deposited + amount + to your current account");
    }
    public void withdraw(float amount){
        if (amount <= balance - 50000){
            System.out.println("You have successfully withdrawn + amount + from your current account");

        }else{
            System.out.println("Not enough money in your current account");

        }
    
    }
    //I don't know the scanner stuff so you have to fill this method
    public void transact(float amount){

    }
    }
    class SavingsAccount extends BankAccount{
        private float interestRate;
        private float interest;
        public SavingsAccount(String accountNo, float balance, float interest, float interestRate){
            super(accountNo, "SavingsAccount", balance);
        }
        public void deposit(float amount){
            interest = interestRate * amount;
            balance += interest;
            System.out.println("Your final balance after saving is {balance}");

        }
        public void withdraw(float amount){
            if (amount <= balance){
                System.out.println("You have withdrawn {amount} from your savings account. Please wait for approval");
            }else{
                System.out.println("Insufficient funds to approve request");

            }
        }
    }
    class FixedDepo extends BankAccount{
        private float interestRate;
        private float balance;
        private float time;
        private float amount;
        public FixedDepo(String accountNo, float balance, float interestRate, float time){
            super(accountNo, "FixedDepo", balance);
        }
        public void deposit(float amount){
            //Enter the period of time in months
            System.out.println("You have deposited + amount + to a fixed depo for + time + months");
            
            }
            public float finalBalance(){
                balance = amount * interestRate * time;
                return balance;

        }
        public void withdraw(float amount){

        }
        
    }
    public static void main(String[] args) {
        Account myobj = new Account();
        System.out.println(myobj);
        
    }
    
    
}
