package streams_example;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.*;


class Employee{
	private String name;
	private int salary;
	
	
	public Employee(String name, int salary) {
	
		this.name=name;
		this.salary=salary;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}


	
	
	
}
public class Demo01 {

	public static void main(String[] args){
			
	List<Employee> l = new ArrayList<Employee>();
	
	l.add(new Employee("khan",1000));
	l.add(new Employee("irshad",2000));
	l.add(new Employee("khushnuma",5000));
	l.add(new Employee("newkik",3000));
	System.out.println(l);

	//Optional<Employee> emp = l.stream()
	//        .sorted(Comparator.comparingInt(Employee::getSalary)
	//        		.reversed()).skip(0).findFirst();

	//   System.out.println(emp.get());
	//Collections.sort(l, (e1, e2)-> e1.getName()
	//		.compareTo(e2.getName() ));
	//System.out.println(l);
	
	
	}
//pas:-khan_Irhd@#_1212345
}


