package sportsleague;

import java.util.Random;

public class Main {

    public static void main(String[] args) {


        HockeyPlayer player1 = new HockeyPlayer("Peter Forsberg");
        HockeyPlayer player2 = new HockeyPlayer("Mats Sundin");
        FootballPlayer player3 = new FootballPlayer("Pontus Wernbloom");
        FootballPlayer player4 = new FootballPlayer("Marcus Berg");

        Team<FootballPlayer> ifkGbg = new Team<>("IFK Göteborg");
        Team<FootballPlayer> aik = new Team<>("AIK");
        Team<FootballPlayer> mff = new Team<>("Malmö FF");
        Team<FootballPlayer> dif = new Team<>("Djurgårdens IF");
        Team<HockeyPlayer> fbk = new Team<>("Färjestad BK");
        Team<HockeyPlayer> vxj = new Team<>("Växjö Lakers");
        Team<HockeyPlayer> fhc = new Team<>("Frölunda HC");
        Team<HockeyPlayer> bif = new Team<>("Brynäs IF");

        League<Team<FootballPlayer>> allsvenskan = new League<>("Allsvenskan");
        League<Team<HockeyPlayer>> shl = new League<>("Swedish Hockey League");

        allsvenskan.addTeam(ifkGbg);
        allsvenskan.addTeam(aik);
        allsvenskan.addTeam(mff);
        allsvenskan.addTeam(dif);

        shl.addTeam(fbk);
        shl.addTeam(vxj);
        shl.addTeam(fhc);
        shl.addTeam(bif);

        ifkGbg.matchResult(aik, randomScore(), randomScore());
        ifkGbg.matchResult(mff, randomScore(), randomScore());
        ifkGbg.matchResult(dif, randomScore(), randomScore());
        aik.matchResult(mff, randomScore(), randomScore());
        aik.matchResult(dif, randomScore(), randomScore());
        mff.matchResult(dif, randomScore(), randomScore());

        fbk.matchResult(vxj, randomScore(), randomScore());
        fbk.matchResult(fhc, randomScore(), randomScore());
        fbk.matchResult(bif, randomScore(), randomScore());
        vxj.matchResult(fhc, randomScore(), randomScore());
        vxj.matchResult(bif, randomScore(), randomScore());
        fhc.matchResult(bif, randomScore(), randomScore());

        System.out.println(allsvenskan);
        System.out.println(shl);

    }

    public static int randomScore() {
        Random random = new Random();
        return random.nextInt(5);
    }
}
