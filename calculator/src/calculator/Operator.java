package calculator;

public enum Operator {
	ADD {
		@Override
		public int operate(int lhs, int rhs) {
			return lhs + rhs;
		}
	}, SUBTRACT {
		@Override
		public int operate(int lhs, int rhs) {
			return lhs - rhs;
		}
	}, MULTIPLY {
		@Override
		public int operate(int lhs, int rhs) {
			return lhs * rhs;
		}
	}, DIVIDE {
		@Override
		public int operate(int lhs, int rhs) {
			return lhs / rhs;
		}
	};
	
	public abstract int operate(int lhs, int rhs);

}
