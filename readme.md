## 桂林学院Java基础样板代码及案例

## [PTA](https://pintia.cn/problem-sets/1768998288701984768/manage)

### 注意事项
1. 接受输入不要混用。详情见接受输入。
2. 不要带包名提交，以import开头
3. 类名修改为Main后提交。即：public class Main{}
4. 不要输出题目要求以外的内容

### 基础模板

```java

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //接受一个int输入

        Scanner sc = new Scanner(System.in);

        //如果要接收多个输入，重复这一行即可

        int inputInt = sc.nextInt();

        //在下面编写你的程序

        //结尾行，避免一些奇怪的问题

        System.out.flush();

    }
}
```

### 接受输入
```java
 //接受一个int输入

 int inputInt = sc.nextInt();

//接受一个string 输入

 string inputString = sc.next();

//接受多个不同类型的输入，仅使用next()方法接收，自行处理类型问题。禁止混用

string inputString = sc.next();

int nextInt = Integer.parseInt(sc.next());
```

### 输出
```java
System.out.println("xxx");
```

##### 一些小工具
* [0-9]+(\s) 去除word的前缀数字