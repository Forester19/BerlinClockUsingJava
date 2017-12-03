package berlin.clock;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Владислав on 03.12.2017.
 */
public class SecondsTest {
    private TimeElement seconds;
    @Before
    public void setUp() throws Exception {
        seconds = new Seconds();
    }

    @After
    public void tearDown() throws Exception {
         seconds = null;
    }

    @Test
    public void getLamps() throws Exception {
              Assert.assertEquals("0", seconds.getLamps(3));
              Assert.assertEquals("Y", seconds.getLamps(4));
    }

}