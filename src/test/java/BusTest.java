import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {
    Bus bus;


    @Before
    public void before(){
        bus = new Bus("Waverly", 10);
    }

    @Test
    public void hasPassengers(){
        assertEquals(0, bus.getPassengers());
    }
}
