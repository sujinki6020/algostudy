package algostudy.sujin.datastructure;

import java.util.ArrayList;
import java.util.List;

// ArrayLsit : Resizable array implementation of the List interface.

public class ArrayListPractice {
	public static void main(String[] args) {
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee("Jane", "Jones", 123));
		employeeList.add(new Employee("John", "Doe", 4567));
		employeeList.add(new Employee("Mary", "Smith", 22));
		employeeList.add(new Employee("Mike", "Wilson", 3245));
		
//		employeeList.forEach(employee -> System.out.println(employee));
//		System.out.println(employeeList.get(1));
//		System.out.println(employeeList.isEmpty());
		
		employeeList.set(1, new Employee("John", "Adams", 4568)); // add가 아니라 replace
		employeeList.forEach(employee -> System.out.println(employee));
		
		System.out.println(employeeList.size());
		
		employeeList.add(3, new Employee("John", "Doe", 4567)); // index[3]에 add -> 원래 있던 wilson은 뒤로 밀림
		employeeList.forEach(employee -> System.out.println(employee));
		
//		System.out.println("-----------------------------");
		
//		Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);
//		for(Employee emp : employeeArray) {
//			System.out.println(emp);
//		}
//		
//		System.out.println(employeeList.contains(new Employee("Mary", "Smith", 22))); // false --> Employee Class에 equals() 추가 -> true
//		System.out.println(employeeList.indexOf(new Employee("John", "Doe", 4567)));

		System.out.println("-----------------------------");
		
		employeeList.remove(2);
		employeeList.forEach(employee -> System.out.println(employee));
 	}
	
}
