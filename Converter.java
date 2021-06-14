package main;
import java.util.Scanner;
public class Converter {
	//The input collection separate method
	public int scanInput(){
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        return x;
    }
	
	
   // The following are all the unit conversion separate methods
    public void convertCupsToTeaspoons(int pr){
        System.out.println( pr + " cup(s) is equivalent to " + (pr*48) + " teaspoon(s)\n");
       
    }
   
    public void convertFeetToMeters(int pr){
        System.out.println( pr + " cup(s) is equivalent to " + (pr*0.3048) + " teaspoon(s)\n");
       
    }
   
    public void convertTeaspoonsToTablespoons(int pr){
        System.out.println( pr + " cup(s) is equivalent to " + (pr*0.333333) + " teaspoon(s)\n");
       
    }
   
    public void convertMilesToKilometers(int pr){
        System.out.println( pr + " mile(s) is equal to " + (pr*1.60934) + " kilometer(s)\n");
    }
   
    public void convertGallonsToLiters(int pr){
        System.out.println( pr + " gallon(s) is equal to " + (pr*3.78541) + " kilometer(s)\n");
    }
   
    
    
    //The main method
public static void main(String[] args) {

int y = 1;// the variable y is initialized here to be used in the while block. This will help terminate the loop.


//This is the while block that will provide all options in a loop until the user selects the option to quit.
while(y!=4){

System.out.println("Please select an option:");
System.out.println("1. Volume Converstions");
System.out.println("2. Miles to Kilometers");
System.out.println("3. Gallons to Liters");
System.out.println("4. Quit\n");

Converter k = new Converter();
int x = k.scanInput();

//Here is the switch block that will help locate the option that the user picked
switch(x) {

case 1: {System.out.println("Please type a number for suboption:\n");
   System.out.println("1. Cups to Teaspoons");
       System.out.println("2. Teaspoons to Tablespoons");
   
   int v = k.scanInput();
   
   //Here is the if else block that will handle the second layer of the menu
   if(v==1){
       System.out.println("Please type a number for cup(s):\n");
       int pr = k.scanInput();
       k.convertCupsToTeaspoons(pr);}
   else if (v==2){
       System.out.println("Please type a number for Teaspoon(s):\n");
       int pr = k.scanInput();
       k.convertTeaspoonsToTablespoons(pr);}
   else {
       System.out.println(".....Please type in a valid number.....Choose from one of the following:\n");
       
       }        

break;
}

case 2: {System.out.println("Please type a number for suboption:\n");
   System.out.println("1. Feet to Meters");
       System.out.println("2. Miles to Kilometers");
   
   int v = k.scanInput();
   
   // The if else block handling the second layer of the menu
   if(v==1){
       System.out.println("Please type a number for Feet:\n");
       int pr = k.scanInput();
       k.convertFeetToMeters(pr);}
   else if (v==2){
       System.out.println("Please type a number for Miles:\n");
       int pr = k.scanInput();
       k.convertMilesToKilometers(pr);}
   else {
       System.out.println(".....Please type in a valid number.....Choose from one of the following:\n");
       
       }        

break;
  
}

case 3: {System.out.println("Please type a number for gallon size:\n");

int pr = k.scanInput();
                k.convertGallonsToLiters(pr);


break;
}
	
case 4: System.out.println("Good Bye.");
y = 4;// here is where we use the variable y to terminate the while loop.

break;


default: System.out.println(".....Please type in a valid number.....Choose from one of the following:\n");
}


}

}
}
