package sum;

public class sum {

	public static void main(String[]args){
		
		//Way #1 
		int a=6, b=21;
		int c=addNumbers(a,b);
		System.out.println("The sum is " +c );
		
		//Way #2
		int r= addNumbers(3,5);
		System.out.println("The sum is "+ r );
		
		//Way #3
		System.out.println("The sum is " +addNumbers(18,31));
	}
	public static int addNumbers(int num1, int num2){

		int sum=num1 + num2;
		return sum;
	}
}


