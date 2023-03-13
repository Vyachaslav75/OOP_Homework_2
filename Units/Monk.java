package Units;

import java.util.ArrayList;

public class Monk extends BaseHero {
    private int mana;
    private int manaMax;

    public Monk(int mana, int manaMax) {
        super(String.format("Hero_Monk #%d", ++Monk.number));
        this.mana = manaMax;
        this.manaMax = Monk.r.nextInt(100, 200);
    }

    public Monk(String name, int manaMax) {
        super(name);
        this.manaMax = manaMax;
        this.mana = manaMax;
    }

    public String getInfo(){
        return String.format("%s Mana: %d", super.getInfo(), this.mana);
    }
    @Override
    public void step(ArrayList<BaseHero> team1) {
        System.out.println("Могу ходить");
    }
}
