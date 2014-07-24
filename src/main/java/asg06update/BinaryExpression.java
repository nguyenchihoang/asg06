package asg06update;



 abstract public class BinaryExpression extends Expression {
	public Expression left;
	public Expression right;
	Expression left(){
		return left;
	}
	Expression right(){
		return right;
	}
}
