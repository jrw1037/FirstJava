package pkg1;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] a;
		
		a = new int[5];
		
		
		int sum = 0;
		
		for(int i=0; i<a.length; i++) {
			if(a[i]==4) {
				break;
			}
			
			a[i] = i+1;
			sum += a[i];
			
			System.out.println("Sum = " + sum);
			
			
		
			
			//System.out.println("Array size = " + i + " value will be " + a[i]);
		}
		
		

	}

}
