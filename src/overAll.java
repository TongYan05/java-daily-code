import java.util.*;

import static java.lang.Math.round;

public class overAll {
    public static void main(String[] args) {
//        System.out.println("==========================Data Type================================");
//        //Static No-parameter Void Method
//        print();
//        //Static Parameterized Return Static Method
//        int a = 10;
//        int b = 20;
//        System.out.println(returnAge(a, b));
//        System.out.println("==========================Static Method================================");
//
//        System.out.println("==========================Data Type+operation================================");
//        int c = 20;
//        double d = 0.5;
//        double e = c + d;
//        System.out.println(e);
//        Scanner sca = new Scanner(System.in);
//        System.out.println("Please enter an integer:");
//        int f = sca.nextInt();
//        sca.nextLine();
//        // Newline Character -> \n
//        // This line of code clears the residue in Input Buffer to avoid being affected by leftover newline characters
//        // When you press 'Enter' after entering numbers, a newline string "\n" will remain in Input Buffer
//        // We use sca.nextLine() to consume this leftover \n, so the subsequent nextLine() can wait for normal input
//        sca.nextLine();
//        System.out.println("Please enter a String:");
//        String g = sca.nextLine();
//        System.out.println("The difference of 'next()':");
//        String h = sca.next();
//        System.out.println(f + "\t" + g + "\t" + h);
//        Random ran = new Random();
//        for (int i = 0; i < 20; i++) {
//            //left-closed right-open interval -> [0,n)
//            int a1 = ran.nextInt(10, 20)+1;
//            System.out.print(a1+" ");
//        }
//        System.out.println("\nthe sum of two random digits:"+(ran.nextInt(10)+ran.nextInt(10)));
//        //calculate BMI
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("please enter your height(m):");
//        double height=scanner.nextDouble();
//        System.out.println("please enter your weight(kg)");
//        double weight=scanner.nextDouble();
//        //printf("format string", argument); %->specifier starter marker  .3->decimal precision  f->float break format specifier %n->line break format specifier better than \n, more compatible
//        System.out.printf("your BMI is: %.3f%n",weight/(height*height));//%f is merely userd for formating double/float
//        //Arithmetic Operation:addition/subtraction/multiplication/division/modulus operator
//        System.out.printf("division:%.2f%n",10.0/3);
//        System.out.println("modulus:"+10%3);
//        System.out.println("modulus:"+10/3);
//        System.out.println("modulus:"+10.0/3);
//        divide();
//        char a2='A';
//        System.out.println(10+a2);
//        char b2=(char)(10+a2);
//        System.out.println(b2);
//        int a3=10;
//        int b3=a3++;
//        int c3=++a3;
//        System.out.println(a3+" "+b3+" "+c3);
//        a3+=8;
//        System.out.println(a3);
//        a3=+10;//it is meaningless I think!!!
//        System.out.println(a3+" "+(a3>=20));
//        compareHeight(1.73,1.85);
//        compareNum();
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("please enter the first integer:");
//        int x=scanner.nextInt();
//        System.out.println("please enter the second integer:");
//        int y=scanner.nextInt();
//        System.out.println(x>y?"x is bigger":"y is bigger");
//        comparePrice(9);comparePrice(28);comparePrice(46);comparePrice(74);comparePrice(163);comparePrice(263);
//        System.out.println("==========================Data Type+operation================================");
//        Random random = new Random();
//        String[] arr = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday","null"};
//        String date = arr[random.nextInt(8)];
//        switch (date) {
//            case "Monday":
//                System.out.println("study");
//                break;
//            case "Tuesday":
//                System.out.println("study");
//                break;
//            case "Wednesday":
//                System.out.println("study");
//                break;
//            case "Thursday":
//                System.out.println("study");
//                break;
//            case "Friday":
//                System.out.println("study and rest");
//                break;
//            case "Saturday":
//                System.out.println("rest");
//                break;
//            case "Sunday":
//                System.out.println("rest");
//            default:
//                System.out.println("cannot find");
//        }

//        int sum=0;
//        for(int i=0;i<101;i++){
//            if(i%2!=0) continue;
//            else {
//                sum=sum+i;
//            }
//        }
//        System.out.println(sum);

//        有一组特殊的数字，从第三项开始，每一项都是前两项的数字和，请问第 10 项的数字是多少？
//        List<Integer> list = new ArrayList<>();
//        list.add(0,0);
//        list.add(1,1);
//        for(int i=2;i<10;i++){
//            list.add(i,list.get(i-1)+list.get(i-2));
//        }
//        System.out.println(list.get(9));

//        计算纸张折叠多少次才能折叠 mountains 0.1/8848860
//        int times=0;
//        double paper=0.1;
//        double mountainHeight=8848860;
//        while(paper<=mountainHeight){
//            paper=paper*2;
//            times++;
//        }
//        System.out.println(times+" "+paper);

//        System.out.println(getSum(426257747));




    }
//    public static int getSum(int x){
//        int sum=0;
//        if(x<0) x=x*(-1);
//        if(x<10&&x>=0) return x;
//        else {
//            while(x>0){
//                sum=sum+x%10;
//                x=x/10;
//            }
//            return sum;
//        }
//    }
//    public static void comparePrice(double price) {
////        需求：很多App都有不同的优惠券
////        假设，现在有以下优惠券
////        全场商品满10减8
////        全场商品满50减30
////        全场商品满100减50
////        全场商品满200减90
////
////        会员卡，全场8折
////        请问：会员卡和优惠券不能同时使用，最优惠的价格是多少？
//        double coupon, card;
//        card=price*0.8;
//        if(price<10) coupon=price;
//        else if(price>=10&&price<50) coupon=price-8;
//        else if(price>=50&&price<100) coupon=price-30;
//        else if(price>=100&&price<200) coupon=price-50;
//        else coupon=price-90;
//        if(card<coupon){
//            System.out.printf("card:%.1f\t",card);
//            System.out.print("coupon:"+coupon+"\t");
//        }
//        else if(card>coupon){
//            System.out.print("coupon:"+coupon+"\t");
//            System.out.printf("card:%.1f\t",card);
//        }
//        else System.out.println("they are the same price!"+coupon);
//        System.out.print(card<coupon?"card is more cost-effective!\n":"coupon is more cost-effective!\n");
//    }
//    public static void compareNum(){
//        Random random=new Random();
//        int x=random.nextInt(20);
//        if(x>=0&&x<=10) System.out.println(x+" is between 0 and 10");
//        else System.out.println(x+" is not between 0 and 10");
//    }
//    public static void compareHeight(double height1,double height2){
//        System.out.println("person1 heigh "+height1+" meters");
//        System.out.println("person1 heigh "+height2+" meters");
//        if(height1>height2) System.out.println("person1 is taller!");
//        else if (height1<height2) System.out.println("person2 is taller");
//        else System.out.println("they are the same height");
//    }
//    public static void divide(){
//        Random random=new Random();
//        int x=random.nextInt(100,1000);
//        int a=x/100;
//        int b=x/10%10;
//        int c=x%10;
//        System.out.println("random number is:"+x+" "+"units digit is:"+c+" "+"tens digit is:"+b+" "+"hundreds digit:"+a);
//    }
//    public static void print() {
//        System.out.println("Today is fourteenth July.");
//    }
//
//    public static int returnAge(int originAge, int neededAddAge) {
//        int newAge = originAge + neededAddAge;
//        return newAge;
//    }
}
