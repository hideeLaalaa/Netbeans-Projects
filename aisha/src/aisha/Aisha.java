/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aisha;
import javax.swing.JOptionPane;
import java.util.Scanner;
/**
 *
 * @author Hidee
 */
public class Aisha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entry=new Scanner(System.in);
        // TODO code application logic here
        int age;
        String department;
        System.out.print("enter age:");
        age=entry.nextInt();
        System.out.print("enter your department:");
        department=entry.next();
        System.out.print("your age is "+age+" and your department is "+department);
        String input=JOptionPane.showInputDialog(null,"enter your age");
        age=Integer.parseInt(input);
        department=JOptionPane.showInputDialog(null,"enter your department");
        JOptionPane.showMessageDialog(null,"your age is "+age+" and your department is "+department);
        
    }
    
}
