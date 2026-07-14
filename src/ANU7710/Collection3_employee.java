package ANU7710;

import java.util.Objects;

public class Collection3_employee implements Comparable<Collection3_employee> {


    private String name;
    private double salary;

    public Collection3_employee() {
    }

    public Collection3_employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString() {
        return "姓名：" + getName() + " " + "工资：" + getSalary() ;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Collection3_employee that = (Collection3_employee) o;
        return Double.compare(salary, that.salary) == 0 && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary);
    }

//alt+enter重写，然后制定规则
    //规定：如果左边大于右边，返回1
    //规定：如果左边小于右边，返回-1
    //规定：如果两边相等，返回0
    //默认升序



    //compareTo 就是在做这件事：
    //当你执行 set4.add(emp2) 时，TreeSet 会把 emp2 作为参数 o，传给树里已经存在的某个节点（即 this）。
    //this.salary 就是树上已有的那个员工的工资。
    //o.getSalary() 就是你想新加进去的那个员工的工资。
    //通过这两者的对比，TreeSet 就知道该把新员工放在左边还是右边了。

//    TreeSet 本身不懂工资（salary）是什么，它只懂数字的正负。
//    当你返回正数时： 你是在告诉 TreeSet：“在我的规则里，老员工 (this) 比 新员工 (o) 大（或者应该排在后面）。”
//    TreeSet 收到判决：好，既然 a 大，那 a 就去右边站着。
//    当你返回负数时： 你是在告诉 TreeSet：“在我的规则里，老员工 (this) 比 新员工 (o) 小（或者应该排在前面）。”
//    TreeSet 收到判决：好，既然 a 小，那 a 就去左边站着。

    //Java 官方定义： compare(a, b) 返回负数，意味着 a 小于 b。在二叉排序树中，小的放左边，大的放右边。    @Override
    public int compareTo(Collection3_employee o) {
        if (this.salary > o.getSalary()) return 10000000;//✳✳✳✳✳成员变量大就返回正数：成员变量小就返回负数✳✳✳✳
        else if (this.salary < o.getSalary()) return -48746589;
        else return 1;//return 0会去重，但是只根据salary去重
    }


//    // ... existing code ...
//    @Override
//    public int compareTo(Collection3_employee o) {
//        // 1. 先比较工资
//        // Double.compare(a, b)：这是 Java 专门用来比大小的工具。
//        //如果 a > b，返回 1。
//        //如果 a < b，返回 -1。
//        //如果 a == b，返回 0。
//        int result = Double.compare(this.salary, o.getSalary());
//
//        // 2. 关键步骤：如果工资一样（result == 0），再比较姓名
//        //this.name.compareTo(...)：字符串也有比大小的方法。它会按字母顺序（Unicode 编码）比较。
//        //比如 "Hong" 和 "Zi" 比，"Hong" 排在前面，返回负数。
//        if (result == 0) {
//            return this.name.compareTo(o.getName());
//        }
//
//        return result;
//    }
//// ... existing code ...





}








