package udemyCoreJava.encapsulation;

public class Bank {

	public int accNo = 12234;
	private int pinNo = 1234;
	private double balAmount=100000;
	
	
	
	public double getBalAmount() {
		return balAmount;
	}

	public void setBalAmount(double balAmount) {
		this.balAmount = balAmount;
	}

	public int getAccNo() {
		return accNo;
	}

	public int getPinNo() {
		return pinNo;
	}

	public void withDrawAmt(int accno, int pin, int amount) {
		
		if (accno ==accNo && pin == pinNo) {
			if(amount<=balAmount) {
				balAmount=balAmount-amount;
				System.out.println("Amount withdrawal : "+amount);
			}else {
				System.out.println("insufficient balance !!!");
			}
		}else {
			System.out.println("invalid	 credentials !!! ");
		}
	}
	
	public void updatePin(int accno, int oldpin, int newpin) {
		if(accno==accNo && oldpin==pinNo) {
			pinNo=newpin;
			System.out.println("pin has changed successfully");
		
		}else {
			System.out.println("invalid credentials");
		}
	}
	
	public double depositeCash(int accno,int pin, double amount) {
		if (accno==accNo && pin ==pinNo) {
			balAmount=balAmount+amount;
			return balAmount;
		}else {
			System.out.println("invalid credentials");
			return balAmount;
		}
		
	}
	
	
}
