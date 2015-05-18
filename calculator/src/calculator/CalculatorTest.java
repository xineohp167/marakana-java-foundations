package calculator;

import static org.junit.Assert.*;

import java.util.Stack;

import org.junit.Test;

import expressions.Expression;
import expressions.NumberExpression;
import expressions.OperationExpression;

public class CalculatorTest {

	/*
	 * TODO:
	 *   handleNumber:
	 *     should handle number: push number and return true
	 *     should not handle non-number: do nothing and return false
	 *     
	 *   handleOperator
	 *     should handle operator: pop, op, push and return true
	 *     should not handle non-operator: do nothing and return false
	 *     
	 *   calculate
	 *     integration test: result is calculated correctly
	 *     BONUS: if you pass garbage, it should throw an exception
	 */

	@Test
	public void handleNumberMustHandleNumbers() {
		Stack<Expression> stack = new Stack<Expression>();
		boolean result = Calculator.handleNumber(stack, "5");
		assertTrue(result);
		assertEquals(1, stack.size());
		assertEquals(new NumberExpression(5), stack.peek());
	}

	@Test
	public void handleNumberMustNotHandleGarbage() {
		Stack<Expression> stack = new Stack<Expression>();
		boolean result = Calculator.handleNumber(stack, "garbage");
		assertFalse(result);
		assertTrue(stack.isEmpty());
	}

	@Test
	public void handleOperatorMustHandleAddition() {
		Stack<Expression> stack = new Stack<Expression>();
		stack.push(new NumberExpression(3));
		stack.push(new NumberExpression(5));
		boolean result = Calculator.handleOperator(stack, "+");
		assertTrue(result);
		assertEquals(1, stack.size());
		assertEquals(new OperationExpression(new NumberExpression(3), new NumberExpression(5), Operator.ADD), stack.peek());
	}

	@Test
	public void handleOperatorMustNotHandleGarbage() {
		Stack<Expression> stack = new Stack<Expression>();
		boolean result = Calculator.handleOperator(stack, "garbage");
		assertFalse(result);
		assertTrue(stack.isEmpty());
	}

	@Test
	public void onePlusOneMustEqualTwo() {
		assertEquals(2, Calculator.calculate("1 1 +"));
	}

	@Test(expected = IllegalArgumentException.class)
	public void calculatorMustNotAcceptGarbage() {
		Calculator.calculate("garbage");
	}
	
	@Test
	public void toStringMustConvertExpressionToInfixFormat(){
		Expression e = Calculator.parse("1 2 3 + -");
		assertEquals("(1 - (2 + 3))", e.toString());
	}

}
