
public class Studente {
	//qui si procede come in js listando gli attributi della classe che vogliamo creare col nostro costruttore
	
	String nome;
	String cognome;
	int eta;
	String colorePreferito;
	
	//una volta creati gli attributi procediamo a creare un METODO che è per l'appunto il METODO COSTRUTTORE
	//come in js diamo come parametri gli attributi che andremo poi ad valorizzare (e popolare)
	//li inizializziamo con il this.attributo = attributo per fare in modo da creare un collegamento che ci permetta di associare a quel parametro un attributo della classe
	public Studente(String nome, String cognome, int eta, String colorePreferito) {
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
		this.colorePreferito = colorePreferito;
	}
}
