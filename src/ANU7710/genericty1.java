package ANU7710;

import java.util.ArrayList;
import java.util.Objects;

public class genericty1 {
    public static void main(String[] args) {

        //get to know genericity
        //no genericity
        ArrayList list1=new ArrayList();
        list1.add(1);
        list1.add("hello");
        list1.add(true);
        list1.forEach(obj-> System.out.print(obj+" "));


        //genericity
        ArrayList<Integer> list2=new ArrayList<Integer>();
        list2.add(1);
        list2.add(2);
        //list2.add('5');//错误

        list1.toString();
        //对于架构师：要会定义泛型类，泛型接口，泛型方法


    }
}
