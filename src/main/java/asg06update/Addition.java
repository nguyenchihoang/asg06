package asg06update;


public class Addition extends BinaryExpression {
	private Expression left;
	private Expression right;
	Addition(Expression a,Expression b){
		left=a;
		right=b;
	}
	public int evalute(){
		return ( left.evalute()+right.evalute());
	}
	public String toString() {
		// TODO Auto-generated method stub
		return left.toString()+right.toString();
	}
}
