import java.io.File;
import java.io.IOException;
import java.util.*;
public class Main {

	 public static void main(String args[]) throws IOException, Throwable{
	        long startTime = System.currentTimeMillis();
	        Archivos m= new Archivos();
	        m.introducirArchivosTXT();

	    Ejecutable e = new Ejecutable();
		Thread t1 = new Thread(e);
		Thread t2 = new Thread(e);
		Thread t3 = new Thread(e);
		Thread t4 = new Thread(e);
	        
	        try{
	            {
	                t1.run();
	                t2.run();
	                t3.run();
	                t4.run();
	            }
	        }catch(Exception exc){
	        
	        }
	        
	        long endTime   = System.currentTimeMillis();
	        long totalTime = endTime - startTime;
	        System.out.println("\nTotal time: "+ totalTime + " milliseconds");
	        
	    }
}
