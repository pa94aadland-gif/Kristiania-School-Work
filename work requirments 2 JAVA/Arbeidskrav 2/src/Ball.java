//This is a sub class that holds the values/objects of Balls
public class Ball extends Equipment {

    private boolean needsMoreAir;
    private String typeOfBall;

    public boolean needsMoreAir() {
        return needsMoreAir;
    }

    public void setNeedsMoreAir(boolean needsMoreAir) {
        this.needsMoreAir = needsMoreAir;
    }

    public void setTypeOfBall(String typeOfBall) {
        this.typeOfBall = typeOfBall;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "id=" + EquipId +
                ", locker='" + Locker + '\'' +
                ", replace=" + Replace +
                ", type='" + typeOfBall + '\'' +
                ", needsMoreAir=" + needsMoreAir +
                '}';
    }
}
