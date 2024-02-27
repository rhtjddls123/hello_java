package exam;

public class MethodEx3 {
    public static void main(String[] args) {
//        다음은 입금, 출금을 나타내는 코드이다.
//        입금(deposit)과, 출금(withdraw)을 메서드로 만들어서 리펙토링 해보자
        int balance = 10000;
        balance = deposit(balance, 1000);
        balance = withdraw(balance, 2000);
        System.out.println("최종 잔액: " + balance + "원");
    }
    public static int deposit(int balance, int money){
        balance += money;
        System.out.println(money + "원을 입금하였습니다. 현재 잔액: " + balance + "원");
        return balance;
    }
    public static int withdraw(int balance, int money){
        if (balance >= money) {
            balance -= money;
            System.out.println(money + "원을 출금하였습니다. 현재 잔액: " +balance + "원");
        } else {
            System.out.println(money + "원을 출금하려 했으나 잔액이 부족합니다.");
        }
        return balance;
    }
}
