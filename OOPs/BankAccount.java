package OOPs;

class BankAccount {
    public int balance;
    public String name;

     BankAccount(int balance, String name) {
        this.balance = balance;
        this.name = name;
    }
    public void depositFund (int depositAmount){
        balance = balance + depositAmount;
    }
    public boolean withdrawFund (int withdrawAmount){
        if (balance >= withdrawAmount){
            balance = balance - withdrawAmount;
            System.out.println("Withdraw went successful");
            return true;
        }
        else {
            System.out.println("Insufficient Funds");
            return false;
        }
    }
}
