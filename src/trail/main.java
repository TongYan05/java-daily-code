package trail;

public class main {
    public static void main(String[] args) {
        BankAccount client1=new BankAccount();
        client1.setAccountName("TongYan");
        client1.setBalance(1000);
        client1.setPassword("654321");
        System.out.println("账户名称是："+client1.getAccountName());
        System.out.println("账户余额是："+client1.getBalance());
        System.out.println("密码是："+client1.getPassword());
        client1.deposit(500);
        client1.withdraw(200);
    }
}
