package teach.three;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Bookshop {
    public static void main(String[] args) {
        Book books[] = new Book[3];
        //模拟从数据库中读取图书信息并输出
        outBooks(books);
        // 顾客购买图书
        Order order = purchase(books);
        // 输出订单信息
        outOrder(order);
    }
    // 顾客购买图书
    public static Order purchase(Book books[]) {
        Order order = new Order("0001");
        OrderItem item = null;
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 3; i ++) {
            int cno = in.nextInt();
            int pnum = in.nextInt();
            item = new OrderItem(books[cno-1],pnum);
            order.setItem(item, i);
        }
        in.close();
        return order;
    }
    // 输出订单信息
    public static void outOrder(Order order) {
        System.out.println("图书订单");
        System.out.println("图书订单号:"+order.getOrderId());
        System.out.println("图书名称 购买数量 图书单价");
        OrderItem items[] = order.getItems();
        for(int i = 0; i < items.length; i ++) {
            System.out.println(items[i].getBook().getName()+" "+items[i].getNum(
            )+" "+items[i].getBook().getPrice());
        }
        System.out.println("订单总额:"+order.getTotal());
    }
    // 模拟从数据库中读取图书信息并输出
    public static void outBooks(Book books[]) {
        books[0] = new Book(1,"Java教程",30.6,30);
        books[1] = new Book(2,"JSP教程",42.1,40);
        books[2] = new Book(3,"SSH架构",47.3,15);
//        System.out.println("图书列表");
//        System.out.println("图书编号\t图书名称\t\t图书单价\t库存数量");
//        System.out.println("---------------------------------------");
//        for (int i = 0; i < books.length; i ++) {
//            System.out.println(i+1+"\t"+books[i].getName()+"\t"+
//                    books[i].getPrice()+"\t"+books[i].getStorage());
//        }
//        System.out.println("---------------------------------------");
    }
}

class Book {
    private int id;    // 编号
    private String name;  // 书名
    private double price;  // 价格
    private int storage;   // 库存
    // 有参构造
    public Book(int id, String name, double price, int storage) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.storage = storage;
    }
    // 获取书号
    public int getId() {
        return id;
    }
    // 获取书名
    public String getName() {
        return name;
    }
    // 获取价格
    public double getPrice() {
        return price;
    }
    // 获取库存
    public int getStorage() {
        return storage;
    }
}

class OrderItem {
    private Book book;
    private int num;
    // 有参构造方法
    public OrderItem(Book book, int num) {
        this.book = book;
        this.num = num;
    }
    // 获取图书对象
    public Book getBook() {
        return book;
    }
    // 获取订购图书数量
    public int getNum() {
        return num;
    }
}

class Order {
    private String orderId;
    private OrderItem items[];
    private double total;
    // 有参构造
    public Order(String orderId) {
        this.orderId = orderId;
        this.items = new OrderItem[3];
    }
    // 获取订单号
    public String getOrderId() {
        return orderId;
    }
    // 获取订单列表
    public OrderItem[] getItems() {
        return items;
    }
    // 获取订单总额
    public String getTotal() {
        calTotal();

        return new DecimalFormat("#.00").format(total);
    }
    // 指定一个订单项
    public void setItem(OrderItem item, int i) {
        this.items[i] = item;
    }
    // 计算订单总额
    public void calTotal() {
        double total = 0;
        for (int i = 0; i < items.length; i ++) {
            total += items[i].getNum() * items[i].getBook().getPrice();
        }
        this.total = total;
    }
}

