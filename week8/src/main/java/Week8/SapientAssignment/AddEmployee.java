package Week8.SapientAssignment;

import java.util.ArrayList;
import java.util.List;

public class AddEmployee {
	 List<EmployeePojo> list = new ArrayList();
	public void addEmployee(EmployeePojo emp)
	{
		list.add(emp);
	}
	public EmployeePojo getEmployee(int id)
	{
		EmployeePojo e=null;
		for(EmployeePojo emp : list)
		{
			if(emp.getId()==id)
				e=emp;
		}
		return e;
	}
	
}
