import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {

        private CabinCrewMember cabinCrewMember;

        @Before
        public void before(){
            cabinCrewMember = new CabinCrewMember("Charles",CabinCrewRank.FLIGHT_ATTENDANT);
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
            assertEquals(CabinCrewRank.FLIGHT_ATTENDANT, cabinCrewMember.getRank());
        }

        @Test
        public void cabinCrewMemberCanSetRank(){
            cabinCrewMember.setRank(CabinCrewRank.SENIOR_FLIGHT_ATTENDANT);
            assertEquals(CabinCrewRank.SENIOR_FLIGHT_ATTENDANT, cabinCrewMember.getRank());
        }

}

