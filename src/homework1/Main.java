package homework1;

public class Main {

	public static void main(String[] args) {

		EmployeeManager employeeManager = new EmployeeManager();

		Employee employee1 = new Employee("Merve", 25000, 45, 1990);

		employeeManager.employeeBilgileriniYazdir(employee1);

		Employee employee2 = new Employee("Ayşe", 15000, 35, 2022);

		employeeManager.employeeBilgileriniYazdir(employee2);

		Employee employee3 = new Employee("Deniz", 20000, 40, 2010);

		employeeManager.employeeBilgileriniYazdir(employee3);

	}
}
