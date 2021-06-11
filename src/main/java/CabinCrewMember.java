public class CabinCrewMember extends Staff{

    public CabinCrewMember(String name, StaffRank rank) {
        super(name, rank);
    }

    public String relayMessageToPassengers(){
        return "The captain has turned on the seatbelts sign, could you please take your seats?";
    }

}
