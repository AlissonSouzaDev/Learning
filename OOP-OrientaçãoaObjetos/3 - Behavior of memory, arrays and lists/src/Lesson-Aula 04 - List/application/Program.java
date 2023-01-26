package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco");
		
		System.out.println(list.size());
		
		for (String names : list) {
			System.out.println(names);
		}
		System.out.println("---------------------------");
		
		list.remove("Anna");
		list.remove(1);
		list.removeIf(x -> x.charAt(0) == 'M');
		for (String names : list) {
			System.out.println(names);
		}
		
		System.out.println("----------------------------");
		System.out.println("Index Of Bob: " + list.indexOf("Bob"));
		System.out.println("Index Of Marco: " + list.indexOf("Marco"));
		
		System.out.println("----------------------------");
		List <String> result = list.stream().filter(x -> x.charAt(0) == 'B').collect(Collectors.toList());
		for (String namesB : list) {
			System.out.println(namesB);
		}
		result.add("Anna");
		result.add("Alex");
		
		System.out.println("----------------------------");
		System.out.println(result);
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
	}

}
