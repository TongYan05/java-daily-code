package graphing;

public abstract class shape {
    private String color;
    private int x;
    private int y;
    public shape() {
    }
    public shape(String color, int x, int y) {
        this.color = color;
        this.x = x;
        this.y = y;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public abstract void draw();
    public abstract void calculateArea();
    public void showInfo(){
        System.out.println("颜色："+color+"，坐标：("+x+","+y+")");
    }



}
