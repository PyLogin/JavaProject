import javax.lang.model.element.NestingKind;

public class Account {
    private String cardNo; //卡号
    private String username;//用户名
    private String password;//密码
    private double quota;//取款限额
    private double balance;//余额

    public Account(){

    }

    public Account(String cardNo, String username, String password, double quota, double balance) {
        this.cardNo = cardNo;
        this.username = username;
        this.password = password;
        this.quota = quota;
        this.balance = balance;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getQuota() {
        return quota;
    }

    public void setQuota(double quota) {
        this.quota = quota;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
