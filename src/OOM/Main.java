package OOM;

import java.lang.invoke.SwitchPoint;
import java.util.List;

import static OOM.Employee.getSalary;
import static OOM.Employee.setSalary;

public class Main {
    static void main(String[] args) {
        Employee e1=new Employee("yan tong",10000,"software developer");
        Employee e2=new Manager("albetor",20000,"anu senior lecturer",5000);
        e1.info();
        e2.info();
        //增删改查static变量
        System.out.println(getSalary());//20000，因为全局就这一个变量，后写覆盖先写，所以是20000
        //增加
        setSalary(15000);
        //再次查询
        System.out.println(getSalary());

        //cast
//        Manager manager = (Manager) e1;//父类不能转化成子类，因为子类信息更多，这是runtimeException
//        System.out.println(manager.getDescription());
        Employee employee=(Employee) e2;
        System.out.println(employee.getDescription());

        //比较 .equals() and ==
        //此时我把manager里面的equals注释了，调用的employee里面的equals方法，不比较bonus
        Employee e3=new Manager("albetor",20000,"anu senior lecturer",6000);
        System.out.println(e2==e3);//比较identity
        System.out.println(e2.equals(e3));//比较state

        Integer x=null;
        int y=x;
        System.out.println(y);

    }
}
