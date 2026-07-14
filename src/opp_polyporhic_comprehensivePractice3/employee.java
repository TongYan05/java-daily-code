package opp_polyporhic_comprehensivePractice3;

public class employee {
    private String name;
    private String id;
    private double baseSalary;

    public employee() {
    }
    public employee(String name, String id, double baseSalary) {
        this.name = name;
        this.id = id;
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }


    public double calculateSalary(){
        return this.baseSalary;
    }
    public void showInfo(){
        System.out.println("员工姓名："+name+"\t员工编号："+id+"\t员工工资："+calculateSalary());
    }

















}
