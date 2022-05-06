/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kakamega;

/**
 *
 * @author Aristah
 */
import java.util.Scanner;
public class unmetered {
public void swiswi()
{
//net bill String text to avoid repitition
  String netbill="Your Net Bill Is: Ksh.";

//double dots
 Draw dots=new Draw();
 //draw lines
 Draw line=new Draw();
  int x=1;
   int unit=0;
   
   //incase alphabet is entered looping occurs until correct value is entered 
  do{
  
  try{
  System.out.println("Enter The Number of Units Consumed:");
 
Scanner bucky1= new Scanner(System.in);
unit =bucky1.nextInt();

    
 x=2;
 }
 catch(Exception e)
 {
  line.lines();
  System.out.println("Invalid Choice Enter a Number");
  
 }
 
} while(x==1);
 
 
 
 int z=1;
int pay=0;
//line

 line.lines();
 
  //incase alphabet is entered looping occurs until correct value is entered 
  do{
   try{ //pay by visa or cash banner
 Draw paybanner=new Draw();
 paybanner.payMode();
 Scanner bucky2= new Scanner(System.in);
 pay = bucky2.nextInt();
 
 while(pay<1 || pay>2)
 {
     line.lines();
  System.out.println("Invalid Choice"); 
  
   //Draw paybanner=new Draw();
  paybanner.payMode();
    pay =bucky2.nextInt();
  }
 z=2;
 }
 catch(Exception e)
 { 
 line.lines();
  System.out.println("Invalid Choice Enter a Number");
  
 }
 
}while(z==1);



//variable Decleration

double amount1, amount2, amount3, amount4, amount5, amount6;

//variable 
   
   amount1=(unit*30)-(unit*0.08)-(unit*0.05);
   amount2=(unit*33)-(unit*0.05)-(unit*0.08);
   amount3=(unit*33)-(unit*0.05);
   
    amount4=(unit*30)-(unit*0.08);
    amount5=(unit*33)-(unit*0.08);
    amount6=unit*33;
    
//above 150 units and payment by visa
   
   if ((pay==1) && (unit>=150))
   {
   dots.drawabledot();
   System.out.println(netbill+unit*30);
   dots.drawabledot();
  System.out.println("Discount For Paying by Visa is: Ksh. "+unit*0.05);
  dots.drawabledot();
   System.out.println("Discount For Using Units Above 100 is: Ksh. "+unit*0.08);
   dots.drawabledot();
    System.out.println("\nYour Water Bill For This Month Is: Ksh. "+amount1);
    }
    //below 150units but above 100 units and payment by visa
 else if ((pay==1) && (unit>100) &&(unit<150))
   {
   dots.drawabledot();
   System.out.println(netbill+unit*33);
   dots.drawabledot();
   System.out.println("Discount For Paying by Visa is: Ksh. "+unit*0.05);
   dots.drawabledot();
   System.out.println("Discount For Using Units above 100 is: Ksh. "+unit*0.08);
   dots.drawabledot();
    System.out.println("Your Water Bill For This Month Is: Ksh. "+amount2);
    }
    //below 100 units payment by visa
     else if((pay==1) && (unit<100))
     
    {
    
   System.out.println(netbill+unit*33);
   dots.drawabledot();
    System.out.println("Discount For Paying by Visa is: Ksh."+0.05*unit);
    dots.drawabledot();
     System.out.println("\nYour Water Bill For This Month Is: Ksh."+amount3);
     dots.drawabledot();
     System.out.println("CONSUME UNITS ABOVE 100 TO GET DISCOUNT FOR UNITS ABOVE 100");
     }
     
     //above 150 units cash payment
     
     else if((pay==2) && (unit>150))
    {
    dots.drawabledot();
   System.out.println(netbill+unit*30);
   dots.drawabledot();
    System.out.println("Discount For Using Units Above 100 is: Ksh."+unit*0.08);
    dots.drawabledot();
     System.out.println("\n Your Water Bill For This Month Is: Ksh."+amount4);
     dots.drawabledot();
     System.out.println("PAY BY VISA NEXT MONTH TO ENJOY DISCOUNT DUE TO VISA");
     }
     //above 100units below 150 units by cash
     
     else if((pay==2)&&(unit >100) &&(unit<150))
       {
       dots.drawabledot();
     System.out.println(netbill+unit*33);
     dots.drawabledot();
       System.out.println("Discount For Consuming Units Above 100 Is: Ksh."+unit*0.08);
       dots.drawabledot();
     System.out.println("\n Your Water Bill For This Month Is: Ksh. "+amount5);
     dots.drawabledot();
      System.out.println("PAY BY VISA NEXT MONTH TO ENJOY DISCOUNT DUE TO VISA");
     }
     
     //less than 100 units by cash
       else if((pay==2) &&(unit<100))
       {
       dots.drawabledot();
   System.out.println(netbill+unit*33);
   dots.drawabledot();
    System.out.println("\n Your Water Bill For This Month Is: Ksh."+amount6);
    dots.drawabledot();
     System.out.println("CONSUME UNITS ABOVE 100 TO GET DISCOUNT FOR UNITS ABOVE 100");
    dots.drawabledot();
    System.out.println("PAY BY VISA NEXT MONTH TO ENJOY DISCOUNT DUE TO VISA");
     
     }
      else
     {
   System.out.println("\nInvalid Choice");
   
   }
   }

}

