import java.util.ArrayList;

public class BusStop {
    private String name;
    private ArrayList<Person> queue;

    public BusStop(String name) {
        this.name = name;
        this.queue = new ArrayList<Person>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Person> getPassengers() {
        return queue;
    }

    public int getQueueTotal(){
        return this.queue.size();
    }

    public void addPassengerToQueue(Person person){
            this.queue.add(person);

    }

    public Person removePassengerFromQueue(){
       return this.queue.remove(0);
    }
}
