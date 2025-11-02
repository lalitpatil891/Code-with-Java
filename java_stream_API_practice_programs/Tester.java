package streamAPI.java_stream_API_practice_programs;

import java.util.Collections;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Tester {
	// ANSI color codes for console output
	private static final String RED = "\033[1;31m";
	private static final String RESET = "\033[0m";

	public static void main(String[] args) {

		List<Employee> list = EmployeeAdder.addDetails();

		Set<Integer> set = new HashSet<>();
		Set<String> set2 = new HashSet<>();

		// 1. Retrieve a list of all female employees
		System.out.println(RED + "***** Female Employees *****" + RESET);
		list.stream().filter(emp -> emp.getGender().equalsIgnoreCase("Female")).forEach(System.out::println);

		// 2. Filter Employees by Age:- Get a list of employees older than 30 years.
		System.out.println(RED + "*****Get a list of employees older than 30 years.********" + RESET);
		list.stream().filter(emp -> emp.getAge() > 30).forEach(System.out::println);

		// 3. Filter Employees by Salary:- Find employees with a salary greater than
		// $50,000.
		System.out.println(RED + "*****Find employees with a salary greater than $50,000.********" + RESET);
		list.stream().filter(emp -> emp.getSalary() > 50000).forEach(System.out::println);

		// 4. Map Employee Names:- Create a list of employee names (Strings).
		System.out.println(RED + "*** Create a list of employee names (Strings) ***" + RESET);
		list.stream().map(employee -> employee.getName()).toList();
		for (Employee emp : list) {
			System.out.println(emp.getName());
		}

		// 5. Calculate Average Salary:- Calculate the average salary of all employees.
		System.out.println(RED + "*********Calculate the average salary of all employees.*******" + RESET);
		double orElseThrow = list.stream().mapToDouble(Employee::getSalary).average().orElseThrow();
		System.out.println("Average : " + orElseThrow);

//		6. Find Maximum Salary:- Find the employee with the highest salary.
		System.out.println(RED + "*********Find the employee with the highest salary.********" + RESET);

		double max = list.stream().mapToDouble(Employee::getSalary).max().orElseThrow();
		System.out.println("MaxSalary: " + max);

//		7.Group Employees by Gender:
//		   - Group employees by gender and return
//		   a map with gender as the key and a list of employees as the value.
		System.out.println(RED + "******Group employees by gender and return a map******" + RESET);
		list.stream().collect(Collectors.groupingBy(Employee::getGender))
				.forEach((key, value) -> System.out.println(key + " - " + value));

//		8. Count Male Employees:
//			   - Count the number of male employees.
		System.out.println(RED + "**********Count the number of male employees.*********" + RESET);
		long count = list.stream().filter(employee -> employee.getGender().equals("Male")).count();
		System.out.println("Count : " + count);

		// 9. Sum of All Salaries:
//		   - Calculate the total sum of salaries for all employees.
		System.out.println(RED + "*********Calculate the total sum of salaries for all employees.**********" + RESET);
		double sum = list.stream().mapToDouble(employee -> employee.getSalary()).sum();
		System.out.println("Sum : " + sum);

//		10. Sort Employees by Name:- Sort the employees by their names in alphabetical order.
		System.out.println(RED + "*******Sort the employees by their names in alphabetical order.*****" + RESET);
		list.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);

//		11. Sort Employees by Age:- Sort the employees by age in ascending order.
		System.out.println(RED + "**********Sort the employees by age in ascending order.********" + RESET);

		list.stream().sorted(Comparator.comparing(Employee::getAge)).forEach(System.out::println);

//		12. Sort Employees by Salary:- Sort the employees by salary in descending order.
		System.out.println(RED + "*********Sort the employees by salary in descending order.******" + RESET);

		list.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).forEach(System.out::println);

//		13. Find Oldest Employee:- Find the oldest employee.
		System.out.println(RED + "*********Find the oldest employee.*********" + RESET);
		int orElseThrow2 = list.stream().mapToInt(Employee::getAge).max().orElseThrow();
		Employee employee = list.stream().max((e1, e2) -> (e1.getAge() - e2.getAge())).get();
		System.out.println(employee);
		System.out.println("Max age of Employee: " + orElseThrow2);

		// or

		Employee oldest = list.stream().max((e1, e2) -> Integer.compare(e1.getAge(), e2.getAge())).get();

		System.out.println("Oldest Employee: " + oldest);

