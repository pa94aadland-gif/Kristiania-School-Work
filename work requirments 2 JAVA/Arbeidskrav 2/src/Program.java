import java.util.List;
import java.util.Scanner;

//Program pulls information from the super class and sub classes.
public class Program {
    private List<Equipment> equipmentList;

    public Program(List<Equipment> equipmentList) {
        this.equipmentList = equipmentList;
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

                while (choice!=4) {
            System.out.println("1. See balls needing more air");
            System.out.println("2. See equipment needing to be replaced");
            System.out.println("3. See table tennis rackets needing new padding");
            System.out.println("4. Quit");

            choice = scanner.nextInt();
            switch (choice) {
                case 1 -> printBallsNeedingMoreAir();
                case 2 -> printEquipmentNeedingToBeReplaced();
                case 3 -> printTableTennisRacketsNeedingNewPad();
                case 4 -> quit();
                default -> System.out.println("What would you like to do?");
            }
        }
    }

    public void printBallsNeedingMoreAir() {

        for (Equipment e : equipmentList) {

            if (e instanceof Ball ball) {
                if (ball.needsMoreAir()) {
                    System.out.println(ball);
                }
            }
        }
    }

    public void printEquipmentNeedingToBeReplaced() {

        for (Equipment e : equipmentList) {
            if (e.isReplace()) {
                System.out.println(e);
            }
        }
    }

    public void printTableTennisRacketsNeedingNewPad() {

        for (Equipment e : equipmentList) {

            if (e instanceof TableTennisRacket racket) {
                if (racket.isNeedsNewLining()) {
                    System.out.println(racket);
                }
            }
        }
    }

    private void quit() {
        System.out.println("Goodbye! :)");
    }
}
