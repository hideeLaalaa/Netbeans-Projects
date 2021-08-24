/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classwork3;
import java.util.Scanner;


public class Classwork3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        person mydata = new person();
        mydata.showdata();
        person herdata= new person();
        herdata.showdata();
        show();
        shape test = new shape();
        test.area();
        System.exit(0);
    }
   
    public static void show(){
        System.out.println("\nWAIT FOR ME....I AM COMING!!!!!");
    }
}

class shape{
     Scanner in = new Scanner(System.in);
     
     public void area(){
         System.out.print("Enter the breadth of your rectangle:");
         int breadth = in.nextInt();
         String name=in.nextLine();
        System.out.print("Enter the length of your rectangle:");
        int length = in.nextInt();
         int area = breadth*length;
         System.out.println("The area is "+area);
     }
}

class person{
    String myName="Goodluck Ebele";
    String sex = "Male";
    String complexion="light";
    String height ="tall";
    String size = "thin";
    String relationshipStatus = "maried";
    String origin = "Oyo state";
    int age = 60;
    //public person(){  
    //}
    public void showdata(){
        System.out.println("The deatils for the presidential candidate is\n"
        +myName+"\n"+sex+"\n"+age);
        System.out.printf("\n%s\n%s\n%s\n%s",complexion,
                height,size,relationshipStatus,origin);
    }
}
