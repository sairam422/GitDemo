package week3.day2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpression {

	public static void main(String[] args) {
		
		/*
		 * String st1="sairamgubbalA91@gmail.com";
		 * 
		 * String matt = "[a-zA-Z0-9]+@[a-z]+.[a-z]{2,3}";
		 * 
		 * Pattern pat=Pattern.compile(matt); Matcher mat=pat.matcher(st1);
		 * System.out.println(mat.matches());
		 */
		
		
		
		  String companyInfo =
		  "Amazon has more than  51000 employees across 18 states in India";
		  
		  String pattern = "\\d+";
		  Pattern compile = Pattern.compile(pattern);
		  Matcher matcher = compile.matcher(companyInfo);
		  
		  while (matcher.find()) {
			System.out.println(matcher.group());
			
		}
		  
			/*
			 * String newInfo = companyInfo.replaceAll("\\D", "");
			 * System.out.println(newInfo);
			 * 
			 * String[] split = companyInfo.split("\\s+"); for (String eachSplit : split) {
			 * System.out.println(eachSplit); }
			 */
		  
		  
		  
		 
		

	}

}
