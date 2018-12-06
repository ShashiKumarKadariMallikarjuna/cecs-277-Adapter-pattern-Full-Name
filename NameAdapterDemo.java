package assignment7p1;
/**The main class that tests the Adapter Pattern design by testing the full name
 * @author Shashi Kumar Kadari Mallikarjuna
 * @version Assignment 7 part 1
 * @since Due - 11/5/18
 */
public class NameAdapterDemo {
	/**main method
	 * @param args
	 */
	public static void main(String[]args) {
		fullnameObjectAdapter ad=new fullnameObjectAdapter("Shashi Kumar");
		System.out.println( "First Name:  "+ ad.getFirstName());
		System.out.println( "Last Name:  "+ ad.getLastName());
	}
}
