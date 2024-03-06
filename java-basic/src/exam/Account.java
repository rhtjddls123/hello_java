package exam;

public class Account {
    int balance;

    public void deposit(int amount){
        balance += amount;
    }

    public void withdraw(int amount){
        if(balance>=amount){
            balance -= amount;
        }else{
            System.out.println("잔액부족");
        }
    }
}
