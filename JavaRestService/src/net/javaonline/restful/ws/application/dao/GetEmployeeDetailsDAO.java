package net.javaonline.restful.ws.application.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.javaonline.restful.ws.application.model.EmpDetails;


public class GetEmployeeDetailsDAO {
	
	
	Map<String, EmpDetails> employees = new HashMap<String, EmpDetails>();
	
	
	public GetEmployeeDetailsDAO()
	{

		//Emp details to be retrieved from the database. 
		
		employees.put("1001", new EmpDetails("1001", "ABC", "101, ABC St", 40000));
		employees.put("1002", new EmpDetails("1002", "XYZ", "102, XYZ St", 50000));
		employees.put("1003", new EmpDetails("1003", "QAZ", "103, QAZ St", 30000));
		employees.put("1004", new EmpDetails("1004", "WSX", "104, WSX St", 70000));
	}
	
	public EmpDetails getEmpDetails(String empcode)
	{
		
		return employees.get(empcode);
		
	}
	
	
	public List<EmpDetails> getEmployees()
	{
		
		//Convert Map to ArrayList
		
		return new ArrayList<EmpDetails>(employees.values());
		
	}

	
}
