import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    private Pilot pilot;

    @Before
    public void before(){
        pilot = new Pilot("Alfred",StaffRank.CAPTAIN, "AB123XYZ");
    }

    @Test
    public void pilotHasName(){
        assertEquals("Alfred", pilot.getName());
    }

    @Test
    public void pilotCanSetName(){
        pilot.setName("Rosie");
        assertEquals("Rosie", pilot.getName());
    }

    @Test
    public void cabinCrewMemberHasRank(){
        assertEquals(StaffRank.CAPTAIN, pilot.getRank());
    }

    @Test
    public void cabinCrewMemberCanSetRank(){
        pilot.setRank(StaffRank.FIRST_OFFICER);
        assertEquals(StaffRank.FIRST_OFFICER, pilot.getRank());
    }

}


