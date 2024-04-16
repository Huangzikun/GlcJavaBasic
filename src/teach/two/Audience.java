package teach.two;

import java.util.Random;
import java.util.Scanner;

public class Audience {

    /*
     * 存储姓名
     * 创建一个存储多个姓名的容器（数组）
     * 键盘输入每个同学的姓名，存储到容器中（数组）
     */
    public static void addAudience(Scanner sc, String[] audience) {
        //键盘输入多个姓名到容器中
        for (int i = 0; i < audience.length; i++) {
            //接收控制台录入的姓名字符串
            audience[i] = sc.next();
        }
    }

    /*
     * 总览全部姓名
     */
    public static void printAudience(String[] audience) {
        //遍历数组，得到每个观众姓名
        for (int i = 0; i < audience.length; i++) {
            String name = audience[i];
            System.out.println(name);
        }
    }

    /*
     * 随机点名
     */
    public static String randomAudience(String[] audience) {
        //根据数组的长度，获取睡觉索引
        int index = new Random().nextInt(audience.length);
        //通过随机索引从数组中获取姓名
        String name = audience[index];
        //返回随机到的姓名
        return name;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.next());
        String x = "test";
        Integer nn = 2;
        //创建一个长度为3的数组存储观众姓名
        String[] audience = new String[n];
        //存储观众姓名
        addAudience(sc, audience);

        int monitor = Integer.parseInt(sc.next());

        if (monitor == 0) {
            //总览观众姓名
            printAudience(audience);
        } else  {
            //随机抽取一名幸运观众
            System.out.println(audience[monitor-1]);
        }
    }
}
