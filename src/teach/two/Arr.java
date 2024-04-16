package teach.two;

public class Arr {

    public static void main(String[] args) {



        int i1 = 1;
        int i2 = 2;
        int i3 = 3;
        int i4 = 4;
        int i5 = 5;
        int i6 = 6;
        int i7 = 7;
        int i8 = 8;

        String s1 = "1";
        String s2 = "2";
        String s3 = "3";
        String s4 = "4";
        String s5 = "5";
        String s6 = "6";
        String s7 = "7";
        String s8 = "8";


        //int[] iArr = new int[10];
        int[] iArr = new int[]{1,2,3,4,5,6,7,8};
        //int[] iArr;
        //iArr = new int[10];
        //System.out.println(iArr[11]);

//        for(int i=0; i<iArr.length; i++) {
//            System.out.println(iArr[i]);
//        }

//        for (int x : iArr) {
//            System.out.println(x);
//        }
//        System.out.println();

        int[] numbers = {1,2,3};
        int n = numbers[0];
        numbers[0] = 4;
        System.out.println(n); // n是2还是4?
        System.out.println(numbers);
        modifyArray(numbers);
        System.out.println(numbers[0]);

        for(int i=0; i<numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        String[] names = {"ABC", "XYZ", "zoo"};
        String s = names[1];
        names[1] = "cat";
        System.out.println(s); // s是"XYZ"还是"cat"?
    }

    public static void modifyArray(int[] arr) {
        System.out.println(arr);
        arr[0] = 10; // 修改数组元素

        arr = new int[10];
        System.out.println(arr);

    }
}
