import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//metodi delle stringhe
		
		//String nome = "Francioschio";
		
		//EQUALS ci rende un boolean E' CASE SENSITIVE
		//boolean risultato = nome.equals("Gino");
		
		//EQUALSIGNORECASE ignora maiuscole e minuscole
		//boolean risultato = nome.equalsIgnoreCase("FRANCIOschio");
		
		//LENGTH ci restituisce la lunghezza
		//int risultato = nome.length();
		
		//CHARAT ci rende il char ad un dato index
		//char risultato = nome.charAt(6);
		
		//INDEXOF ci restituisce l'index di un dato SUBSTRING (della prima occorrenza)
		//int risultato = nome.indexOf("cio");
		
		//ISEMPTY ci dice se è vuota ( == "");
		//boolean risultato = nome.isEmpty();
		
		//TOUPPERCASE e TOLOWER case solito metodo anche di js
		//String risultato = nome.toLowerCase();
		//String risultato = nome.toUpperCase();
		
		//TRIM elimina gli spazi bianchi
		//String risultato = nome.trim();
		
		//REPLACE sostituisce una substring con un'altra
		//String risultato = nome.replace("ci", "ri");	
		
		//System.out.println(risultato);
		
		
		//le WRAPPER CLASS ci permettono di usare dati primitivi come reference (vedi String) e quindi avere accesso a metodi, lo svantaggio è che le wrapper classes sono molto più lente come "economia energetica"
		
		/*
		//boolean come reference diventa Boolean
		Boolean vero = true;
		
		
		//Char come reference diventa Character
		Character carattere = 'a';
		
		//int come reference diventa Integer
		Integer numero = 76;
		
		//double come reference diventa Double
		Double virgola = 32.456;
		
		//String è già una reference
		String stringa = "Questo è già così";
		
		//Ora tutti loro hanno dei metodi propri, cercare testare vedere grazie!
		//ma restano lo STESSO tipo di dato
		
		boolean a = true;
		char b = 'a';
		int c = 5;
		double d = 5.23;
		
		if(vero == a) {
			System.out.println("oh yessa!!");
		}
		*/
		
		
		
		
		//ARRAYLIST, sono array ridimensionabili che quindi NON HANNO UNA DIMENSIONE FISSA (js), ACCETTANO SOLO REFERENCE TYPES
		//ArrayList è il tipo di dato a cui passiamo nell'operatore diamond <> il tipo di di REFERENCE contenuto
		
		
		//IMPORTANTE, è come se fosse un modulo (come scanner), va IMPORTATO o cliccandoci o scrivendo in alto import java.util.ArrayList;
		
		//come ts ci da warning su dichiarazioni non per estero quindi meglio ri specificare il tipo
		//praticamente qui ci da un warning sul new ArrayList(), funziona lo stesso
		//ArrayList<String> persone = new ArrayList();
		
		/*
		ArrayList<String> persone = new ArrayList<String>(); //così meglio
		
		//essendo le ARRAYLIST a lunghezza variabile hanno metodi per interagire con l'array stesso e mettere togliere cose
		
		//ADD, prende il posto di push()
		persone.add("Francioschio");
		persone.add("Giongiorgio");
		persone.add("Annanna");
		
		//Remove
		
		System.out.println(persone); //stampa dell'intero array
		
		//GET...Per recuperare uno specifico index si usa il metodo GET
		System.out.println(persone.get(1)); //arrayList.get(index)
		
		//SIZE... Le arrayList non hanno una length ma va utilizzato il metodo SIZE
		System.out.println(persone.size());
		
		for(int i= 0; i < persone.size(); i++) { // array.size() ci restituisce la lunghezza dell'arrayList
			System.out.println(persone.get(i));
		}
		
		//SET...per modificare un elemento di un'array list si utilizza il metodo SEt, passando come parametro l'indice e in cosa vogliamo cambiarlo
		persone.set(1, "Andreandra"); // array.set(index, nuovoValore);
		System.out.println(persone);
		
		//REMOVE...per eliminare un elemento in un arrayList si usa .remove passando l'indice nell'elemento da eliminare
		persone.remove(1); // array.remove(index);
		System.out.println(persone);
		
		//CLER...si usa per azzerate TUTTA l'ARRAYLIST
		persone.clear(); // array.clear();
		System.out.println(persone);
		*/
		
		//le ARRAYLIST 2D , arraylist di arraylist

		ArrayList<ArrayList<String>> classi = new ArrayList<ArrayList<String>>();
		
		ArrayList<String> classe1 = new ArrayList<String>();
		classe1.add("Lucia");
		classe1.add("Marco");
		classe1.add("Cecilia");
		
		ArrayList<String> classe2 = new ArrayList<String>();
		classe2.add("Sara");
		classe2.add("Luca");
		classe2.add("Gigi");
		
		ArrayList<String> classe3 = new ArrayList<String>();
		classe3.add("Marco");
		classe3.add("Andrea");
		classe3.add("Luisa");
		
		classi.add(classe1);
		classi.add(classe2);
		classi.add(classe3);
		
		for(int i = 0; i < classi.size(); i++) {
			System.out.println();
			for(int j = 0; j < classi.get(i).size(); j++) {
			System.out.print(classi.get(i).get(j) + "  ");
			}
		}
		
		
	}

}
