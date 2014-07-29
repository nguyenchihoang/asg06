package asg06update;

public class Subtraction extends BinaryExpression {
	private Expression left;
	private Expression right;
	Subtraction(Expression a,Expression b){
		left=a;
		right=b;
	}
	public int evalute(){
		return ( left.evalute()-right.evalute());
	}
	public String toString(){
		// TODO Auto-generated method stub
		return String.format("% s %s ",left, right);
	}

}
