package quiz;

public class No4 implements Calculable {

	@Override
	public double calculate(double num1, double num2) {
		return num1 % num2;
	}

	@Override
	public double caladd(double num1, double num2) {
		return num1 + num2;
	}

	@Override
	public double calsub(double num1, double num2) {
		return num1 - num2;
	}

	@Override
	public double calmul(double num1, double num2) {
		return num1 * num2;
	}

	@Override
	public double caldiv(double num1, double num2) {
		return num1 / num2;
	}
	
	public static void main(String[] args) {
		No4 calculator = new No4();
		
		System.out.println(calculator.calculate(5.0, 3.0));
		System.out.println(calculator.caladd(5.0, 3.0));
		System.out.println(calculator.calmul(5.0, 3.0));
		System.out.println(calculator.calsub(5.0, 3.0));
		System.out.println(calculator.caldiv(5.0, 3.0));
	}

}
