package berlin.clock;

/**
 * Created by Владислав on 02.12.2017.
 */
public class Minuts implements TimeElement {
    private static final String RED_L = "R";
    private static final String YELLOW_L= "Y";
    private static final String FOUR_L_OFF= "0000";
    private static final String NEXTLINE_L_OFF= "00000000000";


    @Override
    public String getLamps(int minuts) {
        int follMinuts = minuts/5;
        int restMinuts = minuts%5;
        return getLampsMinuteFive(follMinuts) +  " \n"  +getLampsMinuteSingle(restMinuts);
    }
    private String getLampsMinuteFive(int minuts){
        StringBuilder lamps = new StringBuilder(NEXTLINE_L_OFF);
        for (int i=0; i<minuts; i++){
            if ((i+1)%3 ==  0) {
                lamps.replace(i, i + 1, RED_L);
            }else {
                lamps.replace(i, i + 1, YELLOW_L);
            }
        }
        return lamps.toString();
    }
    private String getLampsMinuteSingle(int minuts){
        StringBuilder lamps = new StringBuilder(FOUR_L_OFF);
        for (int i=0; i<minuts; i++){
                lamps.replace(i, i + 1, YELLOW_L);
        }
        return lamps.toString();
    }
}
