import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {

        private CabinCrewMember cabinCrewMember;

        @Before
        public void before(){
            cabinCrewMember = new CabinCrewMember("Charles", "Flight Attendant");
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
            assertEquals("Flight Attendant", cabinCrewMember.getRank());
        }

        @Test
        public void cabinCrewMemberCanSetRank(){
            cabinCrewMember.setRank("Senior Flight Attendant");
            assertEquals("Senior Flight Attendant", cabinCrewMember.getRank());
        }

}

