package ANU7710;

import javax.management.relation.RelationSupport;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.stream.StreamSupport;

public class Summary {
    public static void main(String[] args) throws Exception {
        System.out.println("程序开始");
        try {
            System.out.println(result(10, 0));
        } catch (Exception e) {
            //throw new RuntimeException(e);//将异常重新抛出，程序会终止执行,拉中之拉！！！！
            e.printStackTrace();//仅打印异常信息，程序可以继续执行
        }
        System.out.println("程序结束");


        try {
            age(150);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("still执行...");


        printNumber(100);
        System.out.println("still执行...");


        Random random = new Random();

        String[] countries = {"中国", "美国", "日本", "英国", "法国"};
        Integer[] numbers = {0,0,0,0,0};
        Map<String, Integer> map = new HashMap<>();
        for(int i=0;i<countries.length;i++){
            map.put(countries[i],numbers[i]);
        }
        System.out.println(map);

        for (int i=0;i<8;i++){
            int index=random.nextInt(countries.length);
            map.put(countries[index],++numbers[index]);
        }

        System.out.println(map);











    }

    public static int result(int a, int b) {
        if (b == 0) {
            throw new RuntimeException("除数不能为0");
        }
        return a / b;
    }

    public static int age(int a) {
        if (a < 0 || a > 120) {
            throw new RuntimeException("年龄不合理");
        }
        return a;
    }


    public static void printNumber(int a) throws Exception {
        //如果a不是数字，则throw
        Integer b = new Integer(a);
        if (b.getClass().equals(Integer.class)) {
            System.out.println(a);
        } else throw new Exception("请输入数字");
    }
}
