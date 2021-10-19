package fr.diginamic.chaines;

public class TestStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long debut= System.currentTimeMillis();
		int nb=1;
		StringBuilder nombres= new StringBuilder();
	
		
		while(nb<100_000) {
			
			nb++;
			nombres.append(nb);
		}
		
		
		long fin= System.currentTimeMillis();
		System.out.println(nombres.toString());
		System.out.println("Temps ecoulé : "+ (fin-debut)+" milliseconde(s)");
		
		long deb= System.currentTimeMillis();
		int n=1;
		String s = "Nombre de ";
		while (n < 100_000) {

			n++;
			s= s+n;
		}
	
		long f= System.currentTimeMillis();
		System.out.println("Temps ecoulé : "+ (f-deb)+" milliseconde(s)");
	}

}
