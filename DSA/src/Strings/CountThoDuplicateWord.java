package Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountThoDuplicateWord {
public static void main(String[] args) {
	// Declaring the String
    String str = "Alice is girl and Bob is boy";
    // Declaring a HashMap of <String, Integer>
   Map<String , Integer> h1= new HashMap<>();
   
   String [] words =str.split(" ");
   
   for(String word:words) {
	   Integer integer= h1.get(word); // that line show that the hashMap contain key or not 
	   
	   if(integer==null) {
		   h1.put(word,1); // that line word store as the key and its occurrence 
	   }
	   else {
		   h1.put(word, integer+1); // it increment the occurrence value
	   }
   }
   System.out.println(h1);
}
}
