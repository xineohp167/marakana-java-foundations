import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class ObjectsTest {

	@Test
	public void test() {
		Memory m1 = new Memory(8, "DIMM"), m2 = new Memory(8, "DIMM");
		assertFalse(m1 == m2);
		assertTrue(m1.equals(m2));
		
		List<Storage> storage = new ArrayList<Storage>();
		storage.add(new Memory(4096, "DIMM"));
		storage.add(new Memory(4096, "DIMM"));
		storage.add(new Disk(512, "SATA", 6));
		
		Laptop lappy = new Laptop("MacBook Pro", storage, 15);
		
		lappy.installApplication("Eclipse");
		lappy.installApplication("BitTorrent");
		
		assertEquals(520, lappy.totalStorage());
		Laptop lap2 = new Laptop("Dell", storage, 15);

		lappy.turnOn();
		lap2.turnOn();

		LaptopBag bag = new LaptopBag(15, Color.BLACK);
		bag.insertLaptop(lappy);
		
		LaptopBag bag2 = new LaptopBag(17, Color.RED);
		bag2.insertLaptop(lap2);
		
		System.out.println(bag);
		System.out.println(bag2);
	}

}
