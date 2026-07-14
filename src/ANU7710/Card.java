package ANU7710;

public class Card {
//    private String size;
//    private String pattern;
//    private int num;
//    public Card() {
//    }
//    public Card(String size, String pattern, int num) {
//        this.size = size;
//        this.pattern = pattern;
//        this.num = num;
//    }
//
//    public String getSize() {
//        return size;
//    }
//
//    public void setSize(String size) {
//        this.size = size;
//    }
//
//    public String getPattern() {
//        return pattern;
//    }
//
//    public void setPattern(String pattern) {
//        this.pattern = pattern;
//    }
//    public int getNum() {
//        return num;
//    }
//    public void setNum(int num) {
//        this.num = num;
//    }
//
//    public String toString() {
//        return  size  + pattern;
//    }


    private String size;
    private String pattern;
    private int num;
    public Card() {
    }
    public Card(String size, String pattern, int num) {
        this.size = size;
        this.pattern = pattern;
        this.num = num;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }


    public String toString() {
        return  size  + pattern;


    }
    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }

}
