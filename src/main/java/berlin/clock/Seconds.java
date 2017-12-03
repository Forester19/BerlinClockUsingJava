package berlin.clock;

/**
 * Created by Владислав on 02.12.2017.
 */
public class Seconds implements TimeElement {
    @Override
    public String getLamps(int seconds) {
        if (seconds % 2 == 0){
            return "Y";
        }
        return "0";
    }
}
