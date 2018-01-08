package com.visam.java.statickeyword;


public class MyProgramStatic {
	String FullName = "prathyusha";
	String CompanyName = "TCS";
	static int Empid = 101;
	
	static void EmpSalary() {
		System.out.println(""+Empid);
		
		System.out.println (" salary is " );
	}
	 
} 
 class NewEmployee extends MyProgramStatic{
	 static String Designation =" Java Developer";
		
		public void EmpSalary(int x,int y) {
			System.out.println ("emp salary is" + x + "" +y);
			System.out.println(""+Designation);
		}
		
			/*public void EmpSalary(int x) {
				System.out.println("Emp salary and bonus" +x);
			}
			static void EmpHike(int x ) {
				int a = x + 2000;
				System.out.println(" joining hike of employee is "+ a);
				
			}*/

	
			public static void main(String args[]) {
			/*Employee emp = new Employee();
			NewEmployee emp1= new NewEmployee();
			emp.EmpSalary(1000);
			emp1.EmpSalary(2000);
			emp1.EmpHike(3000);*/
				NewEmployee emp1= new NewEmployee();
				EmpSalary();
				emp1.EmpSalary(10,20);
			}
			
 }