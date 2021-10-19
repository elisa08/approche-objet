package fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ManipulationFichier {
	
	public static void main(String[] args) throws IOException {
		
		Path chemin= Paths.get("C:/Users/Elisa/OneDrive/Bureau/formation-concepteur-developpeur/recensement.csv");
		Path chemin2= Paths.get("C:/Users/Elisa/OneDrive/Bureau/formation-concepteur-developpeur/ville25000hbt.txt");
		List<String> lignes= Files.readAllLines(chemin,StandardCharsets.UTF_8);
		List<String> lignesFichier2= new ArrayList<>();
		lignesFichier2.add(lignes.get(0));
		lignes.remove(0);
		for (String line : lignes) {
			
//			System.out.println(line);
			
			
			String[] nbHb= line.split(";");
			
//			System.out.println(nbHb[9]);
			
			String nbH= nbHb[9];
			
			
			nbH= nbH.trim().replace(" ", "");
			
			System.out.println(nbH);
			
			int hbt= Integer.parseInt(nbH);
			
			if(hbt>25000) {
				
				lignesFichier2.add(nbHb[6]+";"+nbHb[2]+";"+nbH);
				
			}
			
		}
		
		Files.write(chemin2, lignesFichier2);
	}

}
