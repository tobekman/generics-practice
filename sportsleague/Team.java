package sportsleague;

import java.util.ArrayList;

public class Team<T extends Player> {
    private String name;
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;

    private ArrayList<T> players = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addTeam(T player) {
        players.add(player);
    }

    public int numberOfPlayers() {
        return players.size();
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore) {
        if (ourScore > theirScore) {
            won++;
        } else if (theirScore > ourScore) {
            lost++;
        } else {
            tied++;
        }
        played++;

        if(opponent != null) {
            opponent.matchResult(null, theirScore, ourScore);
        }
    }

    public int points() {
        return (won * 3) + tied;
    }

}
