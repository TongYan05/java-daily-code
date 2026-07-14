package API;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class trail {
    public static void main(String[] args) {

//        String studentId=new String("1234");
//        String password=new String("12");
//        Scanner input=new Scanner(System.in);
//        for (int i=0;i<3;i++){
//            System.out.print("请输入学号：");
//            String studentId1=input.next();
//            System.out.print("请输入密码：");
//            String password1=input.next();
//
//            if(!studentId1.equals(studentId)&&i<2){
//                System.out.println("学号错误！你还有"+(2-i)+"次机会！");
//            }
//            else if(!password1.equals(password)&&i<2){
//                System.out.println("密码错误！你还有"+(2-i)+"次机会！");
//            }else if(i==2&&(!studentId1.equals(studentId)||!password1.equals(password)))System.out.println("登录失败！");
//            else System.out.println("登录成功！");
//        }


//        Scanner input=new Scanner(System.in);
//        System.out.print("请输入一个字符串：");
//        String str=input.next();
//        int upperCount=0;
//        int lowerCount=0;
//        int numberCount=0;
//        for(int i=0;i<str.length();i++){
//            if(str.charAt(i)>='a'&&str.charAt(i)<='z')upperCount++;
//            else if(str.charAt(i)>='A'&&str.charAt(i)<='Z')lowerCount++;
//            else if(str.charAt(i)>='0'&&str.charAt(i)<='9')numberCount++;
//        }
//        System.out.println("大写字母的个数："+upperCount+" "+"小写字母的个数："+lowerCount+" "+"数字的个数："+numberCount);


//        Scanner input=new Scanner(System.in);
//        Random random=new Random();
//        System.out.print("请输入数组的长度：");
//        int arr[]=new int[input.nextInt()];
//        for(int i=0;i<arr.length;i++){
//            arr[i]=random.nextInt(100);
//        }
//        formation f=new formation();
//        System.out.println( f.transforation(arr));


//        Scanner input=new Scanner(System.in);
//        System.out.print("请输入用户名：");
//        String username=input.next();
//        System.out.println(username.substring(0,3)+"***");

//        Scanner input=new Scanner(System.in);
//        System.out.print("请输入一个字符串：");
//        String str=input.next();
//        System.out.println(str.replace("我","你"));


//        Scanner input=new Scanner(System.in);
//        System.out.print("请输入一个字符串：");
//        String str=input.next();
//        String arr[]={"我","你","他","她","它"};
//        for(int i=0;i<arr.length;i++){
//            str=str.replace(arr[i],"*");
//        }
//        System.out.println(str);


//        String str = "        The university of Melbourne       ";
//        System.out.println(str.trim()+"/////"+str);
//        String str1=str.trim();
//        System.out.println(str.contains("T")+"\t"+str1.startsWith("The")+"\t"+str1.endsWith("T"));
//        System.out.println(str.indexOf('e')+"\t"+str.lastIndexOf('e'));
//        System.out.println(str.isEmpty());
//        char ch[]=str.toCharArray();
//        for (int i=0;i<ch.length;i++){
//            System.out.print(ch[i]+" ");
//        }
//        System.out.println("\n"+str1.toLowerCase()+"\t"+str1.toUpperCase());



//        StringBuilder sb=new StringBuilder();
//        sb=sb.append("I also wish to become one of pivotal part of you");
//        System.out.println(sb.reverse());
//        System.out.println(sb.length());
//        System.out.println(sb.getClass());
//        String str=sb.toString();
//        System.out.println(str.toUpperCase()+"\t"+str.getClass());


//        Scanner input=new Scanner(System.in);
//        System.out.print("请输入一个字符串：");
//        String str=input.next();
//        for(int i=0;i<str.length();i++){
//            if(i%8==0) {
//                System.out.println();
//            }
//            System.out.print(str.charAt(i));
//        }


//        ArrayList<String> list=new ArrayList();
//        list.add("爱");list.add("你");list.add("我");
//        for(int i=0;i<list.size();i++){
//            System.out.print(list.get(i));
//        }
//        System.out.println();
//        list.set(0,"我");list.set(1,"爱");list.set(2,"你");
//        for(int i=0;i<list.size();i++){
//            System.out.print(list.get(i));
//        }



//
//        ArrayList<student1> list=new ArrayList();
//        student1 s1=new student1("Mike",20,"1234");
//        student1 s2=new student1("Judy",17,"5678");
//        student1 s3=new student1("Tomy",19,"3456");
//        list.add(s1);list.add(s2);list.add(s3);
//        for(int i=0;i<list.size();i++){
//            System.out.println(list.get(i).getName()+"\t"+list.get(i).getAge()+"\t"+list.get(i).getId());
//        }
//        Scanner input=new Scanner(System.in);
//        System.out.print("请输入要查找的学号：");
//        String id=input.nextLine();
//        student1 stu=new student1();
//        int index=stu.index(id,list);
//        System.out.println(index);


    }
}
