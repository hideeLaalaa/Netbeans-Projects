/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gproject;
import java.io.*;
import java.net.*;
/**
 *
 * @author Hidee
 */
public class Gproject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
       /* FileWriter f = new FileWriter("test.txt",true);
        PrintWriter out= new PrintWriter(f);
        out.println("They say they are so not feeling wizzy boy with his new hit 'soco'");
          out.close();
          f.close();*/
       
      // loadArray("test.txt");
     /* File f = new File("test.txt");
      File g = new File("issa.txt");
      PrintWriter out = new PrintWriter(g);
      out.println("Anti zainab is a very naughty ");
      out.close();
    */
     
     //example plural
 /*    InputStreamReader isr = new InputStreamReader(System.in);
     BufferedReader keyboard= new BufferedReader(isr);
     System.out.print("Enter a word:");
     System.out.flush();
     String line = keyboard.readLine();
     System.out.println("The plural of "+line+" is "+line+"s.");
  */
 
     //Generalized input and output
     // Reads from the Internet and writes to a file
    System.out.println("*** Internet -> File ***");
    URL u = new URL("http://www.inf.unibz.it/");
    InputStream net = u.openStream();
    File fout = new File("CShome.html");
    FileOutputStream fileos = new FileOutputStream(fout);
    readWrite(net, fileos);
    fileos.close();
    // Reads from a file and writes to video
    System.out.println("*** File -> Video ***");
    File fin = new File("CShome.html");
    FileInputStream fileis = new FileInputStream(fin);
    readWrite(fileis, System.out);
    fileis.close();
}
    
    public static void readWrite(InputStream in,OutputStream out) throws IOException{
    InputStreamReader isr = new InputStreamReader(in);
    BufferedReader br = new BufferedReader(isr);
    PrintStream ps = new PrintStream(out);
    String line = br.readLine();
    while (line != null) {
    ps.println(line);
    line = br.readLine();
    }
    
    public static String[] loadArray(String fileName) throws IOException{
        FileReader f = new FileReader(fileName);
       BufferedReader in = new BufferedReader(f); //the object for reading from file
     String line = in.readLine();
     int n=0;
     while(line!=null){
         n++;
         line=in.readLine();
     }
     
     f.close();
     String[] id = new String[n];
     f=new FileReader(fileName);
     in = new BufferedReader(f);
     int i=0;
     line = in.readLine();
     while(line!=null&&i<n){
         id[i]=line;
         line=in.readLine();
         i++;
     }
    f.close();
    return id;
    }
     
    public static void saveArray(String[] v,String fileName)throws IOException{
        FileWriter f = new FileWriter(fileName);
         PrintWriter out= new PrintWriter(f);
         for(int i=0;i<v.length;i++)
             out.println(v[i]);
         out.close();
         f.close();
    }
    
}
