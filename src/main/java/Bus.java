import java.util.ArrayList;

public class Bus {
    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus(String destination, int capacity) {
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<Person>();
    }

    public String getDestination() {
        return this.destination;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int getPassengerTotal(){
        return this.passengers.size();
    }

    public void addPassenger(BusStop busStop){
        if(getPassengerTotal() < this.capacity && busStop.getQueueTotal() != 0) {
            this.passengers.add(busStop.removePassengerFromQueue());
        }
    }

    public void removePassenger(){
        this.passengers.remove(0);
    }
}

