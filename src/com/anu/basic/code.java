package com.anu.basic;


import javax.imageio.stream.FileCacheImageInputStream;
import java.io.File;
import java.io.IOException;
import java.lang.classfile.constantpool.DoubleEntry;
import java.lang.classfile.constantpool.LongEntry;
import java.lang.reflect.Type;
import java.security.PublicKey;
import java.util.Random;
import java.util.Scanner;

public class code {

    //方法的定义和调用
    public static int sum_calculation(int x, int y) {
        int sum = x + y;
        return sum;
    }

    public static void cal(int have_done, int sum, int everyday) {
        int day = 0;
        if ((sum - have_done) % everyday == 0) System.out.println((sum - have_done) / everyday + "天可以完成!");
        if ((sum - have_done) % everyday != 0)
            System.out.println(((sum - have_done) / everyday + (sum - have_done) / everyday / 7.0) + "天可以完成");

        while (have_done <= sum) {
            day++;
            have_done = have_done + everyday;
        }
        System.out.println("第" + day + "天完成");


    }


    public static void main(String[] args) {

//        cal(61,106,7);

        File file = new File("C:\\Users\\33265\\Desktop\\pcyyb_cn.com.langeasy.LangEasyLexis_2700300016_installer.exe");
        Runtime runtime = Runtime.getRuntime();
        try {
            Process process = Runtime.getRuntime().exec("cmd /c start \"\" \"" + file.getAbsolutePath() + "\"");
        } catch (IOException e) {
            e.printStackTrace();
        }



/*        //输出霸王龙的信息：霸王龙 8岁11.5 公


/*        //输出霸王龙的信息：霸王龙 8岁11.5 公

        //输出恐龙的名字
        System.out.println("霸王龙");
        //输出恐龙的年龄
        System.out.println(8);
        //输出恐龙的体重
        System.out.println(11.5);
        //输出恐龙的性别
        System.out.println("公");*/




/*        //数据类型 变量名=数据值，比python多了一个数据类型,int整数/double小数
        //定义一个变量用于记录微信的余额
        double wechatbalance = 0;
        //定义一个变量用来记录银行卡余额
        double bankBalance = 10;
        //定义一个变量记录支付宝余额
        double alipayBalance = 20;
        //三个变量和为另一个新的变量
        double totalBalance = wechatbalance + bankBalance + alipayBalance;
        System.out.println(totalBalance);
        //微信收了10块右发了两块
        wechatbalance = wechatbalance + 10 - 2;
        //三个变量的和
        totalBalance= wechatbalance + bankBalance + alipayBalance;
        System.out.println(totalBalance);*/


//        String name1="叉子";//String字符串
//        double attack1=220;
//        double defence1=85;
//        double blood1=1012.5;
//        double extraattack1=1.2;
//
//        String name2="小怪兽";
//        double attack2=210;
//        double defence2=80;
//        double blood2=1223.3;
//        double extraattack2=1.3;
//
//        //普通攻击伤害=我方攻击力-对方防御力
//        double normalattack1=attack1-defence2;
//        double normalattack2=attack2-defence1;
//        //对方剩余血量=原有血量-收到的攻击
//        blood2=blood2-normalattack1;
//        System.out.println("经过一次普通攻击后二号的剩余血量是："+blood2);
//        //技能攻击伤害=攻击力*攻击加成-对方防御力
//        double skillattack1=attack1*extraattack1-defence2;
//        //对方剩余血量=原有血量-收到的攻击
//        blood2=blood2-skillattack1;
//        System.out.println("经过一次技能攻击后二号的剩余血量是："+blood2);


//        String a,b,c,d;
//        a="不要";
//        b="忘记";
//        c="我";//String用双引号
//        d="爱你";
//        System.out.println(a+b+c+d);
//        //byte,short,int,long,float,double,char,String,boolean
//        char one_word='瞬';//char类型一定用单引号
//        System.out.println(one_word);
//        boolean buer=true;//java中是true不是True,是false不是False
//        System.out.println(buer);


//        //定义身高和体重
//        double height=1.73;
//        int MyWeight=53;
//        //BMI=体重/（身高*身高）
//        double BMI=MyWeight/(height*height);
//        System.out.println(BMI);//general18.5-23.9
//        //求当前身高下的正常体重范围
//        double BMI1,BMI2,WeightNormalMax,WeightNormalMin;
//        BMI1=18.5;
//        BMI2=23.9;
//        WeightNormalMax=2*BMI2*(height*height);
//        WeightNormalMin=2*BMI1*(height*height);
//        System.out.println("1.73m下的正常体重范围为："+WeightNormalMin+"-"+WeightNormalMax+"斤");


//        //变量名只能由数字、字母、下划线、$组成,且不能以数字开头，不能用关键字当变量名：比如class,多个单词为变量名记得大写Capital
//        String name$,name_,name2;


//        Scanner input = new Scanner(System.in);//一个程序内写一次就足够了
//        //输入名字
//        System.out.print("Please enter your name:");//print()打印不换行,println()打印并换行
//        String name = input.nextLine();//nextLine()输入字符串,nextInt()输入数字,next()读到空格就不读了
//        System.out.println("hello,"+name);
//        //输入年龄
//        System.out.print("Please enter your age:");
//        int age = input.nextInt();
//        System.out.println("your age is:"+age);


//        System.out.print("请输入你最喜欢的一首歌：");
//        String name=input.nextLine();//next()读取到空格，换行就不读了，nextLine却可以读一行
//        System.out.println(name+"确实很好听");


//        //任意两数之和
//        System.out.print("please enter the first number:");
//        int number1=input.nextInt();
//        System.out.print("please enter the second number:");
//        int number2=input.nextInt();
//        int sum=number1+number2;
//        System.out.println(number1+"与"+number2+"的和为:"+sum);


//        //从键盘输入 3 个整数 a、b、c，计算：
//        //result = 2a + 3b - c
//        int a,b,c,d;
//        System.out.print("请依次输入3个整数，中间用空格隔开：");//print不换行
//        a=input.nextInt();//nextInt遇见空白字符就结束，然后往后找到第一个数字就是下一个nextInt
//        b=input.nextInt();//空格，回车都可以
//        c=input.nextInt();
//        d=a+b+c;
//        System.out.println(a+","+b+","+c+"的和为："+d)


        //输入两数，求和
//        Scanner input2 = new Scanner(System.in);
//        int num1,num2;
//        System.out.print("enter num1:");
//        num1=input2.nextInt();//137行已经声明了int类型，这里就不用申明
//        System.out.print("enter num2:");
//        num2=input2.nextInt();
//        System.out.println("num1+num2="+(num1+num2));

//        //BMI，键盘输入自身数据
//        System.out.print("请输入身高(米)：");
//        double height=input2.nextDouble();
//        System.out.print("请输入体重(斤)：");
//        double weight=input2.nextDouble();
//        double BMI=weight/2/(height*height);
//        System.out.println("BMI="+BMI);


        //运算符,%取余数
//        //整数计算
//        int a=10;
//        int b=3;
//        System.out.println(a/b);
//        System.out.println(a%b);
//        System.out.println(a+b);
//        System.out.println(a-b);
//        System.out.println(a*b);

//        System.out.println("--------------------------------");
//
//        //浮点数计算，小数参与计算，结果是有可能不精确的
//        double a=1.1;
//        double b=1.01;
//        System.out.println(a/b);
//        System.out.println(a%b);
//        System.out.println(a+b);
//        System.out.println(a-b);
//        System.out.println(a*b);
//        System.out.println(a/b);


        //输入一个三位数，求个位、十位、百位
//        System.out.print("输入一个三位数：");
//        int number=input2.nextInt();
//        System.out.print("个位数："+number%10+"\t");
//        System.out.print("十位数："+(number/10)%10+"\t");
//        System.out.print("百位数："+(number/100));


//        //输入任意秒数，转换成时分秒
//        System.out.print("请输入任意秒数：");
//        int second=input2.nextInt();
//        int hourTransferred,minuteTransferred,secondTransferred;
//        hourTransferred=second/3600;
//        minuteTransferred=(second%3600)/60;
//        secondTransferred=(second%3600)%60;
//        System.out.println(second+"秒转换成时分秒为："+hourTransferred+"时"+minuteTransferred+"分"+secondTransferred+"秒");


//        //算数运算符的三种情况,类型不一样不能运算，需要转换成一样的类型
//        //隐式转换,java会自动将数据类型转换成最大的数据类型,如有byte and short类型,java会先提升为int类型再进行运算，byte+byte=int
//        //把取值范围小的提升为取值范围大，在进行计算，byte+double=double
//
//        //显式转换(强制转换)--有可能导致精度丢失---数据类型 变量名=（transferred类型）被转换的变量名
//        int a=10;
//        byte aTransferred=(byte) a;

//        //练习二：
//        //检查下面代码，程序运行的时候是否会报错，如果会，请说明错误原因
//        short s1 = 100;
//        short s2 = 200;
//        // int + int = int
//        // 修改方案1：
//        // 300 - 二进制：00000000 00000000 00000001 00101100
//        // 强制转换byte：00101100(44)
//        byte result1 = (byte) (s1 + s2);
//        System.out.println(result1);
//
//        // 修改方案2：
//        int result2 = s1 + s2;
//        System.out.println(result2);


//        //字符和数字的对应ASCLL码
//        char a='A';//A的ASCLL码为65
//        int b=5;
//        System.out.println(a+b);

//        //A转化成a,利用强制转换
//        char before='A';
//        int later='A'+32;//A的ASCLL码为65，a的ASCLL码为97,65+32=97
//        System.out.println(later);
//        char later1=(char)(later);
//        System.out.println(later1);


//        //字符串只有+操作，从左往右依次进行运算
//        int x1=123;
//        int x11=2;
//        String x2="abc";
//        String x22="def";
//        int x3=4;
//        int x4=5;
//        System.out.println(x1+x11+x2+x22+x3+x4);


//        System.out.println("--------------------------------");


//        //自增运算符++，自减运算符--
//        int num=5;
//        int num1=num++;//num先赋值给num1=5，num再加1=6
//        int num2=++num;//num先加1=7，num再赋值给num2=7
//        // ',' （单引号）= char 类型，值为 ASCII 码 44，参与数值运算
//        //"," （双引号）= String 类型，作为字符串拼接符号
//        System.out.println(num+","+num1+","+num2);
//        num=num++;
//        System.out.println(num);
//        num++;
//        System.out.println(num);
//        num--;
//        System.out.println(num);


//        System.out.println("--------------------------------");
//
//
//        //赋值运算符=/+=/-=/*=//=/%=
//        int a=10;
//        a+=5;//先加5，再赋值给a，结果为15
//        System.out.print(a+"\t");
//        a-=5;//先减5，再赋值给a，结果为10
//        System.out.print(a+"\t");
//        a*=5;//先乘5，再赋值给a，结果为50
//        System.out.print(a+"\t");
//        a/=5;//先除5，再赋值给a，结果为10
//        System.out.print(a+"\t");
//        a%=5;//先求余数5，再赋值给a，结果为0
//        System.out.print(a+"\t");
//
//
//        System.out.println();


//        //关系运算符，也叫比较运算符，==/!=/</>/<=/>=
//        int b=3;
//        System.out.print((b==4)+"\t");
//        System.out.print((b!=4)+"\t");
//        System.out.print((b<4)+"\t");
//        System.out.print((b>4)+"\t");
//        System.out.print((b<=4)+"\t");
//        System.out.print((b>=4)+"\t");
//        System.out.println();


//        //练习1：录入好基友的身高，比一比谁更高
//        Scanner input=new Scanner(System.in);
//        System.out.print("请输入你的身高(m)：");
//        double yourHeight=input.nextDouble();
//        System.out.print("请输入好基友的身高(m)：");
//        double frienddHeight=input.nextDouble();
//        System.out.println("你更高吗？"+(yourHeight>frienddHeight));


//        //练习2：输入一个数字，判断是否能被3整除
//        System.out.print("请输入一个数字：");
//        int number=input.nextInt();
//        System.out.println(number+"能被3整除吗？"+(number%3==0));
//

//        //逻辑运算符，&/|   短路与/短路或&&/||/!
//        //练习一：输入一个数字，判断是否在1-10之间
//        System.out.print("enter a int:");
//        int number=input.nextInt();
//        System.out.print(number+"在1-10之间吗？"+(number>=1&&number<=10)+"\n");
//
//        System.out.print("enter a int:");
//        int number1=input.nextInt();
//        System.out.print(number1+"不在1-10之间吗？"+!(number1>=1&&number1<=10)+"\n");
//        System.out.print(number1+"不在1-10之间吗？"+(number1<=1||number1>=10)+"\n");


//        System.out.println("-----------------------------------------------------------------");
//        //2026/4/7

//        //input a five-digit number, judge whether it is palindrome
//        Scanner input=new Scanner(System.in);
//        System.out.print("please enter a five-digit number:");
//        int x=input.nextInt();
//        System.out.println("Is "+x+" a palindrome? "+((x%10==x/10000)&&(x/10%10==x/1000%10)));

//        //寻找7的有缘数，输入一个两位数，只要包含7或者是7的倍数，就是有缘数
//        System.out.print("enter a two-digit number:");
//        int y=input.nextInt();
//        System.out.println("Is "+y+" a luck number of 7? "+(y/10==7||y%10==7||y%7==0));


//        //三元运算符
//        //键盘录取两个整数，获取最大值,格式：写一个判断?表达式1：表达式2,对应执行true:false
//        System.out.print("enter a int:");
//        int a=input.nextInt();
//        System.out.print("enter a int:");
//        int b=input.nextInt();
//        System.out.println((a>b?a:b)+" is the bigger one.");


//        //判断语句if(判断){语句体
//        //       }输入提问，>38°，输出体温警报
//        System.out.print("enter your temperature:");
//        double temp=input.nextDouble();
//        if (temp>38){
//            System.out.println("your temperature is high!");
//        }


//        // 需求：初始最大生命200，受到X点伤害，技能恢复Y点血，X和Y由键盘录入而来
//        // 假设：游戏人物不会死亡，最少1点血
//        // 问：最终游戏人物血量是多少？
//        int blood=200;
//        System.out.print("enter attack:");
//        int attack=input.nextInt();
//        if (200-attack<=0){
//            System.out.println("you died.");
//            System.out.println("final blood:"+0);
//        if (200-attack>0){
//            System.out.println("you blood:" + (200 - attack));
//            System.out.print("enter recovery:");
//            int recovery = input.nextInt();
//            if (200-attack+recovery>200) {
//                System.out.println("you can't recover more than your max blood.");
//                System.out.println("final blood:" +200);
//            }
//            if (200-attack+recovery<=200) {
//                System.out.println("you are alive.");
//                System.out.println("final blood:" + (200 - attack + recovery));
//            }
//        }



        /*
        if的语句：
        1. if语句大括号的位置
           左括号写在上一行的末尾，不要单独写一行
        2. if语句大括号的省略
           如果大括号中写的语句只有一行，大括号可以省略
        3. 小括号后面不能有分号
              小括号后面不能有分号，这会断开if和代码块
        4. 判断布尔类型的变量
              判断布尔类型的变量，直接把变量写在小括号中即可
        */

/*        if (){
            语句A
        } else if (){
            语句B
        } else if (){
            语句C
        } else{
            语句D
        }*/

//        //定义一个小数成绩，判断是否及格
//        Scanner input=new Scanner(System.in);
//        System.out.print("enter a score:");
//        double score=input.nextDouble();
//        if (score>=60&&score<=85)
//            System.out.println("pass.");
//        else if (score>85&&score<=100)
//            System.out.println("excellent.");
//            else if (score>100)
//                System.out.println("牛逼!");
//        else
//            System.out.println("fail.");

//        //美团饿了么花销比较第一种方法
//        Scanner input=new Scanner(System.in);
//        System.out.print("your bill is:");
//        double bill=input.nextDouble();
//        double eLeMe=bill*0.9;
//        double meiTuan1=bill;
//        double meiTuan2=bill-10;
//        if (bill<30){
//            System.out.println("美团："+meiTuan1+"\t"+"饿了么："+eLeMe);
//            System.out.println("饿了么 is more cost-effective.");
//            } else{
//            System.out.println("美团："+meiTuan2+"\t"+"饿了么："+eLeMe);
//            if (meiTuan2>eLeMe){
//                System.out.println("饿了么 is more cost-effective.");
//            }else if(meiTuan2<eLeMe){
//                System.out.println("美团 is more cost-effective.");
//            }else{
//                System.out.println("They cost the same.");
//            }
//        }

//        //美团饿了么花销比较第二种方法
//        Scanner input=new Scanner(System.in);
//        System.out.print("your bill is:");
//        double bill=input.nextDouble();
//        double eLeMe=bill*0.9;
//        double meiTuan1=bill;
//        double meiTuan2=bill-10;
//        if (bill<30){
//            System.out.println("美团："+meiTuan1+"\t"+"饿了么："+eLeMe);
//            System.out.println("饿了么 is more cost-effective.");
//        }else if(bill>=30&&meiTuan2<eLeMe){
//            System.out.println("美团："+meiTuan2+"\t"+"饿了么："+eLeMe);
//            System.out.println("美团 is more cost-effective.");
//        }else if(bill>=30&&meiTuan2>eLeMe){
//            System.out.println("美团："+meiTuan2+"\t"+"饿了么："+eLeMe);
//            System.out.println("饿了么 is more cost-effective.");
//        }else{
//            System.out.println("They cost the same.");
//        }


//        //practice:卡拉兹函数（Collatz function）定义如下：
//        //给定正整数 n，
//        //若 n 为奇数，则 f(n)=3n+1,
//        //若 n 为偶数，则 f(n)=n/2,
//        Scanner input=new Scanner(System.in);
//        System.out.print("enter a positive integer:");
//        int number=input.nextInt();
//        int fn1=3*number-1;
//        int fn2=number/2;
//        if (number%2==0)
//            System.out.println(fn2);
//        else
//            System.out.println(fn1);


//        需求：很多App都有不同的优惠券
//        假设，现在有以下优惠券
//                全场商品满10减8
//        全场商品满50减30
//                全场商品满100减50
//        全场商品满200减90
//
//        会员卡，全场8折
//        请问：会员卡和优惠券不能同时使用，最优惠的价格是多少？

//        Scanner input=new Scanner(System.in);
//        System.out.print("enter your bill:");
//        double bill=input.nextDouble();
//        double coupon1=bill-8;
//        double coupon2=bill-30;
//        double coupon3=bill-50;
//        double coupon4=bill-90;
//        double membershipCard5=bill*0.8;
//        if (bill<10) {
//            System.out.println("membership card:"+membershipCard5+"￥"+"\t"+"coupon:"+bill+"￥");
//            System.out.println("membership card is more cost-effective.");
//        }
//        else if (bill>=10&&bill<50&&coupon1<membershipCard5) {
//            System.out.println("membership card:"+membershipCard5+"￥"+"\t"+"coupon:"+coupon1+"￥");
//            System.out.println("coupon is more cost-effective.");
//        }
//        else if (bill>=10&&bill<50&&coupon1==membershipCard5) {
//            System.out.println("membership card:"+membershipCard5+"￥"+"\t"+"coupon:"+coupon1+"￥");
//            System.out.println("They cost the same.");
//        }
//        else if (bill>=10&&bill<50&&coupon1>membershipCard5) {
//            System.out.println("membership card:"+membershipCard5+"￥"+"\t"+"coupon:"+coupon1+"￥");
//            System.out.println("membership card is more cost-effective.");
//        }
//        else if (bill>=50&&bill<100&&coupon2<membershipCard5) {
//            System.out.println("membership card:"+membershipCard5+"￥"+"\t"+"coupon:"+coupon2+"￥");
//            System.out.println("coupon is more cost-effective.");
//        }
//        else if (bill>=50&&bill<100&&coupon2==membershipCard5) {
//            System.out.println("membership card:"+membershipCard5+"￥"+"\t"+"coupon:"+coupon2+"￥");
//            System.out.println("They cost the same.");
//        }
//        else if (bill>=50&&bill<100&&coupon2>membershipCard5) {
//            System.out.println("membership card:"+membershipCard5+"￥"+"\t"+"coupon:"+coupon2+"￥");
//            System.out.println("membership card is more cost-effective.");
//        }
//        else if (bill>=100&&bill<200&&coupon3<membershipCard5) {
//            System.out.println("membership card:"+membershipCard5+"￥"+"\t"+"coupon:"+coupon3+"￥");
//            System.out.println("coupon is more cost-effective.");
//        }
//        else if (bill>=100&&bill<200&&coupon3==membershipCard5) {
//            System.out.println("membership card:"+membershipCard5+"￥"+"\t"+"coupon:"+coupon3+"￥");
//            System.out.println("They cost the same.");
//        }
//        else if (bill>=100&&bill<200&&coupon3>membershipCard5) {
//            System.out.println("membership card:"+membershipCard5+"￥"+"\t"+"coupon:"+coupon3+"￥");
//            System.out.println("membership card is more cost-effective.");
//        }
//        else if (bill>=200&&coupon4<membershipCard5) {
//            System.out.println("membership card:"+membershipCard5+"￥"+"\t"+"coupon:"+coupon4+"￥");
//            System.out.println("coupon is more cost-effective.");
//        }
//        else if (bill>=200&&coupon4==membershipCard5) {
//            System.out.println("membership card:"+membershipCard5+"￥"+"\t"+"coupon:"+coupon4+"￥");
//            System.out.println("They cost the same.");
//        }
//        else if (bill>=200&&coupon4>membershipCard5) {
//            System.out.println("membership card:"+membershipCard5+"￥"+"\t"+"coupon:"+coupon4+"￥");
//            System.out.println("membership card is more cost-effective.");
//        }


//        //第二种方法
//        Scanner input=new Scanner(System.in);
//        System.out.print("enter your bill:");
//        double bill=input.nextDouble();
//        double coupon;
//        if (bill<10) {
//            coupon = bill;
//        }
//        else if (bill>=10&&bill<50) {
//            coupon = (bill - 8);
//        }
//        else if (bill>=50&&bill<100) {
//            coupon = (bill - 30);
//        }
//        else if (bill>=100&&bill<200) {
//            coupon = (bill - 50);
//        }
//        else {
//            coupon= (bill - 90);
//        }
//        double membershipCard=bill*0.8;
//        if (coupon<membershipCard) {
//            System.out.println("membership card:"+membershipCard+"￥"+"\t"+"coupon:"+coupon+"￥");
//            System.out.println("coupon is more cost-effective.");
//        }
//        else if (coupon==membershipCard) {
//            System.out.println("membership card:"+membershipCard+"￥"+"\t"+"coupon:"+coupon+"￥");
//            System.out.println("They cost the same.");
//        }
//        else {
//            System.out.println("membership card:"+membershipCard+"￥"+"\t"+"coupon:"+coupon+"￥");
//            System.out.println("membership card is more cost-effective.");
//        }


//        Scanner input=new Scanner(System.in);
//        System.out.print("enter the first double:");
//        double number1=input.nextDouble();
//        System.out.print("enter the second double:");
//        double number2=input.nextDouble();
//        System.out.print("enter the third double:");
//        double number3=input.nextDouble();
        //任意两边大于第三边，不是逻辑或而是逻辑与，比如5，5，10
//        if (number1+number2>number3&&number1+number3>number2&&number2+number3>number1){
//            if((number1==number2&&number1!=number3)||(number1==number3&&number2!=number3)||(number2==number3&&number1!=number3))
//                System.out.println("isosceles triangle");//ai'soseli:z
//            else if(number1==number2&&number1==number3)//先写等边再写等腰会简单一丢丢
//                System.out.println("equilateral triangle");//i:kwi'laeterel
//            else if(number1*number1+number2*number2==number3*number3||number1*number1+number3*number3==number2*number2||number2*number2+number3*number3==number1*number1)
//                System.out.println("right triangle");
//            else
//                System.out.println("scalene triangle");//ske'li:n
//        }
//        else{
//            System.out.println("not a triangle");
//        }


//        Scanner input=new Scanner(System.in);
//        System.out.print("enter x:");
//        double x=input.nextDouble();
//        System.out.print("enter y:");
//        double y=input.nextDouble();
//        if (x>0&&y>0){
//            System.out.println("point("+x+","+y+") is in the first quadrant");
//        }
//        else if(x<0&&y>0){
//            System.out.println("point("+x+","+y+") is in the second quadrant");
//        }
//        else if(x<0&&y<0){
//            System.out.println("point("+x+","+y+") is in the third quadrant");
//        }
//        else if(x>0&&y<0){
//            System.out.println("point("+x+","+y+") is in the fourth quadrant");
//        }
//        else if(x==0&&y==0){
//            System.out.println("point("+x+","+y+") is at the origin");
//        }
//        else if(x==0){
//            System.out.println("point("+x+","+y+") is on the y-axis");
//        }
//        else{
//            System.out.println("point("+x+","+y+") is on the x-axis");
//        }


//       计算电费（课堂练习，自己独立完成）
//         用电量计算采取阶梯计费原则，规则如下：
//        1. [0 ~ 100] 度，按 0.5 元/度计费
//         2. (100 ~ 200] 度，按 0.8 元/度计费
//         3. (超过200] 度，按 1.2 元/度计费
//
//        Scanner input=new Scanner(System.in);
//        System.out.print("please enter your electricity consumption:");
//        double electricity_consumption=input.nextDouble();
//        double electricity_bill=0;//条件没有覆盖正无穷到负无穷，必须赋值
//        if (electricity_consumption<=100){
//            electricity_bill=electricity_consumption*0.5;
//        }
//        else if(electricity_consumption>100&&electricity_consumption<=200){
//            electricity_bill=100*0.5+(electricity_consumption-100)*0.8;
//        }
//        else if(electricity_consumption>200){
//            electricity_bill=100*0.5+100*0.8+(electricity_consumption-200)*1.2;
//        }
//        System.out.println("your electricity bill is:"+electricity_bill);





/*      //switch语句示例 - 根据星期选择运动项目
        int week = 1; // 假设今天是星期一
        switch(week){week只能是---字符/整数:byte short int/枚举，不能是double/float/long/boolean
            case 1:
                System.out.println("跑步");
                break;//如果没有break会造成case穿透，程序会运行下一个case的语句体，直到找到break为止
            case 2:
                System.out.println("慢走");
                break;
            case 3:
                System.out.println("游泳");
                break;
            case 4:
                System.out.println("骑自行车");
                break;
            case 5:
                System.out.println("打篮球");
                break;
            case 6:
                System.out.println("爬山");
                break;
            case 7:
                System.out.println("休息");
                break;
            default://defualt的位置可以随意摆放
                System.out.println("没有这个星期");
                break;
        }*/

        //first expression
//        Scanner input=new Scanner(System.in);
//        System.out.print("enter a day:");
//        String day=input.nextLine();
//        switch(day){
//            case "Monday":
//            System.out.println("跑步");
//            break;
//            case "Tuesday":
//            System.out.println("慢走");
//            break;
//            case "Wednesday":
//            System.out.println("游泳");
//            break;
//            case "Thursday":
//            System.out.println("骑自行车");
//            break;
//            case "Friday":
//            System.out.println("打篮球");
//            break;
//            case "Saturday":
//            System.out.println("爬山");
//            break;
//            case "Sunday":
//            System.out.println("休息");
//            break;
//            default:
//            System.out.println("没有这个星期");
//            break;
//        }

        //second expression
//        Scanner input=new Scanner(System.in);
//        System.out.print("enter a month:");
//        String month=input.nextLine();
//        switch(month){
//            case "March","April", "May"-> System.out.println("Spring");//case后面接多个值用逗号连接
//            case "June", "July", "August"->System.out.println("Summer");//如果case里面不止一句，则要求->{2句语句}，跟一个大括号
//            case "September", "October", "November"->System.out.println("Autumn");
//            case "December", "January", "February"->System.out.println("Winter");
//            default->System.out.println("没有这个月份");
//        }

//        //third expression
//        Scanner input=new Scanner(System.in);
//        System.out.print("enter a month:");
//        String month=input.nextLine();
//        String season=switch(month){
//            case "March","April", "May"->"Spring";//case里面不输出，而是定义变量season,case语句相当于给season赋值
//            case "June", "July", "August"->"Summer";
//            case "September", "October", "November"->"Autumn";
//            case "December", "January", "February"->"Winter";
//            default->"没有这个月份";
//        };//最后的分号不能忘记
//        System.out.println(season);


//        //fourth expression
//        Scanner input=new Scanner(System.in);
//        System.out.print("enter a month:");
//        String month=input.nextLine();
//        String season=switch(month){
//            case "March","April", "May"-> {
//                yield "Spring";
//            }//大括号就不回穿透，所以不要break
//            case "June", "July", "August"-> {
//                yield "Summer";
//            }
//            case "September", "October", "November"-> {
//                yield "Autumn";
//            }
//            case "December", "January", "February"-> {
//                yield "Winter";
//            }
//            default-> {
//                yield "没有这个月份";
//            }
//        };//整个来看就是定义变量所以要分号
//        System.out.println(season);


//        //for循环(初始化语句;条件判断语句;条件控制语句)
//        for(int i=1;i<=10;i=i+2){
//            System.out.println("jump "+i+" times");
//        }

//        //练习1：循环打印数字
//        //需求：在实际开发中，如果要获取一个范围中的每一个数据时，就会用到循环。
//        //要求1：打印1-5
//        //要求2：打印5-1
//        for (int i=1;i<=5;i++){
//            System.out.print("i="+i+" ");
//        }
//        System.out.println();
//        for (int i=5;i>=1;i--){
//            System.out.print("i="+i+" ");
//        }


//        //案例4：求和
//        //需求：在实际开发中，如果要获取一个范围中的每一个数据时，也会用到循环。
//        //要求：求1-5之间的和
//        int sum=0;
//        for (int i=1;i<=5;i++){
//            sum=sum+i;
//        }
//        System.out.println("sum="+sum);


//        //案例5：求偶数和
//        //比如：求1-100之间的偶数和
//        int sum=0;
//        for (int i=0;i<=100;i=i+2){
//            sum=sum+i;
//        }
//        System.out.println("sum="+sum);


//        //案例6：统计满足条件的数字
//        //需求：键盘录入两个数字，表示一个范围。
//        //既能被3整除，又能被5整除数字有多少个？
//        int a,b;
//        Scanner input=new Scanner(System.in);
//        System.out.print("enter a:");
//        a=input.nextInt();
//        System.out.print("enter b:");
//        b=input.nextInt();
//        if (a>b) {
//            for (int i = b; i <= a; i++) {
//                if (i % 3 == 0 && i % 5 == 0) System.out.print(i + " ");
//            }
//        }
//        else if(a<b){
//            for (int i = a; i <= b; i++) {
//                if (i % 3 == 0 && i % 5 == 0)System.out.print(i + " ");
//            }
//        }
//        else System.out.println("a和b相等");


//        //案例 7：数字规律（牛客）difficult
//        //有一组特殊的数字，从第三项开始，每一项都是前两项的数字和，请问第 10 项的数字是多少？
//        //0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89...
//        int a=0;
//        int b=1;
//        int c=1;
//        for(int i=1;i<=10;i++){
//            if (i==1)System.out.print(a+" "+b+" "+c+" ");
//            a=b;
//            b=c;
//            c=a+b;
//            System.out.print(c+" ");
//        }

        //exactly not easy
//        Scanner input=new Scanner(System.in);
//        System.out.print("你想查第几位数字:");
//        int n=input.nextInt();
//        int i=4;
//        int x1=0;
//        int x2=1;
//        int x3=1;
//        while(i<=n){
//            x1=x2;
//            x2=x3;
//            x3=x1+x2;
//            if(i==n){
//                System.out.println(x3);
//            }
//            i++;
//        }


//        //案例 8：求和（牛客）1-2+3-4+5-6.。。。。。
//        Scanner input=new Scanner(System.in);
//        System.out.print("enter a number:");
//        int n=input.nextInt();
//        int sum=0;
//        for(int i=1;i<=n;i++){
//            if (i%2==0)sum=sum-i;
//            else sum=sum+i;
//        }
//        System.out.println(sum);


//        //while循环语句
//        int i=1;
//        while (i<=10){
//            System.out.println("i="+i);
//            i++;
//        }


//        //案例 9：计算复利,两倍本金的存期是多久？
//        double principal=100000;
//        double interestRate=0.017;
//        int year=1;
//        Scanner input=new Scanner(System.in);
//        System.out.print("enter the deposite term (years):");
//        int n=input.nextInt();
//        while (year<=n){
//            principal=principal*(1+interestRate);
//            if(principal>=200000){
//                System.out.println("the year when the principal doubles: "+year);
//                break;
//            }
//            year++;
//        }
//        System.out.println("principal and interest is: "+principal);

//        //案例 10：计算纸张折叠多少次才能折叠 mountains
//        double mountainHeight=8848860;
//        double paperThickness=0.1;
//        int foldTime=0;
//        while(paperThickness<=mountainHeight){
//            paperThickness=paperThickness*2;
//            foldTime++;
//            }
//        System.out.println("the number of folds: "+foldTime);
//        System.out.println("the thickness of the paper: "+paperThickness);


////        练习12：数位之和（牛客）difficult
////        描述 给定一个整数 n，请计算其所有数位之和。若 n 为负数，请先取其绝对值。
////        示例1 输入：12 说明：1 + 2 = 3 输出：3
////        示例2 输入：-305 说明：获取绝对值305，再求和3 + 0 + 5 = 8 输出：8
//        Scanner input=new Scanner(System.in);
//        System.out.print("enter a number:");
//        int number=input.nextInt();
//        if(number<0){
//            number=-number;
//        }
//        int sum=0;
//        while(number!=0){
//            System.out.println(number%10);
//            sum=number%10+sum;
//            number=number/10;
//        }
//        System.out.println("sum="+sum);


//        //do...while循环用的少,不需要额外练习
//        int i=1;
//        do{
//            System.out.println("do while loop");
//            i++;
//        }while(i<=5);

//        无限循环,后面不能写任何代码,因为不会运行
//        for(;;){
//            System.out.println("那年的池塘边蝶舞翩翩");
//        }
//        while(true){
//            System.out.println("那年的池塘边蝶舞翩翩");
//        }


//        //break
//        for(int i=0;i<=100;i++){//100.fori(快速生成)
//            System.out.println("i="+i);
//            if(i==10){
//                System.out.println("terminate");
//                break;
//            }
//        }

//        //输入一个数判断是否为质数
//        Scanner input=new Scanner(System.in);
//        System.out.print("enter a number:");
//        int count=0;
//        int number=input.nextInt();
//        for(int i=2;i<number;i++){
//            if(number%i==0){//能整除,说明不是质数
//                count++;//能被整除的次数
//                System.out.println(number+" is not a prime number");
//                break;
//                }
//            }
//        if (count==0)System.out.println(number+" is prime number");

//        Scanner input=new Scanner(System.in);
//        System.out.print("enter a number:");
//        int number=input.nextInt();
//        while(number<=2){
//            System.out.println("enter a new number:");
//            number=input.nextInt();
//        }
//        int i=2;
//        while (i<number){
//            if (number%i==0){//能整除--不是质数
//                System.out.println(number+" is not a prime number");
//                break;//终止循环,因为已经判定number不是质数了
//            }
//            else {
//                if (i==number-1) System.out.print(number+" is a prime number");
//                i++;
//            }
//        }


//        //continue
//        //练习16：逢七过（牛客） 循环打印1~100之间的数字，如果数字包含7或者是7的倍数，输出"过"
//        for(int i=1;i<=100;i++){
//            if (i%7==0||i%10==7||i/10%10==7){
//                System.out.println("pass");
//                continue;
//            }
//            System.out.println(i);
//        }


//        //猜数字游戏
//        Random random=new Random();
//        int number=random.nextInt(100);
//        Scanner input=new Scanner(System.in);
//        int x=0;
//        while( true){
//            System.out.print("enter a number:");
//            x=input.nextInt();
//            if(x==number) {
//                System.out.println("you are right");
//                break;
//            }
//            else if(x>number){
//                System.out.println("too big, try again");
//                continue;
//            }
//            else{
//                System.out.println("too small, try again");
//                continue;
//            }
//        }


//        //循环嵌套,4行5列
//        for(int i=1;i<=4;i++){
//            for(int j=1;j<=5;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //正直角
//        for (int i=1;i<=5;i++){
//            for (int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //倒直角
//        for (int i=1;i<=5;i++){
//            for (int j=1;j<=6-i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }


//        //镜面正直角
//        for (int i=1;i<=5;i++){
//            for (int j=i;j<=4+i;j++){
//                if(5-j>=1)System.out.print(" ");
//                else System.out.print("*");
//            }
//            System.out.println();
//        }


//        //平行四边形4列3行
//        for(int i=1;i<=3;i++){
//            for(int j=i;j<=i+2;j++){
//                if(3-j>=1)System.out.print(" ");
//                else System.out.print("*");
//            }
//            for(int k=1;k<=4-i;k++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }


//        //平行四边形6列3行
//        for(int i=1;i<=3;i++){
//            for(int j=i;j<=i+2;j++){
//                if(3-j>=1)System.out.print(" ");
//                else System.out.print("*");
//            }
//            for(int k=1;k<=2;k++){
//                System.out.print("*");
//            }
//            for(int k=1;k<=4-i;k++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }


//        //新方法教学的,好理解点
//        for (int i=1;i<=5;i++){
//            for (int j=i;j<=4;j++){
//                System.out.print(" ");
//            }
//            for (int k=1;k<=i;k++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }


//        //乘法表
//        for (int i=1;i<=9;i++){
//            for (int j=1;j<=i;j++){
//                System.out.print(j+"*"+i+"="+(i*j)+"\t");
//            }
//            System.out.println();
//        }


//        //数组：存储多个变量的容器
//        // 数组的学习内容：
//        // 1、数组的静态初始化int a[]={1,2,3,4,5};
//        // 2、数组的元素访问a[2],a[3]=1000
//        // 3、数组的遍历for,while
//        // 4、数组的动态初始化int b[]=new int[数组长度];+for input
//        // 5、数组的常见问题、算法真题
//        // 6、重新认识数组（内存）
//
//
//        // 1、数组的静态初始化
//        //int number;这是定义变量
//        //number=1;这是赋值
//        //int number=1;这是初始化=定义+赋值同时进行
//        //静态：定义之前已经知道数组的确定元素了
//        //数据类型 数组名[] = {数据值, 数据值...};
//        //定义数组存储3位同学的年龄
//        int age[ ]={20,21,23};
//        //定义数组存储5位同学的身高
//        double height[ ]={1.78,1.65,1.68};
//        //定义数组存储3位同学的名字
//        String name[ ]={"张三","李四","王五"};

//        // 2、数组的元素访问：获取，修改
//        int number[]={10,20,30,40,50,60};
//        System.out.println(number[5]);
//        number[0]=55;
//        System.out.println(number[0]);

//        // 3、数组的遍历
//        int number[]={10,20,30,40,50,60,70,80,90,100,110,10,20,30,40,50,60,70,80,90,100,110,10,20,30,40,50,60,70,80,90,100,11010,20,30,40,50,60,70,80,90,100,110};
//        for(int i=0;i<=number.length-1;i++){
//            System.out.print(number[i]+"\t");
//        }
//        System.out.println();
//        int i=0;
//        while(i<=number.length-1){
//            System.out.print(number[i]+"\t");
//            i++;
//        }

//        // 4、数组的动态初始化:指定数组的长度，系统自己填入元素
//        // 变量类型 变量名[]=new 数据类型[数组的长度];
//        Scanner input=new Scanner(System.in);
//        int digit[]=new int[5];
//        for(int i=0;i<digit.length;i++){
//            System.out.print("please enter a number:");
//            digit[i]=input.nextInt();
//        }
//        for(int i=0;i<digit.length;i++){
//            System.out.print(digit[i]+"\t");
//        }

//        //5、数组的常见问题、算法真题
//        int arr[]={33,5,22,44,55,33};
//        Scanner input=new Scanner(System.in);
//        System.out.print("please enter an elemnet:");
//        int number=input.nextInt();
//        for(int i=0;i<=arr.length-1;i++){
//            if(number==arr[i]) {
//                System.out.println("the index is:" + i);
//                break;
//            }
//            else if(i==arr.length-1){
//                System.out.println("not found");
//            }
//        }

//        //算法题：请找出数组中最大值并打印在控制台
//        int x[]={33,5,22,44,55,33,13,3532,674567,4,3,3,5,46,7,653,5,124};
//        for(int i=0;i<=x.length-2;i++){
//            if(x[i]>x[i+1]&&i<x.length-2) x[i+1]=x[i];
//            else if(i==x.length-2&&x[i]<x[i+1]) System.out.println(x[i+1]);
//            else if(i==x.length-2&&x[i]>x[i+1]) System.out.println(x[i]);
//        }
//        //第二种方法：只拿x[0]比
//        int x[]={33,5,22,44,55,33,13,3532,67,4,3,3,5,46,7,653,5,124};
//        for(int i=0;i<=x.length-1;i++){
//            if(x[0]<x[i]) x[0]=x[i];
//        }
//        System.out.println(x[0]);

//        //算法：打乱数组里的数据,细节：交换数据得引入一个中间变量
//        int x[]={1,2,3,4,5,6,7,8,9,10};
//        for(int i=0;i<=x.length-1;i++){
//            Random random=new Random();
//            int index=random.nextInt(x.length);
//            int j=x[0];
//            x[0]=x[index];
//            x[index]=j;
//        }
//        for(int i=0;i<=x.length-1;i++){
//            System.out.print(x[i]+"\t");
//        }

//        //算法：随机生成一个数组，数组元素范围1-100，不能有重复的元素
//        Random random=new Random();
//        Scanner input=new Scanner(System.in);
//        System.out.print("please enter the number of array:");
//        int number=input.nextInt();
//        int arr[]=new int[number];
//        for(int i=0;i<number;i++){
//            arr[i]=random.nextInt(1,101);
//            for (int k=0;k<i;k++){
//                if (arr[i]==arr[k]){
//                    i--;
//                    break;
//                }
//            }
//        }
//        System.out.println(arr.length+" "+number);
//        for(int i=0;i<number;i++){
//            System.out.print(arr[i]+" ");
//        }


//        //删除数组重复元素,快慢指针法
//        int arr[]={1,1,1,2,2,2,4,4,4,6,7,7,7};
//        int slow=0;
//        int fast=1;
//        while (fast<arr.length){
//            if(arr[slow]==arr[fast]){
//                fast++;
//            }
//            else if(arr[slow]!=arr[fast]){
//                slow++;
//                arr[ slow]=arr[fast];
//                fast++;
//            }
//        }
//        for(int j=0;j<=slow;j++){
//            System.out.print(arr[j]+" ");
//        }

//        //数组章节练习1,找出数组中所有和为17的数对
//        int arr[]={1,2,3,4,5,6,7,8,9,10};
//        int target=17;
//        for(int i=0;i<arr.length-1;i++){
//            for(int j=i+1;j<arr.length;j++){
//                if(arr[i]+arr[j]==target){
//                    System.out.print(i+"-"+j+"\t");
//                    System.out.println(arr[i]+"+"+arr[j]+"="+target);
//                }
//            }
//        }

//        //数组章节练习2给你两个有序数组 arr1 和 arr2
//        //将两个数组中的数据合并到一个大数组中。
//        //要求：合并之后的大数组也是有序的
//        int arr1[]={1,3,5,7,9};
//        int arr2[]={2,4,6,8,10};
//        int arr3[]=new int[arr1.length+arr2.length];
//        for(int i=0;i<arr1.length+arr2.length;i++){
//            if(i<arr1.length){
//                arr3[i]=arr1[i];
//            }
//            else if(i>=arr1.length){
//                arr3[i]=arr2[i-arr1.length];
//            }
//        }
//        int x=0;
//        for(int i=0;i<arr3.length-1;i++){
//            for(int j=i+1;j<arr3.length;j++){
//                if(arr3[i]>arr3[j]){
//                    x=arr3[i];
//                    arr3[i]=arr3[j];
//                    arr3[j]=x;
//                }
//            }
//        }
//        for(int i=0;i<arr3.length;i++){
//            System.out.print(arr3[i]+" ");
//        }

//        //方法二，其实就是合并的思路换了一下
//        int arr1[] = {1, 3, 5, 7, 9};
//        int arr2[] = {2, 4, 6, 8, 10};
//        int arr3[]=new int[arr1.length+ arr2.length];
//        for(int i=0;i<arr1.length;i++){
//            arr3[i]=arr1[i];
//        }
//        for(int j=arr1.length;j<arr3.length;j++){
//            arr3[j]=arr2[j-arr1.length];
//        }
//
//        for(int i=0;i<arr3.length-1;i++){
//            for(int j=i+1;j<arr3.length;j++){
//                if(arr3[i]>arr3[j]){
//                    int x=arr3[i];
//                    arr3[i]=arr3[j];
//                    arr3[j]=x;
//                }
//            }
//        }
//
//        for (int k=0;k<arr3.length;k++){
//            System.out.print(arr3[k]+" ");
//        }

//        //数组章节练习3：作业3：查找元素（力扣算法）自己想的
//        //给定一个递增的有序数组和一个目标值，在数组中找到目标值，打印其索引。 如果目标值不存在于数组中，打印应插入的位置（我做到了插入这个数组，形成一个新的数组）
//        //举例1:
//        //数据：nums = [1,3,5,6]; target = 5
//        //输出：2
//        //举例2:
//        //数据：nums = [1,3,5,6], target = 2
//        //输出：1
//        //举例3:
//        //数据：nums = [1,3,5,6], target = 7
//        //输出：4
//        int nums[]={1,3,5,6,7,8,9,11,12};
//        Scanner input=new Scanner(System.in);
//        System.out.print("please enter the number you want to find:");
//        int target=input.nextInt();
//        for(int i=0;i<nums.length;i++){
//            //等于就输出索引
//            if(nums[i]==target){
//                System.out.println("index="+i);
//                break;
//            }
//            //大于就创造出一个新数组存放原数组和target
//            else if(nums[i]>target){
//                int arr[]=new int[nums.length+1];
//                for(int j=0;j<nums.length+1;j++){
//                    if(j<nums.length) arr[j]=nums[j];
//                    else arr[nums.length]=target;
//                }
//                //新数组排序
//                for(int k=0;k<arr.length-1;k++){
//                    for(int m=k+1;m<arr.length;m++){
//                        if(arr[k]>arr[m]){
//                            int x=arr[k];
//                            arr[k]=arr[m];
//                            arr[m]=x;
//                        }
//                    }
//                }
//                for(int s=0;s<arr.length;s++){
//                    System.out.print(arr[s]+" ");
//                }
//                break;
//            }
//        }


//        //方法的定义不能在main的内部，要在code内部
//        System.out.println(sum_calculation(38,69));


//        //方法练习1---遍历数组
//        int arr[]={1,2,3,4,5,6,7,8,9,10};
//        printarr(arr);

//        //方法练习2---乘法表
//        mulplication_table(20);

        //方法的重载：方法的功能类似


//        //作业1：评委打分
//        //
//        //跳水比赛有五个评委打分，分数在0~100之间。最终得分会去掉一个最高分，去掉一个最低分，
//        //剩余的分数再求平均数，改平均数为选手最终得分。
//        //要求1：利用键盘录入5个整数存入数组当中，如果分数超出范围需要重新录入
//        //要求2：定义方法分别求数组的最大值和最小值
//        //要求3：计算五名评委的总分
//        //要求4：总分 - 最大值 - 最小值，求选手最终平均分
//        Scanner input=new Scanner(System.in);
//        int arr[]=new int[5];
//        for(int i=0;i<5;i++){
//            System.out.print("请输入评分:");
//            arr[i]=input.nextInt();
//            while (arr[i] < 0 || arr[i] > 100) {
//                System.out.println("请输入正确的分数！");
//                System.out.print("请重新输入:");
//                arr[i] = input.nextInt();
//                }
//            if(i==5)System.out.println("评分完成！");
//        }
//        printarr(arr);
//        System.out.println("最高分是："+maxarr(arr));
//        System.out.println("最低分是："+minarr(arr));
//        int sum=0;
//        for(int i=0;i<arr.length;i++){
//            sum=sum+arr[i];
//        }
//        System.out.println("五名评委的总分是："+sum);
//        System.out.println("选手最终得分是："+(sum-maxarr(arr)-minarr(arr))/(arr.length-2));


//        //作业2：计算班级分数
//        //班主任需要统计10名学生的数学成绩（0-100分）， 计算及格率，平均分，并找出最高分。
//        // 要求1：键盘录入10名学生的成绩，存入数组。超出范围，提示“成绩无效，请重新输入”。
//        // 要求2：定义方法，求及格人数，根据及格人数，求及格率。
//        // 要求3：定义方法求总分，根据总分求平均分
//        // 要求4：定义方法求最大值。
//        Scanner input = new Scanner(System.in);
//        int arr[] = new int[10];
//        int i = 0;
//        while (i < 10) {
//            System.out.print("请输入第" + (i + 1) + "个同学的成绩：");
//            arr[i] = input.nextInt();
//            while (arr[i] < 0 || arr[i] > 100) {
//                System.out.print("请输入正确的成绩！");
//                System.out.print("请重新输入：");
//                arr[i] = input.nextInt();
//            }
//            i++;
//        }
//        printarr(arr);
//        passd_student(arr);
//        sum_grade(arr);
//        System.out.println("最高分是："+maxarr(arr));


//        //作业3：计算快递邮费
//        //某快递公司的运费规则如下（首重1kg，超出部分按kg计算，不足1kg按1kg算）：
//        // 首重1kg：10元； 超出1-5kg：每kg加2元； 超出5kg以上：每kg加1.5元。
//        // 键盘录入小数，表示用户快递的重量，计算最终的结果
//        // 要求1：快递重量必须大于0，否则重新输入
//        // 要求2：不同价位的计算，单独定义一个方法
//        Scanner input = new Scanner(System.in);
//        System.out.print("请输入快递重量:");
//        double package_weight = input.nextDouble();
//        while (package_weight <= 0) {
//            System.out.print("请输入正确的重量:");
//            package_weight = input.nextDouble();
//        }
//        int i=0;
//        while(package_weight-i>0){
//            if(package_weight-i<1){
//                package_weight=i+1;
//                System.out.println("收费重量是：" + package_weight+"kg");
//                break;
//            }
//            i++;
//        }
//        package_price(package_weight);


//        //原理篇1：java的运行机制
//        Java程序运行的过程是怎么样的? Java文件 --> class字节码文件 --> 结果
//        Java是直接运行在操作系统里面的吗? 不是，是运行在虚拟机里面的
//        虚拟机的好处是什么? 利用虚拟机可以实现跨平台
//        为什么要跨平台? 写一套代码，可以在任意的操作系统中运行

//        虚拟机里面是怎么运行代码的呢？
//        内存：存储数据，内存地址：内存中每个格子的编号，一个格子就是一个字节
//        栈内存：方法(main)  堆内存：new关键字  方法区：字节码信息(class)
//        Java 虚拟机把内存分成了几个部分？
//         栈、堆、方法区、本地方法栈、程序计数器
//        栈、堆、方法区的作用？
//         栈：方法 堆：new 关键字 方法区：字节码文件
//        基本数据类型在内存中的特点？
//         记录的是真实的数据，传递也是真实的数据
//        引用数据类型在内存中的特点？
//         记录的是地址值，传递也是地址值


//        //练习1 移除元素
//        //给你一个数组 nums 和一个值 val，你需要删除所有数值等于 val 的元素
//        //举例1： 输入：nums = [3,2,2,3] val = 3 输出：nums = [2,2] 剩余2个元素
//        int nums[]={3,2,2,3,4,7,34,53,6,6,7,43,5,36,4,3};
//        int val=3;
//        int slow=0;
//        for(int i=0;i<nums.length;i++){
//            if (nums[i]!=val){
//                nums[slow]=nums[i];
//                slow++;
//            }
//        }
//        for(int i=0;i<slow;i++){
//            System.out.print(nums[i]+" ");
//        }
//        //升序排序
//        System.out.println();
//        for(int i=0;i<slow-1;i++){
//            for(int j=i+1;j<slow;j++){
//                if(nums[i]>nums[j]){
//                    int x=nums[i];
//                    nums[i]=nums[j];
//                    nums[j]=x;
//                }
//            }
//        }
//        for(int i=0;i<slow;i++){
//            System.out.print(nums[i]+" ");
//        }


        //-----------------------------------------------------------------------------------
        //面向对象java语法的基石
        //什么是面向对象？
        //类和对象
        //面向对象中的数据安全问题
        //this关键字
        //构造方法
        //原理篇/算法训练

//        //practice 1:利用面向对象思想表示狗狗（属性：名字，年龄，体重，毛发颜色）
//        dog x=new dog();
//        x.name="小黄";
//        x.age=2;
//        x.weight=0.5;
//        x.color="白色";
//        System.out.println("姓名："+x.name);
//        System.out.println("年龄："+x.age);
//        System.out.println("体重："+x.weight);
//        System.out.println("颜色："+x.color);
//        System.out.println("-----------------------------------");
//        dog y=new dog();
//        y.name="小黑";
//        y.age=1;
//        y.weight=0.3;
//        y.color="黑色";
//        System.out.println("姓名："+y.name);
//        System.out.println("年龄："+y.age);
//        System.out.println("体重："+y.weight);
//        System.out.println("颜色："+y.color);


//        //practice 2:利用面向对象思想表示学生（属性：名字，性别，年龄，身高）
//        student a=new student();
//        a.name="小王";
//        a.gender="男";
//        a.age=18;
//        a.height=1.75;
//        System.out.println("姓名："+a.name);
//        System.out.println("性别："+a.gender);
//        System.out.println("年龄："+a.age);
//        System.out.println("身高："+a.height);
//        student b=new student();
//        b.name="小张";
//        b.gender="女";
//        b.age=19;
//        b.height=1.8;
//        System.out.println("姓名："+b.name);
//        System.out.println("年龄："+b.age);
//        System.out.println("身高："+b.height);
//        System.out.println("性别："+b.gender);


//        //1面向对象思想表示老师
//        //属性:姓名、年龄
//        //行为:授课、吃饭、睡觉
//        teacher teacher1=new teacher();
//        teacher1.name="方旭";
//        teacher1.age=30;
//        System.out.println("姓名："+teacher1.name);
//        System.out.println("年龄："+teacher1.age);
//        //调用方法,类名+方法名
//        teacher1.teach();
//        teacher1.eat();
//        teacher1.sleep();

//        //面向对象思想表示厨师
//        //属性:姓名、年龄、厨艺等级
//        //行为:做菜
//        chef member1=new chef();
//        member1.setAge(56);
//        member1.setName("周杰伦");
//        System.out.println("姓名："+member1.getName());
//        System.out.println("年龄："+member1.getAge());
//        member1.movement();


//        //面向对象思想表示工人
//        //属性:姓名、年龄、工龄
//        //行为:工作
//        worker member1=new worker();
//        member1.setname("咕咕嘎嘎");
//        member1.setage(8);
//        member1.setworking_years(568);
//        System.out.println("姓名："+member1.getname());
//        System.out.println("年龄："+member1.getage());
//        System.out.println("工作年限："+member1.getworking_years());
//        member1.behavior();




 /*     worker--类，member1--对象，属性：name,age,working_years
        接下来学习，面向对象中的数据安全问题
总结：
方法：outside main&&inside class
core structure:
public static 无返回值类型void       方法名(变量类型+运行方法所需的参数){}
public static 返回值类型int，String  方法名(变量类型+运行方法所需的参数){return 返回值的值}
调用-----方法名(输入方法的参数)
example:
// 定义
public static int maxarr(int arr[]) {
    return arr[arr.length - 1];  // 返回一个int值
}
// 调用
int result = maxarr(arr);  // 调用方法,得到返回值,赋给result

类和对象:a new class,we should create it first
core structure:
public class 类名{int age; String name;}
public class 类名{

      private int age;

      public void setAge(int value) {
                  if(age>100)system.out.println("Invalid age");
                  else age=value;
               }
       public int getAge(){return age}
调用----类名——set(要赋的值)/get()
}
*/

//        //练习学生信息
//在校学生有属性：姓名、年龄、身高、体重。 行为：学习。
// 实现以下需求 要求1：大一新生，张三，18岁，183cm，60kg，刚进大学努力学习。
// 要求2：大二期间张三体重增加了10kg
// 要求3：大三期间张三减肥成功，身高增加2cm，体重减少3kg
// 要求4：打印大学毕业之后，张三的所有信息
//        Scanner input=new Scanner(System.in);
//        System.out.println("请输入年龄：");
//        int i=input.nextInt();
//        student1 people=new student1();
//        people.setName("张三");
//        System.out.println("姓名："+people.getName());
//        people.setAge(i);
//        System.out.println("年龄："+people.getAge()+"岁");
//        people.setWeight(i);
//        System.out.println("体重："+people.getWeight()+"kg");
//        people.setHeight(i);
//        System.out.println("身高："+people.getHeight()+"m");
//        people.behavior(i);
//
//        //setWeight(people.getWeight()+1);
//        //system.out.println("体重："+people.getWeight()+"kg");这样就修改了数据


//        //second mode-----the best
//        student2 member = new student2();
//        member.setName("张三");
//        member.setAge(18);
//        member.setWeight(60);
//        member.setHeight(183);
//        System.out.println("姓名：" + member.getName() + " " + "年龄：" + member.getAge() + " " + "体重：" + member.getWeight() + " " + "身高：" + member.getHeight());
//        member.setAge(member.getAge() + 1);
//        member.setWeight(member.getWeight() + 10);
//        System.out.println("姓名：" + member.getName() + " " + "年龄：" + member.getAge() + " " + "体重：" + member.getWeight() + " " + "身高：" + member.getHeight());
//        member.setAge(member.getAge() + 1);
//        member.setWeight(member.getWeight() - 3);
//        member.setHeight(member.getHeight() + 2);
//        System.out.println("姓名：" + member.getName() + " " + "年龄：" + member.getAge() + " " + "体重：" + member.getWeight() + " " + "身高：" + member.getHeight());
//        member.setAge(member.getAge() + 1);
//        System.out.println("姓名：" + member.getName() + " " + "年龄：" + member.getAge() + " " + "体重：" + member.getWeight() + " " + "身高：" + member.getHeight());


//        //this关键字:用于区分成员变量和局部变量，this.属性名(成员变量)
//        //构造
//        //初始化属性
//        university name1=new university();
//        university name2=new university("Australian National University","G8",32);
//        //无参数构造值带出来了，只要有this.就能把值带出来
//        System.out.println(name1.getName()+"\t"+name1.getTitle()+"\t"+name1.getRanking());
//        //带参数构造值带出来了
//        System.out.println(name2.getName()+"\t"+name2.getTitle()+"\t"+name2.getRanking());
//        //修改属性
//        name2.setName("ANU");
//        name2.setRanking(name2.getRanking()+2);
//        System.out.println(name2.getName()+"\t"+name2.getTitle()+"\t"+name2.getRanking());


//        //题目：设计一个“游戏角色”类 (GameCharacter)
//        //需求：
//        //属性（全部私有 private）：
//        //name (String): 名字
//        //hp (int): 生命值
//        //attack (int): 攻击力
//        //构造方法：
//        //空参构造：打印一句 "新角色已创建"。
//        //带参构造：接收名字、生命值、攻击力，并赋值给成员变量（注意：这里别再只打印不赋值了！）。
//        //方法：
//        //提供所有属性的 get 和 set 方法。
//        //定义一个 showInfo() 方法，打印角色的当前状态，格式如：[英雄] 亚瑟 | 生命: 100 | 攻击: 50。
//        //在 code.java 的 main 方法里实现以下逻辑：
//        //创建一个叫“亚瑟”的角色，初始生命 100，攻击 50。
//        //打印他的初始信息。
//        //他被打了一下，生命值减少 30。
//        //他吃了个药，攻击力临时增加了 10。
//        //再次打印他的信息，看看数值变了没。
//        GameCharacter hero1=new GameCharacter();
//        GameCharacter hero2=new GameCharacter("亚瑟", 100, 50);
//        hero2.showInfo();
//        hero2.setHp(hero2.getHp()-30);
//        System.out.println("他被打了一下，生命值减少30,余下生命值："+hero2.getHp());
//        hero2.setAttack(hero2.getAttack()+10);
//        System.out.println("他吃了个药，攻击力增加10，攻击力："+hero2.getAttack());
//        hero2.showInfo();


//        题目：图书管理系统
//        设计一个简单的图书管理系统，包含以下要求：
//        Book 类
//        属性：书名（title）、作者（author）、ISBN、价格（price）、是否借出（isBorrowed）
//        构造方法
//        getter 和 setter 方法
//        toString 方法显示图书信息
//        Library 类
//        属性：图书馆名称、图书数组（最多存储 100 本图书）、当前图书数量
//        方法：
//        添加图书
//        删除图书（根据 ISBN）
//        查找图书（根据书名或作者，支持模糊查询）
//        借书（根据 ISBN，如果已被借出则提示）
//        还书（根据 ISBN）
//        显示所有图书
//                显示所有已借出的图书
//        测试类
//                创建图书馆对象
//        添加至少 5 本图书
//        测试查找、借书、还书、删除等功能
//        请独立完成这个程序，加油！
//        Book a=new Book();
//        Book b=new Book("《三体》","刘慈欣",10.0,false);
//        b.presentation();
//        b.setName("狼王梦");
//        b.setAuthor("王小波");
//        b.setPrice(58.34);
//        b.setIsBorrowed(true);
//        b.presentation();


//        //student3----the use of static,一般用类名调用
//        student3 schoolmate1=new student3();
//        schoolmate1.name="张三";
//        schoolmate1.age=18;
//        student3.college="软件学院";
//
//        student3 schoolmate2=new student3();
//        schoolmate2.name="王五";
//        schoolmate2.age=19;
//
//        schoolmate1.presentation();
//        schoolmate2.presentation();


////        //array-----static方法,一般用类名调用
//        Random random=new Random();
//        Scanner input=new Scanner(System.in);
//        System.out.println("请输入数组的长度：");
//        int i=input.nextInt();
//        int arr1[]=new int[i];
//        for(int j=0;j<i;j++){
//            arr1[j]=random.nextInt(0,1001);
//        }
//        Array.sequencing(arr1);


//        //final int 变量=值;这表示常量,变量名必须大写
//        final int MAX_AGE=100;
//        //常量的练习
//        //任务：定义一个 Javabean 类描述圆
//        //属性：半径，圆周率
//        //行为：计算圆的面积，计算圆的周长
//        circle circle1 = new circle();
//        circle1.setRadius(5.0);
//        circle1.area();
//        circle1.perimeter();
//        circle1.setRadius(circle1.getRadius()*5);
//        circle1.area();
//        circle1.perimeter();


//        //枚举:
//        //每一个枚举项，都是该枚举类的对象，每一个对象都是通过构造方法创建出来的
//        //枚举项在底层其实就是常量，默认用 public static final 修饰,但不会显示
//        //枚举类的第一行上必须是枚举项，枚举项之间用逗号隔开，以分号作为结尾
//        //枚举类的构造方法必须是 private 修饰，不让外界创建本类的对象
//        //编译器会给枚举类新增两个默认存在的方法：values(), valueOf()
//        G8 first_university = G8.usyd;//枚举下的有参构造调用
//        G8 second_university = G8.uq;
//        G8 third_university = G8.unsw;
//        G8 fourth_university = G8.anu;
//        System.out.println(first_university.getTitle());//二次调用用getter
//        G8 arr[]=G8.values();
//        for(int i=0;i<arr.length;i++){
//            System.out.println(arr[i]+":"+arr[i].getTitle());
//        }
//        G8 five_university = G8.valueOf("usyd");//枚举下的有参构造调用
//        System.out.println(five_university+":"+five_university.getTitle());


//        futureDevelopment roomate1= futureDevelopment.LiuGuo;
//        futureDevelopment roomate2= futureDevelopment.TongYan;
//        futureDevelopment roomate3= futureDevelopment.WangWenJie;
//        futureDevelopment roomate4= futureDevelopment.ZhouFuBin;
//        System.out.println(roomate1+":"+roomate1.getName());
//        System.out.println(roomate2+":"+roomate2.getName());
//        System.out.println(roomate3+":"+roomate3.getName());
//        System.out.println(roomate4+":"+roomate4.getName());


        //封装、继承、多态----面向对象的三大特征


    }//main结束

