package diginamic.recensement;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Applicaton {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Path chemin= Paths.get("C:/Users/Elisa/OneDrive/Bureau/formation-concepteur-developpeur/recensement.csv");
		
		List<String> lignes= Files.readAllLines(chemin,StandardCharsets.UTF_8);
		List<Ville> villes= new ArrayList<Ville>();
		lignes.remove(0);
		for (String line : lignes) {
			
//			System.out.println(line);
			
			
			String[] ligneFichier= line.split(";");
			
			String codeR= ligneFichier[0];
			String nomRegion= ligneFichier[1];
			String codeDepartement= ligneFichier[2];
			String codeC= ligneFichier[5];
			String nomCommune= ligneFichier[6];
			String nbH= ligneFichier[9];
			
			
			nbH= nbH.trim().replace(" ", "");
			
			
			int hbt= Integer.parseInt(nbH);
			int codeRegion= Integer.parseInt(codeR);
			
			int codeCommune= Integer.parseInt(codeC);
			
			villes.add(new Ville(codeRegion,nomRegion,codeDepartement,codeCommune,nomCommune,hbt));
			
		}
		
		for (Ville ville : villes) {
			
			
			if(ville.getNomCommune().equals("Montpellier")) {
				
				System.out.println(ville);
				
			}
		}
		int hbs= 0;
		int minVille= Integer.MAX_VALUE;
		int maxVille= Integer.MIN_VALUE;
		String nomVille= "";
		for (int i = 0; i < villes.size(); i++) {
			Ville ville= villes.get(i);
			
			if (ville.getCodeDepartement().equals("34")) {
				
				hbs= ville.getPopTotale()+hbs;
				
				if(ville.getPopTotale()<minVille) {
					
					minVille= ville.getPopTotale();
					nomVille= ville.getNomCommune();
				}
			
			}
			
			
		}
		System.out.println("Il y a "+hbs+" habitants dans l'hérault.");
		System.out.println("La plus petite ville est "+nomVille+", avec "+minVille+" habitants.");
		
		Collections.sort(villes, new ComparatorNbhMin());
		
		int nbVille = 0;
		System.out.println("\n-----------Dix villes les plus peuplées de l'hérault :------------\n");
		for (Ville ville : villes) {
			if (ville.getCodeDepartement().equals("34")) {

				nbVille++;
				System.out.println(ville.getNomCommune()+" "+ville.getPopTotale());
				if(nbVille>=10) {
					
					break;
				}

			}
		}
		System.out.println("\n-----------Dix villes les moins peupl�es de l'hérault :------------\n");
		int nb = 0;
		Collections.sort(villes, new ComparatorNbhP());
		for (Ville ville : villes) {
			if (ville.getCodeDepartement().equals("34")) {

				nb++;
				System.out.println(ville.getNomCommune()+" "+ville.getPopTotale());
				if (nb >= 10) {

					break;
				}

			}
		}
		System.out.println("-----------------------");
		int nbTotal = 0;
		for (Ville ville : villes) {

			if (ville.getNomRegion().equals("Occitanie")) {

				nbTotal = ville.getPopTotale() + nbTotal;

			}

		}

		System.out.println("Nombre d'habitants en région Occitanie :" + nbTotal);
		System.out.println("\n-----------Le dix villes les plus peupl�es d'Occitanie------------\n");
		int n = 0;
		Collections.sort(villes, new ComparatorNbhMin());
		for (Ville ville : villes) {
			
			
				if (ville.getNomRegion().equals("Occitanie")) {

				n++;

					System.out.println(ville.getNomCommune() + " " + ville.getPopTotale());
				}

				if (n >= 10) {

					break;
				}

			

		}
		

		int depPg= 0;
		String codeD= "";
		String nom= "";
		for (Ville ville : villes) {
			if (ville.getNomRegion().equals("Occitanie")) {
				if (ville.getPopTotale() > depPg) {

					depPg = ville.getPopTotale();
					codeD = ville.getCodeDepartement();
					nom= ville.getNomCommune();
				}
			}
		}
		System.out.println("-------Le département le plus peuplé d'Occitanie----------\n");
		
		System.out.println("Département haute garonne, ville de "+nom+" : "+codeD);
		
		System.out.println("\n--------Les dix régions les plus peuplées de France---------\n");
	
	
	
	HashMap<Integer, Region> regions= new HashMap<>();
	int population= 0;
	for(Ville ville : villes) {
		
		Integer codeRegion= ville.getCodeRegion();
		Region region= regions.get(codeRegion);
		
		if(region==null) {
			
			region= new Region(ville.getNomRegion(),0);
			
			regions.put(codeRegion, region);
			
			
		}
		
		 
		population= region.getPopTotale()+ville.getPopTotale();
	
		region.setPopTotale(population);
	
		
	}
	
	List<Region> reg= new ArrayList<Region>();
	
	reg.addAll(regions.values());
	
	Collections.sort(reg, new ComparatorRegionPop());
	
	for (int i=0; i< 10;i++) {
		
		Region regionsPlusPeuplees= reg.get(i);
		
		System.out.println(regionsPlusPeuplees.getNomRegion()+" "+regionsPlusPeuplees.getPopTotale());
		
		
	}
	
}

}
