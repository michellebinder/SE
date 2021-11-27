package hw7Task2;

public class Client {

    public static void main(String[] args) {

        ChinaTeam womenTaekwondo = new ChinaTeam("Women's Taekwondo", 12, 3);
        AfghanistanTeam menTaekwondo = new AfghanistanTeam("Men's Taekwondo", 15, 4);
        AlgerienTeam womenGymnastics = new AlgerienTeam("Women's Gymnastics", 22, 4);
        GhanaTeam menGymnastics = new GhanaTeam("Men's Gymnastics", 15, 3);
        BrasilienTeam womensFootball = new BrasilienTeam("Women's Football", 23, 2);
        ArgentinienTeam mensFootball = new ArgentinienTeam("Men's Football", 22, 5);
        GermanyTeam womensTennis = new GermanyTeam("Women's Tennis", 4, 3);
        ItalyTeam mensSwimming = new ItalyTeam("Men's Swimming", 13, 2);


        OlympicsTeams.printAll(womenTaekwondo);
        OlympicsTeams.printAll(menTaekwondo);
        OlympicsTeams.printAll(womenGymnastics);
        OlympicsTeams.printAll(menGymnastics);
        OlympicsTeams.printAll(womensFootball);
        OlympicsTeams.printAll(mensFootball);
        OlympicsTeams.printAll(womensTennis);
        OlympicsTeams.printAll(mensSwimming);

    }
}
