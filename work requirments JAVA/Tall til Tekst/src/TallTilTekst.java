import java.util.Scanner;

public class TallTilTekst {
    public void tallTilTekst() {
        //Henter inn scanner for bruker input
        Scanner scanner = new Scanner(System.in);
        System.out.println("skriv ett nummer mellom 1-999: ");
        int tall = scanner.nextInt();


        //Dette er strings for objektene programmet skal jobbe med.
        String[] enkelTall = {"","en","to","tre","fire","fem","seks","syv","åtte","ni","ti",
                "elve","tolv","tretten","fjorten","femten","seksten","søtten","atten","nitten",};
        String[] tiTall = {"tjue","tretti","førti","femti","seksti","søtti","åtti","nitti",};
        String[] hundreTall = {"hundre","to hundre","tre hundre","fire hundre","fem hundre",
                "seks hundre","syv hundre","åtte hundre","ni hundre",};

        //If statement til alt under 20
        if (tall <20) {
            System.out.println(enkelTall[tall]);

            //else if for tall mellom 20-99
        } else if (tall > 19 && tall <100) {
            int tier = tall / 10;
            int enhet = tall % 10;
            System.out.println(tiTall[tier - 2] + " " + enkelTall[enhet]);

            //else if for tall mellom 100-999
        } else if (tall > 99 && tall <1000) {
            int hundre = tall / 100;
            int rest = tall % 100;

            //En string for å knytte sammen tallene til hundre.
            String tekst = hundreTall[hundre -1];

            //!= 0 er for å sjekke at tallet ikke inneholder 0, om det ikke gjør det. Så kjører den resten av koden.
            if (rest != 0) {
                if (rest < 20) tekst += " og " + enkelTall[rest];
                else {
                    int tier = rest / 10;
                    int enhet = rest % 10;
                    tekst += " og " + tiTall[tier - 2] + (enhet != 0 ? " " + enkelTall[enhet] : "");
                }
            }
            System.out.println(tekst);
        }
    }
}
