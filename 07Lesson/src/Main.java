
public class Main {
	public static void main(String[] args) {
		//lo SCOPE di una variabile è "il raggio di azione" in cui una variabile è disponibile nel codice
		//se lo scope di una variabile è LOCALE non sarà accessibile all'esterno, se è GLOBALE vuol dire che viene definita FUORI DAI METODI il che le rende accessibili da OVUNQUE ALL'INTERNO DI UNA CLASSE
		
		//Prendendo l'esempio di una classe LAVORATORE contenente dei metodi, facciamo notare come il metodo possa accedere liberamente alla variabile globale (eta, qui usata come numero) contenuta nel suo costruttore
		
		Lavoratore lavoratore1 = new Lavoratore("Giorgio", "Giorgi", 27, "Arancione");
		
		lavoratore1.cammina();
		
		lavoratore1.addizione(5, 7);
	
		
		//Così come possiamo creare degli OVERLOADED METHODS possiamo creare anche degli OVERLOADED COSTRUCTOR, essendo i costruttori essi stessi dei metodi
		//segue esempio pizza
		
		//Così creiamo un pizza usando il COSTRUTTORE della Pizza completa
		Pizza pizza1 = new Pizza("Integrale", "Pomodoro", "Mozzarella", "Ananas");
		
		
		//Per la margherita faremo
		Pizza pizza2 = new Pizza("Integrale", "Pomodoro", "Mozzarella");
		
		//Fondamentalmente per creare i due oggetti pizza verrà richiamato l'OVERLOADED CONSTRUCTOR contentente metodi costruttore diversi ma con lo stesso nome, che si distinguono per il numero e la tipologia degli attributi che andranno a costituire l'ISTANZA della CLASSE PIZZA 
		
	}
	
}
