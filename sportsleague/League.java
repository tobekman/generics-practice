package sportsleague;

import java.util.ArrayList;

public class League<T extends Team> {
    private String name;

    ArrayList<T> leagueTable = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    public void addTeam(T team) {
        leagueTable.add(team);
    }

    private String setLeagueTable() {
        sortTeamsByPoints();
        String table = "--- "+name+" ---";
        for (T team : leagueTable) {
            table += "\n" + team.getName() + " " +
                    team.played + " " +
                    team.won + " " +
                    team.lost + " " +
                    team.tied + " " +
                    team.points();
        }
        return table;
    }

    private void sortTeamsByPoints() {
        leagueTable.sort((team1, team2) -> team2.points() - team1.points());
    }

    @Override
    public String toString() {
        return setLeagueTable();
    }
}
