package opp_polyporhic_comprehensivePractice3;

public class programmer extends  employee{
    private String language;
    public programmer() {
    }
    public programmer(String name, String id, double baseSalary, String language) {
        super(name, id, baseSalary);
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }
    public void setLanguage(String language) {
        this.language = language;
    }


    @Override
    public double calculateSalary() {
        return getBaseSalary() + 2000;
    }

    public void whiteCode(){
        System.out.println("程序员"+getName()+"正在用"+language+"写代码");
    }



























}
