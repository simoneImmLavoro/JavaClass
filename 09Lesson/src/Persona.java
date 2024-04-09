
public class Persona {
	String nome;
	String cognome;
	//creiamo un attributo statico, per esempio un counter che identifichi il numero di istanze
	static int numero;
	
	Persona(String nome, String cognome){
		this.nome = nome;
		this.cognome = cognome;
		//richiamiamo l'attributo static, essendo statico non deve essere collegato all'istanza ma verrà generato automaticamente, in questo caso lo incrementiamo ad ogni creazione di istanza
		numero++;
		//system log giusto per tenere traccia dell'incremento del numero di persone
		System.out.println(numero);
	}
	
	public String toString() {
		String descrizione = this.nome + " " + this.cognome + " " + numero;
		
		return descrizione;
	}
}
