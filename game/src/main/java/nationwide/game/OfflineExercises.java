package code;

public class OfflineExercises {

	// Given a string, return a string where
	// for every char in the original,
	// there are two chars.

	// doubleChar("The") → "TThhee"
	// doubleChar("AAbb") → "AAAAbbbb"
	// doubleChar("Hi-There") → "HHii--TThheerree"
	
	

public void doubleChar(String msg) {
		
		
		String word="";
		int i;
		for (i=0;i<msg.length();i++) {
			if (msg.substring(i,i+1).equals(msg.substring(i,i+1))){ 
			word=msg.substring(i,i+1)+msg.substring(i,i+1); 
			}
			System.out.println(word);
		}	
}
	
	

	//
	// A sandwich is two pieces of bread with something in between. Return the
	// string that is between the first and last appearance of "bread" in the
	// given string, or return the empty string "" if there are not two pieces
	// of bread.

	// getSandwich("breadjambread") → "jam"
	// getSandwich("xxbreadjambreadyy") → "jam"
	// getSandwich("xxbreadyy") → ""

public void getSandwich(String msg) {
	String newmsg="";
	int i;
	String word=msg.substring(i,i+5);
	
	
	for (i=0;i<msg.length();i++) {
		
			
		if (word.equals("bread")) {
			newmsg="";
		}
		else {
			newmsg=newmsg+msg.substring(i,i+1);
		}
	}
	System.out.println(newmsg);	
	}
}


	// Given three ints, a b c, one of them is small, one is medium and one is
	// large. Return true if the three values are evenly spaced, so the
	// difference between small and medium is the same as the difference between
	// medium and large.

	// evenlySpaced(2, 4, 6) → true
	// evenlySpaced(4, 6, 2) → true
	// evenlySpaced(4, 6, 3) → false

	public boolean evenlySpaced(int a, int b, int c) {
		return false;
	}

	// Given a string and an int n, return a string made of the first and last n
	// chars from the string. The string length will be at least n.

	// nTwice("Hello", 2) → "Helo"
	// nTwice("Chocolate", 3) → "Choate"
	// nTwice("Chocolate", 1) → "Ce"

	public String nTwice(String input, int a) {
		return "";
	}

	// Given a string, return true if it ends in "ly".

	// endsLy("oddly") → true
	// endsLy("y") → false
	// endsLy("oddy") → false

	public boolean endsly(String input) {
		return false;
	}

	// Given a string, return recursively a "cleaned" string where adjacent
	// chars that are the same have been reduced to a single char. So "yyzzza"
	// yields "yza".

	// stringClean("yyzzza") → "yza"
	// stringClean("abbbcdd") → "abcd"
	// stringClean("Hello") → "Helo"
	
	
	String newmessage="";
	public int findletter(String a){
		String word2="";
		
		int i=0;
		while (i<newmessage.length()){
			if (newmessage.substring(i,i+1).equals(a.substring(i))){
				if (word2.equals(a.substring(i))){
					return 1;
				}
				word2="";
			}
			else {
				word2=word2+newmessage.substring(i,i+1);
			}
			i++;
	}
	return 0;
	}
	public void removeduplicate(String msg){
		String word="";
		
		int i=0;
		while (i<msg.length()){
			if (msg.substring(i,i+1).equals(msg.substring(i))){
				if (findletter(word)==0){
					newmessage+=(word);
				}
				word="";

			}
			else {
				word=word+msg.substring(i,i+1);
			}
			i++;
	}
	System.out.println(newmessage);
	}
}



	// The fibonacci sequence is a famous bit of mathematics, and it happens to
	// have a recursive definition. The first two values in the sequence are 0
	// and 1 (essentially 2 base cases). Each subsequent value is the sum of the
	// previous two values, so the whole sequence is: 0, 1, 1, 2, 3, 5, 8, 13,
	// 21 and so on. Define a recursive fibonacci(n) method that returns the nth
	// fibonacci number, with n=0 representing the start of the sequence.

	// fibonacci(0) → 0
	// fibonacci(1) → 1
	// fibonacci(2) → 1

	public int fibonacci(int input) {
		return -1;
	}

	// We have a number of bunnies and each bunny has two big floppy ears. We
	// want to compute the total number of ears across all the bunnies
	// recursively (without loops or multiplication).
	//
	// bunnyEars(0) → 0
	// bunnyEars(1) → 2
	// bunnyEars(2) → 4

	public int bunnyEars(int input) {
		return -1;
	}

}
