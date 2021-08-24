/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aisha341;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author Hidee
 */
public class Aisha341 {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int k=0,v=0;String i="";
        String[] text = new String[10];
        JTextArea out = new JTextArea(30,20);
        while(v<1||v>10){
            i=JOptionPane.showInputDialog(null,"How many strings are in the array(1-10)?");
            v=Integer.parseInt(i);
        }
        out.append("Text arranged in alphabetical order\n");
        out.append("______________________________\n");
        for(k=0;k<v;k++)
            text[k]=JOptionPane.showInputDialog(null,"Enter text "+(k+1));
        myString entered_text = new myString(text,v,'z');
        text = entered_text.arrange();
        for(k=0;k<v;k++)
            out.append((k+1)+"\t"+text[k]+"\n");
        JOptionPane.showMessageDialog(null, out, "Text Output", 1);
    }
}

class myString{
    private String[] stringArray = new String[10];
    private String ps = "";
    private int count=0;
    private char order = 'n';
    public myString(String[] s,int c,char o){
        stringArray = s;
        count =c;
        order=o;
    }
    public String[] arrange(){
        int i=0;
        if(order=='a'){
            do{
                if((stringArray[i]).compareTo(stringArray[i+1])>0){
                    ps = stringArray[i].substring(0);
                    stringArray[i]=stringArray[i+1].substring(0);
                    stringArray[i+1]=ps.substring(0);
                    i=0;
                }
                else i++;
            }while(i<(count-1));
        }
        else 
            do{
                if((stringArray[i].compareTo(stringArray[i+1]))<0){
                    ps = stringArray[i].substring(0);
                    stringArray[i]=stringArray[i+1].substring(0);
                    stringArray[i+1]=ps.substring(0);
                    i=0;
                }
                else i++;
            }while(i<(count-1));
        return stringArray;
    }
}
