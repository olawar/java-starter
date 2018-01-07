package agh.mwo.java2_2.palindrome;

public class Palindrome {
    public static Boolean check(String text) {
    	String pattern = "\\p{Punct}|\\s";
    	text = text.replaceAll(pattern, "");
    	String textReversed = "";
    	
    	for(int i = (text.length() - 1); i >= 0; i--) {
    		textReversed+= text.charAt(i);
    	}

    	return text.equalsIgnoreCase(textReversed);
    }
}
