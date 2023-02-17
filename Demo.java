public class Demo{
    class Account{
        //creation of instance variables which are to be used within the class
        private int accountNumber;
        private String accountType;
        private float balance;

        //creation of a class --> Account which will have attributes like accountType, accountNumber and balance
        //It will also have methods like deposit and withdraw
        public Account(int accountNumber, String accountType, float balance){
            this.accountType = accountType;
            this.accountNumber = accountNumber;
            this.balance = balance;

        }
        //The deposit() takes the parameter amount and increments the value to the balance when an argument is passed
        public float deposit(float amount){
            balance += amount;
            return balance;
        }
        public void withdraw(float amount){
            if (amount <= balance + 50000){
                balance -= amount;
            }
            else{
                //I don't know what to fill in here so you guys have to help me
            }
        }

        }
        class SavingsAccount extends Account{
            private double interestRate;
            private double interest;
            private float balance;
            public SavingsAccount(int accountNumber, float interestRate, float balance){
                super(accountNumber, "SavingsAccount", balance);
                this.interestRate = interestRate;
                
            }
            //  The method savingsTotal is used to calculate the total amounted after saving 
            public void savingsTotal(){
                interest = balance * interestRate;
                balance += interest;
                

            }
            


    }
}
