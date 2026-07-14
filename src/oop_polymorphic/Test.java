package oop_polymorphic;

public class Test {
    public static void main(String[] args) {

//        system sys1 = new system();
//        person per=new student("和菜头", "西格玛", "111111");//多态写法
//        sys1.register(per);
//        System.out.println("-----------------");
//        person per1 = new student("罗峰", "金角巨兽", "222222");
//        sys1.register(per1);
//        System.out.println("-----------------");
//        manager man = new manager("岛和王", "座山可", "333333");
//        sys1.register(man);

        system sys1 = new system();
        student stu = new student("和菜头", "西格玛", "111111");
        teacher tea = new teacher("罗峰", "金角巨兽", "222222");
        manager man = new manager("岛和王", "座山可", "333333");
        sys1.register(stu);
        sys1.register(tea);
        sys1.register(man);



    }
}
