package teach.two;

import java.util.Scanner;

public class Department {
    public static void main(String[] args) {
        /*
         * 根据用户输入的信息确定员工应分配到那个部门。
         */
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        String language = sc.next();
        switch (language) {
            case "Java":
            case "java":
                System.out.println(name + "被分配到java程序开发部门");
                break;
            case "C#":
            case "c#":
                System.out.println(name + "被分配到c#程序开发部门");
                break;
            case "asp.net":
                System.out.println(name + "被分配到asp.net程序测试部门");
                break;
            case "html":
            case "Html":
                System.out.println(name + "被分配到前端程序开发部门");
                break;
            default:
                System.out.println("抱歉，本公司不需要" + language + "语言的人");
                break;
        }
        System.out.flush();

        return ;
    }
}
