package boxing_game;

public class fighter {
   
        String name;
        int health;
        int weight;
        int damage;
        int dodge;
        double luck;
    
        fighter(String name, int damage, int health, int weight, int dodge) {
            this.name = name;
            this.health = health;
            this.weight = weight;
            this.damage = damage;
            this.dodge = dodge;
            //this.luck = luck;
    
            if (dodge >= 0 && dodge <= 100) {
                this.dodge = dodge;
            } else {
                this.dodge = 0;
            }
        }
    
        int hit(fighter foe) {
            System.out.println(this.name + " => " + foe.name + " " + this.damage + " hasar vurdu.");
    
            if (foe.isDodge()) {
                System.out.println(foe.name + " gelen hasarı blokladı!");
                System.out.println("-----------------------");
    
                return foe.health;
            }
    
            if (foe.health - this.damage <= 0) {
                return 0;
            }
            return foe.health - this.damage;
        }
    
        boolean isDodge() {
            double randomNumber = Math.random() * 100;
            return randomNumber <= this.dodge;
        }
    }

