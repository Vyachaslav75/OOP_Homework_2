package Units;

import java.util.ArrayList;

public class Spearman extends BaseHero {
    public Spearman() {
        super(String.format("Hero_Spearman #%d", ++Spearman.number));
    }

    public Spearman(String name) {
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
