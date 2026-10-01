package MidTerm27710;

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
    }
}
