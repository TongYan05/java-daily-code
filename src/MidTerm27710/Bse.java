package MidTerm27710;

class Base {
    public Base() {
        show();    // ⚠️ 父类构造器里调用方法
    }
    public void show() {
        System.out.println("Base.show()");
    }
}

class Derived extends Base {
    private int value = 10;   // 显式初始化

    @Override
    public void show() {
        System.out.println("Derived.show(), value = " + value);
    }
}

public class Bse {
    public static void main(String[] args) {
        Derived d = new Derived();
        d.show();
    }
}
