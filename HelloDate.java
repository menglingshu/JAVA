//: object/HelloDate.java
import java.util.*;

/** The first Thinking in Java example program.
 * Displays a string and today's date
 * @author Lingshu
 * @version 1.0
*/
public class HelloDate {
	/** Entry point to class & application.
	 * @param args array of string arguments
	 * @throws exceptions No exceptions thrown
	 */
	public static void main(String[] args)
	{
		System.out.println("Hello, it's: ");
		System.out.println(new Date());
	} /* Output: (55% match)
	Hello, it's:
	Sun Jan 28 16:27:11 CET 2018
	*///:~
}
