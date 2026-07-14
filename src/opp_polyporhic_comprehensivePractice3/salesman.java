package opp_polyporhic_comprehensivePractice3;

public class salesman extends  employee{
    private double salesAmount;
    public salesman() {
    }
    public salesman(String name, String id, double baseSalary, double salesAmount) {
        super(name, id, baseSalary);
        this.salesAmount = salesAmount;
    }

    public double getSalesAmount() {
        return salesAmount;
    }
    public void setSalesAmount(double salesAmount) {
        this.salesAmount = salesAmount;
    }


    @Override
    public double calculateSalary() {
        return getBaseSalary()+salesAmount*0.05;
    }

    public  void sellProduct(){
        System.out.println("销售员"+getName()+"正在销售产品");
    }


















}
