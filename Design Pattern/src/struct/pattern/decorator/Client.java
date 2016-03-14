package struct.pattern.decorator;

public class Client {

	public static void main(String[] args) {
		
		
		OnlineBanking acc = new OnlineBanking(new SavingsAccount());
		System.out.println(acc.balanceToMaintain());
	}

}
