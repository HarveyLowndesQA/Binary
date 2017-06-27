import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class WordToBinary {

	public static void main(String[] args) {
		System.out.println("Please enter a word or sentence:");
		Scanner scanner = new Scanner(System.in);
		String word = scanner.nextLine();
		
		/*String build = "";
		char[] characters = word.toCharArray();
		for(int i = 0; i < characters.length; i++) {
			int j = (int) characters[i];
			NumberBinary nb = new NumberBinary(j);
			build += nb.processBinary() + " ";
		}
		
		System.out.println("Binary of '" + word + "' is: " + build);*/
		
		String build = "";
		byte[] b = word.getBytes(StandardCharsets.US_ASCII);
		for(int i = 0; i < b.length; i++) {
			NumberBinary nb = new NumberBinary(b[i]);
			//if(b[i] == 32) {
			//	build += "{" + nb.processBinary() + "}\n";
			//} else {
				build += nb.processBinary() + " ";
			//}
		}
		
		System.out.println("Binary of '" + word + "' is: \n" + build);
		scanner.close();
	}

}
