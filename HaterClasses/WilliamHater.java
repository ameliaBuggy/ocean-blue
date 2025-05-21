package HaterClasses;
import java.util.ArrayList;

public class WilliamHater extends Hater{
    
    public WilliamHater(boolean isHating) {
        super("William", isHating);
    }

    public void heDidIt() {
        ArrayList<String> reasons = getReasons();
        reasons.add("He made a stupid comment");
    }
}
