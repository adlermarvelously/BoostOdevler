package homework1;

public class EmployeeManager {

	private int counter = 1;

	public void tax(Employee employee) {

		if (employee.getRaiseSalary() <= 2000) {
			employee.setTax(0);

		} else {
			employee.setTax(employee.getSalary() * 0.05);
		}
	}

	public void bonus(Employee employee) {
		if (employee.getWorkHours() >= 40) {
			employee.setBonus((employee.getWorkHours() - 40) * 30);
			System.out.println(employee.getWorkHours() + " kadar bonus eklendi.");
		} else {
			System.out.println("Çalışma saatiniz 40 saatten az olduğu için bonus eklenmedi.");
		}
	}

	public void raiseSalary(Employee employee) {
		if (2023 - employee.getHireYear() < 10) {
			employee.setRaiseSalary(employee.getSalary() * 0.05);
			System.out.println("Maaşınıza %5 zam uygulanmıştır.");
		} else if ((2023 - employee.getHireYear()) >= 10 && (2022 - employee.getHireYear()) < 20) {
			employee.setRaiseSalary(employee.getSalary() * 0.10);
			System.out.println("Maaşınıza %10 zam uygulanmıştır.");
		} else if (2022 - employee.getHireYear() >= 20) {
			employee.setRaiseSalary(employee.getSalary() * 0.15);
			System.out.println("Maaşınıza %15 zam uygulanmıştır.");
		} else {
			System.out.println("Zam uygulanmamıştır.");
		}
	}

	public double salaryNew(Employee employee) {
		employee.setSalary(employee.getSalary() - employee.getTax() + employee.getBonus());
		return employee.getSalary();
	}

	public double finalSalary(Employee employee) {
		employee.setSalary(employee.getSalary() + employee.getSalaryRaise());
		return employee.getSalary();
	}

	public void employeeBilgileriniYazdir(Employee employee) {

		System.out.println("Çalışan " + counter);
		System.out.println();
		System.out.println("Adı: " + employee.getName());
		System.out.println("Maaşı: " + employee.getSalary());
		System.out.println("Çalışma Saati: " + employee.getWorkHours());
		System.out.println("İşe Giriş Yılı: " + employee.getHireYear());
		tax(employee);
		System.out.println("Vergi: " + employee.getTax());
		bonus(employee);
		System.out.println("İkramiye: " + employee.getBonus());
		raiseSalary(employee);
		System.out.println("İşe giriş yılına göre yapılan zam: " + employee.getSalaryRaise());
		System.out.println();
		System.out.println("Vergisiz, zam dahil maaşınız: " + salaryNew(employee));
		System.out.println("Güncel maaşınız: " + finalSalary(employee));
		System.out.println("- - - - -\n");

		counter++;
	}

}
