package abstract_practice1;

public class test {
    public static void main(String[] args) {

        pet p[]=new pet[2];
        p[0]=new dog("旺财","白色");
        p[1]=new cat("傻鸟","黑色");
        for(int i=0;i<p.length;i++){
            System.out.println("========第"+(i+1)+"只动物========");
            if(p[i] instanceof dog){
                dog d=(dog)p[i];
                d.eat();
                d.drink();
                d.behaviour();
            }else if(p[i] instanceof cat){
                cat c=(cat)p[i];
                c.eat();
                c.drink();
                c.behaviour();
            }
        }
























    }
}
