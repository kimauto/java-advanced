package day02.exception.userDefineEx;

public class Account {

    private long balance;

    public Account() {}
    public Account(long balance) {
        this.balance = balance;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public void deposit(int money){
        balance += money;
    }
    public void withdraw(int money) throws InsufficientEx{
        if (balance < money){
            throw new InsufficientEx("잔고 부족으로 출금이 안됩니다." + (money-balance) + "이 부족합니다.");
        }
        balance -= money;
    }
}
