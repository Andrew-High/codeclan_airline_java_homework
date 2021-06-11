import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    private Flight flight;
    private Pilot pilot;
    private CabinCrewMember member1;
    private CabinCrewMember member2;
    private ArrayList<CabinCrewMember> cabinCrew;
    private Plane plane;


    @Before
    public void before(){
        pilot = new Pilot("Geraldine", StaffRank.CAPTAIN, "AB123XYZ");
        member1 = new CabinCrewMember("Arthur", StaffRank.FLIGHT_ATTENDANT);
        member2 = new CabinCrewMember("Maureen", StaffRank.SENIOR_FLIGHT_ATTENDANT);
        cabinCrew = new ArrayList<CabinCrewMember>();
        cabinCrew.add(member1);
        cabinCrew.add(member2);
        plane = new Plane(PlaneType.AIRBUS_A320);
        flight = new Flight(pilot, cabinCrew, plane, "JAV1302", "BUD", "EDI", "1030");
    }

    @Test
    public void flightHasFlightNumber(){
        assertEquals("JAV1302", flight.getFlightNumber());
    }

    @Test
    public void flightHasDestination(){
        assertEquals("BUD", flight.getDestination());
    }

    @Test
    public void flightHasDepartureAirport(){
        assertEquals("EDI", flight.getDepartureAirport());
    }

    @Test
    public void flightHasDepartureTime(){
        assertEquals("1030", flight.getDepartureTime());
    }

    @Test
    public void flightHasPilot(){
        assertEquals("Geraldine", flight.getPilotsName());
    }


}
