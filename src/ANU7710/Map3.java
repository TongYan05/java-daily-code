package ANU7710;

import com.sun.jdi.Value;
import org.w3c.dom.ls.LSException;

import java.util.*;

public class Map3 {
    public static void main(String[] args) {

        vote();
        vote1();
        option();

    }

    public static void vote() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("澳大利亚", 0);
        map.put("中国", 0);
        map.put("新西兰", 0);
        map.put("美国", 0);
        System.out.println("投票开始");
        for (int i = 0; i < 800; i++) {
            Random random = new Random();
            if (random.nextInt(4) == 0) map.put("澳大利亚", map.get("澳大利亚") + 1);
            else if (random.nextInt(4) == 1) map.put("中国", map.get("中国") + 1);
            else if (random.nextInt(4) == 2) map.put("新西兰", map.get("新西兰") + 1);
            else map.put("美国", map.get("美国") + 1);
        }
        System.out.println("投票结束");
        map.forEach((k, v) -> System.out.println(k + "想去的人有" + v + "人"));
    }

    public static void vote1() {
        ArrayList<String> list = new ArrayList<>();
        Random random = new Random();
        HashMap<String, Integer> map = new HashMap<>();
        list.add("澳大利亚");
        list.add("中国");
        list.add("新西兰");
        list.add("美国");
        System.out.println("投票开始");
        for (int i = 0; i < 800; i++) {
            int index = random.nextInt(4);
            map.put(list.get(index), map.keySet().contains(list.get(index)) ? map.get(list.get(index)) + 1 : 1);
        }
        System.out.println("投票结束");
        map.forEach((k, v) -> System.out.println(k + "想去的人有" + v + "人"));
    }


    public static void option() {
        String[] places = {"北京", "上海", "广州", "深圳"};
        Map<String, Integer> map = new HashMap<>();
        Random r = new Random();
        for (int i = 0; i < 60; i++) {
            int x = r.nextInt(4);
            map.put(places[x], map.containsKey(places[x]) ? map.get(places[x]) + 1 : 1);
        }
        map.forEach((key, value) -> System.out.println(key + "：" + value + "\t人"));
    }


}


/**
 * 案例：Map集合的案例-统计投票信息
 * <p>
 * 需求：
 * 某个班级80名学生，现在需要组织秋游活动，班长提供了四个景点依次是(A、B、C、D)，
 * 每个学生只能选择一个景点，请统计出最终哪个景点想去的人数最多。
 */