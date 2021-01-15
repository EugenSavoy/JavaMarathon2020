package day11.task2;

public class Shaman extends Hero implements PhysAttack, MagicAttack, Healer{

    private int health;
    private int physDef;
    private int magicDef;
    private int physAtt;
    private int magicAtt;

    public Shaman(int health, int physDef, int magicDef, int physAtt, int magicAtt) {
        this.health = health;
        this.physDef = physDef;
        this.magicDef = magicDef;
        this.physAtt = physAtt;
        this.magicAtt = magicAtt;
    }

    @Override
    public void healHimself() {
        this.health +=50;
    }

    @Override
    public void healTeammate(Hero hero) {

    }

    @Override
    public void magicalAttack(Hero hero) {

    }

    @Override
    public void physicalAttack(Hero hero) {

    }
}
