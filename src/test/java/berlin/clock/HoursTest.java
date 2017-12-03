package berlin.clock;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Владислав on 03.12.2017.
 */
public class HoursTest {
    private TimeElement hours;

    @Before
    public void setUp() throws Exception {
        hours = new Hours();
    }

    @After
    public void tearDown() throws Exception {
        hours = null;
        System.gc();
    }

    @Test
    public void getLamps() throws Exception {
        Assert.assertEquals("RRR0" + "\n" + "RRRR",hours.getLamps(19));
    }

}