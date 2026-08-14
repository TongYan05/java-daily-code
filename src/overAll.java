
import javax.security.sasl.SaslClient;
import java.awt.*;
import java.lang.classfile.instruction.NewReferenceArrayInstruction;
import java.security.Key;
import java.util.*;
import java.util.List;

import static java.lang.Math.*;

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
//        intf = sca.nextInt();
//        sca.nextLine();
//        // Newline Character -> \n
//        // This line of code clears the residue in Input Buffer to avoid being affected by leftover newline characters
//        // When you press 'Enter' after entering numbers, a newline string "\n" will remain in InputBuffer
//        // We use sca.nextLine() to consume this leftover \n, so the subsequent nextLine() can wait for normal input
//        sca.nextLine();
//        System.out.println("Please enter a String:");
//        String g = sca.nextLine();
//        System.out.println("The difference of 'next()':");
//        String h = sca.next();
//        System.out.println(f + "\t" + g + "\t" + h);
//        Random ran = new Random();
//        for (int i = 0; i < 20; i++) {
//            //left-closed right-open interval-> [0,n)
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
//        System.out.printf("your BMI is: %.3f%n",weight/(height*height));//%f is merely userd for formating double/float//        //Arithmetic Operation:addition/subtraction/multiplication/division/modulus operator
//        System.out.printf("division:%.2f%n",10.0/3);
//        System.out.println("modulus:"+10%3);
//        System.out.println("modulus:"+10/3);
//        System.out.println("modulus:"+10.0/3);
//        divide();
//        char a2='A';
//        System.out.println(10+a2);
//        char b2=(char)(10+a2);
//        System.out.println(b2);
//       int a3=10;
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
//       int x=scanner.nextInt();
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
//case "Sunday":
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


//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1;j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        System.out.println("================================");
//        for (int i=0;i<5;i++){
//            for(int j=i;j<5;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        System.out.println("================================");
//        Scanner scanner=new Scanner(System.in);
//        System.out.print("input the number of layer:");
//        int layer=scanner.nextInt();
//        System.out.println();
//        for(int i=1;i<=layer;i++){
//            int numStar=2*i-1;
//            int numSpace=layer-i;
//            for(int a=1;a<=numSpace;a++) System.out.print(" ");
//            for(int a=1;a<=numStar;a++) System.out.print("*");
//            System.out.println();
//}
///*
//123*
//12***
//1*****
//*******
// */
//        //7 5 3 1     0 1 2 3 4
//        Scanner scanner=new Scanner(System.in);
//        System.out.print("input the number of layer:");
//       int layer=scanner.nextInt();
//        intnumStar, numSpace;
//        for(int i=1;i<=layer;i++){
//            numStar=2*(layer-i)+1;
//            numSpace=i-1;
//            for(int a=1;a<=numSpace;a++) System.out.print(" ");
//            for(int a=1;a<=numStar;a++) System.out.print("*");
//            System.out.println();
//        }


//        /*
//        123*|****
//        12**|***1
//        1***|**12
//        ****|*123
//         */
//        Scanner scanner=new Scanner(System.in);
//        System.out.print("please enter the number of *in a row:");
//        int row=scanner.nextInt();
//        System.out.print("please enter the number of layer:");
//        int layer=scanner.nextInt();
//        int numSpace;
//        for(int i=1;i<=layer;i++){
//            numSpace=layer-i;
//            for(int a=1;a<=numSpace;a++) System.out.print(" ");
//            for(int a=1;a<=row;a++) System.out.print("*");
//            System.out.println();
//        }


//        Scanner scanner=new Scanner(System.in);
//        System.out.print("please enter the number of * in a row:");
//       int row=scanner.nextInt();
//        System.out.print("please enter the number of layer:");
//        int layer=scanner.nextInt();
//        int numSpace;
//        for(int i=1;i<=layer;i++){
//            numSpace=i-1;
//            for(int a=1;a<=numSpace;a++) System.out.print(" ");
//            for(int a=1;a<=row;a++) System.out.print("*");
//            System.out.println();
//        }

//        123*
//        12**
//        1***
//        ****

