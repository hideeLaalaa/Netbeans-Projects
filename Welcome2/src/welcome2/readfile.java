
package welcome2;
import java.io.*;
import javax.swing.*;
import java.util.*;

public class readfile {

public static void main(String[] args){
   //***
   //*******CODE ONE TO TEST FILE INPUT STREAM

   int content=0;
    try{
        FileInputStream myData = new FileInputStream("\\Users\\Public\\contentfile.txt");
        while(content!=-1){
            content = myData.read();
            System.out.print(content);
        }
        myData.close();
        
    }catch(FileNotFoundException ffe){
        System.out.println("Sorry..."+ffe.toString());
    }
    catch(IOException ioe){
        System.out.println("Unable to read file..."+ioe.getMessage());
    }

   //********
   //***************2ND CODE TO DEMONSTRATE FILEINPUTSTREAM
/*   int content=0;
   try{
       JTextArea output = new JTextArea(10,20);
       FileInputStream myData = new FileInputStream("C:\\Users\\Public\\说明.txt");
       while(content!=-1){
           content=myData.read();
           output.append(String.valueOf((char)content));
          // System.out.println(String.valueOf((char)content));
       }
      // JOptionPane.showMessageDialog(null,output);
       myData.close();
   }catch(FileNotFoundException ffe){
       System.out.println("Sorry..."+ffe.toString());
   }
   catch(IOException ioe){
       System.out.println("Unable to read file..."+ioe.getMessage());
   }
*/

//******
//**********PROGRAM TO DEMONSTRATE FILEOUTPUTSTREAM
/*
int content=0;
try{
    FileInputStream myDataIn = new FileInputStream("C:\\Users\\Public\\说明.txt");
    FileOutputStream myDataOut = new FileOutputStream("C:\\Users\\Public\\COPY.txt");
    while(content!=-1){
        content = myDataIn.read();
        myDataOut.write((byte)content);//this is like copying content of the files from myDataIn to this file MyDataOut
    }
    myDataIn.close();myDataOut.close();
}catch(FileNotFoundException ffe){
    System.out.println("Sorry....."+ffe.toString());
}
catch(IOException ioe){
    System.out.println("Unable to read file..."+ioe.getMessage());
}
*/

Random ran = new Random();
int[] arr = new int[1001];
for(int i=0;i<arr.length;i++)
    arr[i]=ran.nextInt();
JTextArea out = new JTextArea(20,50);
int content=0,count=0;
try{
    FileInputStream myDataIn = new FileInputStream("C:\\Users\\olatoyosi\\Desktop\\try.txt");
    FileOutputStream myDataOut = new FileOutputStream("C:\\Users\\olatoyosi\\Desktop\\rand.txt");
    while(count<1001){
        //content = ran.nextInt(500);
        //System.out.println((byte)content+"  this\n\n ");
        //myDataOut.write((byte)content);
        content = arr[count];
       //content = myDataIn.read();
       // arr[count]=(Integer)content;
        
        myDataOut.write((byte)content);
        //out.append(String.valueOf((Integer)content)+" ");
      // System.out.println(String.valueOf(content));//this is like copying content of the files from myDataIn to this file MyDataOut
       count++;
    }    myDataIn.close();myDataOut.close();
}catch(FileNotFoundException ffe){
    System.out.println("Sorry....."+ffe.toString());
}
catch(IOException ioe){
    System.out.println("Unable to read file..."+ioe.getMessage());
}
count=0;
    for(int i=0;i<arr.length;i++){
        if(i%30==0)
        out.append(arr[i]+"\n");
        else
            out.append(arr[i]+"  ");}
    JOptionPane.showMessageDialog(null,out);

}
    
}
