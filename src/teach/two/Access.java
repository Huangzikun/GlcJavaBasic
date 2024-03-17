package teach.two;

import java.util.Scanner;

public class Access {

    public static void main(String[] args) {
        /*
         *现在有两款手机华为与小米需要做入库处理，我们需要编写一个程序来实现商品的入库，
         *入库完成后，打印入库商品的详细信息并计算出入库商品的数量与入库商品总金额。
         */
        //华为手机
        String huaweiBrand = "华为";
        double huaweiSize = 5.5;
        double huaweiPrice = 2300;
        String huaweiConfig = "8+128G 全面屏";
        //小米手机
        String xiaomiBrand = "小米";
        double xiaomiSize = 4;
        double xiaomiPrice = 1999.99;
        String xiaomiConfig = "6+64G LED屏";
        //华为手机入库
        Scanner sc1 = new Scanner(System.in);
        int huanweiCount = sc1.nextInt();
        int xiaomiCount = sc1.nextInt();

        double huaweiTotal = huanweiCount * huaweiPrice;
        System.out.println("库存" + huaweiBrand + "手机的总金额:" + huaweiTotal);
        //小米手机入库
        double xiaomiTotal = xiaomiCount * xiaomiPrice;
        System.out.println("库存" + xiaomiBrand + "手机的总金额：" + xiaomiTotal);
        System.out.println(huaweiBrand + " " + huaweiSize + " " + huaweiPrice + "  " + huaweiConfig + " " + huanweiCount + " "
                + huaweiTotal);
        System.out.println(xiaomiBrand + " " + xiaomiSize + " " + xiaomiPrice + " " + xiaomiConfig + " " + xiaomiCount
                + " " + xiaomiTotal);
        int total = huanweiCount + xiaomiCount;
        double totalMoney = huaweiTotal + xiaomiTotal;
        //总库存数量与库存总价
        System.out.println("总库存：" + total);
        System.out.println("库存总价：" + totalMoney + "￥");
    }
}
