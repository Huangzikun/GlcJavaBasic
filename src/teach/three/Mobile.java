package teach.three;

import java.util.Scanner;

public class Mobile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer n = Integer.valueOf(scanner.next());

        while (n-- > 0) {
            Phone p1 = new Phone();

            p1.brand = scanner.next();
            p1.type  = scanner.next();
            p1.os  = scanner.next();
            p1.price = Double.valueOf(scanner.next());
            p1.memorySize = Double.valueOf(scanner.next());

            // 测试p1的各项功能
            p1.about();
            p1.call(Integer.valueOf(scanner.next()));
            p1.playGame(Integer.valueOf(scanner.next()));
            p1.playMusic(scanner.next());
        }
    }
}

class Phone {
    String brand;  // 品牌
    String type;   // 型号
    String os;     // 操作系统
    Double price;    // 价格
    Double memorySize;   // 内存
    // 无参构造
    public Phone(){
    }
    // 有参构造
    public Phone(String brand, String type, String os, Double price, double
            memorySize) {
        this.brand = brand;
        this.type = type;
        this.os = os;
        this.price = price;
        this.memorySize = memorySize;
    }
    // 关于本机
    public void about() {
        System.out.println("品牌:"+brand+",型号:"+type+",操作系统:"+os+",价格："+price+",内存"+memorySize);
    }
    // 打电话
    public void call(int num) {
        String phoneNo = "";
        switch (num) {
            case 1: phoneNo = "爸爸的号";break;
            case 2: phoneNo = "妈妈的号";break;
            case 3: phoneNo = "爷爷的号";break;
            case 4: phoneNo = "奶奶的号";break;
        }
        System.out.println(phoneNo);
    }
    // 打游戏
    public void playGame(int game) {
        switch (game) {
            case 1:
                System.out.println("玩扫雷游戏");break;
            case 2:
                System.out.println("玩飞行棋游戏");break;

        }
    }
    // 下载音乐
    public void downloadMusic(String song) {
        System.out.println("开始下载");
        System.out.println("下载完成");
    }
    // 播放音乐
    public void playMusic(String song) {
        System.out.println("播放歌曲:"+song);
    }
}
