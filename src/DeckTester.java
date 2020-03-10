/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		String[] r = new String[]{"jack", "king"};
		String[] s = new String[]{"heart"};
		int[] v = new int[]{11, 13};

		Deck d = new Deck(r, s, v);

		System.out.println("--- deck ---");
		System.out.println(d);

		System.out.println("--- empty ---");
		System.out.println(d.isEmpty());

		System.out.println("\n--- dealing ---");
		System.out.println(d.deal());
		System.out.println(d.deal());
		System.out.println(d.deal());

		System.out.println("\n--- deck after dealing ---");
		System.out.println(d);

		System.out.println("--- empty ---");
		System.out.println(d.isEmpty());
	}
}
