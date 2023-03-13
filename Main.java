import Units.*;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        ArrayList<BaseHero> team1 = new ArrayList<>();
        ArrayList<BaseHero> team2 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            switch (new Random().nextInt(7)){
                case 0:
                    team1.add(new Peasant(getName()));
                    team2.add(new Monk(getName(), 100));
                    break;
                case 1:
                    team1.add(new Robber(getName()));
                    team2.add(new Crossbowman(getName()));
                    break;
                case 2:
                    team1.add(new Sniper(getName()));
                    team2.add(new Spearman(getName()));
                    break;
                case 3:
                    team1.add(new Wizard(getName(), 150));
                    team2.add(new Wizard(getName(), 150));
                    break;
                case 4:
                    team1.add(new Spearman(getName()));
                    team2.add(new Sniper(getName()));
                    break;
                case 5:
                    team1.add(new Crossbowman(getName()));
                    team2.add(new Robber(getName()));
                    break;
                default:
                    team1.add(new Monk(getName(), 100));
                    team2.add(new Peasant(getName()));
                    break;
            }
        }
        //System.out.println(team1);
        //System.out.println(team2);
        for (BaseHero item: team1
             ) {
            System.out.println(item.getInfo());
        }
        for (BaseHero item: team2
        ) {
            System.out.println(item.getInfo());
        }

    }
    private static String getName(){
        return  Names.values()[new Random().nextInt(Names.values().length)].toString();
    }
}