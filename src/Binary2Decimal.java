
public class Binary2Decimal {

	public static void main(String[] args) {
		try {
			System.out.println(BinaryToDecimal("11011"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static int BinaryToDecimal(String b) throws Exception {
		int bv = 1, total = 0;
		for(int i = 1; i <= b.length(); i++) {
			String sb = b.substring(b.length()-i);
			if(((int) sb.charAt(0)) == 49) total = total + (bv * 1);
			else if (sb.charAt(0) != 48) throw new IllegalArgumentException("Only 1's and 0's are allowed in binary String");
			bv = bv * 2;
		}
		return total;
	}

}
