package ANU7710;

import java.io.*;
import java.util.Arrays;

public class File3 {
    public static void main(String[] args) throws IOException {
//        //字符流——reader ——字符输入流   FileReader
//        //按字符读取，不是按字节读取，适合读文本内容
//        try (Reader r = new FileReader("D:\\新建文件夹\\java\\javacode\\first\\src\\API\\111")) {
//            int a;
//            char[] chars = new char[10];
//            while ((a = r.read(chars)) != -1) {//read(char[]) does NOT clear the array first! It only overwrites the positions it reads.
//                System.out.print(new String(chars, 0, a));
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }



        //example
//        try (Reader r = new FileReader("D:\\新建文件夹\\java\\javacode\\first\\src\\API\\111")) {
//            int a;
//            char[] chars = new char[100];
//            while((a=r.read(chars))!=-1){
//                System.out.print(new String(chars,0,a));
//            }
//        }catch (Exception e){
//            e.printStackTrace();
//        }

//        //字符流——writer ——字符输出流   FileWriter
//        try (Writer w = new FileWriter("D:\\新建文件夹\\java\\javacode\\first\\src\\API\\222", true)) {//true表示追加
//            w.write("hello world",0, 5);//输出指定字符串的指定部分
//            w.write("\r\n");
//            w.write(98);
//            w.write("\r\n");
//            w.write("天空很蓝，云朵白花花的".toCharArray(), 0, 4);//输出指定字符数组的指定部分
//            w.write("\r\n");
//            w.flush();//刷新缓冲区
//            //这里的 flush() 是否必要？
//            //不是必须的，因为：
//            //try-with-resources 会在结束时自动调用 close()
//            //close() 会自动调用 flush()
//        } catch (Exception e) {
//            e.printStackTrace();
//        }


//        copy("D:\\新建文件夹\\java\\javacode\\first\\src\\API\\111","D:\\新建文件夹\\java\\javacode\\first\\src\\API\\333");
//        copy1("C:\\Users\\33265\\Desktop\\EHP-模型.pdf","C:\\Users\\33265\\Desktop\\EHP-模型COPY.pdf");




    }

    //文件的复制方法(字符reader and write)
    public static void copy(String absolutePathOrigin, String absolutePathCopy) {
        try (
                Reader r = new FileReader(absolutePathOrigin);
                Writer w = new FileWriter(absolutePathCopy);
        ) {
            int a;
            char[] chars = new char[10];
            while ((a = r.read(chars)) != -1) {
                w.write(chars, 0, a);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //文件的复制方法(字节inputStream and outputStream)
    public static void copy1(String absolutePathOrigin, String absolutePathCopy) {
        try (
                InputStream r = new FileInputStream(absolutePathOrigin);
                OutputStream w = new FileOutputStream(absolutePathCopy);
        ) {
            w.write(r.readAllBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
