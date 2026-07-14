package practice2;

public class manager extends managerAndChef {
    private double bonus;

    public manager() {
        super();
        System.out.println("manager");
    }
    public manager(String ID, String name, double salary, double bonus) {
        super(ID, name, salary);
        this.bonus = bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public double getBonus() {
        return bonus;
    }

    public void work() {
        super.work();System.out.println("管理其他人");
    }


}