//		14. Group Employees by Age:- Group employees into age groups (e.g., 20-30, 31-40, etc.) and return a map with age group as the key and a list of employees as the value.
		System.out.println(RED + "**** Group employees into age groups (e.g., 20-30, 31-40, etc.) *****" + RESET);
		list.stream().collect(Collectors.groupingBy(emp -> {
			int age = emp.getAge();
			if (age >= 20 && age <= 30)
				return "20-30";
			else if (age >= 31 && age <= 40)
				return "31-40";
			else
				return "40+";
		})).forEach((key, value) -> System.out.println(key + " -> " + value));

//		15. Find Employees with a Specific Age:- Find all employees who are exactly 35 years old.
		System.out.println(RED + "************ Find all employees who are exactly 35 years old.***********" + RESET);
		list.stream().filter(k -> k.getAge() == 35).forEach(System.out::println);

//		16. Calculate the Sum of Salaries by Gender: - Calculate the sum of salaries for each gender (i.e., male and female) and return a map with gender as the key and the sum of salaries as the value.
		System.out.println(RED + "********* Calculate the sum of salaries for each gender**********" + RESET);
		list.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.summingDouble(Employee::getSalary)))
				.forEach((key, value) -> System.out.println(key + " : " + value));

//		17. Find Employees with Names Starting with "L":- Find all employees whose names start with the letter "M."
		System.out.println(RED + "*********Find all employees whose names start with the letter S******" + RESET);
		list.stream().filter(k -> k.getName().startsWith("L")).forEach(System.out::println);

		/*18. Calculate the Average Salary for Male and Female Employees:
			- Calculate the average salary separately for male and female employees and return a map with gender as the key and the average salary as the value.*/
		System.out.println(
				RED + "**********Calculate the average salary separately for male and female*********" + RESET);
		list.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)))
				.forEach((key, value) -> System.out.println(key + " : " + value));

		// 19. Find the Top N Highest Paid Employees:- Find the top N employees with the
		// highest salaries.
		System.out.println(RED + "*******Find the top N employees with the highest salaries.********" + RESET);
		list.stream().sorted((o1, o2) -> -(int) (o1.getSalary() - o2.getSalary())).limit(5)
				.forEach(System.out::println);
		// or
		System.out.println("=====");
		list.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).limit(3)
				.forEach(System.out::println);

//		20. Retrieve Distinct Age Values:
//	    - Get a list of distinct ages of all employees.
		System.out.println(RED + "*********Get a list of distinct ages of all employees.*********" + RESET);
		// 1. Using distinct()
		list.stream().map(Employee::getAge).distinct().forEach(System.out::println);
		System.out.println(RED + "------------------------" + RESET);
		// 2. Using a Set
		Set<Integer> uniqueAges = list.stream().map(Employee::getAge).collect(Collectors.toSet());
		System.out.println(uniqueAges);

//		21. Find the Three Lowest-Paid Employees:
//			   - Find and display the names of the three employees with the lowest salaries.
		System.out.println(RED
				+ "*******Find and display the names of the three employees with the lowest salaries.********" + RESET);
		list.stream().sorted(Comparator.comparingDouble(Employee::getSalary)).limit(3).forEach(System.out::println);

//		22. Sort Employees by Name Length:
//		  - Sort employees by the length of their names (shortest to longest).
		System.out.println(
				RED + "*******Sort employees by the length of their names (shortest to longest).*******" + RESET);
		list.stream().sorted((o1, o2) -> (o1.getName().length() - o2.getName().length())).forEach(System.out::println);

		System.out.println(RED + "**************" + RESET);
		list.stream().map(Employee::getGender).distinct().forEach(System.out::println);

		System.out.println(RED + "**************" + RESET);
		Map<String, List<Employee>> grouped = list.stream().collect(Collectors.groupingBy(Employee::getGender));

		System.out.println(grouped);

		System.out.println(RED + "**************" + RESET);
		double totalSalary = list.stream().map(Employee::getSalary).reduce(0.0, Double::sum);
		System.out.println(totalSalary);

