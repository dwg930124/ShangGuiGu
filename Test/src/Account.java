/**
 * @author DWG
 * @create 2020-06-13-10:33
 */
public class Account {
    private int id; //账号
    private double balance; //余额
    private double annualInterestRate;  //年利率

    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    /**
     * 取款
     * @param amount
     */
    public void withdraw(double amount){
        if (amount > balance){
            System.out.println("余额不足，取款失败！");
            return;
        }

        balance -= amount;

        System.out.println("成功取出："+amount);
    }

    /**
     * 存款
     * @param amount
     */
    public void deposit(double amount){
        balance += amount;
        System.out.println("成功存入："+amount);
    }
}