//        Scanner scanner=new Scanner(System.in);
//        System.out.print("please enter the number of layer:");
//        int layer=scanner.nextInt();
//        for(int i=1;i<=layer;i++){
//            for(int a=1;a<=layer-i;a++) System.out.print(" ");
//for(int a=1;a<=i;a++) System.out.print("*");
//            System.out.println();
//        }

//        Scanner scanner=new Scanner(System.in);
//        System.out.print("please enter the number of layer:");
//        int layer=scanner.nextInt();
//        for(int i=1;i<=layer;i++){
//            for(int a=1;a<i;a++) System.out.print(" ");
//            for(int a=1;a<=layer+1-i;a++) System.out.print("*");
//            System.out.println();
//        }

//        Random random=new Random();
//        int[] arr= new int[100];
//        arr[0]=random.nextInt(100);
//        System.out.print(arr[0]+" ");
//        int max=arr[0];
//        int min=arr[0];
//        for(int i=1;i<100;i++){
//            arr[i]= random.nextInt(100);
//            if(arr[i]>max) max=arr[i];
//            if(arr[i]<min) min=arr[i];
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println("\nthe maximum value is:"+max);
//        System.out.println("the minimum value is:"+min);

//        //排序+不能重复+max min
//        Random random=new Random();
//        int[] arr= new int[100];
//        arr[0]=random.nextInt(100);
//        System.out.print(arr[0]+" ");
//        for(int i=1;i<100;i++){
//            arr[i]= random.nextInt(100);
//            for(int j=0;j<i;j++){
//                while (arr[i]==arr[j]) {
//                    arr[i] = random.nextInt(100);
//                    j = 0;
//                }
//            }
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//       for(int i=0;i<arr.length;i++){
//            for(int j=0;j<arr.length-i-1;j++){
//                if(arr[j]>arr[j+1]){
//                    int x=arr[j];
//                    arr[j]=arr[j+1];
//                    arr[j+1]=x;
//                }
//            }
//        }
//        for (int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//        System.out.println("the maximum value is:"+arr[arr.length-1]);
//        System.out.println("theminimum value is:"+arr[0]);

//        Random random=new Random();
//        Scanner scanner=new Scanner(System.in);
//        System.out.print("please enter the length of array:");
//        int length=scanner.nextInt();
//        int[] arr=new int[length];
//        arr[0]=random.nextInt(1000);
//        int max=arr[0];
//        for(int i=1;i<arr.length;i++){
//            arr[i]=random.nextInt(1000);
//            if(max<arr[i]) max=arr[i];
//        }
//        System.out.println("the maximum value is:"+max);


//        exclude repeated elements
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("please enter the length of array:");
//        Random random = new Random();
//        int[] arr = new int[scanner.nextInt()];
//        System.out.println();
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = random.nextInt(20);
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//
//        for(int i=0;i<arr.length;i++){
//            for (int j = 0; j < arr.length-1; j++){
//                if(arr[j]>=arr[j+1]){
//                    int x = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = x;
//                }
//            }
//        }
//        for (int i= 0; i <arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//
//        int slow,fast;
//        slow=0;
//        fast=1;
//        while (fast<arr.length){
//            if(arr[slow]==arr[fast]) fast++;
//            else {
//                slow++;
//                arr[slow]=arr[fast];
//                fast++;
//            }
//        }
//
//        for (int i = 0; i <=slow; i++) {
//            System.out.print(arr[i] + "");
//        }

//        int nums[]={3,2,2,3,4,7,34,53,6,6,7,43,5,36,4,3};
//        int val=3;
//        removeElement(nums,val);

