package employee;

public class HourlyEmployee extends Employee {

	
	private double wage;
	private double hours;
	
	//five argument constructor
	public HourlyEmployee(String first,String last,String snn,double hourlyWage,double hoursWorked)
	{
	super(first,last,snn);// pass to Employee constructor
	setWage(hourlyWage);// validate hourly wage
	setHours(hoursWorked);// validate hours worked
	}
	
public void setWage(double hourlyWage)
{
	wage= hourlyWage<0.0?0.0: hourlyWage;
}

public double getWage()
{
	return  wage;
}
//set hours
public void setHours(double hoursWorked)
{
	hours= ((hoursWorked>=0)&&(hoursWorked<=168))?hoursWorked:0.0;
}

public double getHours()
{
	return  hours;
}
//calculate earning :override abstract method earnings in Employee
@Override
public double earnings()
{
	if (getHours()<=40)
		return getWage()* getHours();
	else 
		return 40 *getWage() + (getHours() - 40)*getWage()*1.5;
}

@Override
public String toString()
{
	return String.format("hourly Employee: %S \n%S $%, .2f; %s :%, .2f",super.toString(),"houlywage:",getWage(),"hoursworkeed",getHours());
}
}//end of class HourlyEmployee
