package practice1;

public class test {
    public static void main(String[] args) {

        student stu1=new student("我爱罗",18,"沙影");
        System.out.println(stu1.getName()+" "+stu1.getAge()+" "+stu1.getGrade());
        teacher tea1=new teacher("罗宾",30,"历史");
        System.out.println(tea1.getName()+" "+tea1.getAge()+" "+tea1.getSubject());


    }
}
