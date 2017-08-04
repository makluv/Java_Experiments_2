import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	

	
	public static void main(String[] args) {
		
		ArrayList<Integer> first = new ArrayList<Integer>();
		ArrayList<Integer> second = new ArrayList<Integer>();
		
		first.add(4);
		first.add(5);
		first.add(6);
		printList(first);
		System.out.println("-------");
		
		second.add(1);
		second.add(2);
		second.add(3);
		printList(second);
		System.out.println("-------");
		
		combine(first, second);
		printList(first);
	
	}
	
	public static void combine(ArrayList<Integer> first, ArrayList<Integer> second) {
		int amount = second.size();
		for(int i = 0; i < amount; i++) {
			first.add(0, second.get(amount - i - 1));
		}
	}
	
	public static void printList(ArrayList<Integer> array) {
		for(int i = 0; i < array.size(); i++) {
			System.out.println("[" + i + "]: " + array.get(i));
		}
	}

}