//		22. Sort Employees by Name Length: - Sort employees by the length of their names (shortest to longest).
		System.out.println(
				RED + "******Sort employees by the length of their names (shortest to longest).********" + RESET);
		list.stream().sorted((o1, o2) -> (o1.getName().length() - o2.getName().length())).forEach(System.out::println);

		/*23. Group Employees by Age Range: Group employees into custom age ranges (e.g., 20-29, 30-39, etc.) and
		return a map with the age range as the key and a list of employees as the value.*/
		System.out.println(
				RED + "*********Group employees into custom age ranges (e.g., 20-29, 30-39, etc.)*********" + RESET);
		list.stream().collect(Collectors.groupingBy((t) -> {
			int age = (t).getAge();

			if (age >= 20 && age <= 29)
				return "20-29";
			else if (age >= 30 && age <= 39)
				return "30-39";
			else
				return "40+";
		})).forEach((key, value) -> System.out.println(key + " - " + value));

		System.out.println(
				RED + "*******now group employees by age range AND count how many employees are in each range.*******"
						+ RESET);

		list.stream().collect(Collectors.groupingBy((t) -> {
			int age = t.getAge();

			if (age >= 20 && age <= 29)
				return "20-29";
			else if (age >= 30 && age <= 39)
				return "30-39";
			else
				return "40+";
		}, Collectors.counting())).forEach((key, value) -> System.out.println(key + " - " + value));

		// 24. Find the Average Salary of Employees Aged 30 or Younger:- Calculate the
		// average salary of employees aged 30 or younger.
		System.out.println(RED + "********Calculate the average salary of employees aged 30 or younger.******" + RESET);
		double orElseThrow3 = list.stream().filter(e -> e.getAge() <= 30).mapToDouble(k -> k.getSalary()).average()
				.orElseThrow();
		System.out.println(orElseThrow3);

		// 25. Find the Names of Male Employees with Salaries Over $60,000:- Retrieve
		// the names of male employees with salaries over $60,000.
		System.out.println(
				RED + "**********Retrieve the names of male employees with salaries over $53,000.***********" + RESET);
		list.stream().filter(e -> e.getSalary() >= 53000 && e.getGender() == "Male").map(k -> k.getName())
				.forEach(System.out::println);

		// 26. Find the Youngest Female Employee:- Find the youngest female employee.
		System.out.println(RED + "**********Find the youngest female employee.**********" + RESET);
		Employee youngestEmp = list.stream().filter(e -> e.getGender() == "Female")
				.min((e1, e2) -> Integer.compare(e1.getAge(), e2.getAge())).get();
		System.out.println("Youngest female Employee: " + youngestEmp);

		// 27. Retrieve the Names of Employees in Reverse Order:- Get a list of employee
		// names in reverse order (from the last employee to the first).
		System.out.println(RED + "*** Get a list of employee names in reverse order ***" + RESET);
		List<String> collect = list.stream().map(k -> k.getName()).collect(Collectors.toList());
		Collections.reverse(collect);
		System.out.println(collect);

		// 28. Find the Highest Salary Among Female Employees:- Find the highest salary
		// among female employees.
		System.out.println(RED + "******Find the highest salary among female employees." + RESET);
		Employee emp28 = list.stream().filter(e -> e.getGender() == "Female")
				.max((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary())).get();
		System.out.println(emp28);
		// OR
		Employee emp028 = list.stream().filter(k -> k.getGender().equals("Female"))
				.collect(Collectors.maxBy((e1, e2) -> (int) (e1.getSalary() - e2.getSalary()))).get();
		System.out.println(emp28);

		// 29. Group Employees by Age and Gender:- Group employees by both age and
		// gender and return a multi-level map.
		System.out
				.println(RED + "*** Group employees by both age and gender and return a multi-level map. ***" + RESET);

		Map<String, Map<Integer, List<Employee>>> collect2 = list.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.groupingBy(Employee::getAge)));
		collect2.forEach((key, value) -> {
			value.forEach((k, v) -> System.out.println(k + " --age-- " + v));
			System.out.println(key + " --gender-- " + value);
		});

