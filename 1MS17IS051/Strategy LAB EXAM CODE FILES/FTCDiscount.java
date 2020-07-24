//1MS17IS051 , K S PAVAN KRISHNA
package tryStrategy;

public class FTCDiscount implements Discount {
	@Override
	public float calcDiscount(float amount) {
		// TODO Auto-generated method stub
		return 0.15f*amount;
	}
}
