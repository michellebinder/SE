package hw7Task2;

public interface OlympicsTeams {

    String getName();

    int getNumberOfAthletes();

    int getNumberOfGoldMedals();

    public static void printAll(OlympicsTeams o) {
        o.getName();
        o.getNumberOfAthletes();
        o.getNumberOfGoldMedals();
    }
}
