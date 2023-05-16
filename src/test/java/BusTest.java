import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    Bus bus;

    Person person;

    @Before
    public void setUp(){
        bus = new Bus ("Wallyford", 100);
        person = new Person ();
    }

    @Test
    public void busStartsEmpty(){
        assertEquals(0, bus.busCount());
    }

    @Test
    public void canAddPassenger(){
        bus.addPassenger(new Person());
        assertEquals(1, bus.busCount());
    }
//    add conditional - if passenger count is less than capacity

    @Test
    public void canRemovePassenger(){
        bus.addPassenger(new Person());
        bus.removePassenger();
        assertEquals(0, bus.busCount());
    }


    




}
