package com.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {

		List<String> lists = new ArrayList<String>();

		lists.add("A");
		lists.add("B");
		lists.add("C");

		List<String> lists2 = new ArrayList<String>();
		lists2.add("Sami");

		lists.remove(1);

		lists2.addAll(lists);

//		for (String str : lists2) {
//			System.out.println(str);
//		}

		Employee e1 = new Employee(1, "Sami");
		Employee e2 = new Employee(2, "Sadi");
		Employee e3 = new Employee(3, "babu");

		List<Employee> employees = new ArrayList<Employee>();
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e1);

//		employees.forEach(e -> {
//			System.out.println(e);
//		});

		List<EmployeeDto> emplists = employees.stream().map(EmployeeDto::from).collect((Collectors.toList()));

		Set<EmployeeDto> empSet = employees.stream().map(EmployeeDto::from).collect((Collectors.toSet()));

//		empSet.forEach(e -> {
//			System.out.println(e);
//		});

//		emplists.forEach(e -> {
//			System.out.println(e);
//		});

		Set<Employee> employeesSet = new HashSet<Employee>();
		employeesSet.add(e1);
		employeesSet.add(e2);
		employeesSet.add(e3);
		employeesSet.add(e1);

//		employeesSet.forEach(e -> {
//			System.out.println(e);
//		});

		Map<Integer, String> maps = new HashMap<Integer, String>();

		maps.put(e1.getId(), e1.getName());
		maps.put(e2.getId(), e2.getName());
		maps.put(e3.getId(), e3.getName());

		maps.entrySet().forEach(e -> {
			System.out.println(e);
		});

		maps.keySet().forEach(k -> {
			System.out.println(k);
		});

		maps.values().forEach(v -> {
			System.out.println(v);
		});

	}
}
