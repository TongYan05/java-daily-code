package practice2;

public class Test {
    public static void main(String[] args) {

        manager man1=new manager();
        manager man2=new manager("202211442424","童颜",12000,3000);
        System.out.println(man2.getName()+" "+man2.getSalary()+" "+man2.getBonus()+" "+man2.getID());
        man2.eat();
        System.out.println();
        man2.work();

        chef che1=new chef();
        chef che2=new chef("202211442422","顺德",8000);
        System.out.println(che2.getName()+" "+che2.getSalary()+" "+che2.getID());
        che2.eat();
        System.out.println();
        che2.work();














    }
}
