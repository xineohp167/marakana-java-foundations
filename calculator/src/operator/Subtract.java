package operator;

public class Subtract implements Operator{

	@Override
	public int operate(int lhs, int rhs) {
		return lhs - rhs;
	}

}
