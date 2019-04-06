package InterfaceConcept;

public class Developing implements BankingClient{
	
	public static void main(String[] args) {
		Developing d = new Developing();
		d.paycreditcard();
		d.login();
		BankingClient dr = new Developing();
		dr.paycreditcard();
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
	
}
