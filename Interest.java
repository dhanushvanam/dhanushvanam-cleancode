public class Interest {
	float principal,time,rate,noOfTimesInterestCompounded;
	public void SimpleInterest() { //to calculate Simple Interest
		double simple_interest;
		simple_interest = (principal*rate*time)/100;
		//print simple_interest
	}
	public void CompoundInterest() { //to calculate Compound Interest
		double base = noOfTimesInterestCompounded*time;
		double exponent = (1+rate/noOfTimesInterestCompounded);
		double result = Math.pow(base,exponent);
		double compound_interest;
		compound_interest = principal*result;
		//print compound_interest
	}
}