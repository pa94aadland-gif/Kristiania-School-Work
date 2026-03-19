import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//This class reads in the values from the file, and creates a list.
public class ReadEquipmentFromFile {

    public List<Equipment> readEquipmentFromFile() throws FileNotFoundException {
        List<Equipment> equipmentList = new ArrayList<>();
        File file = new File("equipment.txt");
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()) {
            //these are common values for the equipment
            String equipmentType = scanner.nextLine();
            int EquipId = Integer.parseInt(scanner.nextLine());
            String Locker = scanner.nextLine();
            boolean Replace = Boolean.parseBoolean(scanner.nextLine());

            //if else-loop that checks for Ball or TableTennisRacket. Because Ball has more values then TableTennisRackets.
            if (equipmentType.equals("Ball")){
                String ballType = scanner.nextLine();
                boolean needAir= Boolean.parseBoolean(scanner.nextLine());

                Ball ball = new Ball();
                ball.setEquipId(EquipId);
                ball.setLocker(Locker);
                ball.setReplace(Replace);
                ball.setTypeOfBall(ballType);
                ball.setNeedsMoreAir(needAir);
                equipmentList.add(ball);
            }
            else if (equipmentType.equals("TableTennisRacket")) {
                boolean needsNewLining = Boolean.parseBoolean(scanner.nextLine());

                TableTennisRacket racket = new TableTennisRacket();
                racket.setEquipId(EquipId);
                racket.setLocker(Locker);
                racket.setReplace(Replace);
                racket.setNeedsNewLining(needsNewLining);
                equipmentList.add(racket);
            }
        }
        //Here the scanner gets closed and returns the value/objects
        scanner.close();
        return equipmentList;
    }
}