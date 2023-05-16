import java.util.ArrayList;

public class Bus {
    private String destination;
    private Integer capacity;
    private ArrayList<Person> passangers;

    public Bus (String destination, int capacity){
        this.destination = destination;
        this.capacity = capacity;
        this.passangers = new ArrayList<Person>();
    }

    public int busCount(){
        return this.passangers.size();
    }

    public void addPassenger(Person p) {
        if (this.capacity > busCount()) {
            this.passangers.add(p);
        }
    }

    public void removePassenger(){
        this.passangers.remove(0);
    }
    public void pickUp(BusStop busStop){
        Person person = busStop.removeFromQueue();
        addPassenger(person);
    }
}
