//This is my super class that holds the shared values/objects
public class Equipment {
    public int EquipId;
    public String Locker;
    public boolean Replace;

    public boolean isReplace() {
        return Replace;
    }

    public void setEquipId(int equipId) {
        this.EquipId = equipId;
    }

    public void setLocker(String locker) {
        this.Locker = locker;
    }

    public void setReplace(boolean replace) {
        this.Replace = replace;
    }
}