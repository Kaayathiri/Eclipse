package nationwide.barrenmoor;

import java.util.Scanner;

public class adventure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i;
		Scanner input= new Scanner(System.in);
		System.out.println("Enter your name:");
        String name=input.nextLine();//It is used to get the input string.
        System.out.println("Hello "+name +", Welcome to the adventures of Barren Moor!"); 
        System.out.println("What direction do you want to head: North or South?");
        String direction=input.nextLine();
        i=0;
        if (direction.substring(i,i+1).equals("N")||direction.substring(i,i+1).equals("n")){
        	System.out.println("The dial read there is something that may help you near by! You are 3m away from the treasure. Do you want to go East or West?");
        	 String direction1=input.nextLine();
        	 i=0;
        	 if (direction1.substring(i,i+1).equals("W")||direction1.substring(i,i+1).equals("w")){
        		 System.out.println("You have encountered a monster! You must return to the start! Game Over");
        	 }
        	 else { 
        		 if ((direction1.substring(i,i+1).equals("E")||direction1.substring(i,i+1).equals("e"))){
        			 System.out.println("The treasure is 2m away! You must overcome the next hurdle. Do you choose to go North ot West?");
        			
        		 }
        		 String direction2=input.nextLine();
        		 i=0;
        		 		if ((direction2.substring(i,i+1).equals("E")||direction2.substring(i,i+1).equals("e"))){
        		 			System.out.println("YOU HAVE FOUND THE TREASURE!");
        		 		}
        		 		else {
        		 			if ((direction2.substring(i,i+1).equals("N")||direction2.substring(i,i+1).equals("n"))){
        		 				System.out.println("You have fallen off a clif and died. GAME OVER!");			
        		 			}		
        		 		} 
        }
        } 	
        		 
      
        else {
        
        	if(direction.substring(i,i+1).equals("S")||direction.substring(i,i+1).equals("s")) {
        		System.out.println("The dial read there is something that may help you near by! You are 3m away from the treasure. Do you want to go East or West?");
        	}
        		String direction3=input.nextLine();
        			i=0;
        	if (direction3.substring(i,i+1).equals("W")||direction3.substring(i,i+1).equals("w")){
        		System.out.println("You have fallen off a clif and died. GAME OVER!");
        	}
        	else {
        		if (direction3.substring(i,i+1).equals("E")||direction3.substring(i,i+1).equals("e")) {
        			System.out.println("You have fallen off a clif and died. GAME OVER!");
        		}
        	}
	

        }
	}}
	


   	 

			
