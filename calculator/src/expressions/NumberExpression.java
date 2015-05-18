package expressions;

public class NumberExpression implements Expression {
	
	private final int value;
	
	public NumberExpression(int value) {
		this.value = value;
	}

	@Override
	public int getValue() {
		return value;
	}
	
	public String toString(){
		return String.valueOf(value);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + value;
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
		NumberExpression other = (NumberExpression) obj;
		if (value != other.value)
			return false;
		return true;
	}

	
}
