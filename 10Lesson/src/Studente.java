//Per fare in modo che la classe EREDITI da un'altra classe la parola chiave che usiamo è EXTENDS
//Andremo quindi a dire che la classe extends un'altra classe
public class Studente extends Persona{
	//praticamente noi diciamo che lo studente è una persona ma ne estendiamo le propietà specifiche aggiungendone di nuove 
	//per Esempio aggiungiamo dei suoi attributi specifici
	
	String materiaPreferita;
	String classe;
	int[] votiStoria;
	
	//Si aggiunge ovviamente un COSTRUTTORE
	
	Studente(String nome, String cognome, String materiaPreferita, String classe, int[] votiStoria) {
		//La parola chiave SUPERè riferita AL SOPRA GERARCHICO verso il GENITORE quindi si fa riferimento alla classe da cui deriva questa classe e si passa super(con qui i parametri della classe genitore) in modo che vengano ereditati gli attributi della classe superiore
		
		super(nome, cognome);
		
		this.materiaPreferita = materiaPreferita;
		this.classe = classe;
		this.votiStoria = votiStoria;
	}
	
	//altrettanto si possono avere metodi personalizzati
	
	void studia() {
		System.out.println("Sto studiando ...");
	}
	
	
	//OVERRIDED METHODS, come per i metodi dei costruttori e il println i metodi possono essere sovrascritti dando priorita nell'esecuzione a quello specifico della classe in uso
	//non indispensabile ma buona norma è mettere @Override sopra al metodo sovrascritto per chiarezza
	
	@Override
	void saluta() {
		System.out.println("Buongiorno prof!");
	}

}
