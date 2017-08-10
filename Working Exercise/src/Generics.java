import java.util.ArrayList;
import java.util.List;

public class Generics {
	
	public static <T> void printArray(List<T> array) {
		for(T element : array) {
			System.out.printf("%s ", element);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> array1 = new ArrayList<>();
		array1.add(0, 1);
		array1.add(1, 2);
		array1.add(2, 3);
		
		printArray(array1);
		
	}

}
