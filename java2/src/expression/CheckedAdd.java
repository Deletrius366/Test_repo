package expression;

import exceptions.OverflowException;
import exceptions.ParseExceptions;
import operations.Operation;

public class CheckedAdd<T> extends AbstractBinaryOper<T> {

	public CheckedAdd(TripleExpression<T> x, TripleExpression<T> y, Operation<T> op) {
		super(x, y, op);
	}

	@Override
	protected T apply(T x, T y) throws ParseExceptions {
		return oper.add(x, y);
	}

}
