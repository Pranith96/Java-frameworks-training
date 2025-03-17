
public class MainMethod {

	public static void main(String[] args) {
		Bank b = new ICICIBankImpl();
		float result = b.getInterestRate();
		System.out.println(result);
		
		
		Bank b1 = new SBIBankImpl();
		float result1 = b1.getInterestRate();
		System.out.println(result1);
		
		Bank b2 = new HDFCBankImpl();
		float result2 = b2.getInterestRate();
		System.out.println(result2);
	}
}
