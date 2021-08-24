package javaapplication6;
import javax.swing.JOptionPane;

import java.util.Scanner;
public class JavaApplication6 {

    public static void main(String[] args) {
        //
      /*  Scanner input = new Scanner(System.in);
        String first,second;double length,breadth,area;
        String name;
        String last;
        name=JOptionPane.showInputDialog("what is your name");
        first = JOptionPane.showInputDialog("The length of the rectangle is");
        length=Double.parseDouble(first);
        second = JOptionPane.showInputDialog("The breadth of the rectangle is");
        breadth=Double.parseDouble(second);
        area=length*breadth;
        JOptionPane.showMessageDialog(null,name+" The area of the rectangle is "+area);
        */
      
      String input,name;int i=0;Double total=0.0,number,mean;
      name=JOptionPane.showInputDialog(",What is your name");
          
          String a=JOptionPane.showInputDialog("Enter no"+(++i));
          String b=JOptionPane.showInputDialog("Enter no"+(++i));
          String c=JOptionPane.showInputDialog("Enter no"+(++i));
          String d=JOptionPane.showInputDialog("Enter no"+(++i));
          String e=JOptionPane.showInputDialog("Enter no"+(++i));
          Double number1=2017-Double.parseDouble(a);
          Double number2=Double.parseDouble(b);
          Double number3=Double.parseDouble(c);
          Double number4=Double.parseDouble(d);
          Double number5=Double.parseDouble(e);
          total+=number1+number2+number3+number4+number5;
      mean=total/i;
      JOptionPane.showMessageDialog(null, "Dear user "+name+" The mean of "+a+","+b+","+c+","+d+","+e+ " is " + mean);
        System.exit(0);
        
    }
    
}
