package expression;

import exceptions.OverflowException;
import exceptions.ParseExceptions;
import operations.Operation;

public class CheckedDivide<T> extends AbstractBinaryOper<T> {

	public CheckedDivide(TripleExpression<T> x, TripleExpression<T> y, Operation<T> op) {
		super(x, y, op);
	}

	@Override
	protected T apply(T x, T y) throws ParseExceptions {
		return oper.div(x, y);
	}

}
