import java.util.ArrayList;

public class BusStop {
    private String name;
    private ArrayList<Person> queue;

    public BusStop ( String name){
        this.name = name;
        this.queue = new ArrayList<Person>();
    }

    public int busStopCounter(){
        return this.queue.size();
    }

    public void addToQueue(Person p){
        this.queue.add(p);
    }
    public void removeFromQueue(){
        this.queue.remove(0);
    }

}
