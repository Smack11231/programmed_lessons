import java.util.Random;
public class Character {
    private String name;
    private String type;
    private int strength,toughness,intelligence,magic,influence;
    Random rand = new Random();
    private static int knightCount = 0, peasantCount = 0, clericCount = 0, mageCount = 0, courtierCount = 0;

    public Character(String type) {
        this.type = type;
        if (type.equals("knight")) {
            this.strength = rand.nextInt(4) + 7;
            this.toughness = rand.nextInt(6);
            this.intelligence = rand.nextInt(6);
            this.magic = rand.nextInt(6);
            this.influence = rand.nextInt(6);
            knightCount++;
            int sum = strength + toughness + intelligence + magic + influence;
            while (sum > 28 || sum < 8) {
                reroll();
            }
        } else if (type.equals("peasant")) {
            this.strength = rand.nextInt(6);
            this.toughness = rand.nextInt(4) + 7;
            this.intelligence = rand.nextInt(6);
            this.magic = rand.nextInt(6);
            this.influence = rand.nextInt(6);
            peasantCount++;
            int sum = strength + toughness + intelligence + magic + influence;
            while (sum > 28 || sum < 8) {
                reroll();
            }
        } else if (type.equals("cleric")) {
            this.strength = rand.nextInt(6);
            this.toughness = rand.nextInt(6);
            this.intelligence = rand.nextInt(4) + 7;
            this.magic = rand.nextInt(6);
            this.influence = rand.nextInt(6);
            clericCount++;
            int sum = strength + toughness + intelligence + magic + influence;
            while (sum > 28 || sum < 8) {
                reroll();
            }
        } else if (type.equals("mage")) {
            this.strength = rand.nextInt(6);
            this.toughness = rand.nextInt(6);
            this.intelligence = rand.nextInt(6);
            this.magic = rand.nextInt(4) + 7;
            this.influence = rand.nextInt(6);
            mageCount++;
            int sum = strength + toughness + intelligence + magic + influence;
            while (sum > 28 || sum < 8) {
                reroll();
            }
        } else if (type.equals("courtier")) {
            this.strength = rand.nextInt(6);
            this.toughness = rand.nextInt(6);
            this.intelligence = rand.nextInt(6);
            this.magic = rand.nextInt(6);
            this.influence = rand.nextInt(4) + 7;
            courtierCount++;
            int sum = strength + toughness + intelligence + magic + influence;
            while (sum > 28 || sum < 8) {
                reroll();
            }
        }
    }

    public void setName(String name){
        this.name = name;
    }

    public void setType(String tope) {
        if (type.equals("knight")) {
            knightCount --;
        } else if (type.equals("peasant")) {
            peasantCount --;
        } else if (type.equals("cleric")) {
            clericCount --;
        } else if (type.equals("mage")) {
            mageCount --;
        } else if (type.equals("courtier")) {
            peasantCount --;
        }
        type = tope;
        if (type.equals("knight")) {
            knightCount ++;
        } else if (type.equals("peasant")) {
            peasantCount ++;
        } else if (type.equals("cleric")) {
            clericCount ++;
        } else if (type.equals("mage")) {
            mageCount ++;
        } else if (type.equals("courtier")) {
            peasantCount ++;
        }
    }

    public boolean isTooMuch() {
        if (knightCount > 2 || peasantCount > 2|| clericCount > 2|| mageCount > 2|| courtierCount > 2) {
            return true;
        } else {
            return false;
        }
    }

    public void reroll() {
        if (type.equals("knight")) {
            this.strength = rand.nextInt(4) + 7;
            this.toughness = rand.nextInt(6);
            this.intelligence = rand.nextInt(6);
            this.magic = rand.nextInt(6);
            this.influence = rand.nextInt(6);
        } else if (type.equals("peasant")) {
            this.strength = rand.nextInt(6);
            this.toughness = rand.nextInt(4) + 7;
            this.intelligence = rand.nextInt(6);
            this.magic = rand.nextInt(6);
            this.influence = rand.nextInt(6);
        } else if (type.equals("cleric")) {
            this.strength = rand.nextInt(6);
            this.toughness = rand.nextInt(6);
            this.intelligence = rand.nextInt(4) + 7;
            this.magic = rand.nextInt(6);
            this.influence = rand.nextInt(6);
        } else if (type.equals("mage")) {
            this.strength = rand.nextInt(6);
            this.toughness = rand.nextInt(6);
            this.intelligence = rand.nextInt(6);
            this.magic = rand.nextInt(4) + 7;
            this.influence = rand.nextInt(6);
        } else if (type.equals("courtier")) {
            this.strength = rand.nextInt(6);
            this.toughness = rand.nextInt(6);
            this.intelligence = rand.nextInt(6);
            this.magic = rand.nextInt(6);
            this.influence = rand.nextInt(4) + 7;
        }
    }

    public String toString() {
        if (name == null) {
            return type + "," + strength + "," + toughness + "," + intelligence + "," + magic + "," + influence;
        } else {
            return name + "," + type + "," + strength + "," + toughness + "," + intelligence + "," + magic + "," + influence + "\n" + knightCount + " " + courtierCount;
        }
    }
}
