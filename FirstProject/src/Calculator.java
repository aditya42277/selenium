public class Calculator {
	
	public int add(int num1, int num2) {
		return num1 + num2;
	}
	
	public int subtract(int num1, int num2) {
		if(num2 > num1) {
			return -99;
		}
		return num1 - num2;
	}
	
	public int multiply(int num1, int num2) {
		return num1 * num2;
	}
	
	public int divide(int num1, int num2) {
		if(num2 == 0) {
			return -99;
		}
		
		return num1 / num2;
	}
	
	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		System.out.println("Addition : " + calc.add(10, 25));
		System.out.println("Subtraction : " + calc.subtract(100, 65));
		System.out.println("Multiplication : " + calc.multiply(10, 25));
		System.out.println("Divide : " + calc.divide(100, 25));
	}

}
