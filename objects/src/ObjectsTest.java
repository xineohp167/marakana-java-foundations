import static org.junit.Assert.*;

import org.junit.Test;

public class ObjectsTest {

	@Test
	public void test() {
		Memory m1 = new Memory(8, "DIMM"), m2 = new Memory(8, "DIMM");
		assertFalse(m1 == m2);
		assertTrue(m1.equals(m2));
		
		Storage[] storage = {new Memory(4096, "DIMM"), 
				new Memory(4096, "DIMM"), 
				new Disk(512, "SATA")};
		
		
		Laptop lappy = new Laptop("MacBook Pro", 15, storage);
		assertEquals(520, lappy.totalStorage());
		Laptop lap2 = new Laptop("Dell", 15, storage);

		lappy.turnOn();
		lap2.turnOn();

		LaptopBag bag = new LaptopBag(15);
		bag.insertLaptop(lappy);
		
		LaptopBag bag2 = new LaptopBag(17);
		bag2.insertLaptop(lap2);
		
		System.out.println(bag);
		System.out.println(bag2);
	}

}
