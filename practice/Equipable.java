public interface Equipable {
    //equip(Equipment equipment) - 装备物品
    public abstract void equip(Equipment equipment);
    //unequip(String equipmentSlot) - 卸下物品
    public abstract void unequip(String equipmentSlot);
    //showEquippedItems() - 显示已装备物品
    public abstract void showEquippedItems();
}
