package day11.task2;

public class Paladin extends Hero implements PhysAttack, Healer{

    private int health;
    private int physDef;
    private int magicDef;
    private int physAtt;

    public Paladin(int health, int physDef, int magicDef, int physAtt) {
        this.health = health;
        this.physDef = physDef;
        this.magicDef = magicDef;
        this.physAtt = physAtt;
    }

    @Override
    public void physicalAttack(Hero hero) {

    }

    @Override
    public void healHimself() {
        this.health += 25;
    }

    @Override
    public void healTeammate(Hero hero) {

    }
}