//    collection->List(ArrayList(sequential and repeatable),LinkedList(sequential and repeatable)), set(HashSet,LinkedHashSet,treeset)
//    map->HashMap(no sequence and no repeat),LinkedHashMap,treemap
//
//        HashSet<Integer> arr1 = new HashSet<>();
//        Random random = new Random();
//        System.out.print("[");
//        for (int i = 0; i < 20; i++) {
//            Integer x = random.nextInt(15);
//            System.out.print(x + ", ");
//            arr1.add(x);
//        }
//        System.out.print("]");
//        System.out.println();
//System.out.println(arr1);
//
//
//        ArrayList<Integer> arr2 = new ArrayList<>();
//        LinkedList<Integer> arr3 = new LinkedList<>();
//        for (int i = 0; i < 20; i++) {
//            arr2.add(i * 2);
//            arr3.push(i * 2);
//            arr3.add(i * 3);
//        }
//        System.out.println("=========ArrayList===============");
//        System.out.println(arr2);
//        System.out.println(Arrays.toString(arr2.toArray()));
//        System.out.println(arr2.contains(2) + " " + arr2.remove(1) + " " + arr2.isEmpty() + " " + arr2.size()+" "+arr2.get(10));
//        System.out.println(arr2);
//        System.out.println("=========ArrayList===============");
//        System.out.println("=========LinkedList===============");
//        System.out.println(arr3);
//       System.out.println(arr3.contains(6) + " " + arr3.remove(5) + " " + arr3.size() + " " + arr3.isEmpty()+" "+arr3.get(10));
//        System.out.println(arr3);
//        System.out.println("=========LinkedlList===============");
//
////List 是“可重复、有顺序”，Set 是“不可重复”，
////        其中 LinkedHashSet 保持插入顺序，HashSet 不保证顺序。
//
//        TreeSet<String> arr4=new TreeSet<>();
//        arr4.add("ANU");arr4.add("UNSW");arr4.add("USYD");arr4.add("UM");
//        arr4.add("UOA");arr4.add("UQ");arr4.add("UWA");arr4.add("UOM");
//        arr4.add("ANU");arr4.add("UNSW");arr4.add("USYD");arr4.add("UM");
//        System.out.println(arr4);
//        System.out.println(arr4.size()+" "+arr4.contains("ucl")+" "+arr4.add("ucl")+" "+arr4.remove("ANU"));
//        System.out.println(arr4);
//
//
//        System.out.println("=================iterate over the list or traverse the list==========================");
//        System.out.println("==================iterator traversal/iteration using a Iterator=========================");
//        Iterator<String> iterator = arr4.iterator();
//        while(iterator.hasNext()){
//            System.out.print(iterator.next()+" ");
//        }
//        System.out.println("\n==================enhanced for loop=========================");
//        for(String element: arr4){
//            System.out.print(element+" ");
//        }
//        System.out.println("\n==================foreach transversal with a lambda expression or lambda-based iteration=========================");
//        arr3.forEach(x->System.out.print(x+" "));


//        List<String> list= new ArrayList<>();
//        list.add("Apple");
//        list.add("Banana");
//        list.add("Orange");
//        list.add("Mango");
//        list.add("Grape");
//        list.add("Apple");
//        list.add("Pear");
//        list.add("Banana");
//list.add("Watermelon");
//        list.add("Peach");
//        list.add("Cherry");
//        list.add("Orange");
//        list.add("Lemon");
//        list.add("aKiwi");
//        list.add("Mango");
//        list.add("Strawberry");
//list.add("Blueberry");
//        list.add("Apple");
//        list.add("Pineapple");
//        list.add("Grape");
//        Iterator<String> iterator=list.iterator();
//        while(iterator.hasNext()){
//            String element=iterator.next();
//            if(element.startsWith("A")){
//                iterator.remove();
//                continue;
//            }
//            System.out.print(element+" ");
//        }


//        List<String> list1 = new LinkedList<>();//arrayList<>() and linkedList<>() are the same in functionality
//        list1.add("hello");
//        list1.add("world");
//       list1.add("python");
//        list1.add("C++");
//        list1.add("C++");
//        list1.add("java");
//        list1.add("java");
//        list1.add(0,"Work Harder!");
//        list1.set(2,"Try Your Best, TongYan!!!");
//        System.out.println(list1.get(0)+" "+list1.get(2));
//        list1.forEach(x->System.out.print(x+"| "));


//        for Java LinkedList, addFirst(e) and push(e) have the same effect: both insert the element at the beginning of thelist.
//        The difference is when the list is empty:
//        LinkedList<String> list = new LinkedList<>();
//
//        System.out.println(list.peek());      // null
//        System.out.println(list.peekFirst()); // null
//        System.out.println(list.getFirst());  // thr
//        LinkedList<String>list2 = new LinkedList<>();
//        list2.push("第一颗子弹");
//        list2.addFirst("第二颗子弹");
//        list2.push("第三颗子弹");
//        list2.push("第四颗子弹");
//        list2.push("第五颗子弹");
//        list2.addFirst("第六颗子弹");
//        list2.addLast("第七课子弹");
//        list2.pop();
//        list2.removeLast();
//        list2.removeFirst();
//        System.out.println(list2);
//        System.out.println(list2.getLast()+" "+list2.peek()+" "+list2.peekLast()+" "+list2.peekFirst());


