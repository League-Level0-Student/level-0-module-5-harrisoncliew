package algorithms;

public class Fibonacci {
	public static void main(String[] args) {
		int low=0;
		int high=1;
		int temp=0;
		System.out.println(low);
		for (int i = 0; i < 12; i++) {
			
			temp=low+high;
			low=high;
			high=temp;
			System.out.println(low);
			
			
			
			
		}
	}

}
