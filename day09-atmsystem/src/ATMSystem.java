import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ATMSystem {
    public static void main(String[] args) {

        ArrayList<Account> accounts = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("========欢迎您进入黑马ATM系统========");
            System.out.println("1.登录账户");
            System.out.println("2.注册账户");
            System.out.println("请输入命令1/2选择对应的操作");
            int command = scanner.nextInt();
            switch (command) {
                case 1:
                    // 登录账号
                    login(accounts, scanner);
                    break;
                case 2:
                    // 注册账户
                    register(accounts, scanner);
                    System.out.println("注册了");
                    break;
                default:
                    System.out.println("您的输入有误，请重新输入");
            }
        }
    }

    /**
     * 登录功能
     *
     * @param accounts 账户集合
     * @param scanner  键盘扫描器对象
     */

    private static void login(ArrayList<Account> accounts, Scanner scanner) {
        System.out.println("========欢迎您进入黑马ATM系统登录页面========");
        if (accounts.size() == 0) {
            System.out.println("当前系统中没有用户，请先注册一个");
            return;
        }

        while (true) {
            System.out.println("请您输入卡号");
            String cardNo = scanner.next();
            Account acount1 = getAccountByCarNo(accounts, cardNo);
            if (acount1 == null) {
                System.out.println("账户不存在，请重新输入卡号");
            } else {
                while (true) {
                    System.out.println("请您输入密码");
                    String password = scanner.next();

                    //判断密码是否正确
                    if (acount1.getPassword().equals(password)) {
                        System.out.println("欢迎您" + acount1.getUsername() + "您可以继续操作");
                        showUserCommand(accounts, acount1, scanner);
                        break;
                    } else {
                        System.out.println("密码不正确请重新输入");
                    }
                }
            }
            break;

        }
    }

    /**
     * 用户登录成功后的操作页面
     *
     * @param accounts 用户集合
     * @param acount1
     * @param scanner  键盘扫描器
     */
    private static void showUserCommand(ArrayList<Account> accounts, Account acount1, Scanner scanner) {
        while (true) {
            System.out.println("========欢迎您进入黑马ATM系统操作页面========");
            System.out.println("请选择需要的命令");
            System.out.println("1.查询");
            System.out.println("2.存款");
            System.out.println("3.取款");
            System.out.println("4.转账");
            System.out.println("5.修改密码");
            System.out.println("6.退出");
            System.out.println("7.注销当前账户");

            int command = scanner.nextInt();
            switch (command) {
                case 1:
                    //查询 
                    queryAcountInfo(acount1);
                    break;
                case 2:
                    //存款
                    deposit(acount1, scanner);
                    break;
                case 3:
                    //取款
                    withDraw(acount1, scanner);
                    break;
                case 4:
                    //转账
                    transfer(accounts, acount1, scanner);
                    break;
                case 5:
                    //修改密码
                    boolean flag = updatePassport(accounts, acount1, scanner);
                    if (flag) {
                        return;
                    } else {
                        break;
                    }
                case 6:
                    //退出
                    System.out.println("退出成功，欢迎下次光临");
                    return;
                case 7:
                    //注销用户
                    boolean flag1 = delectAcount(accounts, acount1, scanner);
                    if (flag1) {
                        return;
                    } else {
                        break;
                    }
                default:
                    System.out.println("命令输入有误，请重新输入");
            }
        }
    }

    /**
     * 销户功能
     *
     * @param accounts
     * @param acount1  当前账户
     * @param scanner  键盘录入
     */
    private static boolean delectAcount(ArrayList<Account> accounts, Account acount1, Scanner scanner) {
        System.out.println("========欢迎您进入黑马ATM系统操作页面========");
        while (true) {
            System.out.println("您确定要销户么？(y/n)");
            String command = scanner.next();
            switch (command) {
                case "y":
                    //销户
                    accounts.remove(acount1);
                    System.out.println("销户成功！");
                    return true;
                case "n":
                    //不销户
                    System.out.println("为您保留账户！");
                    return false;
                default:
                    System.out.println("指令输入错误");
            }
        }
    }

    /**
     * 修改密码
     *
     * @param accounts 账户集合
     * @param acount1  当前账户
     * @param scanner  键盘录入
     */

    private static boolean updatePassport(ArrayList<Account> accounts, Account acount1, Scanner scanner) {
        while (true) {
            System.out.println("请您输入旧密码");
            String oldPassport = scanner.next();
            if (acount1.getPassword().equals(oldPassport)) {
                //修改密码
                while (true) {
                    System.out.println("请您输入新密码");
                    String newPassport = scanner.next();
                    System.out.println("请您再次输入新密码");
                    String reNewPassport = scanner.next();
                    if (newPassport.equals(reNewPassport)) {
                        acount1.setPassword(newPassport);
                        return true;
                    } else {
                        System.out.println("两次输入密码不一致，请重新输入");
                    }
                }
            } else {
                System.out.println("您输入的旧密码不正确");
                return false;
            }
        }
    }

    /**
     * 转账逻辑
     *
     * @param accounts 用户集合
     * @param acount1  当前用户
     * @param scanner  键盘扫描器
     */
    private static void transfer(ArrayList<Account> accounts, Account acount1, Scanner scanner) {
        if (accounts.size() < 2) {
            System.out.println("当前系统账户不足，无法完成转账");
            return;
        }
        System.out.println("请输入转账金额");
        double money = scanner.nextDouble();
        if (money > acount1.getBalance()) {
            System.out.println("余额不足，不能完成转账");
            return;
        }
        while (true) {
            System.out.println("请您输入转账卡号");
            String cardNo = scanner.next();
            Account acount2 = getAccountByCarNo(accounts, cardNo);
            if (acount2 == null) {
                System.out.println("卡号不存在，请重新输入");
                continue;
            }
            if (acount1 == acount2) {
                System.out.println("无法向自己转账");
                continue;
            }
            String targetUsername = acount2.getUsername();
            String tip = "*" + targetUsername.substring(1);
            for (int i = 0; i < 3; i++) {
                System.out.println("请输入" + tip + "完整姓氏，完整转账");
                String surName = scanner.next();

                if (surName.equals(targetUsername.substring(0, 1))) {
                    //转账成功
                    acount2.setBalance(acount1.getBalance() - money);
                    System.out.println("恭喜您，转账" + money + "元成功");
                    return;
                } else {
                    System.out.println("姓氏输入错误，您还有" + (2 - i) + "次机会");
                }
            }
        }
    }

    /**
     * 取款功能
     *
     * @param acount1 当前用户
     * @param scanner 键盘扫描器
     */
    private static void withDraw(Account acount1, Scanner scanner) {

        if (acount1.getBalance() < 100) {
            System.out.println("余额不足，先去存点，再来取款吧");
            return;
        }
        while (true) {
            System.out.println("请输入取款金额");
            double money = scanner.nextDouble();
            if (money > acount1.getQuota()) {
                System.out.println("取款金额超出当日限额，每次最多取" + acount1.getQuota() + "元，请修改取款金额");
                continue;
            }
            if (money > acount1.getBalance()) {
                System.out.println("余额不足，请先充值");
                continue;
            }
            acount1.setBalance(acount1.getBalance() - money);
            queryAcountInfo(acount1);
            break;
        }

    }

    /**
     * 存款功能
     *
     * @param acount1 当前用户
     * @param scanner 键盘录入功能
     */
    private static void deposit(Account acount1, Scanner scanner) {
        System.out.println("========欢迎您进入黑马ATM系统存款页面========");
        System.out.println("请输入存款金额");
        double money = scanner.nextDouble();
        double amount = acount1.getBalance();
        acount1.setBalance(amount + money);
        System.out.println("恭喜您，存款" + money + "元成功");
        queryAcountInfo(acount1);
    }

    /**
     * 查询用户信息
     *
     * @param acount1 当前用户
     */
    private static void queryAcountInfo(Account acount1) {
        System.out.println("========欢迎您进入黑马ATM系统用户查询页面========");
        System.out.println("用户卡号：" + acount1.getCardNo());
        System.out.println("账户姓名：" + acount1.getUsername());
        System.out.println("当日限额：" + acount1.getQuota());
        System.out.println("账户余额：" + acount1.getBalance());
    }

    /**
     * 注册用户
     *
     * @param accounts 账户集合
     * @param scanner  键盘扫描器
     */
    public static void register(ArrayList<Account> accounts, Scanner scanner) {
        Account account = new Account();
        System.out.println("请输入您的用户名");
        String name = scanner.next();
        account.setUsername(name);

        while (true) {
            System.out.println("请您输入密码");
            String password = scanner.next();

            System.out.println("请您再次输入密码");
            String secondPasspord = scanner.next();

            if (password.equals(secondPasspord)) {
                account.setPassword(password);
                break;
            } else {
                System.out.println("两次密码不一致，请重新输入");
            }
        }
        System.out.println("请您输入当次取款限额");
        double quota = scanner.nextDouble();
        account.setQuota(quota);

        while (true) {
            String cardNo = "";
            Random random = new Random();

            for (int i = 0; i < 8; i++) {
                int index = random.nextInt(10);
                cardNo += index;
            }
            //判断卡号是否重复
            Account account1 = getAccountByCarNo(accounts, cardNo);
            if (account1 == null) {
                account.setCardNo(cardNo);
                break;
            }
        }
        System.out.println("恭喜您，开户成功，卡号是：" + account.getCardNo() + "请妥善保管");

        accounts.add(account);
    }

    /**
     * 根据卡号找账户
     *
     * @param accounts 账户集合
     * @param cardNo   要查询的卡号
     * @return 返回找到的账户对象
     */
    private static Account getAccountByCarNo(ArrayList<Account> accounts, String cardNo) {
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getCardNo().equals(cardNo)) {
                return accounts.get(i);
            }
        }
        return null;
    }

}
