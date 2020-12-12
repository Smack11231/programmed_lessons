import java.util.Random;
public class Character {
    private String name;
    private String type;
    private int strength,toughness,intelligence,magic,influence;
    Random rand = new Random();

    public Character(String type) {
        this.type = type;
        if (type=="knight") {
            this.strength = rand.nextInt(3) + 7;
            this.toughness = rand.nextInt(6);
            this.intelligence = rand.nextInt(6);
            this.magic = rand.nextInt(6);
            this.influence = rand.nextInt(6);
            int sum = strength + toughness + intelligence + magic + influence;
            while (sum > 28 || sum < 8) {
                reroll();
            }
        } else if (type =="peasant") {
            this.strength = rand.nextInt(6);
            this.toughness = rand.nextInt(3) + 7;
            this.intelligence = rand.nextInt(6);
            this.magic = rand.nextInt(6);
            this.influence = rand.nextInt(6);
            int sum = strength + toughness + intelligence + magic + influence;
            while (sum > 28 || sum < 8) {
                reroll();
            }
        } else if (type == "cleric") {
            this.strength = rand.nextInt(6);
            this.toughness = rand.nextInt(6);
            this.intelligence = rand.nextInt(3) + 7;
            this.magic = rand.nextInt(6);
            this.influence = rand.nextInt(6);
            int sum = strength + toughness + intelligence + magic + influence;
            while (sum > 28 || sum < 8) {
                reroll();
            }
        } else if (type == "Mage") {
            this.strength = rand.nextInt(6);
            this.toughness = rand.nextInt(6);
            this.intelligence = rand.nextInt(6);
            this.magic = rand.nextInt(3) + 7;
            this.influence = rand.nextInt(6);
            int sum = strength + toughness + intelligence + magic + influence;
            while (sum > 28 || sum < 8) {
                reroll();
            }
        } else if (type == "Courtier") {
            this.strength = rand.nextInt(6);
            this.toughness = rand.nextInt(6);
            this.intelligence = rand.nextInt(6);
            this.magic = rand.nextInt(6);
            this.influence = rand.nextInt(3) + 7;
            int sum = strength + toughness + intelligence + magic + influence;
            while (sum > 28 || sum < 8) {
                reroll();
            }
        }
    }

    public void setName(String name){
        this.name = name;
    }

    public void reroll() {
        if (type=="knight") {
            this.strength = rand.nextInt(3) + 7;
            this.toughness = rand.nextInt(6);
            this.intelligence = rand.nextInt(6);
            this.magic = rand.nextInt(6);
            this.influence = rand.nextInt(6);
        } else if (type =="peasant") {
            this.strength = rand.nextInt(6);
            this.toughness = rand.nextInt(3) + 7;
            this.intelligence = rand.nextInt(6);
            this.magic = rand.nextInt(6);
            this.influence = rand.nextInt(6);
        } else if (type == "cleric") {
            this.strength = rand.nextInt(6);
            this.toughness = rand.nextInt(6);
            this.intelligence = rand.nextInt(3) + 7;
            this.magic = rand.nextInt(6);
            this.influence = rand.nextInt(6);
        } else if (type == "Mage") {
            this.strength = rand.nextInt(6);
            this.toughness = rand.nextInt(6);
            this.intelligence = rand.nextInt(6);
            this.magic = rand.nextInt(3) + 7;
            this.influence = rand.nextInt(6);
        } else if (type == "Courtier") {
            this.strength = rand.nextInt(6);
            this.toughness = rand.nextInt(6);
            this.intelligence = rand.nextInt(6);
            this.magic = rand.nextInt(6);
            this.influence = rand.nextInt(3) + 7;
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
