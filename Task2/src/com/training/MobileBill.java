package com.training;

public class MobileBill {
	private String customerName;
	private long mobilenumber ;
	private String planname ;
	public char[] findAmount;
	public static final String BRAND="VI";

	
	/**************************************************************************************************/
	public MobileBill() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public MobileBill(String customerName, long mobilenumber, String planname) {
		super();
		this.customerName = customerName;
		this.mobilenumber = mobilenumber;
		this.planname = planname;
		
		
	}


	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public long getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(long mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public String getPlanname() {
		return planname;
	}
	public void setPlanname(String planname) {
		this.planname = planname;
	}
	

	/*******************************************************************************************/
	
	public int findAmount(String planname)
	{
		
		String k = this.planname;
		switch (k) {
		case "prepaid":
			return 200;
        case "postpaid":
			return 300;
			

		default:
			return 100;
		}
	}
}
