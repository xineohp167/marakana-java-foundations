package shapes;

public class Rectangle {
	
	private final int width, height;

	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public int getWidth() {
		return width;
	}
	

	

	public int getHeight() {
		return height;
	}

	public Rectangle copyWithWidth(int width) {
		return new Rectangle(width, this.height);
	}
	
	public Rectangle copyWithHeight(int height) {
		return new Rectangle(this.width, height);
	}
	
	public int getArea(){
		return width * height;
	}
	
	public int getPerimeter(){
		return 2 * (width + height);
	}
	
	public double getDiagonal(){
		return Math.sqrt((width * width) + (height * height));
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + height;
		result = prime * result + width;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rectangle other = (Rectangle) obj;
		if (height != other.height)
			return false;
		if (width != other.width)
			return false;
		return true;
	}
	
	

}
