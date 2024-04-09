
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Le KEYWORD FINAL e STATIC
		
		//FINAL indica una variabile CHE NON PUO' ESSERE MODIFICATA (const)
		
		//se riassegnamo un altro valore nessun problema
		int prova = 5;
		prova = 10;
		
		//IMPOSSIBILE riassegnare, diventa una costante
		final int test = 5;
		//test = 12;
		
		
		//STATIC vuol dire che quell'attributo è UNIVOCO per tutte le istanze di una classe
		//per fare una cosa del genere abbiamo bisogno di creare un attributo che venga condiviso da tutte le istannze della classe
		
		Persona persona1 = new Persona("Carlo", "Carli");
		Persona persona2 = new Persona("Franco", "Franchi");
		
		//avendo creato uno static e avendo implementato la stampa all'interno del metodo toString() c troveremo in stampa anche il numero totale di istanze della classe create
		System.out.println(persona1);
		System.out.println(persona2);
		
		//lo Static non riguarda dunque l'istanza ma LA CLASSE, l'istanza lo eredita in toto senza interagirci
		
		
	}
}
