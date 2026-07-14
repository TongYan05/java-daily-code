package opp_polyporhic_comprehensivePractice3;

public class test {
    public static void main(String[] args) {



        employee emp[]=new employee[4];
        emp[0]=new manager("TongYan","111111",50000,15000);
        emp[1]=new salesman("MING","222222",20000,5000);
        emp[2]=new salesman("GAO","333333",3000,2500);
        emp[3]=new programmer("XUN","444444",10000,"java");


        double totalSalary=0;
        for (int i = 0; i < emp.length; i++) {
            if(emp[i] instanceof manager){
                manager man=(manager)emp[ i];
                man.calculateSalary();
                totalSalary+=man.calculateSalary();
                man.manageTeam();
                man.showInfo();
            }else if(emp[i] instanceof programmer){
                programmer prog=(programmer)emp[ i];
                prog.calculateSalary();
                prog.whiteCode();
                totalSalary+=prog.calculateSalary();
                prog.showInfo();
            }else if(emp[i] instanceof salesman){
                salesman sale=(salesman)emp[ i];
                sale.calculateSalary();
                sale.sellProduct();
                totalSalary+=sale.calculateSalary();
                sale.showInfo();
            }
        }
        System.out.println("所有员工的总薪资为："+totalSalary);




    }
}
//多态综合练习题：员工薪资管理系统
//        背景
//设计一个公司的员工薪资管理系统，不同类型的员工有不同的薪资计算方式和特殊行为。
//要求
//1. 创建父类 Employee（员工类）
//属性：
//name（姓名，String）
//id（工号，String）
//baseSalary（基本工资，double）
//方法：
//构造方法
//calculateSalary() - 计算月薪（默认返回基本工资）
//showInfo() - 显示员工基本信息
//getter/setter 方法
//2. 创建三个子类：
//a) Manager（经理类）
//新增属性：bonus（奖金，double）
//重写 calculateSalary() - 返回基本工资 + 奖金
//新增方法 manageTeam() - 输出 "经理 [姓名] 正在管理团队"
//b) Programmer（程序员类）
//新增属性：language（编程语言，String）
//重写 calculateSalary() - 返回基本工资 + 项目补贴（固定2000元）
//新增方法 writeCode() - 输出 "程序员 [姓名] 正在用 [语言] 写代码"
//c) Salesman（销售员类）
//新增属性：salesAmount（销售额，double）
//重写 calculateSalary() - 返回基本工资 + 提成（销售额的5%）
//新增方法 sellProduct() - 输出 "销售员 [姓名] 正在销售产品"
//        3. 创建测试类 test
//使用多态创建一个员工数组，包含经理、程序员、销售员等不同类型员工（至少4个）
//遍历数组，调用每个员工的 showInfo() 和 calculateSalary() 方法
//        计算并输出所有员工的总薪资
//使用 instanceof 判断员工类型，向下转型后调用各自特有的方法（manageTeam()、writeCode()、sellProduct()）
//考察点
//方法重写（Override）
//向上转型（父类引用指向子类对象）
//动态绑定（运行时多态）
//向下转型和 instanceof 的使用
//        多态数组的遍历和处理
//
//这道题和你之前做过的动物园、车辆系统类似，但薪资计算逻辑更贴近实际场景。加油！写完需要验证的话随时找我。