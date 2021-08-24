
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hidee
 */
class Calender {
     public static  void main(String args[]){     
      String input = JOptionPane.showInputDialog("Enter the string");
        int n = input.length();
        int a =n-1;
        try{
        for(int i=0;i<n;i++){
            if(i!=a){
            System.out.print(input.charAt(i)+"\t"+input.charAt(a)+"\n ");
            a--;
            }
            else{
                System.out.print("   "+input.charAt(i));
            }
        }
        }catch(Exception e){
            
        }
}
}
