package Units;

import java.util.ArrayList;

public class Wizard extends BaseHero {
    private int mana;
    private int maxMana;

    public Wizard(int mana, int maxMana) {
        super(String.format("Hero_Wizard #%d", ++Wizard.number));
        this.maxMana = Wizard.r.nextInt(50, 150);
        this.mana = maxMana;
    }

    public Wizard(String name, int maxMana) {
        super(name);
        this.maxMana = maxMana;
        this.mana = maxMana;
    }

    public String getInfo(){
        return String.format("%s Mana: %d", super.getInfo(), this.mana);
    }
    @Override
    public void step(ArrayList<BaseHero> team1) {
        System.out.println("Могу ходить");
    }
}