//		30. Find the Sum of Salaries for Employees with Names Containing "Smith":- Calculate the sum of salaries for employees whose names contain the substring "Smith."
		System.out.println(
				RED + "*** Calculate the sum of salaries for employees whose names contain the substring Smith ***"
						+ RESET);
		Double salSum = list.stream().filter(e -> e.getName().contains("Lalit"))
				.collect(Collectors.summingDouble(e -> e.getSalary()));
		System.out.println("Sum: " + salSum);
		// OR
		Double salSum2 = list.stream().filter(k -> k.getName().contains("Lalit")).mapToDouble(k -> k.getSalary()).sum();
		System.out.println("SalSum2: " + salSum2);

		// 31. Find the Names of Employees Aged 30-40 with Salaries Between $50,000 and
		// $60,000:- Retrieve the names of employees aged 30-40 with salaries between
		// $50,000 and $60,000.
		System.out.println(
				RED + "*** Retrieve the names of employees age 30-40 with salaries between $50,000 and $60,000. ***"
						+ RESET);

		List<Employee> emp = list.stream().filter(
				k -> (k.getAge() >= 30 && k.getAge() <= 40) && (k.getSalary() >= 52000 && k.getSalary() <= 60000))
				.toList();
		emp.forEach(System.out::println);

		// 32. Calculate the Total Number of Employees:- Determine the total count of
		// employees.
		System.out.println(RED + "*** Determine the total count of employees. ***" + RESET);
		Long countEmp = list.stream().count();
		System.out.println("Count is: " + countEmp);

		// 33. Find the Most Common Age Among Employees:Determine the age that is most
		// common among the employees.
		System.out.println(RED + "*** Determine the age that is most common among the employees.***" + RESET);
		Integer mostCommonAge = list.stream()
				// Group by age and count how many employees in each age
				.collect(Collectors.groupingBy(Employee::getAge, Collectors.counting()))
				// Convert map to stream of entries (age, count)
				.entrySet()
				// Find entry with highest count
				.stream().max(Map.Entry.comparingByValue())
				// Get only the key (age)
				.map(Map.Entry::getKey)
				// If empty, throw exception
				.orElseThrow();
		System.out.println("Most Common Age: " + mostCommonAge);

		// 34. Find the Median Salary:- Calculate the median salary of all employees.
		System.out.println(RED + "*** Calculate the median salary of all employees. ***" + RESET);

		List<Employee> list2 = list.stream().sorted(Comparator.comparingDouble(Employee::getSalary)).toList();
		int i = 0;
		for (Employee empp : list2) {
			System.out.println((i++) + " - " + empp.getSalary());
		}

		int size = list2.size();

		if (size % 2 == 0) {

			double s = list2.get(size / 2 - 1).getSalary();
			double s1 = list2.get(size / 2).getSalary();
			System.out.println((s + s1) / 2.0);
		} else {
			System.out.println(list.get(size / 2).getSalary());
		}

		// OR
		double medianSalary[] = list.stream()
				// Convert all salaries into a DoubleStream
				.mapToDouble(Employee::getSalary)
				// Sort salaries in ascending order
				.sorted()
				// Store to array for indexing
				.toArray();

		int length = (int) medianSalary.length;

		double median;
		// If even number of elements, take average of middle two
		if (length % 2 == 0)
			median = (medianSalary[length / 2 - 1] + medianSalary[length / 2]) / 2.0;
		else
			// If odd, take the middle element
			median = medianSalary[length / 2];
		System.out.println("Median Salary: " + median);

		// 35. Group Employees by Age and Count:- Group employees by age and count the
		// number of employees in each age group.
		System.out.println(RED + "*** Group employees by age and count ***" + RESET);
		list.stream().collect(Collectors.groupingBy(Employee::getAge, Collectors.counting()))
				.forEach((key, value) -> System.out.println(key + " - " + value));

		// 36. Find the Employee with the Longest Name:- Find the employee with the
		// longest name.
		System.out.println(RED + "*** Find the employee with the longest name. ***" + RESET);
		Employee empNames = list.stream().max((e1, e2) -> Integer.compare(e1.getName().length(), e2.getName().length()))
				.get();
		System.out.println(empNames);
		// OR
		Employee empNam = list.stream().max((e1, e2) -> e1.getName().length() - e2.getName().length()).get();
		System.out.println(empNam);

		// 37. Calculate the Sum of Salaries for Each Age:- Calculate the sum of
		// salaries for each distinct age in a map.
		System.out.println(RED + "*** Calculate the sum of salaries for each distinct age in a map ***" + RESET);
		Map<Integer, Double> sumByAge = list.stream()
				// Group employees by age
				.collect(Collectors.groupingBy(Employee::getAge,
						// For each age group, sum all salaries
						Collectors.summingDouble(Employee::getSalary)));
		System.out.println(sumByAge);

		// 38. Sort employees first by age in ascending order, and then by salary in
		// descending order.
		System.out.println(
				RED + "*** Sort employees first by age in ascending order, and then by salary in descending order ***"
						+ RESET);
		list.stream()
				.sorted(Comparator.comparing(Employee::getAge)
						.thenComparing(Comparator.comparingDouble(Employee::getSalary).reversed()))
				.forEach(System.out::println);

		// 39. Find Employees Whose Names Contain More Than One Word:- Retrieve
		// employees whose names consist of more than one word.
		System.out.println(RED + "*** Retrieve employees whose names consist of more than one word. ***" + RESET);
		list.stream().filter(e -> e.getName().length() > 4).forEach(System.out::println);

		// 40. Find the Two Highest Paid Female Employees:- Find and display the names
		// of the two highest-paid female employees.
		System.out
				.println(RED + "*** Find and display the names of the two highest-paid female employees. ***" + RESET);
		list.stream().filter(f -> f.getGender().equals("Female"))
				.sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).limit(2)
				.forEach(e -> System.out.println(e.getName() + " - " + e.getSalary()));

		// 41. Find the employee with the highest salary for each gender (male and
		// female).
		System.out.println(
				RED + "*** Find the employee with the highest salary for each gender (male and female).***" + RESET);
		list.stream()
				.collect(Collectors.toMap(Employee::getGender, k -> k,
						(e1, e2) -> e1.getSalary() >= e2.getSalary() ? e1 : e2))
				.forEach((key, value) -> System.out.println(key + "=" + value));

		// 42. Retrieve Employees with Unique Names:- Find employees with unique names
		// (no duplicate names in the list).
		System.out.println(RED + "*** Find employees with unique names (no duplicate names in the list). ***" + RESET);
		list.stream().filter(k -> set2.add(k.getName())).forEach(System.out::println);
		set2.clear();
		// OR
		list.stream().map(e -> e.getName()).distinct().forEach(System.out::println);

		// 43. Find the Names of Employees in Uppercase:- Get a list of employee names
		// in uppercase.
		System.out.println(RED + "*** Get a list of employee names in uppercase. ***" + RESET);
		list.stream().map(e -> e.getName().toUpperCase()).forEach(System.out::println);

		// 44. Calculate the salary range (minimum and maximum) for each distinct age group.
		System.out.println(RED + "*** Calculate the salary range (minimum and maximum) for each distinct age group. ***" + RESET);
			Map<Integer, DoubleSummaryStatistics> salaryRangeByAge =
					list.stream().
					collect(Collectors.groupingBy(
							Employee::getAge, //Grouping by age
							Collectors.summarizingDouble(Employee::getSalary)
							));
			salaryRangeByAge.forEach((age, stats) -> 
					System.out.println("Age: "+age+ " | Min Salary: "+stats.getMin() + " | Max Salary: "+stats.getMax())); 

				// OR
		list.stream().collect(
				Collectors.groupingBy(Employee::getAge, Collectors.collectingAndThen(Collectors.toList(), employees -> {
					double min = employees.stream().mapToDouble(Employee::getSalary).min().orElseThrow();
					double maxs = employees.stream().mapToDouble(Employee::getSalary).max().orElseThrow();
					Map<String, Double> map = new HashMap<>();
					map.put("min", min);
					map.put("max", maxs);
					return map;
				}))).forEach((age, salary) -> System.out.println("Age : " + age + " - " + "Min Salary : "
						+ salary.get("min") + " Max Salary : " + salary.get("max")));

		
		// 45. Filter Employees by First Name Initial:- Retrieve employees whose first name starts with a specific initial (e.g., 'A').
		System.out.println(RED+ "*** Retrieve employees whose first name starts with a specific initial (e.g., 'E'). ***" + RESET);
		list.stream().filter(e -> e.getName().startsWith("L")).forEach(System.out::println);
		

		// 46. Group Employees by Age and List Only Unique Salaries:- Group employees by age and display a list of unique salaries for each age group.
		System.out.println(RED+ "*** Group employees by age and display a list of unique salaries for each age group. ***" + RESET);
		list.stream().collect(Collectors.groupingBy(Employee::getAge, Collectors.mapping(Employee::getSalary, Collectors.toSet())))
			.forEach((key, value) -> System.out.println("Age : "+key+" Salary : "+value));
		
		// 47. Find Employees with the Same Salary:- Identify and display employees who have the same salary.
		System.out.println(RED + "*** Identify and display employees who have the same salary. ***" + RESET);
		list.stream()
		  .collect(Collectors.groupingBy(Employee::getSalary)) // group by salary
		  .entrySet().stream()                                 // loop on each group
		  .filter(e -> e.getValue().size() > 1)                // same salary 
		  .forEach(e -> {
		      System.out.println(e.getKey());                  // salary
		      e.getValue().forEach(System.out::println);       // salary emps
		  });

		// 48. Find the Employee with the Shortest Name Among Male Employees:- Find the male employee with the shortest name.
		System.out.println(RED + "*** Find the male employee with the shortest name. ***" + RESET);
		list.stream().filter(e -> e.getGender().equalsIgnoreCase("Male"))
					.min(Comparator.comparingInt(n -> n.getName().length())).ifPresent(System.out::println);
		
		
		// 49. Find the Most Common Salary Value:- Determine the salary value that appears most frequently among the employees.
		System.out.println(RED + "*** Determine the salary value that appears most frequently among the employees. ***" + RESET);

		list.stream()
		    .collect(Collectors.groupingBy(Employee::getSalary, Collectors.counting())) // group & count
		    .entrySet().stream() // map to stream
		    .max(Map.Entry.comparingByValue()) // find highest count
		    .ifPresent(e -> System.out.println("Most common salary: " + e.getKey()));
		
		// 50. Find the Oldest Employee with the Lowest Salary:- Find the oldest employee with the lowest salary.
		System.out.println(RED + "*** Find the oldest employee with the lowest salary. ***" + RESET);
		
		int maxAge = list.stream()
			    .mapToInt(Employee::getAge)
			    .max()
			    .orElseThrow();

			Employee employee6 = list.stream()
			    .filter(k -> k.getAge() == maxAge)
			    .min(Comparator.comparingDouble(Employee::getSalary))
			    .orElseThrow();

			System.out.println(employee6);

		// 51. Filter Employees by Gender:- Retrieve a list of all female employees.
		System.out.println(RED + "*** Retrieve a list of all female employees. ***" + RESET);
		list.stream().filter(e -> e.getGender().equalsIgnoreCase("Female")).forEach(System.out::println);
		
		// 52. Filter Employees by Age:- Get a list of employees older than 30 years.
		System.out.println(RED + "*** Get a list of employees older than 30 years. ***" + RESET);
		list.stream().filter(e -> e.getAge() > 30).forEach(System.out::println);
		
		// 53. Filter Employees by Salary:- Find employees with a salary greater than $50,000.
		System.out.println(RED + "*** Find employees with a salary greater than $50,000. ***" + RESET);
		list.stream()
		    .filter(e -> e.getSalary() > 50000)
		    .forEach(System.out::println);

		// 54. Map Employee Names:- Create a list of employee names (Strings).
		System.out.println(RED + "*** Create a list of employee names (Strings). ***" + RESET);
		List<String> emps = list.stream().map(e -> e.getName()).toList();
		System.out.println(emps);
		
		// 55. Calculate Average Salary:- Calculate the average salary of all employees.
		System.out.println(RED + "*** Calculate the average salary of all employees. ***" + RESET);
		double avgSalary = list.stream()
			    .mapToDouble(Employee::getSalary)
			    .average()
			    .orElse(0.0);

			System.out.println("Average Salary of Employees: " + avgSalary);

		// 56. Find Maximum Salary:- Find the employee with the highest salary.
		System.out.println(RED + "*** Find the employee with the highest salary. ***" + RESET);
		Employee highestPaid = list.stream()
		    .max(Comparator.comparingDouble(Employee::getSalary))
		    .orElse(null);
		System.out.println("Employee with Highest Salary: " + highestPaid);
		
		// 57. Group employees by gender and return a map with gender as the key and a list of employees as the value.
		System.out.println(RED + " ***return a map with gender as the key and a list of employees ***" + RESET);
		Map<String, List<Employee>> groupByGender = list.stream().collect(Collectors.groupingBy(Employee::getGender));
		groupByGender.forEach((gender, empList) -> {
		    System.out.println("Gender: " + gender);
		    empList.forEach(System.out::println);
		    System.out.println("--------------------------------");
		});
		
		// 58. Count Male Employees:- Count the number of male an female employees.
		System.out.println(RED + "*** Count the number of male and female employees. ***" + RESET);

		// 59. Sum of All Salaries:- Calculate the total sum of salaries for all
		// employees.
		System.out.println(RED + "*** Calculate the total sum of salaries for all employees. ***" + RESET);

		// 60. Sort the employees by their names in alphabetical order.
		System.out.println(RED + "*** Sort the employees by their names in alphabetical order. ***" + RESET);

		// Second Highest Salary:
		System.out.println(RED + "*** Second Highest Salary: ***" + RESET);

		Employee e = list.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(1).findFirst()
				.get();
		System.out.println(e);

		// Find employees whose name is already in uppercase.
		System.out.println(RED + "*** Get a list of employee names in uppercase. ***" + RESET);
		list.stream().filter(k -> k.getName().equals(k.getName().toUpperCase())).forEach(System.out::println);
	}

}
