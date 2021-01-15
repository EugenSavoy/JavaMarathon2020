package day11.task2;

public class Warrior extends Hero implements PhysAttack{

    private int health;
    private int physDef;
    private int magicDef;
    private int physAtt;

    public Warrior(int health, int physDef, int magicDef, int physAtt) {
        this.health = health;
        this.physDef = physDef;
        this.magicDef = magicDef;
        this.physAtt = physAtt;
    }

    @Override
    public void physicalAttack(Hero hero) {

    }
}
