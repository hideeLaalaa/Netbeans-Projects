/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycgpa;
import javax.swing.JOptionPane;
/**
 *
 * @author Hidee
 */
public class MyCGPA {

    public static void main(String[] args) {
        // TODO code application logic here
    /*    int a1=0,a21=0,a22=0,a3=0,apass=0,studentPopulation,counter;
        double cgpa;String entry;
        entry=JOptionPane.showInputDialog("How many students are in the class");
        studentPopulation = Integer.parseInt(entry);
        
        for(counter =studentPopulation;counter>=1;counter--){
            entry=JOptionPane.showInputDialog("Enter CGPA for student "+counter);
            cgpa=Double.parseDouble(entry);
            if(cgpa>=4.50) a1++;
            else if (cgpa>=3.50) a21++;
            else if(cgpa>=2.50) a22++;
            else if(cgpa>=1.50) a3++;
            else if(cgpa>=1.00) apass++;
        }
        JOptionPane.showMessageDialog(null, "Number of students in first class division ="+a1
        +"\nNumber of students in second class, Upper division ="+a21
        +"\nNumber of students in second class,Lower divission ="+a22
        +"\nNumber of students in third class ="+apass);
        */
   // odd();
    grade();
    }
    
   public static void grade(){
       int A,B,C,D,E,F,score,population;
       String input,grade="";
       input = JOptionPane.showInputDialog("Enter the number of students");
       population = Integer.parseInt(input);
        for(int i=1;i<=population;i++){
           input = JOptionPane.showInputDialog("Enter score for student "+i);
           score=Integer.parseInt(input);
           if(score<=100&&score>=0){
               if(score>=70) grade="A";
               else if(score>=60) grade = "B";
               else if(score>=50) grade = "C";
               else if(score>=45) grade = "D";
               else if(score>=40) grade = "E";
               else if(score<40) grade = "F";
                JOptionPane.showMessageDialog(null,"grade is "+grade);
           }
          
       }
       
   }
   
   public static void odd(){
       int odd=0,number;
       String input;
       for(int i=1;i<=20;i++){
           input=JOptionPane.showInputDialog("Enter number "+i);
           number = Integer.parseInt(input);
           if(number%2==1) odd++;
       }
       JOptionPane.showMessageDialog(null, "The number of odd numbers is "+odd);
   }
}
