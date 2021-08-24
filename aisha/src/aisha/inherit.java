
package aisha;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class inherit {
    
    public static void main(String[] args){
             JTextArea out = new JTextArea(30,40);
        int choice = Integer.parseInt(JOptionPane.showInputDialog("\t\tAREA OF WHICH SHAPE\nEnter 1 for square\nEnter 2 for rectangle\n"
                + "Enter 3 for trapezium\nEnter 4 for parallelogram"));
        switch(choice){
            case 1:
                square calc = new square();
                calc.area();
                out.append(calc.toString());
                JOptionPane.showMessageDialog(null,out,"AREA CALCULATOR",3);
                break;
            case 2:
                rectangle cal = new rectangle();
                cal.area();
                out.append(cal.toString());
                JOptionPane.showMessageDialog(null,out,"AREA CALCULATOR",3);
                break;
            case 3:
                trapezium test = new trapezium();
                test.area();
                out.append(test.toString());
                JOptionPane.showMessageDialog(null,out,"AREA CALCULATOR",3);
                break;    
            case 4:
                parallelogram para = new parallelogram();
                para.area();
                out.append(para.toString());
                JOptionPane.showMessageDialog(null,out,"AREA CALCULATOR",3);
                break;
            default:
                JOptionPane.showMessageDialog(null,"Wrong choice");
        }
    }
}

class quadilateral{

    protected int length,breadth,height,base;
    double area;
    
    public quadilateral(){
    }        
              
    public String toString(){
        return ("\tSUPERCLASS QUADILATERAL\n");
    }
    
}

class square extends quadilateral{
    public void area(){
        length=Integer.parseInt(JOptionPane.showInputDialog("Enter the length of the square"));
        area=length*length;
        
    }
    @Override
    public String toString(){
        String s=String.format(super.toString()+"SUBCLASS RECTANGLE\n"+"The length of the square is "+length+
                "\n\nThe area of the square is "+length+" * "+length+" = "+area+"m");
        return s;
    }
}

class rectangle extends quadilateral{
    public void area(){
        length=Integer.parseInt(JOptionPane.showInputDialog("Enter the length of the rectangle"));
        breadth=Integer.parseInt(JOptionPane.showInputDialog("Enter the breadth of the rectangle"));
        area=length*breadth;
    }
    @Override
    public String toString(){
        String s=String.format("%s%s\n\n%s= %d\n%s= %d\n\n%s%d%s%d%s%.2f%s",
                super.toString(),"SUBCLASS RECTANGLE","The length of the rectangle ",length
                ,"The breadth of the rectangle ",breadth
                ,"The area of the rectangle is ",length,"*",breadth," = ",area,"m");
        return s;
    }
}

class trapezium extends quadilateral{
    public void area(){
        length=Integer.parseInt(JOptionPane.showInputDialog("Enter the length A of the trapezium"));
        breadth=Integer.parseInt(JOptionPane.showInputDialog("Enter the length B of the trapezium"));
        height=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the height of the trapezium"));
        area=(0.5*(length+breadth))*height;
    }
    @Override
    public String toString(){
        String s=String.format("\t%s\n%s\n%s= %d\n%s= %d\n%s= %d\n\n%s%d%s%d%s%d%s%.2f%s",
                super.toString(),"SUBCLASS TRAPEZIUM","The length A of the trapezium ",length
                ,"The length B of the trapezium ",breadth
                ,"The height of the trapezium ",height
                ,"The area of the trapezium is 1/2*(",length,"+",breadth,")*",height, " = ",area,"m");
        return s;
    }
}


class parallelogram extends quadilateral{
    public void area(){
        base=Integer.parseInt(JOptionPane.showInputDialog("Enter the base of the parallelogram"));
        height=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the height of the parallelogram"));
        area=base*height;
    }
    @Override
    public String toString(){
        String s=String.format("\t%s\n%s\n%s= %d\n%s= %d\n\n %s%d%s%d%s%.2f%s",
                super.toString(),"SUBCLASS PARALLELOGRAM","The base of the parallelogram is ",base
                ,"The height of the parallelogram ",height
                ,"The area of the parallelogram is ",base,"*",height, " = ",area,"m");
        return s;
    }
}