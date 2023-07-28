public class Witcher extends Hero{
    public Witcher(int health, int damage, String name) {
        super(health, damage, SuperAbility.REHEAL,name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        for (int i = 0; i <heroes.length ; i++){
            if (heroes[i].getHealth() <= 0 && !heroes[i].equals(this) ){
                heroes[i].setHealth(heroes[i].getHealth() + this.getHealth());
                System.out.println("witcher оживил героя");
                heroes[6].setHealth(0);
            }

        }
    }
}