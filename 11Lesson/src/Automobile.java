//Automobile EXTENDS la classe astratta Veicolo
public class Automobile extends Veicolo{
	//Automobile DEVE quindi implementare i metodi astratti di veicolo
	//OVVIAMENTE SONO DEGLI OVERRIDE


	@Override
	void muovi() {
		System.out.println("Mi muovo");
	}

	@Override
	void frena() {
		System.out.println("Freno");
	}
}
