package practice2;

public class chef extends managerAndChef{

    public chef(){
        super();
        System.out.println("chef");
    }
    public chef(String ID, String name, double salary){
        super(ID, name, salary);
    }

    public void work(){
        super.work();System.out.println("炒菜");
    }


}
