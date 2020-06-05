package Week7.Assignment;

import java.util.Scanner;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    
    
    ApplicationContext context = new ClassPathXmlApplicationContext(
			"beamContainer.xml");
    EmployeePojo emp = (EmployeePojo) context.getBean("emp1");
	System.out.println(emp);

	Scanner scan = new Scanner(System.in);
	System.out.println("Enter Employee Id: ");
	String empId = scan.next();

	EmployeePojo emp1 = (EmployeePojo) context.getBean(empId);
	System.out.println(emp1);

	ApplicationContext context11 = new AnnotationConfigApplicationContext(EmployeeJavaContainer.class);
	EmployeePojo emp2 = (EmployeePojo) context11.getBean("emp2");
	System.out.println(emp2);
}
}
