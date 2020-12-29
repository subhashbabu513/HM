package hotel;

public class Hotel {
	
    private Hotel(String hotelName,String hotelAddress)
	{
	}
	
	private static final Hotel INSTANCE = new Hotel("CRESCENT","HUBLI");
	
	public static Hotel getInstance()
	{
		return INSTANCE;
	}

}
 

