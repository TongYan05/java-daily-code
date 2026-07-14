package practice2;

public class managerAndChef {
    private String ID;
    private String name;
    private double salary;

    public managerAndChef(){}
    public managerAndChef(String ID, String name, double salary){
        this.ID = ID;
        this.name = name;
        this.salary = salary;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setID(String ID){
        this.ID = ID;
    }
    public String getID(){
        return ID;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public double getSalary(){
        return salary;
    }


   public void work(){
       System.out.print(name + "正在工作");
   }
   public void eat(){
       System.out.print(name + "正在吃米饭");
   }


}
