package lab2;

public class Fighter {
    private String name;
    private int health;
    private  int damagePerAttack;
    static int numbersOfFighters = 0;

    public static int getNumbersOfFighters() {
        return numbersOfFighters;
    }

    public static void setNumbersOfFighters(int numbersOfFighters) {
        Fighter.numbersOfFighters = numbersOfFighters;
    }

    public Fighter(String name, int health , int damagePerAttack){
        this.name=name;
        this.health=health;
        this.damagePerAttack=damagePerAttack;
        numbersOfFighters++;
    }
    public void attack(Fighter opponent){
        opponent.health-=this.damagePerAttack;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamagePerAttack() {
        return damagePerAttack;
    }

    public void setDamagePerAttack(int damagePerAttack) {
        this.damagePerAttack = damagePerAttack;
    }
    public  String toString(){
        return name + " " + health + " " + damagePerAttack;
    }
}
