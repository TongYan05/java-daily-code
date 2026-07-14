package ANU7710;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class file {
    public static void main(String[] args) throws IOException {

        File f = new File("C:\\Users\\33265\\Desktop\\童颜202211442424");
        System.out.println(f.isFile() + " " + f.isDirectory() + " " + f.exists() + " " + f.length() + " " + f.getName());
        String[] files = f.list();//返回类型：String[]（字符串数组）
        for (String s : files) {
            System.out.print(s + "/");
        }
        System.out.println("\n" + files.length);
        File[] f1 = f.listFiles();//返回类型：File[]（File对象数组）
        for (File f2 : f1) {
            System.out.print(f2.getName() + "/");
        }
        System.out.println("\n" + f1.length);

        File f2 = new File("C:\\Users\\33265\\Desktop\\童颜202211442424\\TongYan.ppt");
        System.out.println(f2.createNewFile());//创建文件txt docx ppt....
        System.out.println(f2.delete());

        File f3 = new File("C:\\Users\\33265\\Desktop\\童颜202211442424\\TongYan");
        System.out.println(f3.mkdir());//创建单个文件夹
        System.out.println(f3.delete());

        File f4 = new File("C:\\Users\\33265\\Desktop\\童颜202211442424\\TongYan\\YangJiaXin\\time\\when.docx");
        System.out.println(f4.mkdirs());//创建多个文件夹,when.docx创建成文件夹了
        File f5 = new File("C:\\Users\\33265\\Desktop\\童颜202211442424\\TongYan");
        deleteFile(f5);


//        //递归求和:递归的三要素——1.确定递归函数公式2.确定终止条件3.方向指向终结条件
//        System.out.println(sum(100));

//        //案例：题目：猴子吃桃问题
//        //猴子第一天摘下若干桃子，当即吃了一半，觉得好不过瘾，于是又多吃了一个
//        //第二天又吃了前天剩余桃子数量的一半，觉得好不过瘾，于是又多吃了一个
//        //以后每天都是吃前天剩余桃子数量的一半，觉得好不过瘾，又多吃了一个
//        //等到第10天的时候发现桃子只有1个了。
//        //需求： 请问猴子第一天摘了多少个桃子？
//        System.out.println(totalPeach(1));


//        File f=new File("C:\\");
//        searchFile(f,"pcyyb_cn.com.langeasy.LangEasyLexis_2700300016_installer.exe");


    }



    public static void deleteFile(File f) {
        while (f.exists()) {
            if (f.isFile()) f.delete();// 文件
            else if (f.isDirectory() && f.listFiles().length == 0) f.delete();// 空文件夹
            else if (f.isDirectory() && f.listFiles().length != 0) {// 非空文件夹
                File[] files = f.listFiles();
                for (File f1 : files) {
                    deleteFile(f1);
                }
            }
        }
    }


    public static void searchFile(File f, String name) throws IOException {
        if (f.isFile() && f.getName().contains(name)) {
            System.out.println(f.getAbsoluteFile());
            Runtime r = Runtime.getRuntime();
            r.exec("cmd /c start \"\" \"" + f.getAbsolutePath());
        } else if (f.isDirectory() && f.listFiles() != null) {
            for (File f1 : f.listFiles()) {
                searchFile(f1, name);
            }
        } else {
            return;
        }
    }

    public static int sum(int n) {
        if (n == 1) return 1;
        return n + sum(n - 1);
    }

    //f(1)=n/2-1; f(2)=f(1)/2-1 f(3)=f(2)/2-1 f(4)=f(3)/2-1

    public static int totalPeach(int day) {
        if (day == 10) return 1;
        return (totalPeach(day + 1) + 1) * 2;
    }

}
