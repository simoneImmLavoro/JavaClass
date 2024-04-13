
public class Insegnante extends Persona{
	Insegnante(String nome, String cognome){
		super(nome, cognome);
	}
	
	void insegna() {
		System.out.println("Sto insegnando ...");
	}
	
	@Override
	void saluta() {
		System.out.println("Buongiorno ragazzi!");
	}

}
