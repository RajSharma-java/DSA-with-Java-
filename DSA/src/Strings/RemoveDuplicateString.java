package Strings;

public class RemoveDuplicateString {
public static void main(String[] args) {
	String str="raaaaaam";
	String result="";
	for(int i=0; i<str.length(); i++) {
		char c= str.charAt(i);
		if(result.indexOf(c) ==-1) {
			result = result+c; 	
		}
	}
	System.out.println("Remove duplicate is :" + result);
}
}
