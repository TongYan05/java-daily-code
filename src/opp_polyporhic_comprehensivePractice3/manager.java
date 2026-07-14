package opp_polyporhic_comprehensivePractice3;

public class manager extends  employee {
    private double bonus;

    public manager() {
    }
    public manager(String name, String id, double baseSalary, double bonus) {
        super(name, id, baseSalary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }


    @Override
    public double calculateSalary(){
        return getBaseSalary()+ bonus;
    }

    public void manageTeam() {
        System.out.println("经理"+getName()+"正在管理团队");
    }










}
