import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    Bus bus;
    Bus bus2;
    Person person;


    @Before
    public void before(){
        bus = new Bus("Waverly", 10);
        bus2 = new Bus("Leith",0);
        person = new Person();
    }

    @Test
    public void hasPassengers(){
        assertEquals(0, bus.getPassengers());
    }

    @Test
    public void canAddPassenger(){
        bus.addPassenger(person);
        assertEquals(1,bus.getPassengers());
    }

    @Test
    public void canRemovePassenger(){
        bus.addPassenger(person);
        assertEquals(1, bus.getPassengers());
        bus.removePassenger();
        assertEquals(0, bus.getPassengers());
    }
}
