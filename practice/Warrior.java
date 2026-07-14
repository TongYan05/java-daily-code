import java.net.PasswordAuthentication;

public class Warrior extends GameCharacter implements Skillable, Equipable {
    //新增属性：怒气值
    private int angry;

    public Warrior() {
    }

    ;

    public Warrior(String name, int level, double health, double magic, double attack, double defense) {
        super(name, level, health, magic, attack, defense);
        angry = 0;
    }

    public int getAngry() {
        return angry;
    }

    public void setAngry(int angry) {
        this.angry = angry;
    }

    //实现 specialAttack() - 狂暴攻击（消耗怒气，大幅提升攻击力）
    @Override
    public void specialAttack() {
        System.out.println(getName() + "使用了技能：狂暴攻击(消耗怒气20，大幅提升攻击力100)");
        this.angry = angry - 20;
        setAttack(getAttack() + 100);
        System.out.println("当前怒气：" + angry + "\t当前攻击力：" + getAttack() + "\t");
    }

    //实现 Skillable 和 Equipable 接口
    //learnSkill(String skillName) - 学习技能
    @Override
    public void learnSkill(String skillName) {

    }


    //useSkill(String skillName) - 使用技能
    @Override
    public void useSkill(String skillName) {

    }


    //showSkills() - 显示已学技能列表
    @Override
    public void showSkills() {

    }


    //equip(Equipment equipment) - 装备物品
    @Override
    public void equip(Equipment equipment) {

    }


    //unequip(String equipmentSlot) - 卸下物品
    @Override
    public void unequip(String equipmentSlot) {

    }


    //showEquippedItems() - 显示已装备物品
    @Override
    public void showEquippedItems() {

    }


}
