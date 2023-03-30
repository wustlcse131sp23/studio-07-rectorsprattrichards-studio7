package studio7;

public class Fraction {
	private int numerator;
	private int denominator;
	private String fractionString;
	public Fraction(int initNumerator, int initDenominator) {
		numerator=initNumerator;
		denominator=initDenominator;
		fractionString= numerator + "/" + denominator;
	}
	public int getNumerator() {
		return numerator;
	}
	public int getDenominator() {
		return denominator;
	}
	public String toString() {
		return fractionString;
	}

	public String multiply(Fraction A, Fraction B) {
		 int multiplyNum= (A.getNumerator() * B.getNumerator());
		int multiplyDenom=(A.getDenominator() * B.getDenominator());
		return multiplyNum + "/" + multiplyDenom;
	}
	public String reciprocal() {
		return denominator + "/" + numerator;
	}
	public static Fraction addition(Fraction A, Fraction B) {
		int commonDenom=A.getDenominator()* B.getDenominator();
		int numeratorA= A.getNumerator()* B.getDenominator();
		int numeratorB=B.getNumerator() * A.getDenominator();
		Fraction add = new Fraction (numeratorA+numeratorB, commonDenom);
		return add;
	}
	public static int gcd(int p, int q) {
		
		
		// FIXME compute the gcd of p and q using recursion
			if (p%q== 0){
		return q;
			}
			else {
				return gcd(q, p%q);
			}
	}
	public Fraction simplify (int numerator,int denominator) {
		
		
	}
	public static void main(String[] args) {
		Fraction C= new Fraction(1,2);
		Fraction D= new Fraction(3,4);
		System.out.println(addition(C,D));
	}
}