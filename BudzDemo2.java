
public class BudzDemo2 
{

	public static void main(String[] args) 
	{
		
		int grossSalary=10000;

		BudzDemo2 bd1 = new BudzDemo2();
		int charges = bd1.houseCharges();
		
		int netSalary= grossSalary- charges;
		System.out.println(netSalary);
		
		int taxCal = 30*charges;
		System.out.println(taxCal);
		
	}
	
		
	int houseCharges()  // int houseCharges() = totalCharges;
	{
		System.out.println("houseCharges2 is invoking");
		int rent=1000;
		int childFee=2000;
		int totalCharges=rent+childFee;
		System.out.println(totalCharges);
		return totalCharges;
	}

}
