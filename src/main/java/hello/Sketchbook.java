package hello;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Sketchbook {
	
	public void test() {
		final List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");

		final List<String> newList = myList
		    .stream()
		    .filter(s -> s.startsWith("c"))
		    .map(String::toUpperCase)
		    .sorted()
		    .collect(Collectors.toList());
		    //.forEach(System.out::println);
		
		newList.forEach(System.out::println);
}
	
	public static void main(String[] args) {
		Sketchbook sketchbook = new Sketchbook();
		sketchbook.test();
		
	}
}