package functionalprogramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FunctionalNumbers {

	public static void main(String[] args) {
		List<Integer> numbers=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));
		printAllNumbersInList(numbers);
		printEvenNumbersInList(numbers);
		printSquaresOfOddNumbers(numbers);
		printCubesOfOddNumbers(numbers);
	}
	
	private static void printAllNumbersInList(List<Integer> numbers) {
		System.out.println("All Numbers in the List:");
		numbers.stream().forEach(System.out::println);
		}
	private static void printEvenNumbersInList(List<Integer> numbers) {
		System.out.println("Even Numbers in the List:");
		numbers.stream().filter(number->number%2==0)
		.forEach(System.out::println);
		}
	private static void printSquaresOfOddNumbers(List<Integer> numbers) {
		System.out.println("Squares of ODD Numbers in the List:");
		numbers.stream().filter(number->number%2!=0)
		.map(number->number*number).forEach(System.out::println);
	}
	private static void printCubesOfOddNumbers(List<Integer> numbers) {
		System.out.println("Cubes of ODD Numbers in the List:");
		numbers.stream().filter(number->number%2!=0)
		.map(number->number*number*number).forEach(System.out::println);
	}
}
