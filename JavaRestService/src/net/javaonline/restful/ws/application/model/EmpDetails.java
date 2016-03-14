package net.javaonline.restful.ws.application.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="employee")
@XmlAccessorType(XmlAccessType.FIELD)

public class EmpDetails implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String empcode="";
	String empName="";
	double salary=0;
	String address="";
	
	public EmpDetails (){}	//Empty Constructor is required.  
	
	public EmpDetails(String empcode,String name, String address, double salary)
		{
			this.empcode=empcode;
	
			this.empName=name;
	
			this.address=address;
	
			this.salary=salary;
	
		}
	

	
	public String getEmpcode() {
		return empcode;
	}

	public void setEmpcode(String empcode) {
		this.empcode = empcode;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	

}
