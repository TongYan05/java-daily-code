package ANU7710;

import com.anu.basic.Array;

import java.lang.annotation.Target;
import java.lang.invoke.CallSite;
import java.util.*;
import java.util.stream.StreamSupport;

public class collection1 {
    public static void main(String[] args) {







//        Collection (单列集合接口)
//├── List (有序、可重复、有索引)
//│   ├── ArrayList (数组实现，查询快，增删慢)
//│   ├── LinkedList (链表实现，增删快，查询慢)
//│   └── Vector (线程安全，已过时)
//│
//└── Set (无序/有序、不可重复、无索引)
//    ├── HashSet (哈希表实现，无序)
//    ├── LinkedHashSet (链表+哈希表，保持插入顺序)
//    └── TreeSet (红黑树实现，自动升序排序)
//
//        Map (双列集合接口，key-value 键值对)
//├── HashMap (哈希表实现，key 无序)
//├── LinkedHashMap (保持插入顺序)
//├── TreeMap (按 key 排序)
//└── Hashtable (线程安全，已过时



//        Collection<String> c=new ArrayList<>();
//        Collection<String> c1=new LinkedList<>();
//        c.add("张三");c.add("王五");c.add("王五");c.add("神奇");System.out.println(c);
//        c1.add("hello");c1.add("hello");c1.add("python");c1.add("java");System.out.println(c1);
//        System.out.println(c.contains("张三")+" "+c.remove("张三")+" "+c.isEmpty()+" "+c.size());
//        System.out.println(c1.contains("python")+" "+c1.remove("python")+" "+c1.isEmpty()+" "+c1.size());
//        c1.clear();c.clear();System.out.println(c1+" "+c);
//
//
//        Collection<String> c3=new HashSet<>();
//        Collection<String> c4=new LinkedHashSet<>();
//        c3.add("张三");c3.add("王五");c3.add("王五");c3.add("神奇");System.out.println(c3);
//        c4.add("hello");c4.add("python");c4.add("hello");c4.add("java");System.out.println(c4);
//        System.out.println(c3.contains("张三")+" "+c3.remove("张三")+" "+c3.isEmpty()+" "+c3.size());
//        System.out.println(c4.contains("python")+" "+c4.remove("python")+" "+c4.isEmpty()+" "+c4.size());
//        c4.clear();c.clear();System.out.println(c4+" "+c);
//✅ 可以重复 - 允许添加相同元素
//✅ 有序 - 保持插入顺序
//✅ 有索引 - 可以通过索引访问元素
//实现类：ArrayList, LinkedList

//❌ 不可重复 - 自动去重
//⚠️ 不一定有序 - 取决于具体实现：
//HashSet: 无序（不保证插入顺序）
//LinkedHashSet: 有序（保持插入顺序）
//TreeSet: 排序（按自然顺序或比较器排序）
//❌ 无索引 - 不能通过索引访问



//        Collection<Integer> c5=new HashSet<>();
//        for (int i = 1; i <= 10; i++) {c5.add(i);}
//        System.out.println(c5);//[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]只是coincidence，因为HashSet是无序的，所以结果会变化
////
//        //迭代器
//        Iterator<Integer> it=c5.iterator();
//        while (it.hasNext()){System.out.print(it.next()+" ");}
//        System.out.println();
//        //for循环
//        for (Integer a:c5){System.out.print(a+" ");}
//        System.out.println();
//        //Lamdba
//        c5.forEach(x->System.out.print(x+" "));


//        //集合主要分为collection and map
//        //collection:每个索引上的元素只含一个值（单列集合）
//        //map:每个索引上的元素包含两个值（双列集合）
//
//        //collection<E>是一个接口，接口规定功能，实现增删改查功能
//        //collection<E>->list<E>->arrayList<E>/linkedList<E>                  list<E>家族里的元素可以重复，添加的元素是有序，有索引
//        //collection<E>->set<E>->/treeSet<E>/hashSet<E>->inkedHashSet<E>      set<E>家族的元素不能重复，添加的元素是无序的，无索引，linkedHashSet<E>是有序的，无重复无索引，treeSet<E>无重复无索引,但默认排序（升序）
//
//        ArrayList<String> list=new ArrayList<String>();
//        list.add("张三");
//        list.add("张三");
//        list.add("里斯");
//        list.add("王五");
//        System.out.println(list);
//        System.out.println(list.get(0));//[张三, 张三, 里斯, 王五]
//
//        System.out.println("=========================");
//
//        HashSet<String> set=new HashSet<>();
//        set.add("PYTHON");
//        set.add("JAVA");
//        set.add("张三");
//        set.add("张三");
//        set.add("里斯");
//        set.add("王五");
//        System.out.println(set);//[JAVA, 里斯, 张三, 王五, PYTHON]
//        //set.get(0);没有get()方法来调取索引，因为压根set()集合就没索引，没顺序，没重复
//
//        ArrayList<Integer> list=new ArrayList<>();
//        list.add(10);list.add(10);
//        list.add(20);
//        list.add(30);list.add(40);
//        list.add(10);
//        list.add(50);list.add(60);
//        list.add(10);list.add(10);
//        list.add(70);list.add(80);
//        list.add(90);list.add(100);
//        Iterator<Integer> it=list.iterator();
//        while(it.hasNext()){
//            if (it.next().equals(10)){
//                it.remove();
//            }
//        }
//        System.out.println(list);
//
//        Iterator<Integer> it2=list.iterator();
//        while(it2.hasNext()){
//            if(it2.next()%4==0) it2.remove();
//        }
//        System.out.println(list);

//        System.out.println("============collection集合的功能=============");
//        //add(E e),clrear(),contains(Object o),isEmpty(),size(),remove(Object o),toArray()+Arrary.toString()集合转换为数组
//        System.out.println(list.add("C++"));
//        System.out.println(list);//[张三, 张三, 里斯, 王五, C++]
//        System.out.println(list.contains("张三"));//true
//        System.out.println(list.isEmpty());//false
//        System.out.println(list.size());//5
//        System.out.println(list.remove("张三"));
//        System.out.println(list);//[张三, 里斯, 王五, C++]
//        Object [] arr =list.toArray();
//        System.out.println(Arrays.toString( arr));//[张三, 里斯, 王五, C++], Arrays.toString()把数组转换为字符串（只适用于数组）
//        //System.out.println(list.clear());clear()无返回值
//        list.clear();
//        System.out.println(list);//[]

        //example(comprehensive)
//        List<String> list=new ArrayList<>();
//        list.add("墨尔本大学");list.add("悉尼大学");list.add("昆士兰大学");list.add("新南威尔士大学");
//        list.add("莫纳什大学");list.add("澳大利亚国立大学");list.add("阿德莱德大学");list.add("西澳大利亚大学");
//        list.add("悉尼科技大学");
//        System.out.println(list);
//        Iterator<String> it=list.iterator();
//        while(it.hasNext()) System.out.print(it.next()+" ");
//        System.out.println();
//        for(String l:list) System.out.print(l+" ");
//        System.out.println();
//        list.forEach(x->System.out.print(x+" "));
//        System.out.println();
//        System.out.println(Arrays.toString(list.toArray()));//集合->数组->字符串

//        System.out.println("============collection的3种遍历方式=============");
//        System.out.println("============1.迭代器遍历=============");
//        Collection<String> col=new ArrayList<>();//创建集合
//        col.add("ANU");
//        col.add("JAVA");
//        col.add("PYTHON");
//        col.add("C++");
//        Iterator<String> it=col.iterator();//创建迭代器
//        System.out.println(it.next());//it在-1索引，先位移再取值
//        System.out.println(it.next());
//        System.out.println(it.next());
//        System.out.println(it.next());//此时it已经到末尾了，所以会报NoSuchElementException

//        //for 循环
//        for(int i=0;i<col.size();i++){
//            System.out.print(it.next()+" ");
//        }
//        //while循环
//        while(it.hasNext()){//hasNext()方法判断迭代器是否还有下一个元素
//            String a=it.next();
//            System.out.print(a+" ");
//        }

//        System.out.println("============2.foreach遍历=============");
//        Collection<String> col1=new ArrayList<>();
//        col1.add("ANU");col1.add("UNSW");col1.add("USYD");col1.add("UOM");col1.add("UQ");col1.add("UWA");col1.add("UOA");
//        //foreach循环，for(数据类型 变量名:集合名){}
//        for(String a:col1){
//            System.out.print(a+" ");
//        }
//        //foreach循环，for(数据类型 变量名:数组名){}
//        int [] arr1=new int[5];
//        arr1[0]=1;arr1[1]=2;arr1[2]=3;arr1[3]=4;arr1[4]=5;
//        for(int x:arr1){
//            System.out.print(x+" ");
//        }

//        System.out.println("============3.lambda表达式遍历=============");
//        //lambda格式：(参数列表)->{方法体}
//        Collection<Double> col2=new ArrayList<>();
//        col2.add(1.1);col2.add(2.2);col2.add(3.3);col2.add(4.4);col2.add(5.5);
//        col2.forEach(y->System.out.print(y+"|"));//1.1|2.2|3.3|4.4|5.5|
//        col2.forEach(System.out::print);//引用方法，还是上面那个好点


//        System.out.println("============3种遍历方式的区别=============");
//


//        //遍历和增删改查同时进行
//        ArrayList<String> col3 = new ArrayList<>();
//        col3.add("ANU");
//        col3.add("UNSW");
//        col3.add("USYD");
//        col3.add("UOM");
//        col3.add("UQA");
//        col3.add("UWA");
//        col3.add("UOA");

//        //遍历和增删改查同时进行(for循环的第一种的方法i--)
//       for(int i=0;i<col3.size();i++){
//           if(col3.get(i).contains("A")){
//               col3.remove(i);
//               i--;
//           }
//       }
//       System.out.println(col3);
//       //遍历和增删改查同时进行(for循环的第二种方法倒序遍历)
//        for(int i=col3.size()-1;i>=0;i--){
//            if(col3.get(i).contains("A")){
//                col3.remove(i);
//            }
//        }
//        System.out.println(col3);


//        //遍历和增删改查同时进行(迭代器)
//        java.util.Iterator<String> i =col3.iterator();
//        while(i.hasNext()){
//            if(i.next().contains("A")){
//                i.remove();//remove()方法让游标回退一格，从而让迭代器指向下一个元素
//            }
//        }
//        System.out.println(col3);


        //遍历和增删改查同时进行(增强for循环and Lamdba都没有办法解决)

        //总结：解决并发修改异常问题的方案
        //① 如果集合支持索引，可以使用for循环遍历，每删除数据后做i--；或者可以倒着遍历
        //② 可以使用迭代器遍历，并用迭代器提供的删除方法删除数据。
        //注意：增强for循环/Lambda遍历均不能解决并发修改异常问题，因此增它们只适合做数据的遍历，不适合同时做增删操作。

    }
}