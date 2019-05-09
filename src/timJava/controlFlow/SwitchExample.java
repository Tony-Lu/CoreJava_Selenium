package timJava.controlFlow;

public class SwitchExample {

	public static void main(String[] args) {

		// if statement vs switch ( for same variable better)
		int switchValue = 3;
		switch (switchValue) {
		case 1:
			System.out.println("Value was 1");
			break;

		case 2:
			System.out.println("Value was 2");
			break;

		case 3:
		case 4:
		case 5:
			System.out.println("Actually it was a: " + switchValue);

		default:
			System.out.println("Value was not 1 nor 2");
			break;
		}

		// assignment:
		char switchChar = 'D';
		switch (switchChar) {
		case 'A':
			System.out.println(switchChar + " are found");
			break;
		case 'B':
			System.out.println(switchChar + " are found");
			break;
		case 'C': case 'D': case 'E':
			System.out.println(switchChar + " are found");
			break;	
		default:
			System.out.println(switchChar + " can not be found");
			break;
		}
		
		String month = "jUnE";
		switch(month.toLowerCase()) {
		case "january":
			System.out.println(month + " = Jan");
			break;
		case "june":
			System.out.println(month + " = Jun");
			break;
		case "Feburary":
			System.out.println(month + " = Feb");
			break;
		case "march":
			System.out.println(month + " = Mar");
			break;
		}

	}

}
