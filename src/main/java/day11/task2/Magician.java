package day11.task2;

public class Magician extends Hero implements PhysAttack, MagicAttack{

    private int health;
    private int physDef;
    private int magicDef;
    private int physAtt;
    private int magicAtt;

    public Magician(int health, int physDef, int magicDef, int physAtt, int magicAtt) {
        this.health = health;
        this.physDef = physDef;
        this.magicDef = magicDef;
        this.physAtt = physAtt;
        this.magicAtt = magicAtt;
    }

    @Override
    public void physicalAttack(Hero hero) {

    }

    @Override
    public void magicalAttack(Hero hero) {

    }
}
