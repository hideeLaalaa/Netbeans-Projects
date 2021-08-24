// ******3 SIMULTANEOUS EQUATION SOLVING PROGRAM....******
package aisha;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
/**
 *
 * @author Hidee
 */
public class NewClass {
    private static JTextArea out = new JTextArea(20,20);
    public static void main(String[] args){
        test testing = new test();
        
   /*     int g[][]=new int[3][3];
        double y[]={14,12,0};
              /*  for(int i=0;i<3;i++){
            for(int j=0;j<3;j++)
                x[i][j]=Integer.parseInt(JOptionPane.showInputDialog(null,"value for row"+i+" column"+j));
        }
           for(int i=0;i<3;i++)
              y[i]=Integer.parseInt(JOptionPane.showInputDialog(null,"value for row"+i+" column"+0));
        double[][] x={{16,3,9},{3,2,4},{1,-1,1}};
        double det=testing.name(x);
        out.append(det+"\n");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++)
                out.append(x[i][j]+"\t");
        out.append("\n");
        }
        for(int j=0;j<3;j++){
            double i1=testing.naming(x,y,j);
            out.append(i1+"\n");
            i1/=det;
            out.append("\ni"+(j+1)+" = "+i1+"\n");
        }
        JOptionPane.showMessageDialog(null,(out),"simultaneous equation solver",3);
        */
   
        double[][] g ={{5,3,-6,2},{0,4,2,0},{4,0,1,3},{1,6,4,3}};
        double[] y={3,-3,0,6};
        double det = testing.fourM(g);
        out.append("first det is "+det+"\n");
        for(int j=0;j<4;j++){
            double i1=testing.four(g,y,j);
            out.append(i1+"\n");
            i1/=det;
            out.append("\ni"+(j+1)+" = "+i1+"\n");
        }
        JOptionPane.showMessageDialog(null,(out),"simultaneous equation solver",3);
    }
    
}

class test{
   
    public double name(double[][] x){
System.out.append("dett\n\n");
         
        double a = x[0][0]*((x[1][1]*x[2][2])-(x[1][2]*x[2][1]));
        double b = -x[0][1]*((x[1][0]*x[2][2])-(x[1][2]*x[2][0]));
        double c = x[0][2]*((x[1][0]*x[2][1])-(x[1][1]*x[2][0]));
        double mat=a+b+c;
        
        return mat;
    }
    
    public double naming(double[][] x,double[] y,int j){
        double v[][]=new double[3][3];
        for(int i=0;i<3;i++){
            for(int t=0;t<3;t++)
                v[i][t]=x[i][t];
        }
        for(int i=0;i<3;i++){
            v[i][j]=y[i];
        }
        double i=name(v);
        return i;
    }
    
    public double fourM(double[][] x){
        double v[][]= new double[3][3];
        double i1=0.0;
        int k=0,l=0;
        for(int u=0;u<4;u++){
            k=0;
            for(int j=1;j<4;j++,k++){
           l=0;
                for(int i=0;i<4;i++){ 
                if(j!=0&&i!=u)
                    v[k][l++]=x[j][i];
            }
        }
        i1 += x[0][u]*name(v);
           if(u%2==1)
               i1*=-1;
        }
//                JOptionPane.showMessageDialog(null,i1);
        return i1;

    }
    
    public double four(double[][] x,double[] y,int j){
        double[][] v = new double[4][4];
        for(int i=0;i<4;i++){
            for(int t=0;t<4;t++)
                v[i][t]=x[i][t];
        }
        for(int i=0;i<4;i++){
            v[i][j]=y[i];
        }
        double h=fourM(v);
        return h;
    }

    public void comp(){
//        
//        double[][] g ={{},{},{},{}};
//        double[] y={};
//        double det = fourM(g);
//        for(int j=0;j<4;j++){
//            double i1=four(g,y,j);
//            out.append(i1+"\n");
//            i1/=det;
//            out.append("\ni"+(j+1)+" = "+i1+"\n");
//        }
//        JOptionPane.showMessageDialog(null,(out),"simultaneous equation solver",3);
//    }
    
}
}
class simultaneous{
public static void main(String[] args){
    simult();
}   
public static void simult(){
    double x = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter ax1"));
    double y = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter ax2"));
    double z = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter C1"));
    double c = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter bx1"));
    double d = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter bx2"));
    double e = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter C2"));
    double x2 = cal(x,y,z,c,d,e);
    double x1 = z-(y*x2);
    x1/=x;
    JOptionPane.showMessageDialog(null,"x1 is "+x1+"\nx2 is "+x2);
}
public static double cal(double x,double y,double z,double c,double d,double e){
        double r=y/x;
        double s=z/x;
        double t=d/c;
        double u=e/c;
    double x1;
    if(c>0&&x>0){
        JOptionPane.showMessageDialog(null,s+","+u+","+r+","+t);
        x1=(s-u)/(r-t);}
    else
        x1=(z+e)/(y+d);
    return x1;
}
}


