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
		try {
			String name = args[0];
			System.out.println("Hello, " + name);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Hello nobody");
		}

	}

}
