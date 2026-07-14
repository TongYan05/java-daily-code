package ANU7710;

import com.sun.jdi.Value;

import javax.swing.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream1 {
    public static void main(String[] args) {
//        // Stream流：是从JDK8开始出现的API，用于操纵集合和数组的数据,结合了lambda表达式和函数式接口
//        List<Integer> listtt=new ArrayList<>();
//        for(int i=1;i<=100;i++){
//            listtt.add(i);
//        }
//

//
//        ArrayList<Integer> list1=new ArrayList<>();
//        for(Integer i:listtt){
//            if(i%3==0) list1.add(i);
//        }
//        System.out.println(list1);
//
//        //使用Stream流,接口类型要保持一致listtt and list2
//        List<Integer> list2=listtt.stream().filter(i->i%3==0).filter(i->i%5==0).filter(i->i>=10).collect(Collectors.toList());
//        System.out.println(list2);
//        //上面用一个集合来接住数据，我也可以直接用stream来接住数据
//
//        //collection集合调用stream流-- >直接调用stream()方法
//        Collection<String> list3=new ArrayList<>();
//        list3.add("张三");list3.add("张四");list3.add("张五");list3.add("张六");list3.add("张七");list3.add("张八");
//        Stream<String> s =list3.stream();
//        System.out.println(s.filter(i->i.startsWith("张")).filter(i->i.contains("五")).collect(Collectors.toList()));//collect将筛选出来的打成包
//        //同样list and set 都可以用如上方式


//        //Map集合调用stream流->key and value分别拿出来   or     转成set集合（链式）
//        Map<String,Integer> map=new HashMap<>();
//        map.put("张三",18);map.put("张四",19);map.put("张五",20);map.put("张六",21);map.put("张七",22);map.put("张八",23);map.put("张九",24);
//        //map集合的key和value分别拿出来
//        Stream<String> s1 =map.keySet().stream();
//        Stream<Integer> s2 =map.values().stream();
//        System.out.println(s1.filter(i->i.startsWith("张")).collect(Collectors.toList()));
//        System.out.println(s2.filter(i->i>=20).collect(Collectors.toList()));
//        //map集合转成set集合
//        Set<Map.Entry<String,Integer>> set=map.entrySet();

        //review
//            Map<String,Integer> mapp=new HashMap<>();
//            mapp.put("张三",18);mapp.put("张四",19);mapp.put("张五",20);mapp.put("张六",21);mapp.put("张七",22);mapp.put("张八",23);mapp.put("张九",24);
//            Stream<String> s1=mapp.keySet().stream();
//            Stream<Integer> s2=mapp.values().stream();
//            System.out.println(s1.filter(i->i.startsWith("张")).collect(Collectors.toList()));
//            System.out.println(s2.filter(i->i>=20).collect(Collectors.toList()));
//            Set<Map.Entry<String,Integer>> set=mapp.entrySet();
//            set.stream().filter(i->i.getKey().startsWith("张")).filter(i->i.getValue()>=22).collect(Collectors.toList()).forEach(i-> System.out.println(i));


//        //数组调用stream流->=Arrays.stream()   or       Stream.of(value1,value2........)
//        String[] arr=new String[]{"张三","张四","张五","张六","张七","张八","张九"};
//        Stream<String> s3 =Arrays.stream(arr);
//        System.out.println(s3.filter(i->i.startsWith("张")).collect(Collectors.toList()));
//        Stream<String> s4 =Stream.of("张三","张四","张五","张六","张七","张八","张九");
//        System.out.println(s4.filter(i->i.startsWith("张")).filter(i->i.contains("五")).collect(Collectors.toList()));
//
//
////        获取到stream流后，就要用collect()方法将数据收集起来，然后就是对数据进行处理，比如筛选，去重，排序，这些方法叫做中间方法
////
////          1. filter(Predicate<? super T> predicate)
////             说明：用于对流中的数据进行过滤                         list.stream().filter()
////
////          2. sorted()
////             说明：对元素进行升序排序                              list.stream().sorted()
////
////          3. sorted(Comparator<? super I> comparator)
////             说明：按照指定规则排序
////
////          4. limit(long maxSize)
////             说明：获取前几个元素                                 list.stream().limit()
////
////          5. skip(long n)
////             说明：跳过前几个元素                                 list.stream().skip()
////
////          6. distinct()                                       list.stream().distinct()
////             说明：去除流中重复的元素
////
////          7. map(Function<? super I,? extends R> mapper)
////             说明：对元素进行加工，并返回对应的新流
////
////          8. concat(Stream a, Stream b)
////             说明：合并a和b两个流为一个流                          stream.concat(list1.stream(), list2.stream())


//        //筛选
//        Collection<String> list4 = new ArrayList<>();
//        list4.add("项羽");
//        list4.add("张飞");
//        list4.add("关羽");
//        list4.add("赵云");
//        list4.add("小乔");
//        list4.add("虞姬");
//        list4.add("西施");
//        list4.stream().filter(i -> i.startsWith("张") && i.contains("小")).collect(Collectors.toList()).forEach(i -> System.out.println(i));//筛选

//        //排序
//        Collection<Integer> list5 = new ArrayList<>();
//        for (int i = 1; i <= 30; i++) {
//            Random r = new Random();
//            list5.add(r.nextInt(100));
//        }
//        list5.stream().sorted().forEach(i -> System.out.print(i + " "));//排序
//        System.out.println();
//        //升序排序
//        System.out.println("===================================升序降序========================================");
//        list5.stream().sorted(Comparator.naturalOrder()).forEach(i -> System.out.print(i + " "));
//        System.out.println();
//        //降序排序
//        list5.stream().sorted(Comparator.reverseOrder()).forEach(i -> System.out.print(i + " "));
//        System.out.println();
//
//
//        System.out.println();
//
//        //跳过
//        Collection<Integer> list6 = new ArrayList<>();
//        for (int i = 1; i <= 30; i++) {
//            Random r = new Random();
//            list6.add(r.nextInt(100));
//        }
//        list6.stream().skip(10).forEach(i -> System.out.print(i + " "));//跳过
//
//        System.out.println();

//        //截取
//        Collection<Integer> list7 = new ArrayList<>();
//        for (int i = 1; i <= 30; i++) {
//            Random r = new Random();
//            list7.add(r.nextInt(100));
//        }
//        list7.stream().forEach(i -> System.out.print(i + " "));
//        System.out.println();
//        list7.stream().limit(10).forEach(i -> System.out.print(i + " "));//截取
//
//        System.out.println();

//        //去重
//        Collection<Integer> list8 = new ArrayList<>();
//        for (int i = 1; i <= 30; i++) {
//            Random r = new Random();
//            list8.add(r.nextInt(20));
//        }
//        System.out.println(list8.stream().sorted().collect(Collectors.toList()));
//        System.out.println(list8.stream().sorted().distinct().collect(Collectors.toList()));//去重
//
//
//        //转换
//        Collection<String> list9 = new ArrayList<>();
//        list9.add("张三");
//        list9.add("张四");
//        list9.add("张五");
//        list9.add("张六");
//        list9.add("张七");
//        list9.add("张八");
//        list9.stream().map(i -> i.substring(1)).forEach(i -> System.out.print((i) + " "));//转换
//        //substring(1) 的作用：
//        //从索引 1 开始截取到字符串末尾（跳过索引 0 的字符）
//        //也就是去掉第一个字符"张"
//
//        System.out.println();

//        //合并
//        Collection<Integer> list10 = new ArrayList<>();
//        for (int i = 1; i <= 30; i++) {
//            Random r = new Random();
//            list10.add(r.nextInt(100));
//        }
//        Collection<Integer> list11 = new ArrayList<>();
//        for (int i = 1; i <= 30; i++) {
//            Random r = new Random();
//            list11.add(r.nextInt(100));
//        }
//        Stream.concat(list10.stream(), list11.stream()).sorted().collect(Collectors.toList()).forEach(i -> System.out.print(i + " "));
//        Stream<Integer> sss = Stream.concat(list10.stream(), list11.stream());
//        System.out.println();
//        System.out.println(sss.count());
//        System.out.println(Stream.concat(list10.stream(), list11.stream()).count());
//        //加工
//        Stream.concat(list10.stream(), list11.stream()).sorted().map(i -> i - 100000).collect(Collectors.toList()).forEach(i -> System.out.print(i + " "));

//        System.out.println("===============================终结方法=========================================");

//
//        //终结方法,使用之后就不能再用流了foreach
//        ArrayList<employee> list12 = new ArrayList<>();
//        list12.add(new employee("张三", 18, 20000));
//        list12.add(new employee("张四", 19, 30000));
//        list12.add(new employee("张五", 20, 40000));
//        list12.add(new employee("张六", 21, 50000));
//        list12.add(new employee("张七", 22, 60000));
//        list12.add(new employee("张八", 23, 70000));
//        list12.add(new employee("张九", 24, 80000));
//        list12.add(new employee("张十", 25, 90000));
//        list12.add(new employee("张十一", 26, 100000));
//        list12.add(new employee("张十二", 27, 110000));
//        list12.add(new employee("张十三", 28, 120000));

//        list12.stream().filter(x->x.getAge()>25&&x.getSalary()>100000).collect(Collectors.toMap(k -> k.getName(), v -> v.getSalary())).forEach((k,v)-> System.out.println(k + " " + v));

//        //list and collection可以用tocollection() and tolist() but arraylist can only use tolist()
//        List<employee> list13 = list12.stream().filter(i -> i.getSalary() > 100000).collect(Collectors.toList());
//        Collection<employee> list14 = list12.stream().filter(i -> i.getSalary() > 100000).collect(Collectors.toCollection(ArrayList::new));
//        ArrayList<employee> list15 = list12.stream().filter(i -> i.getSalary() > 100000).collect(Collectors.toCollection(ArrayList::new));
//        Map<String, Double> map = list12.stream().filter(i -> i.getSalary() > 60000).collect(Collectors.toMap(k -> k.getName(), v -> v.getSalary()));
//        Map<String, Double> map1 = list12.stream().filter(i -> i.getSalary() > 60000).collect(Collectors.toMap(employee::getName, employee::getSalary));
//        long count = list12.stream().filter(i -> i.getSalary() > 60000).count();//count的返回值就是long类型，只能用long接收
//        System.out.println(list13 + " " + list13.stream().count());
//        System.out.println(list14);
//        System.out.println(list15);
//        System.out.println(count);
//        System.out.println(map);
//        System.out.println(map1);


//        max() 是终结方法，执行后流就关闭了
//        返回类型是 Optional<employee >（包装类，可能为空）
//        Optional 对象没有 collect() 方法

//            System.out.println(list12.stream().max((m, n) -> Double.compare(m.getSalary(), n.getSalary())));
//            Optional<employee> o = list12.stream().max((m, n) -> Double.compare(m.getSalary(), n.getSalary()));//max() 方法会遍历流中的所有元素，使用 Comparator 进行比较：
//            System.out.println(o.get());//max.get()的返回的是整个对象，把这个对象存储在employee对象，一个新生成的对象名
//            employee max1 = o.get();
//            System.out.println(max1);

    }
}
