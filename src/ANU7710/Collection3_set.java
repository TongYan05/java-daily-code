package ANU7710;

import java.net.spi.InetAddressResolver;
import java.util.*;

public class Collection3_set {
    public static void main(String[] args) {

        //set集合(跟collection的功能一样add(),remoev(),isEmpty(),contains(),size())
        //hashSet<E>->无序，无索引，无重复
        //linkedHashSet<E>->有序，无索引，无重复(是hashset的一个子类)
        //treeSet<E>->排序，无索引，无重复


//        Set<String> set=new HashSet<>();
//        set.add("banana");
//        set.add("apple");
//        set.add("apple");
//        set.add("cherry");
//        set.add("date");
//        set.add("date");
//        set.add("elderberry");
//        System.out.println(set);//[banana, date, apple, cherry, elderberry]


//        Set<String> set1=new LinkedHashSet<>();
//        set1.add("banana");
//        set1.add("apple");
//        set1.add("apple");
//        set1.add("apple");
//        set1.add("cherry");
//        set1.add("date");
//        set1.add("elderberry");
//        set1.add("elderberry");
//        System.out.println(set1);//[banana, apple, cherry, date, elderberry]

//        Set<Double> set2=new TreeSet<>();
//        //10个小数
//        set2.add(5.0);
//        set2.add(2.0);
//        set2.add(3.0);
//        set2.add(3.0);
//        set2.add(3.0);
//        set2.add(3.0);
//        set2.add(3.0);
//        set2.add(4.0);
//        set2.add(1.0);
//        set2.add(6.0);
//        set2.add(7.0);
//        set2.add(8.0);
//        set2.add(90.0);
//        set2.add(10.0);
//        System.out.println(set2);//[1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 10.0, 90.0]




//        Collection3_student stu=new Collection3_student("王文杰", 18,"男");
//        Collection3_student stu1=new Collection3_student("王文杰", 18,"男");
//        Collection3_student stu2=new Collection3_student("童颜", 19,"男");
//        Collection3_student stu3=new Collection3_student("王fqg", 18,"女");
//
//        Set<Collection3_student> set3=new HashSet<>();
//        set3.add(stu);
//        set3.add(stu1);
//        set3.add(stu2);
//        set3.add(stu3);
//        System.out.println(set3);//[姓名：童颜，年龄：19，性别：男   , 姓名：王文杰，年龄：18，性别：男   , 姓名：王文杰，年龄：18，性别：男   , 姓名：王fqg，年龄：18，性别：女   ]
//        //输出结果没有去重，因为hashcode()和equals()方法没有重写
//
//        //重写equals()和hashCode()//[姓名：童颜，年龄：19，性别：男   , 姓名：王fqg，年龄：18，性别：女   , 姓名：王文杰，年龄：18，性别：男   ]


        System.out.println("================treeSet===============");

        //treeSet<E>对于integer and Double类型排序，默认是升序，对于String,根据首字符的编号升序排序
        //如果要对对象排序，需要实现Comparable接口，重写compareTo()方法,指定排序规则


        Collection3_employee emp=new Collection3_employee("小王",2700);
        Collection3_employee emp1=new Collection3_employee("小歌",2700);
        Collection3_employee emp2=new Collection3_employee("小红",5700);
        Collection3_employee emp22=new Collection3_employee("小红",5700);
        Collection3_employee emp222=new Collection3_employee("小红",5700);
        Collection3_employee emp3=new Collection3_employee("小顺",5700);
        Collection3_employee emp4=new Collection3_employee("小紫",3700);
        Collection3_employee emp44=new Collection3_employee("小紫",3700);
        Collection3_employee emp444=new Collection3_employee("小紫",3700);
        Collection3_employee emp5=new Collection3_employee("小花",3700);
        Collection3_employee emp6=new Collection3_employee("小军",3400);
        Collection3_employee emp7=new Collection3_employee("小弧",3400);
        Collection3_employee emp8=new Collection3_employee("小敏",8300);
        Set<Collection3_employee> set4=new TreeSet<>();
        set4.add(emp);set4.add(emp1);set4.add(emp2);set4.add(emp3);set4.add(emp4);
        set4.add(emp44);set4.add(emp444);set4.add(emp22);set4.add(emp222);
        set4.add(emp5);set4.add(emp6);set4.add(emp7);set4.add(emp8);

        System.out.println(Arrays.toString(set4.toArray()));//此时的hashcode() and equals()方法重写并没有去重why?

    }
}
