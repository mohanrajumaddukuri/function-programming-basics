package functionalprogramming;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class OptionalExample {

	public static void main(String[] args) {
		List<String> courses=Arrays.asList("Java","C","C++","Python");
		Predicate<? super String> predicate=course->course.startsWith("C");
		Optional<String> optional = courses.stream().filter(predicate).findFirst();
		System.out.println(optional);
		System.out.println(optional.isEmpty());
		System.out.println(optional.isPresent());
		System.out.println(optional.get());
	}

}
