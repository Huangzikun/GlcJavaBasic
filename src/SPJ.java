
import java.util.Scanner;

public class SPJ {
    /*
     * 模拟商城购物小系统：1.用户选择商品后，后台计算商品价格；
     *                     2.使用while循环实现用户多次购买商品。
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int no = 1;
        boolean con = true;
        switch (sc.next()) {
            case "请输入你需要购买商品的序列号:":
                System.out.println(no);
                no++;
                break;
            case "请输入你需要购买牙刷的数量:":
                System.out.println(1);
                break;
            case "需要继续购买请输入Y，否则输入N":
                if (con) {
                    System.out.println("Y");
                    con = false;
                } else {
                    System.out.println("N");
                }
                break;
            case "请输入你需要购买毛巾的数量:":
                System.out.println(2);
                break;
            default:
                System.out.println(0);

        }

    }
}
