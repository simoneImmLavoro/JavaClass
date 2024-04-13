
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//EREDITARIETA' la capacità delle classi figlie di EREDITARE PROPIETA' e METODI della classe GENITORE
		
		//segue EXTENDS sulle singole classi
		
		
		Persona persona1 = new Persona("Luca", "Rossi");
		
		persona1.saluta();
		
		int[] votiArr = {8, 7, 9};
		
		Studente studente1 = new Studente("Luca", "Rossi", "Lettere", "3G", votiArr);
		
		//Come vediamo pur non avendo il metodo SALUTA lo Studente che estende Persona è in grado di avere accesso al suo metodo
		studente1.saluta();
		//così come è in grado di usare i propri metodi specifici
		studente1.studia();
		
	}

}
