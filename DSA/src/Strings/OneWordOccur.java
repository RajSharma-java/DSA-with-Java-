package Strings;

public class OneWordOccur {
public static void main(String[] args) {
	String string = "Spring is beautiful but so is winter";
	String word = "is";
	String temp[] = string.split(" ");
	int count = 0;
	for (int i = 0; i < temp.length; i++) {
	if (word.equals(temp[i]))
	count++;
	}

	System.out.println("The word: " + word +" ,and count is "+count);
	}
}

