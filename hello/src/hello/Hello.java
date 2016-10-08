package hello;

public class Hello {

	public static void main(String[] args) {
		//String first = args[0];
//		int x = 3;
//		int y = 5;
//		//System.out.println(x * 5  + 10);
//		System.out.println("Total: " + (x + y));
//		System.out.println("Total: " + x + y);
//		System.out.println(x + y + " Total");
//		try {
//			String name = args[0];
//			System.out.println("Hello, " + name);
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("Hello nobody");
//		}
		
		int[] deck = new int[52];
		for(int i = 0; i < deck.length; i++){
			deck[i] = i;
		}
		printArray(deck);
		System.out.println();
		int N = deck.length; 
		for (int i = 0; i < N; i++) 
		{ 
		   int r = i + (int) (Math.random() * (N-i)); 
		   System.out.println("r=" + r);
		   int t = deck[r]; 
		   //System.out.println("t=" + t);
		   deck[r] = deck[i]; 
		   //System.out.println("deck[r]=" + deck[r]);
		   deck[i] = t; 
		   //System.out.println("deck[i]=" + deck[i]);
		} 
		printArray(deck);

	}

	private static void printArray(int[] deck) {
		for (int i = 0; i < deck.length; i++) {
			System.out.print(deck[i] + ",");
		}
		
	}

}
