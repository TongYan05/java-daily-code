package ANU7710;

import com.sun.jdi.Value;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

public class review {
    public static void main(String[] args) throws IOException {


//        Random r=new Random();
//
//        List<Integer> arr1=new ArrayList<>();
//        int[] list={1558, 237, 9743, 9443, 6377, 2804, 7567, 4263, 3174, 1340, 5540, 8222, 4565, 7971, 5893, 4749, 1732, 660, 9502, 8914};
//        for(int i=0;i<list.length;i++){
//            arr1.add(list[i]);
//        }
//        System.out.println(arr1.contains(5555)+" "+arr1.size()+" "+!arr1.isEmpty()+" "+arr1.isEmpty());
//        arr1.remove(list.length-1);
//        arr1.add(5555);
//        arr1.add(5555);
//        arr1.add(5555);
////        arr1.clear();
//        arr1.set(0,999999);
//        arr1.add(3,2005);
//        System.out.println(arr1+" "+arr1.size()+" "+arr1.get(0));
//
//
//        Iterator< Integer> it=arr1.iterator();
//        while (it.hasNext()){
//            System.out.print(it.next()+" ");
//        }
//        System.out.println();
//        for(Integer a:arr1){
//            System.out.print(a+" ");
//        }
//        System.out.println();
//        arr1.forEach(a-> System.out.print(a+" "));


        Map<Collection3_employee, Integer> map = new HashMap<>();
        Collection3_employee emp = new Collection3_employee("小王", 2700);
        Collection3_employee emp1 = new Collection3_employee("小歌", 2700);
        Collection3_employee emp2 = new Collection3_employee("小红", 5700);
        Collection3_employee emp22 = new Collection3_employee("小红", 5700);
        Collection3_employee emp222 = new Collection3_employee("小红", 5700);
        Collection3_employee emp3 = new Collection3_employee("小顺", 5700);
        Collection3_employee emp4 = new Collection3_employee("小紫", 3700);
        Collection3_employee emp44 = new Collection3_employee("小紫", 3700);
        Collection3_employee emp444 = new Collection3_employee("小紫", 3700);
        Collection3_employee emp5 = new Collection3_employee("小花", 3700);
        Collection3_employee emp6 = new Collection3_employee("小军", 3400);
        Collection3_employee emp7 = new Collection3_employee("小弧", 3400);
        Collection3_employee emp8 = new Collection3_employee("小敏", 8300);
        map.put(emp, 1);
        map.put(emp1, 2);
        map.put(emp2, 3);
        map.put(emp22, 4);
        map.put(emp222, 5);
        map.put(emp3, 6);
        map.put(emp4, 7);
        map.put(emp44, 8);
        map.put(emp444, 9);
        map.put(emp5, 10);
        map.put(emp6, 11);
        map.put(emp7, 12);
        map.put(emp8, 13);
        System.out.println(map);
        System.out.println(!map.containsKey(emp) + " " + map.containsValue(13) + " " + map.size() + " " + map.isEmpty());
        //remove() 方法返回的是被删除元素对应的 value（值）
        System.out.println(map.remove(emp444) + " " + map.get(emp7));
        Set<Collection3_employee> emp_arr = map.keySet();
        System.out.println("获取全部键的集合" + emp_arr);
        System.out.println(map);

        map.forEach((key, Value) -> System.out.println(key + " id:" + Value));


        System.out.println("====================================================================================");
        Object[] arr = emp_arr.toArray();
        ArrayList<Integer> arr2 = new ArrayList<>();
        for (int i = 0; i < map.size(); i++) {
            arr2.add(map.get(arr[i]));
            System.out.println("id:" + arr2.get(i));
        }
        System.out.println(arr2);


        System.out.println("=============================file=======================================");
        File f = new File("C:\\Users\\33265\\Desktop\\writing\\outputStream.docx");
        System.out.println(f.exists() + " " + f.isFile() + " " + f.isDirectory() + " " + f.length() + " " + f.getName() + " " + f.getAbsolutePath() + " " + f.getParent() + " " + f.canRead() + " " + f.canWrite() + " " + f.canExecute() + " " + f.isHidden() + " " + f.lastModified());
        long timestamp = f.lastModified();
        Date date = new Date(timestamp);
        System.out.println(date);//能说出星期几
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(timestamp));//能输出时分秒


        //创建文件
        File f1 = new File("C:\\Users\\33265\\Desktop\\writing\\phrasa\\短语");
        System.out.println(f1.mkdirs());
        File f2 = new File("C:\\Users\\33265\\Desktop\\writing\\phrasa\\短语\\phrasa.docx");
        System.out.println(f2.createNewFile());


        System.out.println("========================================file=================================================");
        choice();
        search_file("短句翻译.docx",new File("C:\\"));//文件名必须带后缀
    }


    public static void choice() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Toronto");
        list.add("Canberra");
        list.add("Roma");
        list.add("Washington");
        list.add("Tokyo");
        int people_number = 100;
        Random r = new Random();
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < people_number; i++) {
            int index = r.nextInt(list.size());
            if (!map.containsKey(list.get(index))) {
                map.put(list.get(index), 1);
            } else {
                map.put(list.get(index), map.get(list.get(index)) + 1);
            }
        }
        System.out.println(map);
    }


    public static void search_file(String file_name,File file) {
        File[] files = file.listFiles();
        if (files == null) {
            return;
        }
        for (File f1 : files) {
            if (f1.isFile() && f1.getName().equals(file_name)) {
                System.out.println(file_name + "的位置：" + f1.getAbsolutePath());
                return;
            } else if (f1.isDirectory()) {
                search_file(file_name,f1);
            }
            else {
                continue;
            }
        }
    }


}
