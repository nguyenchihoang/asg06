package asg06update;


public class Square extends Expression {
	private Expression ex;
	Square(Expression a){
		ex=a;
	}
	public String toString() {
		// TODO Auto-generated method stub
		return "Bieu tuc la " + ex;
	}
	public int  evalute() {
		// TODO Auto-generated method stub
		return ex.evalute()*ex.evalute();
	}
	
}
