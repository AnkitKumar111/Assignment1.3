
public class swap {
	/*
    This shows how to swap value of two numbers 
    without using third variable.
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 10;
		int y = 20;
		
		System.out.println("value of x and y before swapping, x: " + x +" y: " + y);

		//swapping value of two numbers without using temp variable
		x = x+ y; //now x is 30 and y is 20
		y = x-y; //now x is 30 but y is 10 (original value of a)
		x = x -y; //now x is 20 and y is 10, numbers are swapped
       
		System.out.println("value of x and y after swapping, x: " + x +" y: " + y);
	}

}
