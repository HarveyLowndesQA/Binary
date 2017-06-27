
public class NumberBinary {
	
	private int number;
	
	public NumberBinary(int number) {
		this.setNumber(number);
	}
	
	public String processBinary() {
		String binary = "";
		
		while(number > 0) {
			binary = number % 2 + binary;
			number = number / 2;
		}
		
		return binary;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
}
