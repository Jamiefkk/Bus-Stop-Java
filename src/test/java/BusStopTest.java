import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class BusStopTest {
    BusStop busStop;
    Person person;

    @Before
    public void setUp(){
        busStop = new BusStop("Prince's Street");
        person = new Person();
    }

    @Test
    public void busStopHasName(){
        assertEquals("Prince's Street", busStop.getName());
    }

    @Test
    public void busStopHasNoPassengersInitially(){
        assertEquals(0, busStop.getQueueTotal());
    }

    @Test
    public void busStopCanAddPassengers(){
        busStop.addPassengerToQueue(person);
        busStop.addPassengerToQueue(person);
        assertEquals(2, busStop.getQueueTotal());
    }
    @Test
    public void busStopCanRemovePassengers(){
        busStop.addPassengerToQueue(person);
        busStop.addPassengerToQueue(person);
        busStop.removePassengerFromQueue();
        assertEquals(1, busStop.getQueueTotal());
    }

}
