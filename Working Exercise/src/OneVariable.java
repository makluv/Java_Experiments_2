import java.util.Scanner;

public class OneVariable {
	
	private int x;
	
	public OneVariable(Scanner x) {
		
		
		
		boolean truth = true;
		while(truth) {
			System.out.println("Enter a positive integer:");
			this.x = x.nextInt();	
			if(this.x > 0) {
				truth = false;
				x.close();
				
			}
			else {
				System.out.println("You have entered a non-positive integer; please try again. \n");
			}
		}
	}
	
	public void x() {
		for(int x = 0; x <  13; x++) {
			System.out.println(this.x + " times " + x + "= " + (this.x)*x);
		}
	}

	
	
	
	public static void main(String[] args) {
		OneVariable x = new OneVariable(new Scanner(System.in));
		x.x();
	}
	
	
	
		
		
	
	
	

}
