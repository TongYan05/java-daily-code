package ANU7710;

public class Exception1 {
    public static void main(String[] args) throws Exception {

        //新的黑马课程应付7710
        //异常(exception)，泛型，集合框架
        //异常————运行时异常(runtimeException)and编译时异常，alte+回车，选第一个或者第二个用来解决


        //1. 异常是什么？
        //- 异常是代码在编译或者执行的过程中可能出现的错误。
        //
        //2. 异常的代表是谁？分为几类？
        //- Exception，分为两类：编译时异常、运行时异常。
        //- 编译时异常：没有继承RuntimeExcpention的异常，编译阶段就会出错。
        //- 运行时异常：继承自RuntimeException的异常或其子类，编译阶段不报错，运行时出现的。
        //
        //3. 异常的作用是啥？
        //- 用来查找bug；可以作为方法内部的特殊返回值，通知上层调用者底层的执行情况。


//        System.out.println("程序开始");
//        result(10,0);
//        System.out.println("程序结束");//运行时异常不阻断后面代码的运行，编译时异常会阻断

        System.out.println("程序开始");
        System.out.println(finalpriec(100, -0.9));
        System.out.println("程序结束");

//        System.out.println("程序开始");
//        System.out.println(finalpriec2(100,-0.9));
//        System.out.println("程序结束");


    }


    public static int result(int a, int b) {
        if (b == 0) throw new RuntimeException("除数不能为0");
        return a / b;
    }

    public static double finalpriec(double orginalprice, double discount) throws Exception {
        if (discount < 0 || discount > 1) {

            throw new Exception("折扣值必须在0-1之间");

        } else return orginalprice * discount;
    }


    public static double finalpriec2(double orginalprice, double discount) throws Exception {
        if (discount < 0 || discount > 1) {
            throw new Exception("折扣值必须在0-1之间");
        } else return orginalprice * discount;
    }

}
