package interface1;

public class test {
    public static void main(String[] args) {


        animal a[]=new animal[3];
        a[0]=new dog("大熊","黑色");
        a[1]=new rabbit("麦麦","白色");
        a[2]=new frog("大傻","绿色");
        for(int i=0;i<a.length;i++){
            System.out.println("==========第"+(i+1)+"只动物==========");
            if(a[i] instanceof dog){
                dog d=(dog)a[i];
                d.eat();d.swim();
            }else if(a[i] instanceof rabbit){
                rabbit r=(rabbit)a[i];
                r.eat();
            }else if(a[i] instanceof frog){
                frog f=(frog)a[i];
                f.eat();f.swim();
            }
        }






    }
}
