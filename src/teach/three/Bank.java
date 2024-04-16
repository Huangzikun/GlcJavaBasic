package teach.three;

public class Bank {
    public static void main(String[] args) {
        BankAccount ba=new BankAccount(123456,500);
        System.out.println("您的余额为:"+ba.getleftmoney());
        ba.savemoney(1000);
        System.out.println("存入1000元后,您的余额为:"+ba.getleftmoney());
        ba.getmoney(2000);
        System.out.println("取款800元后,您的余额为:"+ba.getleftmoney());
    }
}

class BankAccount {
    int account_number;//账号
    double leftmoney;//存款余额
    public double getleftmoney () { //查询余额
        return leftmoney;
    }
    public void savemoney(double money) { //存款
        leftmoney+=money;
    }
    public void getmoney (double money){ //取款
        leftmoney-=money;
    }
    public BankAccount (int number, double money){ //构造方法，用来初始化变量
        account_number=number;
        leftmoney=money;
    }
}
