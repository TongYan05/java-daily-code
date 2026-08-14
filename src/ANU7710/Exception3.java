package ANU7710;

public class Exception3 {
    public static void main(String[] args) {

        //自定义运行时异常
        //- 定义一个异常类继承RuntimeException.
        //- 重写构造器。
        //- 通过throw new 异常类(xxx)来创建异常对象并抛出。
        //特点：编译阶段不报错，运行时才可能出现！提醒不属于激进型。

//        System.out.println(totalNumber(-5,10));//运行时异常



        System.out.println("开始执行...");
        totalNumber(5,-10);
        System.out.println("结束执行...");


    }

    public static int totalNumber(int classNumber,int classSize){
        if(classNumber<0||classSize<0){
            throw new totalNumber_Exception3("班级数量或班级人数不能小于0！");
        }
        return classNumber*classSize;
    }

}
