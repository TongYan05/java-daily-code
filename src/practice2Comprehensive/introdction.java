package practice2Comprehensive;

public class introdction {
    private String name;
    private int age;

    public introdction(String name, int age){
        this.name=name;
        this.age=age;
    }

    public void setName(String name){this.name=name;}
    public String getName(){return name;}public void setAge(int age){this.age=age;}
    public int getAge(){return age;}

    public void eating(){System.out.println(name+"正在吃东西");}
    public void sleeping(){System.out.println(name+"正在睡觉");}
    public void studying(){System.out.print(name+"正在学习");}
    public void teaching(){System.out.print(name+"正在教书");}


}
