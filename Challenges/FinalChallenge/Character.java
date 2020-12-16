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

    public Character(String name, String type, int stren, int tough,int intel, int mag, int inf) {
        this.name = name;
        this.type = type;
        strength = stren;
        intelligence = intel;
        this.toughness = tough;
        magic = mag;
        influence = inf;
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

    public Character(String[] parameters) {
        this(parameters[0], parameters[1], Integer.parseInt(parameters[2]), Integer.parseInt(parameters[3]), Integer.parseInt(parameters[4]), Integer.parseInt(parameters[5]), Integer.parseInt(parameters[6]));

    }
    public void setName(String name){
        this.name = name;
    }
    public void setCount() {
        knightCount = 0;
        peasantCount = 0;
        clericCount = 0;
        mageCount = 0;
        courtierCount = 0;
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

    public boolean tooManyPoints() {
        int sum = strength + toughness + intelligence + magic + influence;
        if (sum > 28 || sum < 8) {
            return true;
        }
        return false;
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
            return name + "," + type + "," + strength + "," + toughness + "," + intelligence + "," + magic + "," + influence;
        }
    }
}
