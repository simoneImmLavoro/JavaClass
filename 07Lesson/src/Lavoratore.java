
public class Lavoratore {

	String nome;
	String cognome;
	int eta;
	String colorePreferito;
	

	public Lavoratore(String nome, String cognome, int eta, String colorePreferito) {
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
		this.colorePreferito = colorePreferito;
	}

	
	
	void saluta() {
		System.out.println("Ciao bellih!");
	}
	
	//queste funzionano senza problemi perchè vanno a riferirsi a variabili GLOBALI o dichiarate localmente all'interno dei metodi
	void cammina() {
		System.out.println("Sto Camminando a " + eta + "km/h");
	}
	
	void addizione(int a, int b) {
		int risultato = a + b;
		System.out.println("Il risultato è " + risultato);
	}
	
	//qui RISULTATO, variabile creata nel metodo addizione, risulta inaccessibile
	void risultatoNonDisp() {
		//commento perchè se no rompe
		//System.out.println(risultato);
	}
	
	//Così invece stiamo creando una variabile RISULTATO che viene passata come PARAMETRO ad un altro metodo che viene chiamato triggerandone l'effetto
	//Praticamente stiamo concatenando lo scope delle variabili per fare in modo che una funzione sia necessaria per completare l'altra attraverso il passaggio di risultato ---> parametro
	
	void sottrazione(int a, int b) {
		int risultato = a - b;
		this.variabileTest(risultato);
	}
	
	void variabileTest(int risultato) {
		System.out.println("Il risultato è " + risultato);
	}

}
