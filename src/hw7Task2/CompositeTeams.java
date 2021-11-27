package hw7Task2;

import java.util.ArrayList;
import java.util.List;

public class CompositeTeams implements OlympicsTeams{

    private int numberOfAthletes;
    private int numberOfGoldMedals;
    private List<OlympicsTeams> teams = new ArrayList<>();

    public String getName(){
        String names = "";
        for(OlympicsTeams team : teams){
            names = team.getName();
        }
        return names;
    }

    public int getNumberOfAthletes() {
        numberOfAthletes = 0;
        for (OlympicsTeams team : teams) {
            team.getNumberOfAthletes();
        }
        return numberOfAthletes;
    }

    public int getNumberOfGoldMedals() {
        numberOfGoldMedals = 0;
        for (OlympicsTeams team : teams) {
            team.getNumberOfGoldMedals();
        }
        return numberOfGoldMedals;
    }
}
