
package aisha;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.util.Random;

public class Matrix {
    //DECLARATION OF THE VARIABLES
    static int m,n,p,q;
    static JTextArea out = new JTextArea(30,20);
    private static Random ran = new Random();
    
    public static void main(String[] args){
    matrixMultiply();
        
    }
    
    public static void matrixMultiply(){
        //FOR INPUT OF ROWS AND COLUMNS OF MATRIX A AND B
        String entry;int multiply;
        entry=JOptionPane.showInputDialog(null,"Enter number of rows for matrix A");
        m=Integer.parseInt(entry);
        entry=JOptionPane.showInputDialog(null,"Enter number of columns for matrix A");
        n=Integer.parseInt(entry);
        entry=JOptionPane.showInputDialog(null,"Enter number of rows for matrix B");
        p=Integer.parseInt(entry);
        entry=JOptionPane.showInputDialog(null,"Enter number of rows for matrix B");
        q=Integer.parseInt(entry);
   
 //       m=6;n=6;p=6;q=6;
 
        //MATRIX INITIALIZATION
        int[][] matA  = new int[m][n];
        int[][] matB  = new int[p][q];
        int[][] matC  = new int[m][q];
        
        if(n==p){
            //INPUT OF MATRIX A
            for(int i=0;i<matA.length;i++)
                for(int j=0;j<matA[i].length;j++){
                   entry=JOptionPane.showInputDialog(null,"Enter value for matrix A row "+i+" column "+j); //CHANGE HERE
                   matA[i][j]=Integer.parseInt(entry);
                  //matA[i][j]=ran.nextInt(10);
                }
            
            //INPUT OF MATRIX B
            for(int i=0;i<matB.length;i++)
                for(int j=0;j<matB[i].length;j++){
                  entry=JOptionPane.showInputDialog(null,"Enter value for matrix B row "+i+" column "+j);
                  matB[i][j]=Integer.parseInt(entry);
                //   matB[i][j]=ran.nextInt(10);
                }
            // MLTIPLICATION OF MATRIX A AND MATRIX B
            for(int row=0;row<m;row++)
                for(int col=0;col<q;col++)
                    for(int size =0;size<n;size++){
                         multiply=matA[row][size]*matB[size][col];
                        matC[row][col]+=multiply;
                    }
            
            //THIS IS` TO OUTPUT MATRIX A AND MATRIX B.....
            out.append("MATRIX A");
            for(int i=0;i<n||i<q;i++){
                if(i==n-1)
                    out.append("\tX\t");
                else
                    out.append("\t");}
            out.append("MATRIX B\n\n");
      
            for(int i=0;i<matA.length||i<matB.length;i++){
              if(i<m)
                for(int j=0;j<matA[i].length;j++)
                    out.append(matA[i][j]+"\t");
              else 
                for(int j=0;j<matA[0].length;j++)
                  out.append(" \t");
                    out.append("\t");
                if(i<p)
                for(int j=0;j<matB[i].length;j++)
                    out.append(matB[i][j]+"\t");
                else 
                  out.append(" \t");
                out.append("\n\n");
            }
            
            //OUTPUT A NEW LINE AFTER DISPLAYING MATRIX A AND MATRIX B 
            out.append("\n");
            
            //THIS IS TO CREAATE A BOUNDARY LINE BETWEEN MATRIX A,B AND MATRIX C
            for(int i=0;i<q||i<n;i++)
                out.append("__________________________");
            
            //DISPLAY OF MATRIX C
            out.append("\n\t\t\t\t\t   MATRIX C = MATRIX A * MATRIX B\n\n\t\t\t\t");
            for(int i=0;i<matC.length;i++){
                for(int j=0;j<matC[i].length;j++)
                    out.append(matC[i][j]+"\t");
                out.append("\n\n\t\t\t\t");
            }
            JOptionPane.showMessageDialog(null,out,"Matrix multiplication",1);
        }
        else   //THIS IS IF THE NUMBER OF COLUMNS OF MATRIX A IS NOT EQUAL TO THE NUMBERS OF ROWS IN MATRIX B
            JOptionPane.showMessageDialog(null,"The number of rows in matrix a must be equal to the number of columns in matrix B");
        
    
    
     }
}