package task.java.seven;

public class Kata7 {
    public static String declareWinner(Fighter fighter1, Fighter fighter2,
            String firstAttacker) {

        if (firstAttacker.equals(fighter1.name)) {
            while (fighter1.health > 0 || fighter2.health > 0) {
                fighter2.health -= fighter1.damagePerAttack;
                if (fighter1.health <= 0) {
                    return fighter2.name;
                }
                fighter1.health -= fighter2.damagePerAttack;
                if (fighter2.health <= 0) {
                    return fighter1.name;
                }
            }

        } else {
            while (fighter1.health > 0 || fighter2.health > 0) {
                fighter1.health -= fighter2.damagePerAttack;
                if (fighter1.health <= 0) {
                    return fighter2.name;
                }
                fighter2.health -= fighter1.damagePerAttack;
                if (fighter2.health <= 0) {
                    return fighter1.name;
                }
            }

        }

        return "Unknown";
    }

    public static String declareWinner2(Fighter fighter1, Fighter fighter2,
            String firstAttacker) {
        Fighter a = fighter1;
        Fighter b = fighter2;

        if (firstAttacker.equals(fighter2.name)) {
            a = fighter2;
            b = fighter1;
        }

        while (true) {
            if ((b.health -= a.damagePerAttack) <= 0)
                return a.name;
            if ((a.health -= b.damagePerAttack) <= 0)
                return b.name;
        }
    }

}

class Fighter {
    public String name;
    public int health, damagePerAttack;

    public Fighter(String name, int health, int damagePerAttack) {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }
}
/*
Create a function that returns the name of the winner in a fight between two fighters.

Each fighter takes turns attacking the other and whoever kills the other first is victorious. Death is defined as having health <= 0.

Each fighter will be a Fighter object/instance. See the Fighter class below in your chosen language.

Both health and damagePerAttack (damage_per_attack for python) will be integers larger than 0. You can mutate the Fighter objects.

Example:
public class Fighter {
  public String name;
  public int health, damagePerAttack;
  public Fighter(String name, int health, int damagePerAttack) {
    this.name = name;
    this.health = health;
    this.damagePerAttack = damagePerAttack;
  }
}

 */
