package ANU7710;

import com.anu.basic.Array;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map2 {
    public static void main(String[] args) {

        //Map集合的遍历：
        // 1.键找值:先获取Map集合中所有的键Map.keySet()，通过键获取对应的值Map.get(key)
        // 2.键值对:获取Map集合中所有的键值对，通过键值对获取键和值 tough
        // 3.Lambda: very easy after JDK8


        Map<String,String> map = new HashMap<>();
        map.put("张三", "北京");
        map.put("李四", "上海");
        map.put("王五", "广州");
        map.put("赵六", "深圳");
        map.put("钱七", "杭州");
        map.put("孙八", "成都");
        map.put("周九", "武汉");
        map.put("吴十", "南京");
        map.put("郑十一", "西安");
        map.put("陈十二", "重庆");
        map.put("刘十三", "北京");
        map.put("杨十四", "上海");
        map.put("黄十五", "广州");
        map.put("林十六", "深圳");
        map.put("何十七", "杭州");
        map.put("高十八", "成都");
        map.put("马十九", "武汉");
        map.put("朱二十", "南京");
        map.put("徐二一", "北京");
        map.put("郭二二", "上海");


//        //1.键找值：获取所有的键：map.keySet()（这是一个由键组成的集合），通过键获取对应的值：map.get(key)
//        for(int i=0;i<map.keySet().size();i++){
//            System.out.println("key:"+map.keySet().toArray()[i]+" value:"+map.get(map.keySet().toArray()[i]));
//        }
//
//        for(String key:map.keySet()){
//            System.out.println("key:"+key+" value:"+map.get(key));
//        }

//        Set<String> s=map.keySet();
//        Object[] arrays=s.toArray();
//        for(int a=0;a<arrays.length;a++){
//            System.out.println("key:"+arrays[a]+"\t"+"value:"+map.get(arrays[a]));
//        }
//        System.out.println("====================================================================================");


//        //2.键值对：获取所有的键值对：map.entrySet()（这是一个由键值对组成的集合），通过键值对获取键和值
//        //3.Lambda
//        map.forEach((k,v)-> System.out.println("key:"+k+" value:"+v));




    }
}
