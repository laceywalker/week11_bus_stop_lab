import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    BusStop busStop;
    Person person;

    @Before
    public void before(){
        busStop = new BusStop("Princes Street");
    }

    @Test
    public void checkQueue(){
        assertEquals(0, busStop.checkQueue());
    }

    @Test
    public void canAddPerson(){
        busStop.addPersonToQueue(person);
        assertEquals(1, busStop.checkQueue());
    }

    @Test
    public void canRemovePerson(){
        busStop.addPersonToQueue(person);
        busStop.removePersonFromQueue();
        assertEquals(0, busStop.checkQueue());
    }

}
