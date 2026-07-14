package opp_polyporhic_comprehensivePractice2;

public class zooTest {
    public static void main(String[] args) {
//        // 使用多态创建动物数组（向上转型：父类引用指向子类对象）
//        animal animals[] = new animal[3];//表示能装3个animal父类的变量
//        animals[0] = new dog("旺财", 3);
//        animals[1] = new cat("咪咪", 2);
//        animals[2] = new bird("小鸟", 1);


        animal animals[]=new animal[3];
        animals[0]=new dog("旺财",3);
        animals[1]=new cat("咪咪",2);
        animals[2]=new bird("小鸟",1);

        for(int j=0;j<animals.length;j++){
            if(animals[j] instanceof dog){
                dog d=(dog)animals[ j];
                d.eat();
                d.speak();
                d.guardHouse();
                d.getDescription();
            }
            else if(animals[j] instanceof cat){
                cat c=(cat)animals[j];
                c.eat();
                c.speak();
                c.catchMouse();
                c.getDescription();
            }
            else if(animals[j] instanceof bird){
                bird b=(bird)animals[j];
                b.eat();
                b.speak();
                b.fly();
                b.getDescription();
            }
        }












        // 遍历数组，演示多态
        for (int i = 0; i < animals.length; i++) {
            System.out.println("=== 第" + (i + 1) + "个动物 ===");

            // 调用 getDescription 显示动物信息
            animals[i].getDescription();

            // 多态调用：运行时动态绑定到子类的重写方法
            animals[i].speak();
            animals[i].eat();

            // 使用 instanceof 判断类型，向下转型调用子类特有方法
            if (animals[i] instanceof dog) {
                dog d = (dog) animals[i];
                d.guardHouse();
            } else if (animals[i] instanceof cat) {
                cat c = (cat) animals[i];
                c.catchMouse();
            } else if (animals[i] instanceof bird) {
                bird b = (bird) animals[i];
                b.fly();
            }

            System.out.println();
        }










    }
}


//我来给你出一道Java多态的练习题，帮助你巩固多态的概念。
//题目：动物园管理系统
//背景： 设计一个简单的动物园管理系统，需要处理不同动物的行为。
//要求：
//创建父类 Animal
//属性：name（动物名称）、age（年龄）
//方法：
//构造方法
//speak() - 发出声音（默认输出"动物发出声音"）
//eat() - 吃东西（默认输出"动物在吃东西"）
//getDescription() - 返回动物的描述信息
//创建三个子类：
//a) Dog 类
//重写 speak() - 输出"汪汪汪"
//重写 eat() - 输出"狗在吃骨头"
//新增方法 guardHouse() - 输出"狗在看家"
//b) Cat 类
//重写 speak() - 输出"喵喵喵"
//重写 eat() - 输出"猫在吃鱼"
//新增方法 catchMouse() - 输出"猫在抓老鼠"
//c) Bird 类
//重写 speak() - 输出"叽叽喳喳"
//重写 eat() - 输出"鸟在吃虫子"
//新增方法 fly() - 输出"鸟在飞翔"


//创建测试类 ZooTest
//使用多态创建一个动物数组，包含狗、猫、鸟等不同动物
//遍历数组，调用每个动物的 speak() 和 eat() 方法
//        演示向上转型和向下转型
//使用 instanceof 判断动物类型，并调用各自特有的方法
//考察点：
//         方法重写（Override）
//         向上转型（父类引用指向子类对象）
//         动态绑定（运行时多态）
//         向下转型和 instanceof 的使用
// 多态数组的使用