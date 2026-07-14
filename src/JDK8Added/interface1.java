package JDK8Added;

public interface interface1 {
    public default void method1(){
        System.out.println("interface1");
    }



    private void method5(){
        System.out.println("eat");
        System.out.println("sleep");
        System.out.println("play");
    }


    //抽取接口里default里面相同的部分
    public default void method4(){
        method5();
        System.out.println("work");
        System.out.println("study");
    }

    public default void method3(){
        method5();
        System.out.println("wake up");
        System.out.println("hang out");
    }





}
