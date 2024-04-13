package Pack1;

public class Persona {
	
	private String nome;
	private String cognome;
	
	Persona(String nome, String cognome){
		this.nome = nome;
		this.cognome = cognome;
		
		/* Avendo dei setters la dichiarazione del COSTRUTTORE può essere anche fatta in questo modo:
		 * this.setNome(nome);
		 * this.setCognome(cognome);
		 */
		
	}
	
	//impostiamo un GET, un attributo PUBLIC che ci restituisca l'attributo che vogliamo ottenere
	//questo è l'unico modo per accedere a quell'attributo, un METODO PUBLIC che faccia il RETURN accessibile a tutti di una cosa PRIVATE a cui può accedere solo lui perchè interno alla classe
	public String getNome() {
		return nome;
	}
	
	public String getCognome() {
		return cognome;
	}
	
	//Impostiamo un SET
	//Creiamo un metodo void(in questo caso, perchè non restituisce nulla) in cui passiamo una stringa in entrata come parametro e un'assegnazione di quella stringa al valore dell'attributo della nostra classe (this.cose)
	public void setNome(String nome) {
		this.nome = nome;
	}
}
