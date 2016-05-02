package by.htp3.JD01.Lesson05.Fraction;


/**
 * @author Dmitry Litvinovich (HTP3-by-JD01-2016)
 *
 */
public class SimpleFraction {

	private final long numerator;

	private final long denominator;

	/**
	 * @param numerator
	 * @param denominator cannot be a 0
	 * 
	 * @throws RuntimeException if denominator is 0.
	 */
	public SimpleFraction(long numerator, long denominator) {
		if(0 == denominator){
			throw new RuntimeException ("Division by zero");
		}

		long result = gcd(Math.abs(numerator), Math.abs(denominator));
		if (result > 1) {
			this.numerator = numerator / result;
			this.denominator = denominator / result;
		} else {
			this.numerator = numerator;
			this.denominator = denominator;
		}
	}

	public SimpleFraction add(SimpleFraction value){
		return new SimpleFraction(this.numerator*value.denominator + this.denominator*value.numerator, this.denominator*value.denominator);
	}

	public SimpleFraction subtract(SimpleFraction value) {
		return new SimpleFraction(this.numerator*value.denominator - this.denominator*value.numerator, this.denominator*value.denominator);
	}

	public SimpleFraction multiply(SimpleFraction value) {
		return new SimpleFraction(this.numerator*value.numerator, this.denominator*value.denominator);
	}

	public SimpleFraction divide(SimpleFraction value) {
		return new SimpleFraction(this.numerator*value.denominator, this.denominator*value.numerator);
	}

	private long gcd(long num, long denom) {
		if (denom == 0) {
			return num;
		}

		long s = num % denom;
		return gcd(denom, s); 
	}

	@Override
	public String toString() {
		return "" + numerator + "/" + denominator;
	}

}
