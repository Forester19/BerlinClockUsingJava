package berlin.clock;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Владислав on 02.12.2017.
 */
public class ClockStarter {
    final static ArrayList<TimeElement> listElements = new ArrayList<TimeElement>(){{
       add(new Seconds());
        add(new Hours());
        add(new Minuts());
    }};
    public static void main(String[] args) throws IOException, InterruptedException {
        while (true) {
            Date date = new Date();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
            System.out.println(showClock(simpleDateFormat.format(date)));
            System.out.println(simpleDateFormat.format(date));
            Thread.sleep(1000);

            final String os = System.getProperty("os.name");
            if (os.contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                Runtime.getRuntime().exec("clear");
        }
    }
    @org.jetbrains.annotations.NotNull
    private static String showClock(String time){
        StringBuilder stringBuilder = new StringBuilder();
        String[] timePart = time.split(":");
        stringBuilder.append(listElements.get(0).getLamps(Integer.parseInt(timePart[2]))).append("\n");
        stringBuilder.append(listElements.get(1).getLamps(Integer.parseInt(timePart[0]))).append("\n");
        stringBuilder.append(listElements.get(2).getLamps(Integer.parseInt(timePart[1])));
        return stringBuilder.toString();
    }

}
