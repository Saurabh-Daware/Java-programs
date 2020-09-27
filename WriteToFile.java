package poo;

import java.io.*;
import java.util.*;

public class WriteToFile {
  public static void main(String[] args) throws IOException {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter number here");
	  int x = sc.nextInt();
	  
    File file = new File("file.txt");
    FileWriter fr = null;
    BufferedWriter br = null;
    String line = "This is line";
   
    try {
    	fr = new FileWriter(file);
    	br = new BufferedWriter(fr);
    	 for(int i = 0;i <= 1000;i++) {
    	    	br.write(x+" x "+i+" = "+x*i+System.getProperty("line.separator"));
    	    }
    }finally{
    	br.close(); fr.close();
    }
  }
}
