
package aisha;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
public class quiz {
    
    public static void main(String[] args){
        resistors TResistor = new resistors();
        
        String input;int choice=0;
        do{
        input = JOptionPane.showInputDialog(null,"\t\tRESISTANCE CALCULATOR\nEnter 1 for series\nEnter 2 for parallel");
        choice =Integer.parseInt(input);
        if(choice!=1&&choice!=2)
            JOptionPane.showMessageDialog(null,"Error choice");
        }while(choice>2||choice<1);
        if(choice==1)
            TResistor.series();
        else
            TResistor.parallel();
    }
    
}

class resistors{
    int series;float parallel;double r;
    JTextArea out = new JTextArea(20,20);
    public resistors(){
        
    }
    
    public void series(){
        
        for (int i=0;i<3;i++){
           String entry = JOptionPane.showInputDialog(null,"Enter the value for resistor "+(i+1));
           r=Integer.parseInt(entry);
           out.append("Resistor R"+(i+1)+" = "+r+"\n");
           series+=r;
        }
        out.append("Equivalent resistance in series is "+series+"(ohms)\n");
        JOptionPane.showMessageDialog(null,out,"Series Resistance Calculator",1);
    }
    
    public void parallel(){
        
        for (int i=0;i<3;i++){
           String entry = JOptionPane.showInputDialog(null,"Enter the value for resistor "+(i+1));
           r=Double.parseDouble(entry);
           out.append("Resistor R"+(i+1)+" = "+r+"\n");
           parallel+=(1/r);
        }
        parallel=(1/parallel);
        out.append("Equivalent resistance in parallel is "+parallel+"(ohms)\n");
        JOptionPane.showMessageDialog(null,out,"Parallel Resistance Calculator",1);
    }
}
