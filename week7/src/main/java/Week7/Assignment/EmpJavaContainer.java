package Week7.Assignment;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class EmpJavaContainer {
	@Bean
	public EmployeePojo emp1() {
		EmployeePojo e = new EmployeePojo();
		e.setId(1);
		e.setName("Ramesh");
		e.setCity("Hamirpur");
		return e;
	}

	@Bean
	public EmployeePojo emp2() {
		EmployeePojo e = new EmployeePojo();
		e.setId(2);
		e.setName("Suresh");
		e.setCity("Agra");
		return e;
	}

	@Bean
	public EmployeePojo emp3() {
		EmployeePojo e = new EmployeePojo();
		e.setId(3);
		e.setName("Mahesh");
		e.setCity("Bangalore");
		return e;
	}
		
}
