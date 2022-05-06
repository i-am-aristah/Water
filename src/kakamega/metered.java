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
public class metered {
public void badus()
{
  //net bill text to avoid repitition
  String netbill="Your Net Bill Is: Ksh.";
  //Meter rent 500 banner
 String meterRentBanner="Your Meter Rent is: Ksh. 500";
  //banner for water bill
  String billbanner="Your Water Bill For This Month Is: Ksh.";
  //Discount due to principal banner
  String prncpDisBanner="Discount Due to Principal amount is: Ksh.";
  
  Draw line=new Draw();

   int x=1;
   int unit=0;
   
    //incase alphabet is entered looping occurs until correct value is entered 
    
 do{
  
 try{
 
  System.out.println("Enter The Number of Units Consumed:");
 
Scanner bucky1= new Scanner(System.in);
unit =bucky1.nextInt();
 while (unit<1)
  {
  line.lines();
   System.out.println("Invalid Input");
   System.out.println("Enter The Number of Units Consumed:");
    unit =bucky1.nextInt();
    }
    
 x=2;
 }
 catch(Exception e)
 {
 line.lines();
   System.out.println("Invalid Choice Enter a Number");
  
 }
 
} while(x==1);

   int y=1;
  int prnplamount=0;
   //incase alphabet is entered looping occurs until correct value is entered 
  
  do{
  
  try{
  
System.out.println("Enter Principal Amount:");
Scanner bucky2=new Scanner(System.in);
prnplamount =bucky2.nextInt();
  
 y=2;
 }
 catch(Exception e)
 {
 line.lines();
 
   System.out.println("Invalid Choice Enter a Number");
  
 }
 
}while(y==1);

int z=1;
int pay=0;
//line
 line.lines();
  do{
  
  try{ //pay by visa or cash banner
 Draw paybanner=new Draw();
 paybanner.payMode();
 Scanner bucky3 = new Scanner(System.in);
 pay = bucky3.nextInt();
 
 while(pay<1 || pay>2)
 {
    line.lines();
  System.out.println("Invalid Choice"); System.out.println("\nEnter Mode Of Payment:");
  
     //Draw paybanner=new Draw();
  paybanner.payMode();
    pay =bucky3.nextInt();
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

double visa1,visa2,visa3,cash1,cash2,cash3;
double amount1, amount2, amount3, amount4, amount5, amount6,prncpldisc;
//variable 

//netbill=unit*unitprice

//Discount by Visa 

      prncpldisc = 0.1*prnplamount;
      
  visa1=(unit*30+500)-(unit*30*0.08)-(unit*30*0.05)-prncpldisc;
  
   visa2=(unit*33+500)-(unit*33*0.05)-(unit*0.08*33)-prncpldisc;
   
   visa3=(unit*33+500)-(unit*33*0.05)-prncpldisc;
   
cash1=(unit*30+500)-(unit*30*0.08)-prncpldisc;
cash2=(unit*33+500)-(unit*33*0.08)-prncpldisc;
    
 cash3=(unit*33+500)-prncpldisc;
    
    
  Draw dots=new Draw();
 dots.drawabledot();
     
    
//above 150 units and payment by visa
   
   if ((pay==1) && (unit>=150))
   {
   
   System.out.println(netbill+unit*30);
   dots.drawabledot();
   
   System.out.println(meterRentBanner);
   dots.drawabledot();
   
   System.out.println("Discount For Paying by Visa is: Ksh."+unit*30*0.05);
   dots.drawabledot();
   System.out.println("Discount For Using Units Above 100 is: Ksh."+unit*30*0.08);
   dots.drawabledot();
 System.out.println(prncpDisBanner+prncpldisc);
   dots.drawabledot();
   System.out.println(billbanner +visa1);
   
    }
    //below 150units but above 100 units and payment by visa
    
 else if ((pay==1) && (unit>100) &&(unit<150))
   {
   System.out.println(netbill+unit*33);
   dots.drawabledot();
   System.out.println(meterRentBanner);
   dots.drawabledot();
   System.out.println("Discount For Paying by Visa is: Ksh."+unit*33*0.05);
   dots.drawabledot();
   System.out.println("Discount For Using Units Above 100 Is: Ksh."+33*unit*0.08);
   dots.drawabledot();
 System.out.println(prncpDisBanner +prncpldisc);
   dots.drawabledot();
   
  System.out.println(billbanner +visa2);
    }
    //below 100 units payment by visa
    
     else if((pay==1) && (unit<100))
    {
    System.out.println(netbill+unit*33);
    dots.drawabledot();
   System.out.println(meterRentBanner);
   dots.drawabledot();
   System.out.println("Discount For Paying by Visa is: Ksh."+unit*33*0.05);
   dots.drawabledot();
     System.out.println("You Consumed Units Below 100, Use Units above 100 to Get Discount Next Month:");
     dots.drawabledot();
   System.out.println(prncpDisBanner +prncpldisc);
   dots.drawabledot();
     System.out.println("Discount For Paying by Visa is: Ksh."+unit*33*0.05);
     
     dots.drawabledot();
 System.out.println(billbanner +visa3);
     }
     
     //above 150 units cash payment
     else if((pay==2) && (unit>150))
    {
    System.out.println(netbill+unit*30);
    dots.drawabledot();
    System.out.println(meterRentBanner);
    dots.drawabledot();
    
    System.out.println("Discount For Using Units above 100 is: Ksh."+unit*30*0.08);
    dots.drawabledot();
   System.out.println(prncpDisBanner+prncpldisc);
    dots.drawabledot();
    System.out.println(billbanner +cash1);
    dots.drawabledot();
     System.out.println("USE VISA TO GET DISCOUNT DUE TO VISA NEXT MONTH");
     }
     //above 100units below 150 units by cash
     
     else if((pay==2)&&(unit >100) &&(unit<150))
       {
       System.out.println(netbill+unit*33);
       dots.drawabledot();
       System.out.println(meterRentBanner);
       
    System.out.println("Discount For Using Units above 100 is: Ksh." +unit*33*0.08);
    dots.drawabledot();
   System.out.println(prncpDisBanner+prncpldisc);
       dots.drawabledot();
     System.out.println(billbanner +cash2);
     dots.drawabledot();
      System.out.println("USE VISA TO GET DISCOUNT DUE TO VISA NEXT MONTH");
     }
     //less than 100 units by cash
     
      else if((pay==2) &&(unit<100))
       {
       System.out.println(netbill+unit*33);
       dots.drawabledot();
       System.out.println(meterRentBanner);
       dots.drawabledot();
  System.out.println(prncpDisBanner+prncpldisc);
  dots.drawabledot();
    System.out.println(billbanner +cash3);
    dots.drawabledot();
     System.out.println("USE VISA AND CONSUME UNITS ABOVE 100 TO GET DISCOUNT DUE TO VISA AND UNITS ABOVE 100 NEXT MONTH");
     }
      else
     {
   System.out.println("\nInvalid Choice");
   
}

}
}

