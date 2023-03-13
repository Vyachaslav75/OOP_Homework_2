package Units;

import java.util.ArrayList;

public class Robber extends BaseHero {
    public Robber() {
        super(String.format("Hero_Robber #%d", ++Robber.number));
    }

    public Robber(String name) {
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
