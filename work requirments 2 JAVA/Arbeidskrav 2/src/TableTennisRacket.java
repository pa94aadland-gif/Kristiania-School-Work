//This is a sub class that holds the values/objects of Table Tennis Rackets
public class TableTennisRacket extends Equipment {

    private boolean needsNewLining;

    public boolean isNeedsNewLining() {
        return needsNewLining;
    }

    public void setNeedsNewLining(boolean needsNewLining) {
        this.needsNewLining = needsNewLining;
    }

    @Override
    public String toString() {
        return "TableTennisRacket{" +
                "id=" + EquipId +
                ", locker='" + Locker + '\'' +
                ", replace=" + Replace +
                ", needsNewLining=" + needsNewLining +
                '}';
    }

}