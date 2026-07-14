//题目：银行账户管理系统
//需求描述：
//创建一个 BankAccount 类，表示银行账户。
//属性：账户名 (accountName)账户余额 (balance)(password)
//行为：存款 (deposit) 取款 (withdraw) 查询余额 (checkBalance) 修改密码 (changePassword)
//要求1：封装属性,所有属性必须用 private 修饰,提供对应的 getter 和 setter 方法
//要求2：数据验证:setBalance：余额不能为负数，如果传入负数，打印 "余额不能为负数" 并不赋值.
// setPassword：密码长度必须在 6-12 位之间，否则打印 "密码长度必须在6-12位之间"
//要求3：业务逻辑
//deposit(double amount)：存款金额必须 > 0，否则打印 "存款金额必须大于0"
//withdraw(double amount)：取款金额必须 > 0，否则打印 "取款金额必须大于0"
//取款金额不能超过余额，否则打印 "余额不足",取款成功打印 "取款成功，当前余额：XXX"
//要求4：场景测试 在 main 方法中创建账户并完成以下操作：
//创建账户：张三，初始余额 1000，密码 "123456"
//存款 500
//取款 200
//取款 2000（测试余额不足）
//修改密码为 "654321"
//查询最终余额
//预期输出：

package trail;
public class BankAccount {
    private String accountName;
    private double balance;
    private String password;
    public void setAccountName(String value){accountName=value;}
    public String getAccountName(){return accountName;}
    public void setBalance(double value){
        if(value<0){System.out.println("余额不能为负数");}
        else balance=value;//value是局部变量，balance是成员变量
    }
    public double getBalance(){return balance;}
    public void setPassword(String password){
        if(password.length()<6||password.length()>12) System.out.println("密码长度必须在6-12位之间");
        else this.password=password;//this.password是成员变量，password是局部变量
    }
    public String getPassword(){return this.password;}
    public void deposit(double amount){
        if(amount>0) balance+=amount;
        else System.out.println("存款金额必须大于0");
    }
    public void withdraw(double amount){
        if(amount>0){
            if(amount>balance) System.out.println("余额不足");
            else{
                balance-=amount;
                System.out.println("取款成功，当前余额："+balance);
            }
        }
        else System.out.println("取款金额必须大于0");
    }
}
