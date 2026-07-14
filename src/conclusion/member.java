package conclusion;

public abstract class member {
    private String name;
    private int age;
    private int VIPnumber;
    private double balance;
    private int borrowednumber=0;
    public member(){};
    public member(String name,int age,int VIPnumber,double balance,int borrowednumber){
        this.name=name;
        this.age=age;
        this.VIPnumber=VIPnumber;
        this.balance=balance;
        this.borrowednumber=borrowednumber;
    };

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

    public int getVIPnumber() {
        return VIPnumber;
    }

    public void setVIPnumber(int VIPnumber) {
        this.VIPnumber = VIPnumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getBorrowednumber() {
        return borrowednumber;
    }
    public void setBorrowednumber(int borrowednumber) {
        this.borrowednumber = borrowednumber;
    }


    public abstract void showInfo();


    public double balance(double input){
        balance=balance+input;
        return balance;
    }




}


