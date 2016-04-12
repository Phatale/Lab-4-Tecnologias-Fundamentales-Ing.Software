import java.util.*;

import java.io.*;

public class Archivos {
	
	// devuelte true si existe el nombre en el archivo 
	public boolean existe(String m) throws IOException{
		File check = new File("ArchivosChecked.txt");
		BufferedReader reader = new BufferedReader(new FileReader(check));
		String line;
		while((line = reader.readLine())!= null){
			if(line.equals(m)){
				return true;
			}
		}
		return false;
	}

	public ArrayList<String> nombresTxt(){
		ArrayList<String> nombres = new ArrayList<String>();
		File folder = new File("src/Textos");
		File[] listofFiles = folder.listFiles();
		for(int i = 0 ; i < listofFiles.length ; i ++){
		nombres.add(listofFiles[i].toString());
		}
		
		return nombres;
		
		
	}
	
	public void introducirArchivosTXT() throws Exception, IOException{
		File folder = new File("src/Textos");
		File[] listofFiles = folder.listFiles();
		PrintWriter writer = new PrintWriter("ArchivosChecked.txt", "UTF-8");

	
		writer.close();

		System.out.println("Referencia Creada");
	
		
	}

}

