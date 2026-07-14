// 带有继承结构的标准JavaBean类
// 书写一个完整的继承体系，要求私有化成员变量、get/set方法、构造方法、其他的成员方法

// 本科学生：
// 属性：姓名、年龄、年级
// 行为：吃饭、睡觉、学习（攻读学士学位）

// 硕士研究生：
// 属性：姓名、年龄、年级
// 行为：吃饭、睡觉、学习（攻读硕士学位）

// 专业课老师：
// 属性：姓名、年龄、学科
// 行为：吃饭、睡觉、教书（教专业课知识）

// 通识课老师：
// 属性：姓名、年龄
// 行为：吃饭、睡觉、教书（教通识课知识）

// 过了一段时间，硕士研究生住宿条件升级，在豪华版学生公寓睡觉



package practice2Comprehensive;

public class Test {
    public static void main(String[] args) {

        undergraduate undergradient1=new undergraduate("TongYan",18,"大一");
        System.out.println(undergradient1.getName()+" "+undergradient1.getAge()+" "+undergradient1.getGrade());
        undergradient1.studying();
        undergradient1.eating();
        undergradient1.sleeping();
        System.out.println("--------------------------------------------------");
        postgraduate postgradient1=new postgraduate("死水",19,"研二");
        System.out.println(postgradient1.getName()+" "+postgradient1.getAge()+" "+postgradient1.getGrade());
        postgradient1.studying();
        postgradient1.eating();
        postgradient1.sleeping();
        System.out.println("--------------------------------------------------");
        majorTeacher majorTeacher1=new majorTeacher("带土",30,"历史");
        System.out.println(majorTeacher1.getName()+" "+majorTeacher1.getAge()+" "+majorTeacher1.getSubject());
        majorTeacher1.teaching();
        majorTeacher1.eating();
        majorTeacher1.sleeping();
        System.out.println("--------------------------------------------------");
        liberalTeacher liberalTeacher1=new liberalTeacher("琳",30);
        System.out.println(liberalTeacher1.getName()+" "+liberalTeacher1.getAge());
        liberalTeacher1.teaching();
        liberalTeacher1.eating();
        liberalTeacher1.sleeping();















    }
}
