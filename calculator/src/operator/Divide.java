package operator;

public class Divide implements Operator{

	@Override
	public int operate(int lhs, int rhs) {
		return lhs / rhs;
	}

}
