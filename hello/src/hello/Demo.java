package hello;

public class Demo {
	
	public static void main(String[] args) {
		try {
			int x = Integer.parseInt("foo");
			System.out.println(x);
		} catch (NumberFormatException e) {
			System.out.println(e);
		}
		
		System.out.println("Go on!");
	}

}
