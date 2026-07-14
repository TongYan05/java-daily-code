package com.anu.basic;

public class GameCharacter {
    private String name;
    private int hp;
    private int attack;
    //定义空参构造方法。当用 new GameCharacter() 创建对象时会自动调用这个方法，打印"新角色已创建"。构造方法名必须和类名完全一致，没有返回值类型。
    public GameCharacter(){System.out.println("新角色已创建");}
    //定义带参构造方法。当用 new GameCharacter("亚瑟", 100, 50) 创建对象时会自动调用。
    public GameCharacter(String name, int hp, int attack){
        this.name = name;
        this.hp = hp;
        this.attack = attack;
    }

    public void setName(String name){this.name = name;}
    public String getName(){return this.name;}
    public void setHp(int hp){this.hp = hp;}
    public int getHp(){return this.hp;}
    public void setAttack(int attack){this.attack = attack;}
    public int getAttack(){return this.attack;}

    public void showInfo(){
        System.out.println("[英雄]"+this.name+"   生命"+this.hp+"   攻击"+this.attack);
    }
}
