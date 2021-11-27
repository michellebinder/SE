package hw7Task2;

public class ArgentinienTeam extends SouthAmericaTeam{

    private String name;
    private int numberOfAthletes;
    private int numberOfGoldMedals;

    public ArgentinienTeam(String name, int numberOfAthletes, int numberOfGoldMedals) {
        super();
        this.name = name;
        this.numberOfAthletes = numberOfAthletes;
        this.numberOfGoldMedals = numberOfGoldMedals;
    }

    public String getName() {
        System.out.println("Team: " + this.name);
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfAthletes() {
        System.out.println("Number of athletes: " + this.numberOfAthletes);
        return numberOfAthletes;
    }

    public void setNumberOfAthletes(int numberOfAthletes) {
        this.numberOfAthletes = numberOfAthletes;
    }

    public int getNumberOfGoldMedals() {
        System.out.println("Number of gold medals: " + this.numberOfGoldMedals);
        return numberOfGoldMedals;
    }

    public void setNumberOfGoldMedals(int numberOfGoldMedals) {
        this.numberOfGoldMedals = numberOfGoldMedals;
    }
}
