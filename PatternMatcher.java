package Assignment1;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher {
	
	public void searchFiles(File[] allFiles,String regex) {
		for(File f:allFiles) {
			if(f.isDirectory()) {
				File[] list = f.listFiles();
				searchFiles(list,regex);
			}
			else {
				String text = f.getName();
				Pattern p = Pattern.compile(regex);
				Matcher m = p.matcher(text);
				if(p.matches(regex,text)){
					System.out.println("File: " + f.getAbsolutePath());
				}
			}
		}
	}
}
