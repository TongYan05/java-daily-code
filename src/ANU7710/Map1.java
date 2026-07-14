package ANU7710;

import java.util.*;

public class Map1 {
    public static void main(String[] args) {
        //collection and  map
        //cllection--每个元素包含一个数据（单列集合/键值对集合）结构{key1=value1,key2=value2,key3=value3.....} key cannot repeat but value can repeat
        //map--每个元素包含两个数据（双列集合）

        //存储一一对应的数据：童颜——澳国立，王文杰——大连海事，刘过——南方科技 周付兵——福建华东

        //Map<k,v>是一个接口，需要使用实现类，如下
        //HashMap<k,v>->linkedHashMap<k,v>， HashTable<k,v>无序，不重复，无索引    linkedHashMap<k,v>有序，不重复，无索引
        //和
        //treeMap<k,v>默认升序，不重复，无索引

        Map<String,String> map = new HashMap<>();
        map.put("童颜","澳国立");
        map.put("童颜","澳洲国立大学");
        map.put("王文杰","大连海事");
        map.put("王文杰","大连海事211");
        map.put("刘过","南方科技");
        map.put("刘过","南方科技强校");
        map.put("周付兵","福建华东");
        map.put("周付兵","福建华东7000");
//        System.out.println(map);//{周付兵=福建华东7000, 刘过=南方科技强校, 童颜=澳洲国立大学, 王文杰=大连海事211}，后面的键值会覆盖前面的


//        Map<String,String> map1 = new LinkedHashMap<>();
//        map1.put("童颜","澳国立");
//        map1.put("童颜","澳洲国立大学");//选中区域ctrl+r,可以一键替换map->map1
//        map1.put("王文杰","大连海事");
//        map1.put("王文杰","大连海事211");
//        map1.put("刘过","南方科技");
//        map1.put("刘过","南方科技强校");
//        map1.put("周付兵","福建华东");
//        map1.put("周付兵","福建华东7000");
//        System.out.println(map1);//{童颜=澳洲国立大学, 王文杰=大连海事211, 刘过=南方科技强校, 周付兵=福建华东7000}，键值对会按照添加的顺序进行排序，后面的键值会覆盖前面的



        //Map的功能
        /*
        方法定义	功能说明
        public V put(K key,V value)	添加元素   √
        public int size()	获取集合的大小   √
        public void clear()	清空集合   √
        public boolean isEmpty()	判断集合是否为空，为空返回 true，反之   √
        public V get(Object key)	根据键获取对应值   √
        public V remove(Object key)	根据键删除整个元素   √
        public boolean containsKey(Object key)	判断是否包含某个键   √
        public boolean containsValue(Object value)	判断是否包含某个值   √
        public Set<K> keySet()	获取全部键的集合   √
        public Collection<V> values()	获取 Map 集合的全部值   √
        public Set<Map.Entry<K,V>> entrySet()	获取 Map 集合的全部键值对   √
         */

        map.put("冬天","要来了");
        map.remove("王文杰");
        System.out.println(map.get("刘过"));
        Set<String> array=map.keySet();
        System.out.println("获取全部键的集合"+array);
        Collection<String> col=map.values();
        System.out.println("获取 Map 集合的全部值"+col);
        System.out.println(map+" "+map.size()+" "+map.containsKey("夏天")+" "+map.containsValue("要来了"));












    }
}
