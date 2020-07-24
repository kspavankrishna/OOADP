//1MS17IS051 , K S PAVAN KRISHNA
package tryStrategy;

public class FTCCustomer extends Customer {
	public FTCCustomer(String id, String name) {
		super(id, name);
		this.d=new FTCDiscount();
		typeOfCust="First Time Customer";
		// TODO Auto-generated constructor stub
	}
}
