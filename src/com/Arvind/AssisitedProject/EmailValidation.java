package com.Arvind.AssisitedProject;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class EmailValidation
{
	 public static boolean isValidEmail(String email) {
		 String regex = "^(.+)@(.+)$";
		 Pattern pattern = Pattern.compile(regex);
		 Matcher matcher = pattern.matcher(email);
		 return matcher.matches();
		 
		 }
		 public static void main(String[] args) {
		 List<String> emails = new ArrayList<String>();
		 // valid emails
		 emails.add("arvind@mphasis.com");
		 emails.add("arvind123@mphasis.com");
		 emails.add("arvind.a@mphasis.me.org");
		 //invalid emails
		 emails.add("aru.mphasis.com");
		 emails.add("arvind..ns#mphasis.com");
		 emails.add("@.mphasis.com");
		 for (String value : emails) {
		 System.out.println("The Email address " + value + " is " + 
		(isValidEmail(value) ? "valid" : "invalid"));
		 }
		 
		 System.out.println("Enter any email address to check");
		 Scanner sc = new Scanner(System.in);
		 String input = sc.nextLine();
		 System.out.println("The Email address " + input + " is " + 
		(isValidEmail(input) ? "valid" : "invalid"));
		 
		 }


}
