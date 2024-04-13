//Questa sarà la nostra CLASSE GENITORE
public class Persona {
	String nome;
	String cognome;
	
	Persona(String nome, String cognome){
		this.nome = nome;
		this.cognome = cognome;
	}
	
	void saluta() {
		System.out.println("ciao sono " + nome);
	}
}
