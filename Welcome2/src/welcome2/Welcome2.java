/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package welcome2;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author olatoyosi
 */
public class Welcome2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    /*    Scanner in = new Scanner(System.in);
        int rest=0;
        System.out.print("Enter x:");
        int x = in.nextInt();
         System.out.print("Enter y:");
        int y=in.nextInt();
        System.out.print("Enter the operator:");
        String oper=in.next();
        switch(oper){
            case "*":
                rest =x+y;
                System.out.println(rest);
                break;
            case "+":
                rest=x-y;
                System.out.println(rest);
                break;
            case "-":
                rest = x-y;
                System.out.println(rest);
                break;
            case "/":
                rest=x/y;
                System.out.println(rest);
                break;
            default:
                System.out.print("only operators +,-,/&* are acceptable ");
        }*/
       grade();
    }
    public static void grade(){
         int a1=0,a21=0,a22=0,a3=0,apass=0,studentPopulation,counter;
        double cgpa;String entry;
        entry=JOptionPane.showInputDialog("How many students are in the class");
        studentPopulation = Integer.parseInt(entry);
        
        for(counter =studentPopulation;counter>=1;counter--){
            entry=JOptionPane.showInputDialog("Enter CGPA for student "+counter);
            cgpa=Double.parseDouble(entry);
            if(cgpa>=1.0&&cgpa<=5.00){
                if(cgpa>=4.5&&cgpa<=5.00) a1++;
             if (cgpa>=3.50&&cgpa<4.5) a21++;
             if(cgpa>=2.50&&cgpa<3.50) a22++;
             if(cgpa>=1.50&&cgpa<2.5) a3++;
            if(cgpa>=1.00&&cgpa<1.50) apass++;
            }
            if(cgpa>5.0||cgpa<1.0)
                JOptionPane.showMessageDialog(null,"The cgpa must be btw 1.0 and 5.0");
            
        }
        JOptionPane.showMessageDialog(null, "Number of students in first class division ="+a1
        +"\nNumber of students in second class, Upper division ="+a21
        +"\nNumber of students in second class,Lower divission ="+a22
        +"\nNumber of students in third class ="+apass);
       
        
    }
    
}
