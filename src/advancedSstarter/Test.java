package advancedSstarter;

public class Test {
    public static void main(String[] args) {
//        //继承，多态，抽象类，接口，内部类
//        // extends+父类名称
////🎓 学生 (Student)
////        属性：姓名、年龄、年级
////        行为：吃饭、学习
////👨‍ 老师 (Teacher)
////        属性：姓名、年龄、学科
////        行为：吃饭、教书
//        student stu1 = new student();
//        stu1.setName("张三");
//        stu1.setAge(18);
//        stu1.setGrade("大一");
//        System.out.println(stu1.getName() + " " + stu1.getAge() + " " + stu1.getGrade());
//        stu1.eating();
//        stu1.studying();
//
//        teacher tea1 = new teacher();
//        tea1.setName("王五");
//        tea1.setAge(30);
//        tea1.setSubject("历史");
//        System.out.println(tea1.getName() + " " + tea1.getAge() + " " + tea1.getSubject());
//        tea1.eating();
//        tea1.teaching();

////        题目要求： 现在有三个电子设备，请设计他们的继承结构
////        1. 安卓手机
////        属性： 品牌，价格，
////        行为： 打电话，发短信，nfc功能
////        2. 苹果手机
////        属性： 品牌，价格
////        行为： 打电话，发短信
////        3. 笔记本电脑
////        属性： 品牌，价格
////        行为： 编程
//        applePhone ap1 = new applePhone();
//        ap1.setBrand("苹果");
//        ap1.setPrice(9999.99);
//        System.out.println(ap1.getBrand() + " " + ap1.getPrice()+"dollar");
//        ap1.calling();
//        ap1.sendMessage();
//
//        Android a1 = new Android();
//        a1.setBrand("安卓");
//        a1.setPrice(5999.99);
//        System.out.println(a1.getBrand() + " " + a1.getPrice()+"dollar");
//        a1.nfc();
//        a1.calling();
//        a1.sendMessage();
//
//        laptop l1 = new laptop();
//        l1.setBrand("联想");
//        l1.setPrice(17999.99);
//        System.out.println(l1.getBrand() + " " + l1.getPrice()+"dollar");
//        l1.coding();


//        //阿伟老师的super用法
//        class Fu {
//            String name = "Fu";
//            String address = "南京";
//        }
//
//        class Zi extends Fu {
//            String name = "Zi";
//
//            public void ziShow() {
//                // 要求：输出结果为Zi，下面的代码如何书写？
//                System.out.println(name);
//                System.out.println(this.name);
//
//                // 要求：输出结果为Fu，下面的代码如何书写？
//                System.out.println(super.name);
//
//                // 要求：输出结果为南京，下面的代码如何书写？
//                System.out.println(address); // 南京
//                System.out.println(this.address); // 南京
//                System.out.println(super.address); // 南京
//            }
//        }

//        //方法的重写
//        firstGenerationPhone phone1=new firstGenerationPhone();
//        phone1.calling();
//        System.out.println();
//        secondGenerationPhone phone2=new secondGenerationPhone();
//        phone2.calling();
//        phone2.sendMessage();
//        System.out.println();
//        thirdGenerationPhone phone3=new thirdGenerationPhone();
//        phone3.calling();
//        phone3.sendMessage();
//        phone3.playGame();
//        System.out.println();


//        //方法重写的练习（计算商品价格）
//        //
//        //某电商项目售卖智能设备，智能设备包括：手机，笔记本电脑，平板
//        //1，所有的智能设备有以下属性：商品名，商品价格
//        //行为：计算商品价格：
//        //    [ 0 ~ 1000 ）元，不打折
//        //    [ 1000 ~ 5000 ）元，9折
//        //    [ 5000 ~ 10000 ）元，8折
//        //    超出10000 元，7折
//        //2，手机享受额外补贴，在原有的基础上基础打9折。
//        //3，笔记本电脑和平板电脑没有不享受额外补贴。
//        notebookPriceCalculation notebook = new notebookPriceCalculation("笔记本电脑", 20000);
//        System.out.println(notebook.getGoodsName() + "的原本价格是：" + notebook.getGoodsPrice() + "打折后是：" + notebook.calculatedPrice(notebook.getGoodsPrice()));
//        System.out.println();
//        laptopPriceCalculation laptop = new laptopPriceCalculation("平板电脑", 10000);
//        System.out.println(laptop.getGoodsName() + "的原本价格是：" + laptop.getGoodsPrice() + "打折后是：" + laptop.calculatedPrice(laptop.getGoodsPrice()));
//        System.out.println();
//        phonePriceCalculation explantion = new phonePriceCalculation();
//        phonePriceCalculation phone = new phonePriceCalculation("手机", 5000);
//        System.out.println(phone.getGoodsName() + "的原本价格是：" + phone.getGoodsPrice() + "打折后是：" + phone.calculatedPrice(phone.getGoodsPrice()));
// ... existing code ...



// 方法重写注意事项和要求：
// 1. 重写方法的名称、形参列表必须与父类中的一致，方法体按照实际需求书写。
// 2. 了解：子类重写父类方法时，访问权限子类必须大于等于父类（空着不写 < protected < public）
// 3. 了解：子类重写父类方法时，返回值类型子类必须小于等于父类
// 4. 建议：重写的方法声明和父类保持一致即可
// 5. final修饰类为最终类，里面所有的方法不能被重写，final修饰方法为最终方法，不能被重写，final修饰的类不能被继承
// 6. private私有方法、static静态方法、final最终方法不能被重写

















   }
 }
