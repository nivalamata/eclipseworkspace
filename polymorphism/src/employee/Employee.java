package employee;

public abstract class Employee {
	
	private String firstName;
	private String lastName;
	private String socialSecurityNumber;
	
	//three argument constructor
	public Employee(String first,String last,String ssn)
	{
	    firstName=first;
		lastName=last;
		 socialSecurityNumber=ssn;
		
	}

	public void setFirstName(String first)
	{
		firstName=first;
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	
	
	public void setLastName(String last)
	{
		lastName=last;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public void setSsn(String ssn)
	{
		socialSecurityNumber=ssn;
	}
	
	public String getSsn()
	{
		return socialSecurityNumber;
	}
	
	//return String representation of Employee object
	@Override
	public String toString()
	{
		return String.format("%S   %S \n social Security Number :%s",getFirstName(),getLastName(),getSsn());
	}
	
	
	//abstract method overridden by concrete classes
	public abstract double earnings();
}// end Emloyee class
