package intelligent;

public class test {
    public static void main(String[] args) {

        //匿名内部类创建方法：
        //类名   变量名 = new  类名()   {重写方法}
        //接口名 变量名 = new  接口名()  {重写方法};
        Device device1=new Device("智能灯泡","LED"){
            @Override
            public void turnOn() {
                System.out.println("灯光逐渐亮起");
            }

            @Override
            public void turnOff() {
                System.out.println("灯光逐渐熄灭");
            }
        };
        Device device2=new Device("智能空调","美的"){
            @Override
            public void turnOn() {
                System.out.println("空调启动，温度设定26度");
            }

            @Override
            public void turnOff() {
                System.out.println("空调关闭");
            }
        };
        Device device3=new Device("智能扫地机器人","irobot"){
            @Override
            public void turnOn() {
                System.out.println("开始清扫全屋");
            }

            @Override
            public void turnOff() {
                System.out.println("返回充电座");
            }
        };
        Device device4=new Device("智能录音机","sony"){
            @Override
            public void turnOn() {
                System.out.println("录音机启动");
            }

            @Override
            public void turnOff() {
                System.out.println("录音机关闭");
            }
        };
        controlDevice(device1);
        controlDevice(device2);
        controlDevice(device3);
        controlDevice(device4);



    }

    public static void controlDevice(Device dev1){
        dev1.showInfo();
        dev1.turnOn();
        dev1.turnOff();
    }


}
//🎯 练习题：智能设备控制系统
//背景： 你正在开发一个智能家居系统，需要控制各种不同类型的设备。每个设备都有基本的开关功能，但不同设备的操作方式各不相同。
//要求：
//创建一个抽象类 Device（设备），包含：
//私有属性：name（设备名称）、brand（品牌）
//构造方法：无参和带参构造
//getter/setter 方法
//抽象方法：turnOn()（开机）、turnOff()（关机）
//普通方法：showInfo()（显示设备信息）
//在测试类中，使用匿名内部类创建以下设备对象：
//智能灯泡：开机显示"灯光逐渐亮起"，关机显示"灯光逐渐熄灭"
//空调：开机显示"空调启动，温度设定26度"，关机显示"空调关闭"
//扫地机器人：开机显示"开始清扫全屋"，关机显示"返回充电座"
//智能音箱：开机显示"欢迎使用，我在听"，关机显示"再见"
//创建一个方法 controlDevice(Device device)，接收设备对象并执行：
//显示设备信息
//开机
//关机
//在 main 方法中调用 controlDevice() 控制所有设备
//挑战题：创建一个设备数组，存储4个匿名内部类对象，然后遍历数组批量控制所有设备