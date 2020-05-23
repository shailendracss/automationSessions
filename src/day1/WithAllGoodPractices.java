package day1;

/**
 * This class demonstrates the viewer, how a good class should look
 */
public class WithAllGoodPractices {

	// This is the main, method which will be executed first
	public static void main(String[] args) {
		
		int i =10;
		
		// calling ageLogic method
		ageLogic(0);
		ageLogic(18);
		ageLogic(19);
		ageLogic(30);
		ageLogic(31);
		ageLogic(60);
		ageLogic(61);
		ageLogic(120);
		
	}

	/**
	 * This method will print the message based on persons age
	 */
	private static void ageLogic(int age) {
		
		if (age <= 18) {
			System.out.println("Teen");
		} else if (age > 18 && age <= 30) {
			System.out.println("Audult");
		} else if (age > 30 && age <= 60) {
			System.out.println("Middle Age");
		} else if (age > 60 && age <= 120) {
			System.out.println("Sr Citizen");
		} else {
			System.out.println("Come on man DIE!");
		}

	}

}
