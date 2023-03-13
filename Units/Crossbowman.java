package Units;

import java.util.ArrayList;

public class Crossbowman extends BaseHero {
    public Crossbowman() {
        super(String.format("Hero_Crossbowman #%d", ++Crossbowman.number));
    }

    public Crossbowman(String name) {
        super(name);
    }

    public String getInfo(){
        return String.format("%s ", super.getInfo());
    }

    @Override
    public void step(ArrayList<BaseHero> team1) {
        System.out.println("Могу ходить");
    }
}
