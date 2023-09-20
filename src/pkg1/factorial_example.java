package pkg1;

public class factorial_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 5;
		int factor_sum = 1;
		
		int num2 = 1;
		
		if(num==0) {
			System.out.println("Factorial Num: " + "1");
			
		}else if (num==1) {
			System.out.println("factorial Num: " + "1");
		} else {
			
			while(num2<num) {
				
				factor_sum = factor_sum * num2;
				num2++;
				System.out.println("Factor Sum: " + factor_sum);
				
			}
		}
		
	}

}
