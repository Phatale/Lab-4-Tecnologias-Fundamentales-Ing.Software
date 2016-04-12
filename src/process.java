import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;

public class process {

	public static void proceso() throws IOException{

		Archivos m = new Archivos();// creamos clase para poder llamar metodos
        ArrayList<String> nombres  = m.nombresTxt();// se guardan todos los nombres de los archivos
        String direccion = null;// para guardar la direccion
        for(int i = 0; i <nombres.size();i++){	// Si existe el nombre en el archivoChecked
        	if(!m.existe(nombres.get(i))){		//seguimos normal hasta llegar a uno que no lo tenga
        		direccion = nombres.get(i);		//	lo asignamos y usamos ese como nuestr nuevo file.
        		break;
        	}

        }

        if(direccion.equals(null)){// Si no quedan ya mas files
        	System.out.println("We are done");
        	return;
        }
		
		File palindromes =  new File(direccion);// Tenemos el file revisamos por palindromos
		BufferedReader reads = new BufferedReader(new FileReader(palindromes));
		int numofpali = 0;
		Palindromo pali = new Palindromo();
		String line;
		while((line = reads.readLine())!= null){
			System.out.println(line);
				if(pali.isPali(line)){
						numofpali++;
						if(line.equals("")){
							numofpali--;
						}
						}
		}
		System.out.println("El archivo" + palindromes.getAbsolutePath() +" tiene " + numofpali  + " palindromos");
		// Imprimos el resultado

		
		// Escribimos el nombre del path en el archivoChecked para no repetir
		try(FileWriter fw = new FileWriter("ArchivosChecked.txt", true);
			    BufferedWriter bw = new BufferedWriter(fw);
			    PrintWriter out = new PrintWriter(bw))
			{
			    out.println(direccion);
			} catch (IOException e) {
			    
			}
		
	}
}
