package employee;

//salaried Employee concrete class extends Employee
public class SalariedEmployee extends Employee {
	
	private double weeklySalary;
	
	//four argument constructor
	public SalariedEmployee(String first,String last,String snn,double salary)
	{
	super(first,last,snn);// pass to Employee constructor
	setWeeklySalary(salary);// validate and store salary
	}
	
public void setWeeklySalary(double salary)
{
	weeklySalary=salary<0.0?0.0:salary;
}

public double getWeeklySalary()
{
	return weeklySalary;
}

//calculate earning :override abstract method earnings in Employee
@Override
public double earnings()
{
	return weeklySalary;
}

@Override
public String toString()
{
	return String.format("salaried Employee: %S \n%S $%, .2f",super.toString(),"weeklySalary:",getWeeklySalary());
}



}//end class SalariedEmployee
