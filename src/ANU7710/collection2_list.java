package ANU7710;

import java.lang.invoke.CallSite;
import java.util.*;

public class collection2_list {
    public static void main(String[] args) {
//        //引入索引的操作-->add(index,element),remove(index),set(index,element),get(index)
//        List<String> list1=new LinkedList<>();//arrayList<>() and linkedList<>() are the same in functionality
//        list1.add("hello");
//        list1.add("world");
//        list1.add("python");
//        list1.add("C++");
//        list1.add("C++");
//        list1.add("java");
//        list1.add("java");
//        System.out.println(list1);//[hello, world, python, C++, C++, java, java]
//        list1.add(1,"java");
//        System.out.println(list1);//[hello, java, world, python, C++, C++, java, java]
//        list1.remove(list1.size()-1);
//        System.out.println(list1);//[hello, javta, world, python, C++, C++, java]
//        list1.set(1,"python");
//        System.out.println(list1);//[hello, python, world, python, C++, C++, java]
//        System.out.println(list1.get(1));//python


        Random random=new Random();
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<10;i++) {
            int num = random.nextInt(100);
            System.out.print(num+" ");
            list.add(num);
        }
        System.out.println();
        for(int i=0;i<list.size();i++) System.out.print(list.get(i)+" ");
        System.out.println();
        Iterator<Integer> it=list.iterator();
        while (it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println();
        list.forEach(x->System.out.print(x+" "));
        System.out.println();
        for(Integer i:list) System.out.print(i+" ");

//        //四种遍历方式：1.普通for循环,2.foreach循环,3.迭代器,4.lambda表达式
//        System.out.println("================普通for循环==================");
//        for(int i=0;i<list1.size();i++){
//            System.out.print(list1.get(i)+" ");
//        }//hello python world python C++ C++ java
//        System.out.println("\n==================迭代器===================");
//        Iterator< String> it= list1.iterator();
//        while (it.hasNext()){
//            System.out.print(it.next()+" ");
//        }//hello python world python C++ C++ java
//        System.out.println("\n================foreach循环===================");
//        for (String a:list1){
//            System.out.print(a+" ");
//        }//hello python world python C++ C++ java
//        System.out.println("\n=================lambda表达式===================");
//        list1.forEach(x->System.out.print(x+" "));//hello python world python C++ C++ java
//
//
//        //arrayList<>()和linkedList<>()的区别：arrayList<>()是数组实现，linkedList<>()是链表实现(数据结构是不同的)
//        //数组存储数据，链表存储数据，数组存储索引，链表存储数据
//        //数组查询快（根据索引查询，查询时间相同），链表查询慢（无论查询哪个数据都要从头查起），数组删除快，链删除表慢
//        //数组通过索引查询数据，链表通过数据查询索引
//        //数组增删效率低，链表增删效率高
//        //单项链表和双向链表，单项链表只能向前遍历，双向链表可以向前向后遍历，链表增删效率更高
//
//        System.out.println();
//
//        //链表 栈
//        //压栈 push(element)=addFirst(),出栈 pop()=removeFirst(),获取栈顶元素 peek(),判断栈是否为空 isEmpty(),获取栈大小 size()
//        LinkedList<String> list2=new LinkedList<>();
//        list2.push("第一颗子弹");
//        list2.addFirst("第二颗子弹");
//        list2.push("第三颗子弹");
//        list2.push("第四颗子弹");
//        list2.push("第五颗子弹");
//        System.out.println(list2);//[第五颗子弹, 第四颗子弹, 第三颗子弹, 第二颗子弹, 第一颗子弹]

//        //出栈
//        System.out.println(list2.removeFirst());//第五颗子弹
//        System.out.println(list2.pop());//第四颗子弹
//        System.out.println(list2);//[第三颗子弹, 第二颗子弹, 第一颗子弹]
//
//        //获取栈顶元素
//        System.out.println(list2.peek());//第三颗子弹
//        System.out.println(list2.getFirst());//第三颗子弹
//
//
//        //获取栈底元素
//        System.out.println(list2.getLast());//第一颗子弹
//
//        //获取栈大小
//        System.out.println(list2.size());//3
//
//        //判断栈是否为空
//        System.out.println(list2.isEmpty());// false

//        List<String> list=new LinkedList<>();
//        list.add("university of sydney");
//        list.add("university of melbourne");
//        list.add("university of qeensland");
//        list.add("university of adelaide");
//        list.add("university of western australia");
//        list.add("university of new south wales");
//        list.add(2,"the asutralian national university");
//        System.out.println(list);
//        System.out.println(list.indexOf("university of qeensland"));
//        list.remove(5);
//        System.out.println(list);
//        System.out.println(list.get(5));


    }
}
