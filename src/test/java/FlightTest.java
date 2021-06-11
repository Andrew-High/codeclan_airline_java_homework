import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    private Flight flight;
    private Flight flight2;
    private Pilot pilot;
    private CabinCrewMember member1;
    private CabinCrewMember member2;
    private ArrayList<CabinCrewMember> cabinCrew;
    private Plane plane;
    private Plane plane2;
    private Passenger passenger;


    @Before
    public void before(){
        pilot = new Pilot("Geraldine", StaffRank.CAPTAIN, "AB123XYZ");
        member1 = new CabinCrewMember("Arthur", StaffRank.FLIGHT_ATTENDANT);
        member2 = new CabinCrewMember("Maureen", StaffRank.SENIOR_FLIGHT_ATTENDANT);
        cabinCrew = new ArrayList<CabinCrewMember>();
        cabinCrew.add(member1);
        cabinCrew.add(member2);
        plane = new Plane(PlaneType.AIRBUS_A320);
        plane2 = new Plane(PlaneType.TEST);
        flight = new Flight(pilot, cabinCrew, plane, "JAV1302", "BUD", "EDI", "1030");
        flight2 = new Flight(pilot, cabinCrew, plane2, "JAV1302", "BUD", "EDI", "1030");
        passenger = new Passenger("Michael Rosenberg", 2);
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

    @Test
    public void flightHasCabinCrew(){
        assertEquals(2, flight.getCabinCrew().size());
    }

    @Test
    public void flightHasPassengers(){
        assertEquals(0, flight.getPassengers().size());
    }

    @Test
    public void flightCanAddPassengers(){
        flight.addPassenger(passenger);
        assertEquals(1, flight.getPassengers().size());
    }

    @Test
    public void flightCantAddPassengersIfFull(){
        flight2.addPassenger(passenger);
        flight2.addPassenger(passenger);
        assertEquals(1, flight2.getPassengers().size());
    }

    @Test
    public void flightCanReturnNumberOfSeats(){
        flight.addPassenger(passenger);
        assertEquals(179, flight.checkNumberofAvailableSeats());
    }


}