    //快递价格
    public static void package_price(double package_weight) {
        if (package_weight <= 1) {
            System.out.println("快递价格是：" + 10.0 + "元");
        } else if (package_weight > 1 && package_weight <= 5) {
            System.out.println("快递价格是：" + ((package_weight - 1) * 2 + 10) + "元");
        } else if (package_weight > 5) {
            System.out.println("快递价格是：" + ((package_weight - 5) * 1.5 + 10 + 8) + "元");
        }
    }

    //遍历数组
    public static void printarr(int arr[]) {
        System.out.print("[");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.print(arr[arr.length - 1]);
        System.out.println("]");
    }

    //乘法表
    public static void mulplication_table(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf(i + "*" + j + "=" + i * j + "\t\t");
            }
            System.out.println();
        }
    }

    //获取数组中的最大值
    public static int maxarr(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int x = arr[i];
                    arr[i] = arr[j];
                    arr[j] = x;
                }
            }
        }
        return arr[arr.length - 1];
    }

    //获取数组中的最小值
    public static int minarr(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int x = arr[i];
                    arr[i] = arr[j];
                    arr[j] = x;
                }
            }
        }
        return arr[0];
    }


    //判断及格人数及及格率
    public static void passd_student(int arr[]) {
        int count = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] >= 60) count++;
        }
        System.out.println("及格人数为：" + count);
        System.out.println("及格率为：" + count * 100 / arr.length + "%");
    }


    //求总分和平均分
    public static void sum_grade(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("总分是：" + sum);
        System.out.println("平均分是：" + sum / arr.length);
    }


}//class结束










