//        Map<String,String> map1=new HashMap<>();
//        map1.put("au","anu");map1.put("au","unsw");map1.put("uk","ucl");
//        map1.put("usa","ucla");map1.put("canada","uot");map1.put("au","usyd");
//        map1.put("uk","ucl");map1.put("canada","uot");
//        System.out.println(map1);
//        /*
//        unordered,unique(no duplicates)
//        if the key already exists, the new value will overwrite the old one
//         */
//        System.out.println(map1.get("au")+" "+map1.size()+" "+map1.remove("canada"));
//        System.out.println(map1.keySet()+" "+map1.values()+" "+map1.containsKey("au")+" "+map1.containsValue("ucl"));
//        System.out.println(map1);
////        keySet() returns a Set<K> — a collection of unique keys.
////        values() returns a Collection<V> — a collection of all the values, which may include duplicates.
//
//        //iterate the map
//        //using forEach expression
//        map1.forEach((key,value)->System.out.println(key+" "+value));
//        //enhanced for loop
//        for(String key:map1.keySet()){
//            System.out.println(key+" "+map1.get(key));
//        }
//        //firstly, we call the keysey() method on map1. This returns
//        //a set containing all the keys. Then we use the enhanced
//        //for loop to iterate over this set



    }

    public static void vote() {
        Random random = new Random();
        Scanner scanner=new Scanner(System.in);
        System.out.print("please enter the number of voters：");
        int number=scanner.nextInt();
        ArrayList<String> list = new ArrayList<>();
        list.add("中国");list.add("美国");list.add("俄罗斯");list.add("日本");list.add("韩国");
        list.add("加拿大");list.add("英国");list.add("法国");list.add("德国");list.add("意大利");
        list.add("西班牙");list.add("葡萄牙");list.add("巴西");list.add("阿根廷");list.add("澳大利亚");
        list.add("新西兰");list.add("印度");list.add("新加坡");list.add("马来西亚");list.add("泰国");
        System.out.print("These countries already exist:"+list+"\n");
        System.out.print("Do you want to add a new country?(y/n)");
        if(scanner.next().equals("y")) addCountry(list);
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < number; i++) {
            int index=random.nextInt(list.size());
            map.put(list.get(index), map.containsKey(list.get(index)) ? map.get(list.get(index))+1 : 0);
        }
        map.forEach((key, value) -> System.out.println(key + "->" + value));
//        System.out.println("The most popular country is："+Collections.max(map,Map.Entry.comparingByValue()));
    }

    public static void addCountry(ArrayList<String> list) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("please enter the country you want to add：");
            String country = scanner.next();
            while (list.contains(country)) {
                System.out.print("This country has already been added. Please enter another country:");
                country = scanner.next();
            }
            list.add(country);
            System.out.print("Do you want to add another country?(y/n)");
            if (scanner.next().equals("n")) break;
            else continue;
        }
    }




//    public static void removeElement(int[] arr, int element){
//        int index=0;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]!=element) arr[index++]=arr[i];
//        }
//        for (int i = 0; i < arr.length; i++){
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//        for(int i = 0; i < index; i++){
//            System.out.print(arr[i] + " ");
//        }
//    }


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
////       需求：很多App都有不同的优惠券
////        假设，现在有以下优惠券
////        全场商品满10减8
////        全场商品满50减30
////        全场商品满100减50
////       全场商品满200减90
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
//        else System.out.println(x+" isnot between 0 and 10");
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
//        System.out.println("random number is:"+x+" "+"units digit is:"+c+" "+"tensdigit is:"+b+" "+"hundreds digit:"+a);
//    }
//    public static void print() {
//        System.out.println("Today is fourteenth July.");
//    }
//
//    public static int returnAge(int originAge, int neededAddAge) {
//        int newAge = originAge +neededAddAge;
//        return newAge;
//    }


}
