package teach.two;

import java.util.Scanner;

public class User {
    // 存储用户名和密码
    public static String[] arr1 = new String[3];
    public static String[] arr2 = new String[3];
    static int index = 0;

    public static void main(String[] args) {
        arr1[0] = "heima";
        arr2[0] = "123456";
        while (true) {
            print();
            Scanner scan = new Scanner(System.in);
            System.out.println("请选择功能：");
            String str = scan.next();
            if (str.equals("1")) {
                login();
            } else if (str.equals("2")) {
                register();
            } else if (str.equals("3")) {
                show();                         //用户退出
                break;
            } else if (str.equals("0")) {
                System.exit(0);
            } else {
                System.out.println("输入错误");
            }
        }
    }

    /*
     * 登录功能，键盘输入用户名与密码
     * 使用for循环加if判断验证输入的用户名与密码是否正确
     */
    public static void login() {
        for (int i = 0; i < 3; i++) {
            Scanner scan1 = new Scanner(System.in);
            System.out.println("请输入用户名：");
            String str1 = scan1.next();
            Scanner scan2 = new Scanner(System.in);
            System.out.println("请输入密码：");
            String str2 = scan2.next();
            for (int i1 = 0; i1 < arr2.length; i1++) {
                if (str1.equals(arr1[i1]) && str2.equals(arr2[i1])) {
                    System.out.println("登录成功！");
                    return;
                }
            }
            System.out.println("登录失败，请重新输入！");
        }
    }

    /*
     * 注册功能，键盘输入用户名与密码
     * 定义一个boolean变量，使用for循序判断用户是否存在
     * 如果用户不存在，在数组中插入注册的账号密码时
     * 可能会有数组长度不够的情况，所以需要使用到
     * 增加数组的长度，这里调用增加数组长度的方法add()。
     */
    public static void register() {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String str1 = scan1.next();
        Scanner scan2 = new Scanner(System.in);
        System.out.println("请输入密码：");
        String str2 = scan2.next();
        boolean flag = true;
        for (int i = 0; i < arr1.length; i++) {
            if (str1.equals(arr1[i])) {
                System.out.println("用户名已存在");
                flag = false;
            }
        }
        if (flag == true) {
            index++;
            if (index < arr1.length) {
                arr1[index] = str1;
                arr2[index] = str2;
                System.out.println("注册成功！");
            } else {
                add();
                arr1[index] = str1;
                arr2[index] = str2;
                System.out.println("注册成功！");
            }
        }
    }

    /*
     * 查看功能
     * 使用for循环打印两个数组的长度
     */
    public static void show() {
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != null) {
                System.out.println("用户名：" + arr1[i] + "," + "密码："
                        + arr2[i] + "\n");
            }
        }
    }

    /*
     * 增加数组长度
     * 先定义两个新的数组并在原有的数组长度上加3
     * 使用System的arraycopy方法复制原有的数组到新的数组
     * 最后将新的数组赋值给原有的arr1与aar2
     */
    public static void add() {
        String[] newarray1 = new String[arr1.length + 3];
        String[] newarray2 = new String[arr1.length + 3];
        System.arraycopy(arr1, 0, newarray1, 0, arr1.length);
        System.arraycopy(arr2, 0, newarray2, 0, arr1.length);
        arr1 = newarray1;
        arr2 = newarray2;
        show();
    }

    /*
     * 可操作功能的显示
     */
    public static void print() {
        System.out.println("--------------------黑马管理系统 --------------------");
        System.out.println(" 1.登录功能 (login) ");
        System.out.println(" 2.注册功能(register) ");
        System.out.println(" 3.查看(show) ");
        System.out.println(" 0.退出(exit) ");
        System.out.println("--------------------黑马管理系统 --------------------");
    }
}
