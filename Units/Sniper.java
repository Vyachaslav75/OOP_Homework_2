package Units;

import java.util.ArrayList;

public class Sniper extends BaseHero {
    public Sniper() {
        super(String.format("Hero_Sniper #%d", ++Sniper.number));
    }

    public Sniper(String name) {
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
