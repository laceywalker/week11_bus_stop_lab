import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {
    Bus bus;
    Person person;


    @Before
    public void before(){
        bus = new Bus("Waverly", 10);
        person = new Person();
    }

    @Test
    public void hasPassengers(){
        assertEquals(0, bus.getPassengers());
    }

    @Test
    public void canAddPassenger(){
        bus.addPassenger(person);
        assertEquals(1, bus.getPassengers());
    }
}
