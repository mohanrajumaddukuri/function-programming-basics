package functionalprogramming;

import java.util.Arrays;
import java.util.List;

public class FunctionalString {
	
	public static void main(String args[]) {
		List<String> courses=Arrays.asList("Spring","Spring mvc","Spring boot",
				"java","jsp","H2");
		printAllCourses(courses);
		printCoursesContainsSpring(courses);
		printCoursesContainsLength(courses);
		printNoOfCharInEachCourse(courses);
	}
	private static void printAllCourses(List<String> courses) {
		System.out.println("All Courses:");
		courses.stream().forEach(System.out::println);
	}
	
	private static void printCoursesContainsSpring(List<String> courses) {
		System.out.println("courses contains Spring:");
		courses.stream().filter(course->course.contains("Spring"))
		.forEach(System.out::println);;
	}
	
	private static void printCoursesContainsLength(List<String> courses) {
		System.out.println("courses contains max length 4:");
		courses.stream().filter(course->course.length()>=4)
		.forEach(System.out::println);;
	}
	
	private static void printNoOfCharInEachCourse(List<String> courses) {
		System.out.println("No Of Characters in Each Course:");
		courses.stream().map(course->course+": "+course.length())
		.forEach(System.out::println);;
	}
}
