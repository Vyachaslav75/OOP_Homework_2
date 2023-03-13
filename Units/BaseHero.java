package Units;

import java.util.Random;

public abstract class BaseHero implements BaseInterface{
    protected static int number;
    protected static Random r;
    protected int health;
    protected int strength;
    protected int agility;
    protected int lucky;
    protected int armor;
    protected int experience;
    protected String name;
    protected int maxHP;
    static {
        BaseHero.number = 0;
        BaseHero.r = new Random();
    }

    public BaseHero(int health, int strength, int agility, int lucky,
                    int armor, int experience, String name) {
        this.health = health;
        this.strength = strength;
        this.agility = agility;
        this.lucky = lucky;
        this.armor = armor;
        this.experience = experience;
        this.name = name;
        this.maxHP = health;
    }

    public BaseHero() {
        this(BaseHero.r.nextInt(100, 200),
                BaseHero.r.nextInt(100, 200),
                BaseHero.r.nextInt(100, 200),
                BaseHero.r.nextInt(100, 200),
                BaseHero.r.nextInt(100, 200),
                0,
                String.format("Hero_ #%d", ++BaseHero.number));
    }

    public BaseHero(String name) {
        this(BaseHero.r.nextInt(100, 200),
                BaseHero.r.nextInt(100, 200),
                BaseHero.r.nextInt(100, 200),
                BaseHero.r.nextInt(100, 200),
                BaseHero.r.nextInt(100, 200),
                0,
                name);
        //this.name = name;
    }

    public String getInfo(){
        return String.format("Name: %s Hp: %d Type: %s",
                this.name, this.health, this.getClass().getSimpleName());
    }

    public void healed(int hp){
        this.health = hp + this.health > this.maxHP ? this.maxHP : hp + this.health;
    }
    public void GetDamage(int damage){
        damage /= (BaseHero.r.nextInt(this.agility) * BaseHero.r.nextInt(this.lucky));
        if (this.health - damage > 0){
            this.health -= damage;
        }
    }
    public void Attack(BaseHero target){
        int damage = (int)(this.strength*(BaseHero.r.nextInt(this.agility)*BaseHero.r.nextInt(this.lucky))/100);
        target.GetDamage(damage);
    }
}
