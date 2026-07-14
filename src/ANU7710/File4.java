package ANU7710;

import javax.swing.text.AttributeSet;
import javax.swing.text.StyledEditorKit;
import java.io.*;// 导入所有 IO 类
import java.util.*;


public class File4 {
    public static void main(String[] args) {
        //从AI的角度，reader writer inputStream outputStream学完就差不多了，后面的IO框架能替代
        //这个File4是用来加深的
        //缓冲流——bufferedInputStream, bufferedOutputStream, bufferedReader, bufferedWriter
        //缓冲流是字节流和字符流，但是效率更高，提升之前学的reader writer inputStream outputStream的效率和性能
        //缓冲流对象的括号里放的是被缓冲的流对象，不是文件的absolutePath


//        try (BufferedReader r = new BufferedReader(new FileReader("D:\\新建文件夹\\java\\javacode\\first\\src\\API\\222"))) {
//            System.out.println(r.readLine());//普通的 Reader 没有 readLine() 方法,只有BufferedReader才有
//            System.out.println(r.readLine());
//            System.out.println(r.readLine());
//            System.out.println(r.readLine());
//            System.out.println("===================");
//            System.out.println(r.readAllAsString());//readLine() 已经读取了前 4 行，所以 readAllAsString() 只能读取剩余的内容。
//            System.out.println("===================");
//            System.out.println(r.readLine());//读取剩余的行，没有返回null
//        }catch (Exception e){
//            e.printStackTrace();
//        }

//        try (Writer w = new BufferedWriter(new FileWriter("D:\\新建文件夹\\java\\javacode\\first\\src\\API\\111"))) {
//            w.write("麦吉尔大学");
//            w.write("\r\n");
//            w.write("多伦多大学",0, 5);
//            w.write("\r\n");
//            w.write("宾夕法尼亚大学");
//            w.write("\r\n");
//            w.write("麻省理工学院");
//        }catch (Exception e){
//            e.printStackTrace();
//        }


//        System.out.println("===================");
//
//        try (InputStream w = new BufferedInputStream(new FileInputStream("D:\\新建文件夹\\java\\javacode\\first\\src\\API\\222"))) {
//            System.out.println(new String(w.readAllBytes()));
//        }catch (Exception e){
//            e.printStackTrace();
//        }


//        try (OutputStream ou = new BufferedOutputStream(new FileOutputStream("D:\\新建文件夹\\java\\javacode\\first\\src\\API\\333"))) {
//            ou.write("hello world".getBytes());
//        }catch (Exception e){
//            e.printStackTrace();
//        }

        //出师表排序练习
        Map<Integer,String> map=new TreeMap<>();
        List<Integer> list=new ArrayList<>();
        list.add(3);list.add(8);list.add(4);list.add(2);list.add(1);list.add(9);list.add(6);list.add(7);list.add(5);
        try (
                BufferedReader b = new BufferedReader(new FileReader("D:\\新建文件夹\\java\\javacode\\first\\src\\ANU7710\\ChuShiBiao"));
                OutputStream o=new BufferedOutputStream(new FileOutputStream("D:\\新建文件夹\\java\\javacode\\first\\src\\ANU7710\\ChuShiBiao1111",true));
        ) {
            for(int i=0;i<list.size();i++){
                map.put(list.get(i),b.readLine());
            }
           //first way
            for(int i=1;i<=list.size();i++){
                o.write(map.get(i).getBytes());
                o.write("\r\n".getBytes());
            }
            //second way
//            map.forEach((key,value)-> {
//                try {
//                    o.write(value.getBytes());
//                    o.write("\r\n".getBytes());
//                } catch (IOException e) {
//                    throw new RuntimeException(e);
//                }
//            });
        }catch (Exception r){
            r.printStackTrace();
        }
        //这段代码虽然从结果上是正确的，但是暴露了我的几个问题：1——忘记集合的遍历方式了 2——忘记各个集合的特性 3——不会定义排序规则 4——各个集合的基本操作忘了




    }

    //其实这段代码的输出结果和之前的inputStream outputStream的输出结果一样,只是添加了缓冲流，提升效率
    public static void copy(String absolutePathOrigin, String absolutePathCopy) {
        try (
                InputStream in = new BufferedInputStream(new FileInputStream(absolutePathOrigin));
                OutputStream out = new BufferedOutputStream(new FileOutputStream(absolutePathCopy));
        ) {
            out.write(in.readAllBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //缓冲字符流
    public static void copy1(String absolutePathOrigin, String absolutePathCopy) {
        try (
                Reader r = new BufferedReader(new FileReader(absolutePathOrigin));
                Writer w = new BufferedWriter(new FileWriter(absolutePathCopy));
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

}
