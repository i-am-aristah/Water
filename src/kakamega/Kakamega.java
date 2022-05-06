/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kakamega;

import java.util.Scanner;

/**
 *
 * @author Aristah
 */
public class Kakamega {

     public static void main(String[] args)
  {
   Draw line=new Draw();
   
   //draws Companies Banner that has Address
     System.out.println("\t\t********💥💥💥💥💥💥💥💥💥💥💥💥💥💥💥********");
  
   System.out.println("\t\t💥\tKAKAMEGA  WATER COMPANY \t💥");
   System.out.println("\t\t💥\tP.O BOX 10347,\t\t\t💥");
   System.out.println("\t\t💥\tKakamega,Kenya.\t\t\t💥");
   
   System.out.println("\t\t*****************************************");
   int x=1;
   int choice=0;
   
   //Error Handling, incase an Alphabet is typed intentionally or unintentionally repromt user to re-enter
   
  do{
  
  try{
  System.out.println("\n1:Metered Clients");
   
  
  System.out.println("2:Un Metered Clients ");
  
  System.out.println("3:Fixed Monthly Consumption");
  
 System.out.println("\nEnter Subscription Choice:");
    Scanner choicea=new Scanner(System.in);
    choice=choicea.nextInt();
    //Choice input either 1 or 2 else Returns an Error and reprompts for input untill 1 or 2 is inputed
    while (choice<1 || choice>3)
  {
  line.lines();
   System.out.println("Invalid Choice");
   System.out.println("\n1:Metered Clients");
   
  
  System.out.println("2:Un Metered Clients ");
  
  System.out.println("3:Fixed Monthly Consumption");
    System.out.println("\nEnter Subscription Choice:");
    
    choice=choicea.nextInt();
    }
 x=2;
 }
 catch(Exception e)
 {
 line.lines();
 System.out.println("Invalid Choice Enter a Number");
  
 }
 
}while(x==1);

 
   System.out.println("");
  
   switch (choice)
  {
   case 1:
  metered vanil=new metered();
  vanil.badus();
  break;
  case 2:
   unmetered vani=new unmetered();
  vani.swiswi();
  break;
  
  case 3:
  fxdmonthly van=new fxdmonthly();
  van.scooby();
  break;
  }
 //invoking drawable dots in Draw Class
  
 Draw dots=new Draw();
 dots.drawable();
  
   System.out.println("\nTHANKS FOR ALLOWING US TO SERVE YOU");
   
 //invoking drawable dots in Draw Class
  
 dots.drawable();

  }

    
}
