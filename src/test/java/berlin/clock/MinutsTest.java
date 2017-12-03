package berlin.clock;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Владислав on 03.12.2017.
 */
public class MinutsTest {
    private TimeElement minuts;
    @Before
    public void setUp() throws Exception {
          minuts = new Minuts();
    }

    @After
    public void tearDown() throws Exception {
          minuts = null;
          System.gc();
    }

    @Test
    public void getLamps() throws Exception {
            String res = minuts.getLamps(22);
        Assert.assertEquals("YYRY0000000" + " \n"  +"YY00",res);
    }

}