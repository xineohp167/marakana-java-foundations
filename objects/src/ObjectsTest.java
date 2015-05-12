import static org.junit.Assert.*;

import org.junit.Test;

public class ObjectsTest {

	@Test
	public void test() {
		Memory[] memory = { new Memory(8, "DIMM"), new Memory(8, "DIMM") };
		Disk[] disks = { new Disk(512, "SATA") };
		Disk[] disks2 = new Disk[2];
		disks2[0] = new Disk(512, "SATA");
		disks2[1] = new Disk(512, "SATA");
		
		
		Laptop lappy = new Laptop("MacBook Pro", 15, memory, disks);
		Laptop lap2 = new Laptop("Dell", 15, memory, disks2);

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
