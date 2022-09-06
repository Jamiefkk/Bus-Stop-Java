import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class BusTest {

    Bus bus;
    Person person;
    BusStop busStop;

    @Before
    public void setUp(){
        bus = new Bus("Portobello", 3);
        person = new Person();
        busStop = new BusStop("Prince's Street");
    }

    @Test
    public void hasDestination(){
        assertEquals("Portobello", bus.getDestination());
    }

    @Test
    public void hasACapacity(){
        assertEquals(3, bus.getCapacity());
    }

    @Test
    public void hasNoPassengersInitially(){
        assertEquals(0, bus.getPassengerTotal());
    }

    @Test
    public void canAddPassengersWithEnoughCapacity() {
        busStop.addPassengerToQueue(person);
        busStop.addPassengerToQueue(person);
        busStop.addPassengerToQueue(person);
        bus.addPassenger(busStop);
        bus.addPassenger(busStop);
        assertEquals(2, bus.getPassengerTotal());
        assertEquals(1, busStop.getQueueTotal());
    }

    @Test
    public void cannotAddPassengersWithoutEnoughCapacity() {
        bus.addPassenger(busStop);
        bus.addPassenger(busStop);
        bus.addPassenger(busStop);
        bus.addPassenger(busStop);
        assertEquals(3, bus.getPassengerTotal());
    }

    @Test
    public void canRemovePassenger(){
        bus.addPassenger(busStop);
        bus.addPassenger(busStop);
        bus.removePassenger();
        assertEquals(1, bus.getPassengerTotal());

    }

}
