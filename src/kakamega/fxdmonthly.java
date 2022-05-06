/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kakamega;

import java.util.Scanner;

/**
 *
 * @author Aristah
 */
public class fxdmonthly {

public void scooby()
{ 
//net bill text to avoid repitition
  String netbill="Your Net Bill Is: Ksh.";

int unit=2500, principal;
double charges1,charges2;
int choice;
System.out.println("You Are Subscribed to Monthly fixed 2,500 units");
//line
Draw line=new Draw();
 line.lines();
 
 int y=1;
  principal=0;
   //incase alphabet is entered looping occurs until correct value is entered 
  do{
  
  try{ 
  
System.out.println("Enter Principal Amount:");
Scanner prncpal=new Scanner(System.in);
principal =prncpal.nextInt();
  
 y=2;
 }
 catch(Exception e)
 {
  line.lines();
  System.out.println("Invalid Choice Enter a Number");
  
 }
 
}while(y==1);


  
 charges1=(unit*30+500)-(unit*30*0.08)-(unit*30*0.09)-(principal*0.1)-(unit*30*0.05);
  
charges2=(unit*30+500)-(unit*30*0.08)-(unit*30*0.09)-(principal*0.1);
 
  
 
 
 //object for dots
   Draw dots=new Draw();
   choice=0;
   int z=1;
   
    //incase alphabet is entered looping occurs until correct value is entered 
   do{
  
  try{ //pay by visa or cash banner
 Draw paybanner=new Draw();
 paybanner.payMode();
 Scanner val= new Scanner(System.in);
 choice= val.nextInt();
 
 while(choice<1 || choice>2)
 {
     line.lines();
  System.out.println("Invalid Choice"); 
 
  paybanner.payMode();
    choice=val.nextInt();
  }
 z=2;
 }
 catch(Exception e)
 {
  line.lines();
   System.out.println("Invalid Choice Enter a Number");
  
 }
 
}while(z==1);
 
   
 
switch (choice)
{
case 1:
dots.drawabledot();
System.out.println(netbill+unit*30);
dots.drawabledot();System.out.println("Your Meter Rent is: Ksh. 500");
dots.drawabledot();

System.out.println("Discount For Consuming Above 100 Units is: Ksh."+ 30*unit*0.08);
dots.drawabledot();
System.out.println("Discount For Total Cost is: Ksh."+30*0.09*unit );
dots.drawabledot();
System.out.println("Discount Due To Principal Amount is: Ksh. "+0.1*principal);
dots.drawabledot();
System.out.println("Discount For Paying by Visa is: Ksh. "+unit*30*0.05);
dots.drawabledot();
 System.out.println("\n Your Water Bill For This Month Is Ksh."+charges1);
break;
case 2:
dots.drawabledot();
System.out.println(netbill+unit*30);
dots.drawabledot();System.out.println("Your Meter Rent is: Ksh. 500");
dots.drawabledot();

System.out.println("Discount For Consuming Above 100 Units is: Ksh."+ 30*unit*0.08);
dots.drawabledot();
System.out.println("Discount For Total Cost is: Ksh."+30*0.09*unit );
dots.drawabledot();
System.out.println("Discount Due To Principal Amount is: Ksh. "+30*principal*0.1);
dots.drawabledot();
System.out.println("\n Your Water Bill For This Month Is: Ksh."+charges2);
dots.drawabledot();
System.out.println("NEXT MONTH, PAY BY VISA TO ENJOY VISA DISCOUNT");
  break;
}
}
}

