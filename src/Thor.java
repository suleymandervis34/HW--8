public class Thor extends Hero{
    public Thor(int health, int damage, String name) {
        super(health, damage, SuperAbility.STUN, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        boolean stan =RPG_Game.random.nextBoolean();
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth()>0 &&stan==true){
                boss.setDamage(0);
                System.out.println("boss stan");
            }
           else  {
               boss.setDamage(50);
            }
        }
    }
}
