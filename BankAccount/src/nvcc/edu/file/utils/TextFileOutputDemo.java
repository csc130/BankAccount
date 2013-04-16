package nvcc.edu.file.utils;
import java.io.PrintWriter;          
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.File;
import java.util.Scanner;

import nvcc.edu.model.Account;
public class TextFileOutputDemo
{
    public static void write (Account theAc)
    {
    	
    	//PrintWriter pw = new PrintWriter(new FileOutputStream(
    		    //new File("persons.txt"), 
    		   // true /* append = true */));
        String fileName = "out.txt"; //The name could be read from
        //the keyboard.
        PrintWriter outputStream = null;
        try
        {
            outputStream = new PrintWriter (new FileOutputStream(new File(fileName),true));
        }
        catch (FileNotFoundException e)
        {
        	
            System.err.println ("Error writing the file " +
                    fileName);
            System.exit (0);
        }
    
        Scanner keyboard = new Scanner (System.in);
       
            String line = ""; 
            line += theAc + "\t";
            
            outputStream.println(line);
        
        outputStream.close ();
        System.out.println ("Bank account was written to " +
                fileName);
    }
}