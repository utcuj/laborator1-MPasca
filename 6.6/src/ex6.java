import java.math.BigInteger;

public class ex6 {
	public static void main(String [] args) {
		BigInteger value = BigInteger.TWO.pow(64).subtract(BigInteger.ONE);
		System.out.println(value);
	}
}
