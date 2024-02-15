package teach.two;

public class Two {
    public static void main(String[] args) {

        long x = 10;
        System.out.println(x);
        //x = 2200000000L;
        //System.out.println(x);

        //char a = 'a';
        //char a = 97;


        byte a;                // 定义byte类型的变量a
        int b = 298;          // 定义int类型的变量b
        a = (byte) b;
        System.out.println("b=" + b);
        System.out.println("a=" + a);

        short s = 3;
        int i = 5;
        s += i;    //强制类型转换自动完成
        System.out.println("s = " + s);

//        String str1 = "a";
//        String str2 = "b";
//        String str3 = "ab";
//        String str4 = str1 + str2;
//        System.out.println(str3 == str4);


//        String str1 = "a";
//        String str2 = "b";
//        String str3 = "ab";
//        String str4 = str1 + str2;
//        String str5 = str4.intern();
//        System.out.println(str3 == str5);

//        String str1 = "ab";
//        String str2 = "a" + "b";
//        System.out.println(str1 == str2);

//        final String str1 = "a";
//        final String str2 = "b";
//        String str3 = "ab";
//        String str4 = str1 + str2;
//        System.out.println(str3 == str4);
    }

}
