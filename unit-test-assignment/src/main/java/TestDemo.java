
public class TestDemo {
	
	public int addPositive(int a, int b) {
		int sum = a+b;
		if( a < 0 || b < 0) {
			throw new IllegalArgumentException("Both parameters must be positive!");
		}
		else {
			return sum;
		}
		
	}

}
