package day2;

public class Employee {
	String FullName = "Joe Manda";
	String CompanyName = "TCS";
	int Empid = 101;
	int salary = 1000;

	public void EmpSalary(int x) {

		System.out.println(" salary is " + salary);
	}
}

 class NewEmployee extends Employee {
	String Designation = " Java Developer";

	public void EmpSalary(int x, int y) {
		System.out.println("emp salary is" + x + "" + y);
	}

	public void EmpSalary(int x) {
		System.out.println("Emp salary and bonus" + x);
	}

	public void EmpHike(int x) {
		int a = x + 2000;
		System.out.println(" joining hike of employee is " + a);

	}

	public static void main(String args[]) {
		System.out.println("tests" + "");
		Employee emp = new Employee();
		NewEmployee emp1 = new NewEmployee();
		emp.EmpSalary(1000);
		emp1.EmpSalary(2000);
		emp1.EmpHike(3000);

	}
}
