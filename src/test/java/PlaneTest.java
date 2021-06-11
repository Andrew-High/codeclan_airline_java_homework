import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {
    private Plane plane;

    @Before
    public void before(){
        plane = new Plane(PlaneType.BOEING_777);
    }

    @Test
    public void planeHasType(){
        assertEquals(PlaneType.BOEING_777, plane.getType());
    }

    @Test
    public void planeCanSetType(){
        plane.setType(PlaneType.AIRBUS_A320);
        assertEquals(PlaneType.AIRBUS_A320, plane.getType());
    }
}
