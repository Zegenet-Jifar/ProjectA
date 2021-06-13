package main;

import java.util.Scanner;

public class Converter {
	
		
	public static void main(String[] args) {
	
		int y = 1;
		
		while(y!=4){
			
			System.out.println("Please select an option:");
			System.out.println("1. Cups to Teaspoons");
			System.out.println("2. Miles to Kilometers");
			System.out.println("3. Gallons to Liters");
			System.out.println("4. Quit\n");
		
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		
		switch(x) {
		
		case 1: {System.out.println("Please type a number for cup size:\n");
				Scanner c1 = new Scanner(System.in);
				int pr = c1.nextInt();
				
				System.out.println( pr + " cup(s) is equivalent to " + (pr*48) + " teaspoon(s)\n");
					
					
		break;
		} 
		
		case 2: {System.out.println("Please type a number for miles:\n");
				Scanner c2 = new Scanner(System.in);
				int pr = c2.nextInt();
		
				System.out.println( pr + " mile(s) is equal to " + (pr*1.60934) + " kilometer(s)\n");
					
					
		break;
		}
		
		case 3: {System.out.println("Please type a number for gallon size:\n");
				Scanner c3 = new Scanner(System.in);
				int pr = c3.nextInt();

				System.out.println( pr + " gallon(s) is equal to " + (pr*3.78541) + " kilometer(s)\n");
					
					
		break;
		}
		
		case 4: System.out.println("Good Bye.");
				y = 4;
		
		break;
		
		
		default: System.out.println(".....Please type in a valid number.....Choose from one of the following:\n");
		}
		
			
		}
		
		}
							
	 	
		}
	
	


