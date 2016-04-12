import java.io.*;
import java.util.*;


public class Ejecutable implements Runnable{
	
	public void run(){
		while(true){
		try {
			process.proceso();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
	
	
	}


