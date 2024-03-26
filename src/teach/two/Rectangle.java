package teach.two;

public class Rectangle {

    public static void main(String[] args) {
        printRectangle(3,5);
        printRectangle(2,4);
        printRectangle(6,10);

        int height = 3;
        int width = 5;
        System.out.println("The area is: " + getArea(height, width));

        String sHeight = "3";
        String sWidth = "5";
        System.out.println("The area is: " + getArea(sHeight, sWidth));


        Height heightClass = new Height();
        Width widthClass = new Width();

        heightClass.setHeight(3);
        widthClass.setWidth(5);
        System.out.println("The area is: " + getArea(heightClass, widthClass));

        System.out.println(heightClass.getHeight());
    }

    public static void printRectangle(int height, int width) {
        for (int i=0; i<height; i++) {
            for (int j=0; j<width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static int getArea(int height, int width) {
        int temp = height*width;
        height += 20;

        return temp;
    }

    public static int getArea(String height, String width) {
        int temp = Integer.parseInt(height)*Integer.parseInt(width);
        return temp;
    }

    public static int getArea(Height height, Width width) {
        int temp = height.getHeight() * width.getWidth();
        height.setHeight(20);

        return temp;
    }
}

