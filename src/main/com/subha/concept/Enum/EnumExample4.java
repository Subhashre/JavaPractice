package main.com.subha.concept.Enum;

public class EnumExample4 {

	public static void main(String[] args) {
		TrafficSignal signal = TrafficSignal.GREEN;
		System.out.println("Now you can go the signal is now:"+ signal);
		
		TrafficSignal[] allSignal = TrafficSignal.values();
		for (TrafficSignal t : allSignal) {
			 System.out.println("name : " + t.name() +
                     " action: " + t.getAction() );
		}
	}

}
enum TrafficSignal
{
    // This will call enum constructor with one
    // String argument
    RED("STOP"), GREEN("GO"), ORANGE("SLOW DOWN");
 
    // declaring private variable for getting values
    private String action;
 
    // getter method
    public String getAction()
    {
        return this.action;
    }
 
    // enum constructor - cannot be public or protected
    private TrafficSignal(String action)
    {
        this.action = action;
    }
}