package OOM;

import org.apache.commons.io.input.BoundedInputStream;

import javax.management.remote.JMXServiceURL;

public class Manager extends Employee{
    private double bonus;
    public Manager(){}
    public Manager(String name,double salary,String description,double bonus){
        super(name,salary,description);
        this.bonus=bonus;
    }
    @Override
    public void info(){
        System.out.println("this is manager!");
    }

//    @Override
//    public boolean equals(Object otherObject){
//        //manager可以转employee，因为高精度转低精度
//        //这步主要判断 大部分field是否相等，是否为空，class类型
//        if(!super.equals(otherObject)) return false;
//        //但是转化完成之后otherObject还是Object类,还要再转
//        Manager manager=(Manager) otherObject;
//        //比较剩下的manager类特有的field
//        return this.bonus==manager.bonus;
//    }

}
