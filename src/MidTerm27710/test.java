package MidTerm27710;

import org.apache.commons.io.output.AbstractByteArrayOutputStream;

//接口里面只能放方法，不能放变量，只能放default,private,static方法, static方法只能是private和public不能default!
public interface test {
    int a=10;//前面有public static final，所以声明时必须给初始值，不然就报错
//    private  int b=2;
//    default int c=4;
    public final int d=10;
    public static final int f=9;
//    int age1;
    static int age2=9;
    final int age3=8;
//    private int x=88;

    void cat1();
    default void dog1(){
        System.out.println("dog1");
    }
    private void dog2(){
        System.out.println("dog2");
    }
//    public void dog3(){
//        System.out.println("dog3");
//    }
//    protected void dog4(){
//        System.out.println("dog4");
//    }
//    void dog5(){
//        System.out.println("dog5");
//    }
    abstract void dog6();
    static void dog7(){
        System.out.println("dog7");
    }

//    abstract void cat2();
////    protected void cat3();
//    public void cat4();
//    private void cat5(){};
//    default void cat6(){};
//    static void cat7(){};


    public abstract int num(int x);




}
