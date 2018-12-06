package assignment7p1;
/**Adaptee class
 * @author Shashi Kumar Kadari Mallikarjuna
 * @version Assignment 7 part 1
 * @since Due - 11/5/18
 */
public class SimpleName implements NameInterface{
	String name;
	/**overloaded constructor
	 * @param n name
	 */
	public SimpleName(String n) {
		name=n;
	}
	/**methods that sets the name*/
	@Override
	public void setName(String n) {
		name=n;
	}
	/**method that gets the name*/
	@Override
	public String getName() {
		return name;
	}
}
