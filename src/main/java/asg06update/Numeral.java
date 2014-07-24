package asg06update;

public class Numeral extends Expression {
	private int valu;
	Numeral(int a){
		valu=a;
	}


	public String toString() {
		// TODO Auto-generated method stub
		return "valu" + valu;
	}
	public int evalute() {
		// TODO Auto-generated method stub
		return valu;
	}
}
