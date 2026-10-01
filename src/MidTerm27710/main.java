package MidTerm27710;

import java.nio.file.FileSystemLoopException;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.TreeMap;

public class main {
    static void main(String[] args) {

        test t = new employee("yantong",5000,"anu");
        t.dog1();
        t.dog6();
        test.dog7();

        testRecord t1=new testRecord("yan tong","anu",21);
        System.out.println(t1);
        System.out.println(new testRecord("YanTong","ANU",21));
        System.out.println(t1.age()+" "+t1.name()+" "+t1.uni() + " hashcode: "+ t1.hashCode()+" "+t1.equals(new testRecord("yan tong","anu",21)));


        employee e1=new employee("YanTong",8000,"student");
        employee e2=new employee("Alberto",3000,"lecturer");
        employee e3=new employee("michael",4000,"professor");
        employee[] arr=new  employee[3];
        arr[0]=e1;
        arr[1]=e2;
        arr[2]=e3;
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));


        PriorityQueue<Integer> priorityQueue=new PriorityQueue<>((x,y)->Integer.compare(y,x));
        for (int i = 0; i < 17; i++) {
            priorityQueue.offer(i);
        }
        for (int i = 0; i < 17; i++) {
            System.out.print(priorityQueue.poll()+" ");
        }




    }
}
