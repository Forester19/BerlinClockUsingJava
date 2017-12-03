package berlin.clock;

/**
 * Created by Владислав on 02.12.2017.
 */
public class Hours implements TimeElement {
    private final String RED_L = "R";
    private final String ALL_L_OFF= "0000";


    private String getLampFiveLamps(int hours){
    StringBuilder lamps= new StringBuilder(ALL_L_OFF);
    for (int i=0; i<(hours/5);i++){
        lamps.replace(i,i+1,RED_L);
    }
    return lamps.toString();
    }
    private String getLampSingle(int hours){
        StringBuilder lamps = new StringBuilder(ALL_L_OFF);

        for (int i=0; i<(hours%5);i++){
            lamps.replace(i,i+1,RED_L);
        }
        return lamps.toString(); }
    @Override
    public String getLamps(int element) {
        return getLampFiveLamps(element) +  "\n"  + getLampSingle(element);
    }
}
