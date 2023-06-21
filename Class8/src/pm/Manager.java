package pm;

public class Manager extends Employee {

	int bonus;
	
	
	int getSalary() {
		return bonus + salary;
	}
}
