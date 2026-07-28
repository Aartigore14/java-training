abstract class BankAccount {
    private int accNo;
    private double balance;

    public int getAccNo(){
        return accNo;
    }

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    abstract double calculateInterest();
}

class SavingsAccount extends BankAccount{
    @Override
    double calculateInterest(){
        return getBalance()*0.05;
    }
}

void main() {
    BankAccount acc = new SavingsAccount();
    acc.setAccNo(76543);
    acc.setBalance(12500);
    System.out.println("Account Number:"+acc.getAccNo());
    System.out.println("Balance:"+acc.getBalance());
    System.out.println("Interest :"+acc.calculateInterest());
}
