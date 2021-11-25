package combat;

public class Combat {

    private String name;
    private boolean isDoped;
    private int health;

    public Combat(String name) {
        this.name = name;
        this.health = 100;
        this.isDoped = false;
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

    public boolean isDoped() {
        return isDoped;
    }

    public void setIsDopped(boolean isDoped) {
        this.isDoped = isDoped;
    }

    public void attack(Combat combat) {
        // this
        // combat
        // this.attack(combat)
        // zizou.attack(materazzi);
        // this fait référence à zizou dans le Application car c'est lui qui appelle la méthode
        int degats = (int) (Math.random() * 10);
        if (this.isDoped()) {
            degats = degats * 2;
            this.isDoped = false;
        }
        int initialCombatHealth = combat.getHealth();
        int healthAfterAttack = initialCombatHealth - degats;
        combat.setHealth(healthAfterAttack);
        System.out.println(this.getName() + " attaque méchamment " + combat.getName());
    }

    public void steroid() {
        this.isDoped = true;
    }

}
