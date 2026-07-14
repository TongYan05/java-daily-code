package graphing;

public class test {
    public static void main(String[] args) {
        shape sha1=new shape("红色",41,26){
            @Override
            public void draw() {
                System.out.println("绘制图形");
            }
            @Override
            public void calculateArea() {
                System.out.println("计算面积");
            }
        };
        shape sha2=new shape("蓝色",41,26){
            @Override
            public void draw() {
                System.out.println("绘制图形");
            }
            @Override
            public void calculateArea() {
                System.out.println("计算面积");
            }
        };
        shape sha3=new shape("绿色",41,26){
            @Override
            public void draw() {
                System.out.println("绘制图形");
            }
            @Override
            public void calculateArea() {
                System.out.println("计算面积");
            }
        };
        shape sha4=new shape("紫色",41,26){
            @Override
            public void draw() {
                System.out.println("绘制图形");
            }
            @Override
            public void calculateArea() {
                System.out.println("计算面积");
            }
        };

        showInfo(sha1);
        showInfo(sha2);
        showInfo(sha3);
        showInfo(sha4);

    }

    public static void showInfo(shape sha){
        sha.draw();
        sha.calculateArea();
        sha.showInfo();
        System.out.println("--------------------");
    }


}
