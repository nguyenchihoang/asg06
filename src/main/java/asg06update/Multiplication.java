package asg06update;

public class Multiplication extends BinaryExpression {
	private Expression left;
	private Expression right;
	Multiplication(Expression a,Expression b){
		left=a;
		right=b;
	}
	public int evalute(){
		return ( left.evalute()*right.evalute());
	}
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("% s, %s ",left, right);
	}

}
