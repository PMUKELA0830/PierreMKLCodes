package stringMod;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello World!");
		
		String word1 = "";
	    Scanner input1 = new Scanner(System.in);
	    System.out.println("\nPlease enter the word to be reversed ");
	    word1 = input1.next();
		
	    
	    // Calling method for Solution 1
		String result1 = reverseString(word1);
	    System.out.println("\nSolution1: The reversed word is " + result1 + " \n");
	    
	    
	    // Calling method for Solution 2
	    String result2 = reverseString1(word1);
	    System.out.println("\nSolution2: The reversed word is " + result2 + " \n");
	    
	    
	    // Calling method for Solution 3
	    String result3 = reverseString2(word1);
	    System.out.println("\nSolution3: The reversed word is " + result3 + " \n");
	  
	    // Calling method for Solution 4
	    String result4 = reverseString3(word1);
	    System.out.println("\nSolution4: The reversed word is " + result4 + " \n");
	    
	    // Calling method for Solution 5
	    String result5 = reverseString4(word1);
	    System.out.println("\nSolution5: The reversed word is " + result5 + " \n");
	    
	  
	  
	}
	
	
	// Solution 1; best and simplest solution
	public static String reverseString(String word){
        String result = "";
        char[] word1 = word.toCharArray();
        for(int i = word.length() - 1; i >= 0 ; i-- ){
            result += word1[i];
        }
        
        // The following line is not needed since it is repeated in the 
        // main method.
        // System.out.println("The reversed word is " + result);
        return result;
    }
	
	
	
	// Solution 2
	
	// Alternate solution
	
	public static String reverseString1(String word){
        String result = "";
        char[] word1 = word.toCharArray();
        //char[] resultArray = new char[word.length()];
        for(int i = 0 ; i <= word.length() - 1 ; i++ ){
            if(i < word.length()) {
        	result += word1[(word.length() - 1) - i];
        	
        	// a possible mistake is to use the following:
        	// array1[(word.length() - i]
        	// where you get an error like, "Index 7 is out of bound for
        	// length 7. 
        	// This is because index starts from zero and the last index should
        	// be string1.length() - 1 for a given string1. 
            }
        }
        
        // Line right below not necessary
        //System.out.println("The reversed word is " + result);
        return result;
    }
	
	
	
	// Solution 3
	
	
	public static String reverseString2(String word){
        String result = "";
        char[] word1 = word.toCharArray();
        char[] resultArray = new char[word.length()];
        for(int i = 0 ; i <= word.length() - 1 ; i++ ){
            resultArray[i] = word1[(word.length() - 1) - i];
            
            
            //Populating the result
            result += Character.toString(resultArray[i]);
        }
        
        for(int i = 0 ; i < resultArray.length; i++) {
        	// result = resultArray[i] + "";
        	
        	// Does not work either
        	// not a good idea
        	
        	// System.out.println(resultArray[i] + "");
        }
        
        
        // System.out.println("The reversed word is " + result);
        return result;
    }
	
	
		// Solution 4
	
		public static String reverseString3(String word){
	        String result = "";
	        char[] word1 = word.toCharArray();
	        char[] resultArray = new char[word.length()];
	        for(int i = 0 ; i <= word.length() - 1 ; i++ ){
	            resultArray[i] = word1[(word.length() - 1) - i];
	            
	        }
	        
	        // Populating the result
	        
	        result = String.valueOf(resultArray);
	        
	        for(int i = 0 ; i < resultArray.length; i++) {
	        	// result = resultArray[i] + "";
	        	
	        	// Does not work either
	        	// not a good idea
	        	
	        	// System.out.println(resultArray[i] + "");
	        }
	        
	        
	        // System.out.println("The reversed word is " + result);
	        return result;
	    }
		
		// Solution 5
		
			public static String reverseString4(String word){
		        String result = "";
		        char[] word1 = word.toCharArray();
		        char[] resultArray = new char[word.length()];
		        for(int i = 0 ; i <= word.length() - 1 ; i++ ){
		            resultArray[i] = word1[(word.length() - 1) - i];
		            
		        }
		        
		        // Populating the result
		        
		        System.out.print("Solution5: ");
		        //System.out.println("Solution5: "); for vertical output
		        for(int i = 0 ; i < resultArray.length; i++) {
		        	result += resultArray[i] + "";
		        	
		        	// Does not work either
		        	// not a good idea
		        	
		        	System.out.print(resultArray[i] + "");
		        	
		        	// To get a vertical line of output, use
		        	// System.out.println(resultArray[i] + "");
		        }
		        
		        
		        // System.out.println("The reversed word is " + result);
		        return result;
		    }
	

}
