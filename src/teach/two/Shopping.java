package teach.two;

import java.util.Scanner;
public class Shopping {
    public static void  main (String[] args) {
        /*
         * 假如你有20元，至少需要购买1本书，剩余的钱还可以购买那些东西。
         */
        int pencil=1;   //铅笔价格
        int rubber=2;   //橡皮价格
        int cola=3;     //可乐价格
        int book=12;    //书本价格
        int snacks=5;   //零食价格
        System.out.println("书本的价格为"+book+"元，您总共有20元");
        System.out.println("1.铅笔的价格为："+pencil+"元");
        System.out.println("2.橡皮的价格为："+rubber+"元");
        System.out.println("3.可乐的价格为："+cola+"元");
        System.out.println("4.零食的价格为："+snacks+"元");
        Scanner sc1 = new Scanner(System.in);
        System.out.println("请输入其他需要购买商品的序列号：");
        int id=sc1.nextInt();
        switch (id){
            case 1:
                int pencilmoney=20-book;
                int pencilsum=pencilmoney/pencil;
                int pencilsurplus=pencilmoney%pencil;
                System.out.println("购买完书本后还可以购买铅笔"+pencilsum+"个，还剩"+pencilsurplus+"元");
                break;
            case 2:
                int rubbermoney=20-book;
                int rubbersum=rubbermoney/rubber;
                int rubbersurplus=rubbermoney%rubber;
                System.out.println("购买完书本后还可以购买橡皮"+rubbersum+"个，还剩"+rubbersurplus+"元");
                break;
            case 3:
                int colamoney=20-book;
                int colasum=colamoney/cola;
                int colasurplus=colamoney%cola;
                System.out.println("购买完书本后还可以购买可乐"+colasum+"个，还剩"+colasurplus+"元");
                break;
            case 4:
                int snacksmoney=20-book;
                int snackssum=snacksmoney/snacks;
                int snackssurplus=snacksmoney%snacks;
                System.out.println("购买完书本后还可以购买零食"+snackssum+"个，还剩"+snackssurplus+"元");
                break;
            default:
                System.out.println("您的输入有误。");
                break;
        }

    }
}

