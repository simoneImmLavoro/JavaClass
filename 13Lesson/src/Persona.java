
public class Persona {
	
	private String nome;
	private String cognome;
	
	Persona(String nome, String cognome){
		this.nome = nome;
		this.cognome = cognome;
		
	}

	public String getNome() {
		return nome;
	}
	
	public String getCognome() {
		return cognome;
	}
	
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	//Giusto per ricordare il metodo toString()
	/*public String toString() {
		String descr= this.nome + " " + this.cognome;
		return descr;
	}*/
	
	//creiamo il nostro METODO PER COPIARE
	//passiamo come parametro un oggetto
	//usiamo i setters e i getters per impostare (SET) il valore degli attributi di riferimento uguale a quelli che recuperiamo (GET) dall'oggetto usato come PARAMETRO
	
	public void copiaOggetto(Persona persona) {
	    this.setNome(persona.getNome());
	    this.setCognome(persona.getCognome());
	}
	
	//In alternativa possiamo utilizzare un costruttore
	//Usando la propietà dell'OVERLOAD dei COSTRUTTORI possiamo creare un costruttore dedicato alla copia senza che vada in conflitto
	
	Persona(Persona persona){
		this.copiaOggetto(persona);
	}
	
}