package functionalprogramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program1Structural {

	public static void main(String[] args) {
		
		List<Integer> numbers=new ArrayList<>(Arrays.asList(1,2,3,4,5,12,10));
		//printAllNumbersInList(numbers);
		printEvenNumbersInList(numbers);
		//printAllNumbersInList(Arrays.asList(1,2,3,4,5));
	}
	
	private static void printAllNumbersInList(List<Integer> numbers) {
		for(int number:numbers) {
			System.out.println(number);
		}
	}
	
	private static void printEvenNumbersInList(List<Integer> numbers) {
		for(int number:numbers) {
			if(number%2==0) {
				System.out.println(number);
			}
		}
	}

} 
