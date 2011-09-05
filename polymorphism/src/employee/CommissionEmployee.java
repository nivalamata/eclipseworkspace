package employee;

public class CommissionEmployee extends Employee {
	
	private double commissionRate;
	private double grossSales;
	
	
	//five argument constructor
		public CommissionEmployee(String first,String last,String snn,double sales,double rate)
		{
		super(first,last,snn);// pass to Employee constructor
		setGrossSales(sales);// validate sales
		setCommissionRate(rate);// validate rate
		}
		
		public void setCommissionRate(double rate)
		{
			commissionRate= (rate >0.0 && rate< 1.0)? rate:0.0;
		}

		public double getCommissionRate()
		{
			return  commissionRate;
		
		}
		//set gross sales
		public void setGrossSales(double sales)
		{
			grossSales= (sales <0.0)?0.0:sales;
		}

		public double getGrossSales()
		{
			return  grossSales;
		
		}
		
		@Override
		public double earnings()
		{
			return getGrossSales() * getCommissionRate();
		}

		@Override
		public String toString()
		{
			return String.format(" %S: %S\n%s: $%, .2f; %s : %.2f","comission employee",super.toString(),"grossrate:",getGrossSales(),"comissionrate:",getCommissionRate());
		}
		
		
}//end class CommissionEmployeee
