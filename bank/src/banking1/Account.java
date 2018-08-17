package banking1;

public class Account {
    private double balance;//账号余额

    public Account(double init_balance){
        balance=init_balance;
    }

    public double getBalance() {
        return balance;
    }

    //存钱
    public void deposit(double amt){
        balance+=amt;
    }

    //取钱
    public void withraw(double amt){
        if (balance>=amt){
            balance-=amt;
        }else {
            System.out.println("您的余额不足！！！！！");
        }
    }

}

