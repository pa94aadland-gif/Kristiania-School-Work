import java.io.FileNotFoundException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ReadEquipmentFromFile reader = new ReadEquipmentFromFile();

        try {
            List<Equipment> equipmentList = reader.readEquipmentFromFile();
            Program program = new Program(equipmentList);
            program.run();

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}
