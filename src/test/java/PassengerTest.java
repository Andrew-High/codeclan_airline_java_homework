import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    private Passenger passenger;

    @Before
    public void before(){
        passenger = new Passenger("Tom", 2);
    }

    @Test
    public void passengerHasName(){
        assertEquals("Tom", passenger.getName());
    }

    @Test
    public void passengerCanSetName(){
        passenger.setName("Steve");
        assertEquals("Steve", passenger.getName());
    }

    @Test
    public void passengerHasBags(){
        assertEquals(2, passenger.getBags());
    }

    @Test
    public void passengerCanSetBags(){
        passenger.setBags(1);
        assertEquals(1, passenger.getBags());
    }

}
