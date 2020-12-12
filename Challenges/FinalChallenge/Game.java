public class Game {
    private String name;
    private Character char1;
    private Character char2;
    private Character char3;
    private Character char4;

    public Game(String name, Character char1, Character char2, Character char3, Character char4) {
        this.name = name;
    }

	public String toString() {
        return name + "\n" + char1 + "\n" + char2 + "\n" + char3 + "\n" + char4;
    }
}