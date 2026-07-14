package JDK8Added;

public interface interface3 {

    public default void method1(){
        System.out.println("interface3");
    }


    public static void method3(){
        System.out.println("static method3 in interface3");
    }


    //用private就可以仅限于该类中调取共同体
    private static void method5(){
        System.out.println("red");
        System.out.println("yellow");
        System.out.println("blue");
        System.out.println("green");
    }


    //抽取接口static里相同的部分
    public static void method4(){
        method5();
    }
    public static void method6(){
        method5();
        System.out.println("black");
        System.out.println("white");
    }






}
