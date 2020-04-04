package day1;

public class Comments {
	public static void main(String[] args) {

		// START
		int i = 10;
		if (i <= 18) {
			System.out.println("Teen");
		} else if (i > 18 && i <= 30) {
			System.out.println("Audult");
		} else if (i > 30 && i <= 60) {
			System.out.println("Middle Age");
		} else if (i > 60 && i <= 120) {
			System.out.println("Sr Citizen");
		} else {
			System.out.println("Come on man DIE!");
		}
		// END

		// Single Line Comment

		// In Java 3 types of comments

		// Multi line comment

		/*
		 * 
		 * 
		 * Hi,
		 * 
		 * I am writing a multiline comment
		 * 
		 * to explain my code to a reader
		 * 
		 * 
		 */

		// JAVA DOC

		/**
		 * 
		 */

		m1();

	}

	/**
	 * JAVA DOC Comments
	 * 
	 * <h1>Decision Table</h1>
	 * 
	 * <table border=1>
	 * <tr>
	 * <td>AGE</td>
	 * <td>OUTPUT</td>
	 * </tr>
	 * <tr>
	 * <td>0</td>
	 * <td>TEEN</td>
	 * </tr>
	 * </tr>
	 * <tr>
	 * <td>18</td>
	 * <td>TEEN</td>
	 * </tr>
	 * <tr>
	 * <td>19</td>
	 * <td>AUDULT</td>
	 * </tr>
	 * 
	 * </table>
	 * 
	 * @author Shailendra 28-Mar-2020
	 * 
	 * 
	 */
	private static void m1() {
		// TODO Auto-generated method stub

	}

}
