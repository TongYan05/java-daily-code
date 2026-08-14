package ANU7710;

import java.util.Scanner;

public class Exception4 {
    public static void main(String[] args) {

        //方法一：抛出异常（throws）
        //异常处理：标准表述：
        //方法中出现异常，可以不直接处理，而是通过 throws 关键字声明抛出异常，让调用者来处理。异常会沿着调用栈一层一层往上抛，直到被某个方法捕获，或者最终抛给 JVM。
        //通俗讲：
        //方法里出了错，我自己不解决，在方法声明上加 throws 异常类型，把这个 “锅” 丢给调用我的方法去处理。

         //方法二：捕获并处理异常（try-catch）
        //这就是你说的「集中反映异常」的具体实现方式。
        //标准表述：
        //使用 try-catch 语句块直接捕获代码中出现的异常，并在 catch 块中进行处理，阻止异常继续向上传递，保证程序可以继续执行。
        //通俗理解：
        //主动在异常发生的位置（或上层调用处）“接住” 异常。
        //在 catch 块中编写处理逻辑，比如打印错误信息、记录日志、给用户友好提示，或者进行补救操作。
        //这种方式让程序更健壮，不会因为一个小错误就直接崩溃。

        //try：你说的 “踹一下”，就是尝试执行一段可能出问题的代码。
        //如果这段代码里出了异常，程序不会直接崩掉，而是立刻跳去对应的 catch 块。
        //catch：你说的 “输出在里面”，就是捕获异常，并在这里写处理逻辑（比如打印错误信息、记录日志、或者做补救）。

        //先试着跑 try 里的代码，出了问题就进 catch 里 “擦屁股”，程序还能接着往下走。
    while ( true){

        System.out.println("程序开始");
        try {
            System.out.println("您的身高是："+sonheight());//try/catch----ctrl+alt+t
            break;
        } catch (Exception e) {
            System.out.println("请输入数字！");
        }
        System.out.println("程序结束");
    }

    }
    public static double sonheight(){
        Scanner input=new Scanner(System.in);
        System.out.println("请输入您的身高：");
        double height=input.nextDouble();
        return height;
    }


}
