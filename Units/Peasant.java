package Units;

import java.util.ArrayList;

public class Peasant extends BaseHero {
    public Peasant() {
        super(String.format("Hero_Peasant #%d", ++Peasant.number));
    }

    public Peasant(String name) {
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
