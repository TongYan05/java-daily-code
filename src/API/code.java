package API;

import Object_Oriented.SecondType;

import javax.sql.rowset.FilteredRowSet;
import javax.swing.text.AttributeSet;
import java.awt.*;
import java.lang.reflect.Type;
import java.util.*;
import java.util.stream.StreamSupport;

public class code {
    public static void main(String[] args) {
        //API: Application Programming Interface/java已经写好的类
        //java中两个常见的API：String and ArrayList



       /*
         第一种：直接赋值
         第二种：new关键字
                 public String()                    空白字符串，不含任何内容
                 public String(String original)     根据传入的字符串，创建新的字符串对象
                 public String(char[] chs)          根据字符数组，创建字符串对象
                 public String(byte[] chs)          根据字节数组，创建字符串对象
        */
//        String a="hello world";
//        System.out.println(a);
//        System.out.println("============");
//        String b=new String();
//        System.out.println(b);
//        System.out.println("============");
//        String c=new String("hello world!!!");
//        String d=new String(a);
//        System.out.println(c);
//        System.out.println(d);
//        System.out.println("============");
//        char[] chs={'h','e','l','l','o'};
//        String e=new String(chs);
//        System.out.println(e);
//        System.out.println("============");
//        byte[] bytes={97,98,99,100};//97=a,98=b,99=c,100=d, ASCII码
//        String f=new String(bytes);
//        System.out.println(f);















//        //字符串中常见的成员方法：比较
//        String a1="hello world";
//        String a2="hello world";
//        String a3="hello world!!!";
//        System.out.println(a1.equals(a2)+" "+a1.equals(a3)+" "+a2.equals(a3));
//        String x=new String("we");
//        String y="we";
//        String z=new String("we");
//        System.out.println((x==y)+" "+x.equals(y)+" "+(x==z));//==比较的是两个对象的地址（引用数据类型），但对于基本数据类型，==比较的是两个数据本身（int, double）
//        System.out.println("============================");
//        //equals()方法 and equalsIgnoreCase()方法第二种忽略大小写
//        String a4="anu";
//        String a5="ANU";
//        String a6=new String("anu");
//        String a7=new String("ANU");
//        System.out.println(a4.equals(a5)+" "+a4.equals(a6)+" "+a4.equals(a7)+" "+a4.equalsIgnoreCase(a5)+" "+a4.equalsIgnoreCase(a6)+" "+a4.equalsIgnoreCase(a7));
//        System.out.println("============================");
//        //练习：
//        //已知正确的用户名和密码，请用程序实现模拟用户登录
//        //总共给三次机会，登录之后，给出相应的提示
//        String username="202211442424";
//        String password=new String("Ty200555");
//        Scanner input=new Scanner(System.in);
//        System.out.print("请输入用户名：");
//        String username1=input.next();
//        System.out.print("请输入密码：");
//        String password1=input.next();
//        for(int i=0;i<3;i++){
//            if(username.equals(username1)&&password.equals(password1)) {
//                System.out.println("登录成功！");
//                break;
//            }//1input--i==0  2input--i==1  3input--i==2
//            else if (i==2&&!(username1.equals( username)&&password1.equals(password))){
//                System.out.println("登录失败！请30s后重试!");
//                break;
//            }
//            else if(username1.equals( username)&&!(password1.equals(password))) {
//                System.out.println("密码错误！"+"还剩"+(2-i)+"次机会！");
//                System.out.print("请重新输入密码：");
//                password1=input.next();
//            }
//            else if(!(username1.equals( username))&&password1.equals(password)) {
//                System.out.println("用户名错误！"+"还剩"+(2-i)+"次机会！");
//                System.out.print("请重新输入用户名：");
//                username1=input.next();
//            }
//            else if (!(username1.equals( username))&&!(password1.equals(password))){
//                System.out.println("用户名和密码错误！"+"还剩"+(2-i)+"次机会！");
//                System.out.print("请重新输入用户名：");
//                username1=input.next();
//                System.out.print("请重新输入密码：");
//                password1=input.next();
//            }
//        }


//        //charAt()方法 and length()方法
//        String a= new String("fuck you!");
//        for (int i=0;i<a.length();i++){
//            System.out.print(a.charAt(i)+" ");
//        }



//        //练习：遍历字符串
//        //需求：键盘录入一个字符串，使用程序实现在控制台遍历该字符串
//        Scanner input=new Scanner(System.in);
//        System.out.print("请输入一个字符串：");
//        String str=input.nextLine();//把一行的数据全部录入进来
//        System.out.println(str.length());
//        for (int i=0;i<str.length();i++){
//            System.out.print(str.charAt(i)+" ");
//        }


//        //练习：统计字符次数
//        //键盘录入一个字符串，统计该字符串中大写字母字符，小写字母字符，数字字符出现的次数
//        //（不考虑其他字符）
//        Scanner input=new Scanner(System.in);
//        System.out.print("请输入一个字符串：");
//        String str=input.nextLine();
//        int upperCount=0;
//        int lowerCount=0;
//        int numberCount=0;
//        for(int i=0;i<str.length();i++){
//            if(str.charAt( i)>'a'&&str.charAt(i)<'z') lowerCount++;
//            else if(str.charAt( i)>'A'&&str.charAt(i)<'Z') upperCount++;
//            else if(str.charAt( i)>'0'&&str.charAt(i)<'9') numberCount++;
//        }
//        System.out.println("大写字母字符出现的次数为："+upperCount);
//        System.out.println("小写字母字符出现的次数为："+lowerCount);
//        System.out.println("数字字符出现的次数为："+numberCount);

//        //练习：拼接字符串
//        //定义一个方法，把int数组中的数据按照指定的格式拼接成一个字符串返回，调用该方法，并在控制台输出结果。
//        //例如：
//        //数组为 `int[] arr = {1,2,3};`
//        //执行方法后的输出结果为：`[1, 2, 3]`
//        Random random=new Random();
//        Scanner input=new Scanner(System.in);
//        System.out.print("请输入数组的长度：");
//        int num=input.nextInt();
//        int arr[]=new int[num];
//        for (int i=0;i<num;i++){
//            arr[i]=random.nextInt(0,101);
//        }
//        pingJie pj=new pingJie();
//        String str=pj.tranformation(arr);
//        System.out.println(str);


//        //数据脱敏--直播间名字只显示第一个字，后面全用***
//        //第一种方法substring(int beginIndex, int endIndex)方法
//        String str=new String("康神开播啦！真的假的？");
//        System.out.println(str.substring(0,2)+"***");
//
//        //敏感词过滤--replace(char oldChar, char newChar)方法
//        String str1=new String("打的这样玩什么啊？傻逼！");
//        String str2=str1.replace("傻逼","**");
//        System.out.println(str2);
//        //substring()方法只能截取或替换固定位置的字符串，但是replace()方法可以替换任意位置的字符串

//        //创建一个敏感词库
//        String arr[]={"傻逼","日你妈","操你妈","鸡巴","没母"};
//        Scanner input=new Scanner(System.in);
//        System.out.print("请输入内容：");
//        String str3=input.nextLine();
//        for(int i=0;i<arr.length;i++){
//            str3=str3.replace(arr[i],"***");
//        }
//        System.out.println(str3);



//        //总结equals()方法,equalIgnoreCase()方法,charAt(index)方法,length()方法,substring(startIndex,endIndex)方法,replace(char orginal, char alternated)方法
//        /*
//        String 类中常见的方法：
//        比较                  equals  equalsIgnoreCase
//        长度                  length
//        获取单个字符           charAt
//        截取                  substring
//        替换                  replace
//        ==============================================================================
//        删除                  trim//去除头尾空格
//        是否包含               contains
//        判断开头、结尾          startsWith/endsWith//判断开头、结尾
//        查找                  indexOf(int ch)    lastIndexOf(int ch)//
//        判断是否为空           isEmpty()
//        转字符数组             toCharArray()
//        大小写转换             toUpperCase() 、toLowerCase()
//        */
//        String str=new String("  The Australian National University");
//        String delete=str.trim() ;
//        System.out.println(delete);
//        System.out.println(str.contains("Australian")+" "+str.startsWith("the"));
//        System.out.println(str.startsWith("The")+" "+str.endsWith("University")+" "+str.startsWith("The",1));
//        //判断是不是pdf文件可以用 boolean a=str.endsWith(".pdf");
//        System.out.println(str.indexOf("i")+" "+str.lastIndexOf("i")+" "+str.lastIndexOf('*'));//如果要查找的字符串不存在，返回-1
//        System.out.println(str.isEmpty());
//        char arr[]=str.toCharArray();//char表示单个字符
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//        System.out.println(str.toUpperCase()+" "+str.toLowerCase());


//
//        //stringbuilder是字符串的一个工具类，让我们在拼接字符串的时候更高效
//        /*
//        StringBuilder的构造方法:
//        public StringBuilder()                    空参构造
//        public StringBuilder(String str)          带参构造
//
//        StringBuilder的常见成员方法:
//        append（任意类型）                         添加数据
//        reverse()                                 反转
//        int length()                              获取长度
//        toString                                  变回字符串
//        */
//
        StringBuilder sb=new StringBuilder();
        StringBuilder sb1=new StringBuilder("Pharmaceutics");
        sb.append("Pharmaceutics");
        System.out.println("sb:"+sb+" sb1:"+sb1);
        sb.reverse();
        System.out.println("sb:"+sb);
        System.out.println("lengthsb:"+sb.length());
        String str=sb1.toString();//sb只是一个容器，进行reverse()等操作后，要利用tostring()方法将数据返回给str，转换成字符串
        System.out.println(str);



/**
 * String 类和 StringBuilder 类 常用方法总结
 * ========================================
 *
 * 一、String 类
 *
 * 1. 构造方法：
 *    - String()                           空白字符串
 *    - String(String original)            根据传入的字符串创建新对象
 *    - String(char[] chs)                 根据字符数组创建字符串
 *    - String(byte[] bytes)               根据字节数组创建字符串（ASCII码转换）
 *
 * 2. 比较方法：
 *    - equals(String str)                 比较字符串内容是否相等（区分大小写）
 *    - equalsIgnoreCase(String str)       比较字符串内容是否相等（忽略大小写）
 *
 * 3. 获取方法：
 *    - charAt(int index)                  获取指定位置的字符
 *    - length()                           获取字符串长度
 *
 * 4. 截取和替换：
 *    - substring(int beginIndex, int endIndex)  截取字符串（包含beginIndex，不包含endIndex）
 *    - replace(CharSequence oldStr, CharSequence newStr)  替换字符串内容
 *
 * 5. 其他常用方法：
 *    - trim()                             去除字符串首尾空格
 *    - contains(CharSequence s)           判断是否包含指定字符串
 *    - startsWith(String prefix)          判断是否以指定字符串开头
 *    - startsWith(String prefix, int offset) 从指定位置开始判断是否以指定字符串开头
 *    - endsWith(String suffix)            判断是否以指定字符串结尾
 *    - indexOf( ch)                    查找字符第一次出现的位置
 *    - lastIndexOf( ch)                查找字符最后一次出现的位置
 *    - isEmpty()                          判断字符串是否为空
 *    - toCharArray()                      将字符串转换为字符数组
 *    - toUpperCase()                      转换为大写
 *    - toLowerCase()                      转换为小写
 *
 * 二、StringBuilder 类
 *
 * 1. 构造方法：
 *    - StringBuilder()                    空参构造
 *    - StringBuilder(String str)          带参构造
 *
 * 2. 常用成员方法：
 *    - append(任意类型)                    添加数据到末尾
 *    - reverse()                          反转字符串
 *    - length()                           获取长度
 *    - toString()                         转换为String类型
 *
 * 三、Scanner 类
 *    - next()                             读取下一个单词（以空格分隔）
 *    - nextLine()                         读取整行数据
 *    - nextInt()                          读取整数
 *
 * 四、Random 类
 *    - nextInt(int origin, int bound)     生成指定范围的随机数 [origin, bound)
 */


//键盘录入任意字符串，请按长度为 8 拆分每个输入字符串并进行输出
//长度不是 8 整数倍的字符串请在后面补数字 0，空字符串不处理。
//举例：
//输入：abcdabcda
//输出：第一行：abcdabcd
//　　　第二行：a0000000
//        //第一种方法
//        Scanner input = new Scanner(System.in);
//        System.out.print("请输入任意长度的字符串：");
//        String str = input.nextLine();
//        char arr[] = str.toCharArray();
//        for (int i = 1; i <= arr.length; i++) {
//            System.out.print(arr[i - 1]);
//            if (i % 8 == 0) {
//                System.out.println();
//            }
//        }
//        if (arr.length % 8 != 0) {
//            int r = arr.length % 8;
//            for (int i = 0; i < 8 - r; i++) {
//                System.out.print("0");
//            }
//        }
//        //第二种方法
//        Scanner input = new Scanner(System.in);
//        System.out.print("请输入任意长度的字符串：");
//        String str = input.nextLine();
//        for (int i = 0; i < str.length()/8; i++){
//            System.out.print(str.substring(i*8,i*8+8)+"\n");
//        }
//        System.out.print(str.substring(str.length()/8*8));
//        for (int i = str.length()%8; i < 8; i++){
//            System.out.print("0");
//        }
//        //第三种方法
//        Scanner input=new Scanner(System.in);
//        System.out.print("请输入一个字符串：");
//        String str=input.next();
//        for(int i=0;i<str.length();i++){
//            if(i%8==0) {
//                System.out.println();
//            }
//            System.out.print(str.charAt(i));
//        }



//        //定义一个字符串，然后打乱它里面的字符顺序。
//        String str=new String("111122223333444455556666777788889999");
//        Random random=new Random();
//        char arr[]=str.toCharArray();
//        for(int j=0;j<str.length()*str.length();j++){
//            int i=random.nextInt(0,str.length());
//            char c=arr[i];
//            arr[i]=arr[str.length()/2];
//            arr[str.length()/2]=c;
//        }
//        String str1=new String(arr);
//        System.out.println(str1);


//        //提取的题目内容：
//        //字符串反转
//        //键盘录入字符串，将该字符串进行反转，当输入 “拜拜” 的时候程序停止运行。
//        //例如，键盘录入 abc，输出结果 cba。
//        Scanner input = new Scanner(System.in);
//        System.out.print("请输入任意字符串：");
//        String str =new String(input.nextLine());
//        StringBuilder str1=new StringBuilder(str);
//        String j="是";
//        while(j.equals("是")){
//            str1=str1.reverse();
//            System.out.println(str1);
//            System.out.print("你还要继续反转吗（是/拜拜）：");
//            j=input.next();
//            if (j.equals("拜拜")) {
//                System.out.println("程序结束");
//                break;
//            }
//        }


        //集合ArrayList--一个长度可变的容器，每加一个元素，就会自动扩容（增删改查）
        //数组一旦定义后长度要变化的话非常麻烦
//        boolean add(E e)	添加数据到末尾	增
//        void add(int index, E e)	在指定索引位置添加数据	增
//        boolean remove(E e)	删除指定元素	删
//        E remove(int index)	删除指定索引位置的元素，并返回被删除的元素	删
//        E set(int index, E e)	修改指定索引位置的元素，并返回被修改的旧元素	改
//        E get(int index)	获取指定索引位置的元素	查
//        int size()	获取集合的长度（元素个数）	查


//        //<数据类型>泛型
//        System.out.println("==========定义集合+添加元素===========");
//        //后面的泛型可以省略不写
//        ArrayList<String> list=new ArrayList<String>();//创建集合对象,可存储任意数据类型
//        list.add("张三");list.add("20");list.add("true");list.add("1.5");
//        list.add(2,"傻逼");list.add(5,"张思");
//        System.out.println(list);
//        System.out.println("==========删除元素===========");
//        list.remove("true");//删除指定元素
//        list.remove(1);//删除指定索引位置的元素
//        System.out.println(list);
//        System.out.println("==========修改元素===========");
//        list.set(0,"爱丁堡");
//        System.out.println(list);
//        System.out.println("==========获取元素===========");
//        System.out.println(list.get(0));
//        System.out.println("==========获取集合长度===========");
//        System.out.println(list.size());
//        System.out.println("==========遍历集合===========");
//        for(int i=0;i<list.size();i++){
//            System.out.print(list.get(i)+" ");
//        }


//        //基本数据类型对应的包装类
//        //byte Byte，short Short，int Integer，long Long
//        // float Float，double Double，boolean Boolean，char Character
//        //小练习
//        ArrayList<Integer> list=new ArrayList<>();
//        Random random=new Random();
//        System.out.print("[");
//        for(int i=0;i<10;i++){
//            int k=random.nextInt(100);
//            list.add(k);
//            System.out.print(list.get(i)+",");
//            if(i==9)System.out.print(list.get(i)+"]");
//        }




//        //标题：添加学生对象并遍历
//        //需求：
//        //定义一个集合，添加一些学生对象。
//        //学生类的属性为：id、姓名、年龄。
//        //要求：
//        //遍历集合，将所有学生的属性打印在控制台上，每个学生一行。
//        //定义一个方法，根据id查找学生的信息。
//        //存在：返回索引
//        //不存在：返回-1
//        student stu1=new student("Mali",16,"2323");
//        student stu2=new student("Gery",18,"8787");
//        student stu3=new student("Hary",19,"6565");
//        student stu4=new student("Lily",17,"4545");
//        student stu5=new student("Mike",17,"9090");
//        student stu6=new student("Lucy",18,"7373");
//        ArrayList<student> list=new ArrayList<>();
//        list.add(stu1);list.add(stu2);list.add(stu3);list.add(stu4);list.add(stu5);list.add(stu6);
//        for(int i=0;i<list.size();i++){
//            System.out.println("==========第"+(i+1)+"个学生信息==========");
//            System.out.println("姓名："+list.get(i).getName()+"\t"+"年龄："+list.get(i).getAge()+"\t"+"学号："+list.get(i).getId());
//        }

//        Scanner input = new Scanner(System.in);
//        System.out.print("请输入要查找的学号：");
//        String id = input.next();
//        student stu=new student();
//        int index=stu.index(id,list);
//        System.out.println("==========查找结果==========");
//        System.out.println("索引："+index);
//        System.out.println("姓名："+list.get(index).getName()+"\t"+"年龄："+list.get(index).getAge()+"\t"+"学号："+list.get(index).getId());





















    }
}




















