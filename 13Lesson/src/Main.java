
public class Main {
	public static void main(String[] args) {
		//Copiare DEGLI OGGETTI
		//implementiamo due nuovi oggetti
		
		Persona persona1 = new Persona("Luca", "Rossi");
		Persona persona2 = new Persona("Marco", "Verdi");
		
		System.out.println(persona1);
		System.out.println(persona2);
		System.out.println();
		System.out.println(persona1.getNome());
		System.out.println(persona1.getCognome());
		System.out.println();
		System.out.println(persona2.getNome());
		System.out.println(persona2.getCognome());
		
		//Se vogliamo copiare i dati e fare in modo che i due oggetti sono uguali per istinto faremmo
		
		persona2 = persona1;
		
		//Se andiamo a stampare l'oggetto però ci restituirà LA STESSA POSIZIONE IN MEMORIA il che vuol dire che non sono DAVVERO DUE OGGETTI diversi ma fondamentalmente lo stesso oggetto perchè vivono entrambi nella stessa casella di memoria
		//praticamente finirebbe per essere un'uguaglianza BIUNIVOCA dove cambiando poi il nome di persona2 si aggiorna anche persona 1
		//NOTARE DIFFERENZA CON PRECEDENTE RISULTATO
		
		System.out.println(persona1);
		System.out.println(persona2);
		
		//Per fare la copia effettiva bisogna creare un metodo nella classe di riferimento e un costruttore
		//per chiarezza utilizziamo due nuovi oggetti persona
		
		Persona persona3 = new Persona("Franco", "Franchi");
		Persona persona4 = new Persona("Carlo", "Carli");
		
		//avendo creato un METODO PER LA COPIA lo richiamiamo
		//notare le posizioni in memoria ora rispettano le originali
		
		System.out.println();
		System.out.println();

		persona4.copiaOggetto(persona3);
		
		//ora la nostra copia è un oggetto indipendente dall'oggetto da cui abbiamo copiato i valori

		System.out.println();
		System.out.println();
		System.out.println(persona3);
		System.out.println(persona4);
		System.out.println();
		System.out.println(persona3.getNome());
		System.out.println(persona3.getCognome());
		System.out.println();
		System.out.println(persona4.getNome());
		System.out.println(persona4.getCognome());
		
		//Proviamo ad usare l'overloaded constructor dedicato alla copia creando un nuovo oggetto che prende come attributi gli attributi dell'oggetto copiato
		//avendo creato un costruttore che ha come parametro un altro oggetto semplicemente passiamo quel parametro e java andrà a trovare il costruttore corretto da utilizzare
		
		Persona persona5 = new Persona(persona3);
 	}
}
