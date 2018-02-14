package compare;

public class compare {

	public static void main(String[]args){

		//Way 1
		
		int a=82, b=64;
		int a2=2, b2=221;
		int a3=18, b3=31;

		int c=compareNumbers(a,b);
		System.out.println(c);

		int c2=compareNumbers(a2,b2);
		System.out.println(c2);

		int c3=compareNumbers(a3,b3);
		System.out.println(c3);  

	}

	public static int compareNumbers(int num1, int num2){

		if(num1>num2)
		{
			return num1;
		}
		else
		{
			return num2;
		}	
	}
}
