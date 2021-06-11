import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {

        private CabinCrewMember cabinCrewMember;

        @Before
        public void before(){
            cabinCrewMember = new CabinCrewMember("Charles",StaffRank.FLIGHT_ATTENDANT);
        }

        @Test
        public void cabinCrewMemberHasName(){
            assertEquals("Charles", cabinCrewMember.getName());
        }

        @Test
        public void cabinCrewMemberCanSetName(){
            cabinCrewMember.setName("Anthony");
            assertEquals("Anthony", cabinCrewMember.getName());
        }

        @Test
        public void cabinCrewMemberHasRank(){
            assertEquals(StaffRank.FLIGHT_ATTENDANT, cabinCrewMember.getRank());
        }

        @Test
        public void cabinCrewMemberCanSetRank(){
            cabinCrewMember.setRank(StaffRank.SENIOR_FLIGHT_ATTENDANT);
            assertEquals(StaffRank.SENIOR_FLIGHT_ATTENDANT, cabinCrewMember.getRank());
        }

        @Test
        public void cabinCrewMemberCanSpeak(){
            assertEquals("The captain has turned on the seatbelts sign, could you please take your seats?", cabinCrewMember.relayMessageToPassengers());
        }

}

