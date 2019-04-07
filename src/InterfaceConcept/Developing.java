package InterfaceConcept;

public class Developing implements BankingClient, RetailClient {   
	
	public static void main(String[] args) {
		Developing d = new Developing();
		d.paycreditcard();
		d.login();
		
		BankingClient dr = new Developing();
		dr.paycreditcard();
		
		RetailClient rc = new Developing();
		rc.retailcCheckingbalance();
	}

	@Override
	public void paycreditcard() {
		// TODO Auto-generated method stub
		System.out.println("paycreditcard implemented");
	}

	@Override
	public void transferbalance() {
		// TODO Auto-generated method stub
		System.out.println("transferbalance implemented");
	}

	@Override
	public void checkingbalance() {
		// TODO Auto-generated method stub
		System.out.println("checkingbalance implemented");
	}

	public void login() {
		System.out.println("logged onto the site");
	}

	@Override
	public void retailPaycreditcard() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void retailTransferbalance() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void retailcCheckingbalance() {
		// TODO Auto-generated method stub
		
	}
	
}
