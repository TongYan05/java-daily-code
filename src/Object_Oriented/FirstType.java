package Object_Oriented;

public class FirstType {
    String name;
    int age;
    boolean isMale;
    static String schoolName;

    public FirstType(){System.out.println("This is a first type");}
    public FirstType(String name, int age, boolean isMale){
        this.name = name;
        this.age = age;
        this.isMale = isMale;
    }
    //static方法只能调用static变量，，而非静态方法都能调用静态变量和非静态变量，静态变量不加this.
    //public static void show(){System.out.println("Name:"+name+" Age:"+age+"  isMale:"+isMale+"  SchoolName:"+schoolName);}
    public void show(){System.out.println("Name:"+this.name+" Age:"+this.age+"  isMale:"+this.isMale+"  SchoolName:"+schoolName);}

}
