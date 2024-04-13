
public class Main {
	public static void main(String[] args) {
		
		//L'ASTRAZIONE
		//Possiamo definire le classi astratte come delle classi ristrette che non vengono usate per creare degli oggetti
		//Vengono solitamente usate SOLO per essere EREDITATE
		//Creano un CONCETTO
		
		//Non possiamo creare un new Veicolo oggetto perchè è astratta (provare per credere)
		
		Automobile auto = new Automobile();
		auto.muovi();
	}
}
