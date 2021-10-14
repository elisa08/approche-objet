package sets;

import java.util.HashSet;

public class TestPays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pays pays1= new Pays("USA",80_000_000,57000);
		Pays pays2= new Pays("Inde",1000_000_000,2000);
		Pays pays3= new Pays("France",60_000_000,60000);
		Pays pays4= new Pays("Allemagne",20_000_000,60000);
		Pays pays5= new Pays("Japon",20_000_000,70000);
		Pays pays6= new Pays("Chine",2000_000_000,50000);
		Pays pays7= new Pays("Russie",40_000_000,60000);
		
		
		HashSet<Pays> pays= new HashSet<Pays>();
		
		pays.add(pays1);
		pays.add(pays2);
		pays.add(pays3);
		pays.add(pays4);
		pays.add(pays5);
		pays.add(pays6);
		pays.add(pays7);
		
		long pibPG=0;
		String nom= null;
		for (Pays p : pays) {
			
			long pib=  p.getPibHb();
			
			if (pib > pibPG) {
				
				pibPG= pib;
				nom= p.getNom();
				
			}
			
		}
		
		System.out.println("Pib le plus grand : "+pibPG+" est produit par le pays : "+nom);
		System.out.println("---------------");
		
		long pibTotalPG=0;
		String nomPays= null;
		
		for (Pays p : pays) {
			long pib= p.getPibHb();
			long hb= p.getNbHb();
			long pibTotal= pib*hb;
			
			if (pibTotal > pibTotalPG) {
				
				pibTotalPG= pibTotal;
				nomPays= p.getNom();
				
			}
			
		}
		
		System.out.println("Pib total le plus grand : "+pibTotalPG+" est produit par le pays : "+nomPays);
		System.out.println("---------------");

		long pibTotalPt= Long.MAX_VALUE;
		
		nomPays= null;
		Pays paysPpt= new Pays("",0,0);
		for (Pays p : pays) {
			
			long pib= p.getPibHb();
			long hb= p.getNbHb();
			long pibTotal= pib*hb;
			
			
			if (pibTotal < pibTotalPt) {
				
				pibTotalPt= pibTotal;
				nomPays= p.getNom();
				paysPpt= p;
			}
			
		}
		
		System.out.println("Pib le plus petit : "+pibTotalPt+" est produit par le pays : "+nomPays);
		pays.remove(paysPpt);
		
		System.out.println("---------------");
		
		for (Pays pays8 : pays) {
			
			System.out.println(pays8.toString());
			
		}
		
		
	}

}
