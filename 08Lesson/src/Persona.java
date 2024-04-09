
public class Persona {
	
	String nome;
	String cognome;
	int eta;
	String colorePreferito;
	
	Persona(String nome, String cognome, int eta, String colorePreferito){
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
		this.colorePreferito = colorePreferito;
	}
	
	//Dichiariamo come parametro la Persona che cogliamo salutare
	//Così facendo possiamo accedere agli attributi dell'oggetto passato come parametro
	void saluta(Persona personaDaSalutare) {
		System.out.println("ciao sono " + personaDaSalutare.nome + ", io sono " + this.nome);
	}
	
	void cammina() {
		System.out.println("Sto camminando");
	}
	
	//override del metodo toString()
	
	public String toString() {
		String descrizione = this.nome + " " + this.cognome + " " + this.eta + " " + this.colorePreferito;
		
		return descrizione;
	}
	
}