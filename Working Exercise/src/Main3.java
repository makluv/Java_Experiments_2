import java.util.Scanner;

public class Main3 {
	
	public static void main(String[] args) {
		
		System.out.println("Enter a word:");
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		sc.close();
		
		System.out.println("Precisely " + howManyCharacters(word));
		
	}

	
	public static int howManyCharacters(String word) {
		return word.length();
	}
}
