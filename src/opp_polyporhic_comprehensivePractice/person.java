package opp_polyporhic_comprehensivePractice;

public class person {
    private String name;
    private int age;
    private String sex;

    public person() {
    }
    public person(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }


    public void drive(vehicle v){

        v.move();

        if(v instanceof bicycle){
            bicycle b=(bicycle)v;
            b.honk();
        }else if(v instanceof car){
            car c=(car)v;
            c.ringBell();
        }else System.out.println("abnormal!!!!");

        System.out.println(getName()+" is driving "+v.getBrand());






    }
















}
