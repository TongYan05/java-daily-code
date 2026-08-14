package ANU7710;

public class Exception2 {
    public static void main(String[] args) {

        //自定义编译时异常

        //- 定义一个异常类继承Exception.
        //- 重写构造器。
        //- 通过throw new 异常类(xxx) 创建异常对象并抛出
        //特点：编译阶段就报错，提醒比较激进


        System.out.println("开始执行...");
        try {
            age(-10);//编译时异常
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("程序结束");


        System.out.println("开始执行...");
        try {
            age(150);
            System.out.println("程序执行成功！");
        } catch (Exception e) {
            e.printStackTrace();//输出异常信息
            System.out.println("程序执行失败！");
        }
        System.out.println("程序结束！");

    }

    public static void age(int age) throws Exception {
        if (age < 0 || age > 120) {
            throw new Exception("年龄不合理!");
        } else System.out.println("年龄正常！");
    }


}
