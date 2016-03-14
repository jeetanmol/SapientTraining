package creat.pattern.factory;

/*
 * 
 * Factory Class with a Static Method to create Instance of Sub class
 */
public class LoanFactory {
	
	public static LoanAccount getInstance(){
		
		return getLoanAccount("personal");
		
	}
	
	public static LoanAccount getInstance(String type){
		
		return getLoanAccount(type);
	}
	
	public static LoanAccount getLoanAccount(String type){
		
		LoanAccount account = null;
		switch (type) {
		case "personal":
			account =  new PersonalLoan(12);
			break;

		case "housing":
			account = new HousingLoan(13);
			break;
		default:
			account = null;
			break;
		}
		return account;
		
	}

}
