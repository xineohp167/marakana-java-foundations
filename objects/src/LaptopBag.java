public class LaptopBag {

	private final int size;
	private Computer laptop;

	public LaptopBag(int size) {
		this.size = size;
	}

	public void insertLaptop(Laptop laptop) {
		if (laptop.getSize() > size) {
			throw new IllegalArgumentException("laptop too big");
		}

		if (this.laptop != null) {
			throw new IllegalStateException("bag already contains a laptop");
		}

		this.laptop = laptop;
	}

	public Computer getLaptop() {
		return laptop;
	}

	public int getSize() {
		return size;
	}
}
