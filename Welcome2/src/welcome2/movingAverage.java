
package welcome2;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;
import javax.swing.JTextArea;
import java.util.Random;

public class movingAverage {

public static void main(String[] args){
  /*  int k=0,a=0;double d=0;
    String i="";
    String[] inputNumber = new String[10];
    double[] convertNumber = new double[10];
    double[] numberOutput = new double[10];
    JTextArea output = new JTextArea(20,30);
    DecimalFormat df = new DecimalFormat("0.00");
    while(a<1||a>10){
        i=JOptionPane.showInputDialog(null,"How many names are in the array(1-10)?");
        a=Integer.parseInt(i);
    }
    output.append("Number\tmovingAverage\n");
    for(k=0;k<a;k++){
        inputNumber[k]=JOptionPane.showInputDialog(null,"Enter text "+(k+1));
        convertNumber[k]=Double.parseDouble(inputNumber[k]);
        d=convertNumber[k]+d;
        numberOutput[k]=d/(k+1);
        output.append(df.format(k+1)+"\t"+df.format(numberOutput[k])+"\n");
    }
    JOptionPane.showMessageDialog(null,(output),"Text Output thsis that",1);
    System.exit(0);
*/
 /* Random ran = new Random();
  int days[] = new int[31];
  double month=0,convert=0;int i=0,j=0;
  JTextArea out = new JTextArea(30,30);
  DecimalFormat df = new DecimalFormat("00.00");
  out.append("DAY\tAVAERAGE HOURLY TEMPERATURE\n");
  for(j=0;j<days.length;j++){
  for(i=0;i<24;i++){
      //String entry = JOptionPane.showInputDialog(null,"Enter temperature for January "+(j+1)+" Hour "+(i+1));
      //convert=Integer.parseInt(entry);
      convert=ran.nextInt(100);
      days[j]+=convert;
  }
  days[j]/=i;
  month+=days[j];
  out.append("Jan "+(j+1)+"\t"+df.format(days[j])+" (C)\n");
  }
  month/=j;
  out.append("\nAverage temperature for the month is "+df.format(month));
  JOptionPane.showMessageDialog(null,(out),"Temperature Data",1);
  System.exit(0);
  */
 
 temperature test = new temperature();
 test.hour();
}   
}

class temperature{
    public temperature(){}
    public void hour(){
        Random ran = new Random();
  int days[] = new int[31];
  double month=0,convert=0;int i=0,j=0;
  JTextArea out = new JTextArea(30,30);
  DecimalFormat df = new DecimalFormat("00.00");
  out.append("DAY\tAVAERAGE HOURLY TEMPERATURE\n");
  for(j=0;j<days.length;j++){
  for(i=0;i<24;i++){
      //String entry = JOptionPane.showInputDialog(null,"Enter temperature for January "+(j+1)+" Hour "+(i+1));
      //convert=Integer.parseInt(entry);
      convert=ran.nextInt(100);
      days[j]+=convert;
  }
  days[j]/=i;
  month+=days[j];
  out.append("Jan "+(j+1)+"\t"+df.format(days[j])+" (C)\n");
  }
  month/=j;
  out.append("\nAverage temperature for the month is "+df.format(month));
  JOptionPane.showMessageDialog(null,(out),"Temperature Data",2);
  System.exit(0);
  
    }
}
