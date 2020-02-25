package Assignment1;
import java.io.File;
import java.util.Scanner;

public class Assignment1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String pattern = "";
		System.out.println("Enter a pattern: ");
		pattern = sc.next();
		while(!pattern .equals("EXIT")) {
			File file = new File("/home/muthyala");
			File[] allFiles = file.listFiles();
			PatternMatcher pM = new PatternMatcher();
			pM.searchFiles(allFiles, pattern);
			System.out.println("If you want to exit, enter \"EXIT\" or Enter a pattern : ");
			pattern = sc.next();
		}
	}
}


