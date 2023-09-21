interface Bank {
    void calinterest();
    void displaybalance();
}
 class SavingsAccount implements Bank {
     double balance;
     double interest;
     SavingsAccount(double balance, double interest) {
        this.balance = balance;
        this.interest = interest;
    }
    public void calinterest() {
        balance += balance * interest;
    }
    public void displaybalance() {
        System.out.println("balance:"+balance);
    }
}
class CheckingAccount implements Bank {
     double balance;
     double total;
     CheckingAccount(double balance, double total) {
        this.balance = balance;
        this.total =total;
    }
    public void calinterest() {
    }
    public void displaybalance() {
        System.out.println("balance:"+balance);
    }
}
 class bankk {
    public static void main(String[] args) {
        Bank savingsAccount = new SavingsAccount(2000, 0.02);
        Bank checkingAccount = new CheckingAccount(50000, 10000);
        savingsAccount.calinterest();
        savingsAccount.displaybalance();
        checkingAccount.displaybalance();

    }
}
