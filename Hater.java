import java.util.ArrayList;

public class Hater {

    private ArrayList<String> reasons;
    private String hatee;
    private boolean isHating;
    private static int numHaters;

    public Hater(String hatee) {
        this.hatee = hatee;
        isHating = true;
        reasons = new ArrayList<String>();
        numHaters++;
    }

    public Hater(String hatee, boolean isHating) {
        this.hatee = hatee;
        this.isHating = isHating;
        reasons = new ArrayList<String>();
        numHaters++;
    }

    public void addReason(String reason) {
        reasons.add(reason);
    }

    public void removeReason(String reason) {
        reasons.remove(reason);
    }

    public void setHatee(String hatee) {
        this.hatee = hatee;
    }

    public String getHatee() {
        return hatee;
    }

    public boolean isHating() {
        return isHating;
    }

    public void setHating(boolean isHating) {
        this.isHating = isHating;
    }

    public void getReasons() {
        for (String reason : reasons) {
            System.out.println(reason);
        }
    }

    public static int getNumHaters() {
        return numHaters;
    }

    public static void removeHater() {
        numHaters--;
    }
}
