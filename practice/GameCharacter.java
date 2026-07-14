import java.io.CharConversionException;

public abstract class GameCharacter {
    //属性：姓名、等级、生命值、魔法值、攻击力、防御力
    private String name;
    private int level;
    private double health;
    private double magic;
    private double attack;
    private double defense;

    //构造方法：无参、全参
    public GameCharacter() {
    }

    ;

    public GameCharacter(String name, int level, double health, double magic, double attack, double defense) {
        this.name = name;
        this.level = level;
        this.health = health;
        this.magic = magic;
        this.attack = attack;
        this.defense = defense;
    }

    //getter/setter


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public double getMagic() {
        return magic;
    }

    public void setMagic(double magic) {
        this.magic = magic;
    }

    public double getAttack() {
        return attack;
    }

    public void setAttack(double attack) {
        this.attack = attack;
    }

    public double getDefense() {
        return defense;
    }

    public void setDefense(double defense) {
        this.defense = defense;
    }

    //抽象方法：specialAttack() - 特殊攻击
    public abstract void specialAttack();

    //普通方法：
    //attack() - 普通攻击（输出攻击信息）
    public void attack(GameCharacter character) {
        System.out.println(this.name + "的攻击力：" + character.attack);
    }

    //takeDamage(int damage) - 受到伤害
    public double takeDamage(GameCharacter attacker, GameCharacter sufferer) {
        System.out.println(sufferer.name + "受到了" + attacker.name + attacker.attack + "点的攻击");
        sufferer.health = sufferer.health - attacker.attack;
        return sufferer.health;
    }

    //heal(int amount) - 恢复生命值
    public double heal(GameCharacter sufferer, int healAmount) {
        System.out.println(sufferer.name + "恢复了" + healAmount + "点生命值：");
        sufferer.health = sufferer.health + healAmount;
        return sufferer.health;
    }

    //levelUp() - 升级（提升各项属性）
    public void levelUp(GameCharacter character, int upgradeLevel) {
        double improveRate = (upgradeLevel + character.level) / character.level;
        character.level = upgradeLevel + character.level;
        character.health = character.health * improveRate;
        character.magic = character.magic * improveRate;
        character.attack = character.attack * improveRate;
        character.defense = character.defense * improveRate;
    }

}
