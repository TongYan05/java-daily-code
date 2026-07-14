public interface Skillable {
    //learnSkill(String skillName) - 学习技能
    public abstract void learnSkill(String skillName);
    //useSkill(String skillName) - 使用技能
    public abstract void useSkill(String skillName);
    //showSkills() - 显示已学技能列表
    public abstract void showSkills();

}
