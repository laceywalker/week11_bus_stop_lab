import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    Bus bus;
    Bus bus2;
    Person person;
    Person person2;
    Person person3;
    Person person4;
    BusStop busStop;


    @Before
    public void before(){
        bus = new Bus("Waverly", 3);
        bus2 = new Bus("Leith",0);
        person = new Person();
        person2 = new Person();
        person3 = new Person();
        person4 = new Person();
        busStop = new BusStop("George Street");
        busStop.addPersonToQueue(person);
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
    public void cannotAddPassenger(){
        bus.addPassenger(person);
        bus.addPassenger(person2);
        bus.addPassenger(person3);
        bus.addPassenger(person4);
        assertEquals(3,bus.getPassengers());
        bus2.addPassenger(person);
        assertEquals(0,bus2.getPassengers());

    }

    @Test
    public void canRemovePassenger(){
        bus.addPassenger(person);
        assertEquals(1, bus.getPassengers());
        bus.removePassenger();
        assertEquals(0, bus.getPassengers());
    }

    @Test
    public void canPickUpPassenger(){
        bus.pickUpPassenger(busStop);
        assertEquals(1, bus.getPassengers());
        assertEquals(0, busStop.checkQueue());
    }
}
