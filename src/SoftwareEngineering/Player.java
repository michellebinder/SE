package SoftwareEngineering;

public class Player {

    static String name;

    public Player(String name) {
        this.name = name;
    }

    public static String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
