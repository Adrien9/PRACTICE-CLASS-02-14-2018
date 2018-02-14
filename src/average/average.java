package average;

public class average {
public static void main(String[]args){
		
		//Way 1 
	
		double a=72, b=6, c=91;
		double p=averageNumbers(a,b,c);
		System.out.println("The average is " +p );
		
		double d=200, e=1, f=117;
		double p2=averageNumbers(d,e,f);
		System.out.println("The average is " +p2 );
	}
	public static double averageNumbers(double num1, double num2, double num3){

		double average=(num1 + num2 + num3)/3;
		return average;
	}
}


