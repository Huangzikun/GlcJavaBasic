package teach.two;

import java.util.Random;
import java.util.Scanner;

public class Audience {

    /*
     * 存储姓名
     * 创建一个存储多个姓名的容器（数组）
     * 键盘输入每个同学的姓名，存储到容器中（数组）
     */
    public static void addAudience(String[] audience) {
        //键盘输入多个姓名到容器中
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < audience.length; i++) {
            System.out.println("存储第" + (i + 1) + "个姓名：");
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
            System.out.println("第" + (i + 1) + "个观众姓名:" + name);
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
        System.out.println("--------抽取幸运观众---------");
        //创建一个长度为3的数组存储观众姓名
        String[] audience = new String[3];
        //存储观众姓名
        addAudience(audience);
        //总览观众姓名
        printAudience(audience);
        //随机抽取一名幸运观众
        String randomName = randomAudience(audience);
        System.out.println("随机抽取的幸运观众是：" + randomName);
    }
}
