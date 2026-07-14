package opp_polyporhic_gamedesign;

public class Assassin extends  character{

    private double extraDamage;

    public Assassin(){
    }
    public Assassin(String name, double hp, double atk, double def,double speed, double extraDamage){
        super(name, hp, atk, def,speed);
        this.extraDamage = extraDamage;
    }

    public void setExtraDamage(double extraDamage){
        this.extraDamage = extraDamage;
    }
    public double getExtraDamage(){
        return extraDamage;
    }



    @Override
    public double attack(){
        return getATK() + extraDamage;
    }
    @Override
    public double speed(){
        return getSpeed()*1.05;
    }

    @Override
    public void showInfo(){
        System.out.println("角色名称："+getName()+"\t生命值："+getHP()+"\t攻击力："+attack()+"\t防御力："+getDEF()+"\t速度:"+speed());
    }










}
