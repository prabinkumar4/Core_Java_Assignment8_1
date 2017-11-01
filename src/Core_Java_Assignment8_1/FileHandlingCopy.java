package Core_Java_Assignment8_1; //Package declaration is mandatory

	import java.io.File; //Importing IO package
	import java.io.FileInputStream;
	import java.io.FileOutputStream;
	import java.io.IOException;
	 

	public class FileHandlingCopy {
		
		//main started
		  public static void main(String[] args) {
		      FileInputStream ins = null;
		      FileOutputStream outs = null;
		      try {
		         File infile =new File("D:\\Backup_from_old_laptop_Drives\\Acadgild\\Java\\Assignments\\8.1\\inputfile.txt");  //copying input from the defined location 
		         File outfile =new File("D:\\Backup_from_old_laptop_Drives\\Acadgild\\Java\\Assignments\\8.1\\outputfile.txt"); //creating output to the defined location 
		         ins = new FileInputStream(infile);
		         outs = new FileOutputStream(outfile);
		         byte[] buffer = new byte[1024];
		         int length;
		         
		         while ((length = ins.read(buffer)) > 0) {
		            outs.write(buffer, 0, length);
		         } 
		         ins.close();
		         outs.close();
		         System.out.println("File copied successfully!!"); // printing message after successful copy.
		      } catch(IOException ioe) {
		         ioe.printStackTrace();
		      } 
		   }
		}
