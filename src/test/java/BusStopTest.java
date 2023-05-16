import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {
    Bus bus;
    Person person;
    BusStop busStop;

    @Before
    public void setUp(){
        bus = new Bus ("Wallyford", 100);
        person = new Person ();
        busStop = new BusStop("WhiteCraigs");
    }

    @Test

    public void busStopStartsEmpty(){
        assertEquals(0, busStop.busStopCounter() );
    }

    @Test
    public void canAddToQueue(){
        busStop.addToQueue(new Person());
        assertEquals(1, busStop.busStopCounter());
    }

    @Test
    public void canRemoveFromQueue(){
        busStop.addToQueue(new Person());
        busStop.removeFromQueue();
        assertEquals(0, busStop.busStopCounter());
    }


}
