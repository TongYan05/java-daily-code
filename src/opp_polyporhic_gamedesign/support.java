package opp_polyporhic_gamedesign;

public class support extends  character{
    private double Recovery;







    public support() {
    }
    public support(String name, double hp, double atk, double def,double speed,double  recovery) {
        super(name, hp, atk, def,speed);
        Recovery = recovery;
    }


    public double getRecovery() {
        return Recovery;
    }

    public void setRecovery(double recovery) {
        Recovery = recovery;
    }



    @Override
    public  double speed(){
        return getSpeed()*1.1;
    }
    @Override
    public double hp() {
        return getHP()+getRecovery();
    }

    @Override
    public void showInfo() {
        System.out.println("角色名称："+getName()+"\t生命值："+hp()+"\t攻击力："+getATK()+"\t防御力："+getDEF()+"\t速度："+speed()+"\t恢复力："+getRecovery());
    }







}
