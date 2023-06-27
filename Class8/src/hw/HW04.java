package hw;

public class HW04 {

	public static void main(String[] args) {
		Manager manager = new Manager();
		manager.getSalary(100, 500);
	}
}
class Employee{
	int salary;
	
	void getSalary(int bonus, int salary) {
		
	}
}

class Manager extends Employee{
	
	int bonus;
	
	void getSalary(int bonus, int salary) {
		System.out.println(bonus+salary);
	}
}

