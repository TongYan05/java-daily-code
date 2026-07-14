package ANU7710;

import java.awt.*;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class file2 {
    public static void main(String[] args) throws IOException {
//        //字符集的编码
//        String s = "hello world";
//        byte[] b = s.getBytes("GBK");//getBytes()方法返回值是字节数组，就是返回字符的字节码
//        System.out.println(b.length+" "+ Arrays.toString( b));//Arrays.toString()方法将内存地址转化成可读的字符串格式
//        //字符集的解码
//        String s1 = new String(b,"GBK");
//        System.out.println(s1);
//        //review
//        String str=new String("ANU");
//        byte[] byt =str.getBytes();
//        System.out.println(Arrays.toString(byt));
//        String ss=new String(byt);




//        //IO流——input输入流,output输出流(按方向分类)    字节流和字符流(按内容分类)  作用：用于读写数据
//        //字节输入流，字符输入流，字节输出流，字符输出流（IO流四大金刚）
//        //InputStream, reader, outputStream, Writer(abstracted抽象类)
//        //FileInputStream, FileReader, FileOutputStream, FileWriter(实现类)
//
//        //创建字节输入流对象（纯文本文件（.txt、.java、.csv 等））
//        InputStream in = new FileInputStream("C:\\Users\\33265\\Desktop\\claude-test\\API-key.txt");
//        FileInputStream inn = new FileInputStream("C:\\Users\\33265\\Desktop\\claude-test\\API-key.txt");
//        //list<String> a=new arraylist<>()   arraylist<String> a=new arraylist<>()其实和上面这两行代码的逻辑一样
//        System.out.print("开始读取文件内容：\n");
//        //读取一个字节
//        int a;
//        while ((a = in.read()) != -1) {//read()方法返回一个字节,空字节返回-1，UTF-8中汉字占3个字节，但是read()只能读一个字节，所以会乱码
//            System.out.print((char) a);
//        }
//        System.out.println("\n===============\n");
//        //读取多个字节
//        byte[] b = new byte[3];
//        int c;
//        while ((c = inn.read(b)) != -1) {//read()方法返回读到字节数组的字节数,空字节数组返回-1
//            String s = new String(b, 0, c);//字符集的解码
//            System.out.print(s);//或者 System.out.print(new String(b,0,c))
//        }
//        System.out.println("\n====读取完成====");
//        //drawbacks of byte input stream like this example
//        System.out.println("\n=======局限=======\n");
//        InputStream in1 = new FileInputStream("D:\\新建文件夹\\java\\javacode\\first\\src\\ANU7710\\InputStream");//55澳
//        byte[] b1 = new byte[3];
//        int c1 = 0;
//        while ((c1 = in1.read(b1)) != -1) {
//            System.out.print(new String(b1, 0, c1));
//        }
//        System.out.println("\n=======局限=======\n");
//        //解决方法也有，就是把字节数组的长度定义为要读取文档的字节长度(也有缺陷：就是文件的字节大小不能太大)
//        System.out.println("\n=======stupid solution=======\n");
//        InputStream in2 = new FileInputStream("D:\\新建文件夹\\java\\javacode\\first\\src\\API\\COMP7710_Exam_Syllabus.java");
//        File f = new File("D:\\新建文件夹\\java\\javacode\\first\\src\\API\\COMP7710_Exam_Syllabus.java");
//        byte[] b2 = new byte[(int) f.length()];
//        int c2 = 0;
//        while ((c2 = in2.read(b2)) != -1) {
//            System.out.print(new String(b2));
//        }
//        System.out.println("\n=======stupid solution=======\n");
//
//        System.out.println("\n=======stupid solution(readAllBytes())=======\n");
//        InputStream in3 = new FileInputStream("D:\\新建文件夹\\java\\javacode\\first\\src\\API\\COMP7710_Exam_Syllabus.java");
//        byte[] b3 = in3.readAllBytes();
//        System.out.print(new String(b3));
//        System.out.println("\n=======stupid solution(readAllBytes())=======\n");


        //因此，字符输入流才是读文本的最好办法，字节流适合做数据的转移

//        //outputStream- FileOutputStream文件字节输出流
//        OutputStream ou=new FileOutputStream("C:\\Users\\33265\\Desktop\\writing\\outputStream.docx");//创建一个文件字节输出流对象
//        byte[] b="澳大利亚国立大学并没有想象中的那么好，但是符合我的发展趋势///".getBytes();
//        ou.write(b);
//        ou.write("\n".getBytes());//换行,\r\n更好
//        ou.write(b,0,6);//输出指定字节数组的指定部分,6个字节就是两个汉字
//        //因为 FileOutputStream 在创建时只覆盖一次文件，之后所有的 write() 调用都会顺序追加到文件末尾，直到你关闭流或程序结束。
//        ou.close();

//        //如果不要每次删除数据，重新创建文件，直接追加数据则要用ture
//        OutputStream ou1=new FileOutputStream("C:\\Users\\33265\\Desktop\\writing\\outputStream2.docx",true);
//        ou1.write("ANU\r\n".getBytes());
//        ou1.close();

//        //文件的复制——原理很简单，就是inputStream和outputStream,读入文件的数据，然后将这个数据转成字节数组，写入到outputStream的新文件中
//        不管文件是：
//📝 .docx(Word 文档)
//🖼️ .png, .jpg(图片)
//📐 .dwg(CAD 图纸)
//🎵 .mp3(音频)
//🎬 .mp4(视频)
//📦 .zip, .rar(压缩包)
//💻 .exe(可执行程序)
//        全部都能完美复制！因为对字节流来说，所有文件都是一串 0 和 1，它只是原封不动地搬运这些数据。
//        InputStream in = new FileInputStream("C:\\Users\\33265\\Desktop\\writing\\短句翻译.docx");
//        byte[] data=in.readAllBytes();
//        OutputStream out = new FileOutputStream("C:\\Users\\33265\\Desktop\\writing\\outputStream.docx");
//        out.write(data);
//        out.close();
        //文件的复制方法——dwg竟然也能复制
//        copy("C:\\Users\\33265\\Desktop\\童颜202211442424\\EHP.dwg","C:\\Users\\33265\\Desktop\\writing\\EHPCOPY.dwg");
//        copy("C:\\Users\\33265\\Desktop\\Weixin Image_20251229232956_374_7.png","C:\\Users\\33265\\Desktop\\writing\\boatCOPY.png");

        FileInputStream in = new FileInputStream("C:\\Users\\33265\\Desktop\\writing\\短句翻译.docx");
        FileOutputStream out = new FileOutputStream("C:\\Users\\33265\\Desktop\\writing\\phrasa\\短语\\phrasa.docx");
        out.write(in.readAllBytes());



    }

    public static void copy(String absolutePathOrigin, String absolutePathCopy) {
        try (
                //这里只能放置资源对象，用完后自动调用close()方法关闭资源——资源是指最终实现了closeable/autocloseable接口的类
                InputStream in = new FileInputStream(absolutePathOrigin);
                OutputStream out = new FileOutputStream(absolutePathCopy);
        ) {
            byte[] data = in.readAllBytes();
            out.write(data);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}

