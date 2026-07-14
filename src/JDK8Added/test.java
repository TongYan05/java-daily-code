package JDK8Added;

public class test {
    public static void main(String[] args) {


        //default and static在的话，接口里面的方法可以不用在实现类里面重写
        //如果两个接口里有相同方法名的default方法，那么实现类里面必须重写
        //但是static方法就不用了，因为static方法只能通过接口名调用，不需要实现类

        fu f1=new fu();
        f1.method1();
        f1.method2();
        f1.method4();
        System.out.println("-------------------");
        f1.method3();

        System.out.println("-------------------");

        zi z1=new zi();
        z1.method1();
        interface3.method3();
        interface2.method3();

        System.out.println("-------------------");


        interface3.method6();
        System.out.println("-------------------");
        interface3.method4();



    }
}
