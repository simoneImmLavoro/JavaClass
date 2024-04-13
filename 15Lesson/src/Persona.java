
public class Persona {
	
	private String nome;
	private String cognome;
	
	Persona(String nome, String cognome){
		this.nome = nome;
		this.cognome = cognome;
		
	}

	public void saluta() {
		System.out.println("Ciao!");
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
	

	public void copiaOggetto(Persona persona) {
	    this.setNome(persona.getNome());
	    this.setCognome(persona.getCognome());
	}
	
	Persona(Persona persona){
		this.copiaOggetto(persona);
	}
	
}