package assignment7p1;
/**Adapter class
 * @author Shashi Kumar Kadari Mallikarjuna
 * @version Assignment 7 part 1
 * @since Due - 11/5/18
 */
public class fullnameObjectAdapter extends SimpleName implements FullNameInterface{
	String fn="";
	String ln="";
	 /** This constructor method is used to create a name adaptor.  
	 * @param s - String full name
	 */
	public fullnameObjectAdapter(String s) {
		super(s);
		fn = getName().split(" ")[0];
		ln = getName().split(" ")[1];
	}
	/**method that sets the first name*/
	@Override
	public void setFirstName(String f) {
		fn=f;
	}
	/**method that sets the last name*/
	@Override
	public void setLastName(String l) {
		ln=l;
	}
	/**method that gets the last name*/
	@Override
	public String getFirstName() {
		return fn;
	}
	/**method that gets the last name*/
	@Override
	public String getLastName() {
		return ln;
	}
	
}
