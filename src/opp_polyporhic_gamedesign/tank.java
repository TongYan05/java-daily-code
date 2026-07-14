package opp_polyporhic_gamedesign;

public class tank extends  character{
    private double extraHP;
    private double extraDef;
    public tank() {
    }
    public tank(String name, double hp, double atk,double def,double speed, double extraHP,double extraDef) {
        super(name, hp, atk,def, speed);
        this.extraHP = extraHP;
        this.extraDef = extraDef;
    }

    public double getExtraHP() {
        return extraHP;
    }

    public void setExtraHP(double extraHP) {
        this.extraHP = extraHP;
    }

    public double getExtraDef() {
        return extraDef;
    }

    public void setExtraDef(double extraDef) {
        this.extraDef = extraDef;
    }



    @Override
    public double hp() {
        return getHP()+extraHP;
    }
    @Override
    public double def() {
        return getDEF()+extraDef;
    }
    @Override
    public double speed(){
        return getSpeed()*0.8;
    }

    @Override
    public void showInfo(){
        System.out.println("角色名称："+getName()+"\t生命值："+hp()+"\t攻击力："+getATK()+"\t防御力："+def()+"\t速度"+speed());
    }







}
