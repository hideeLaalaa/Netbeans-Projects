/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aisha;
import javax.swing.JOptionPane;
import java.util.Random;
import javax.swing.JTextArea;
/**
 *
 * @author Hidee
 */
public class aisha_part2 {
public static void main(String[] args){
 
   /* Random ran = new Random();
    double number = ran.nextDouble();
    number*=8;
    JOptionPane.showMessageDialog(null,"Initial value of number is "+number);
    JOptionPane.showMessageDialog(null,"Floor is "+ Math.floor(number));
    JOptionPane.showMessageDialog(null,"Ceil is "+ Math.ceil(number));
    JOptionPane.showMessageDialog(null,"Floor is "+ Math.pow(number, 4));
    */
  /* int prime=0;
   for(int i=100;i>=1;i++){
       for(int j=2;j<=100;j++){
           if(i%j==0)
               prime = -1;
       }
       if(prime!=-1)
           JOptionPane.showMessageDialog(null,i+"is a prime number");
   }
}*/
  JTextArea out = new JTextArea(30,20);
  out.append("Prime numbers btw 1 - 100 are\n");
		 for(int number=1;number<=100;number++)
  {
            int pri=0;
		for(int i=2;i<number;i++){
			if(number%i==0)
			pri = -1;
		}
		if(pri!=-1)
			out.append(number+"    ");
  }
                 JOptionPane.showMessageDialog(null,out,"prime",2);
	}//end
	
	

    
    
}
