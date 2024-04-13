package Pack1;

import javax.naming.event.NamespaceChangeListener;

import Pack2.B;

public class Main {
	public static void main(String[] args) {
		//Creare PACKAGES è come se creasse sotto ambienti del nostro programma
		//Questo serve a creare livelli di sicurezza (di vario tipo) usando i modificatori di accesso
		//I file nei due pack non possono comunicare direttamente se non creiamo noi delle specifiche (imports/)
		
		//I MODIFICATORI DI ACCESSO
		//PUBLIC PROTECTED DEFAULT PRIVATE, segue tabella descrittiva di cosa è reso visibile oppure no
		//				class		package		subclass		world
		//public		 si			   si			si			  si
		//protected		 si			   si			si			  no
		//default		 si			   si			no			  no	
		//private		 si			   no			no			  no
		
		//Classe è la classe ovvero "Un attributo è visibile o no in altri punti della stessa classe?"
		//Package "l'attributo o il metodo possono essere usati nello stesso pacchetto?"
		//subClass è riferito alle classi figlie "può essere usato da una classe che estende un altra?"
		//World "è possibile usarlo ovunque?"
		
		//per esempio, in pack2 esiste una classe b che contiene un attributo "nome" che in main(pack1) non è visibile perchè è stato definito senza un modificatore di accesso che quindi lo rende DEFAULT
		B prova = new B();
		
		//System.out.println(prova.nomeDefault);
		
		//Questo viene prenso senza problemi perchè public quindi visibile ovunque
		System.out.println(prova.nomePublic);
		
		//L'INCAPSULAMENTO (encapsulation)  è una metodologia della programmazione ad oggetti che, partendo da classi con attributi private, ci permette di creare un ambiente di sviluppo protetto in cui le classi sono "a tenuta stagna" finchè non si utilizzano metodi precisi per interagire con il loro contenuto.
		
		//GETTERS AND SETTERS
		
		//GETTER
		
		//Provando a recuperare gli attributi di persona ci ritroviamo bloccati dal fatto che questi sono definiti come PRIVATE
		//Per potervi accedere dobbiamo utilizzare dei METODI fatti apposta (GETTER & SETTERS) che vanno settati sulla classe PROPIETARIA degli attributi/metodi per renderli intercettabili
		
		Persona persona = new Persona("Luca", "Rossi");
		
		//Avendo creato un METODO GETTER ora richiamiamo il metodo per ottenere il risultato
		System.out.println(persona.getNome() + " " + persona.getCognome());
		
		//SETTERS
		//Sempre perchè limitati dal MODIFICATORE DI SICUREZZA non possiamo andare a sovrascrivere i valori degli attributi della classe su cui stiamo lavorando.
		
		//Per intenderci : persona.nome = "Orazio" è impossibile da eseguire perchè "Luca" è un valore private su cui noi non abbiamo controllo per il momento, andiamo quindi a impostare un metodo nella classe che agisca su quel valore
		
		//Richiamiamo il metodo setter
		persona.setNome("Orazio");
		//stampiamo il nome appena modificato con il metodo get e avremo il nostro nome aggiornato
		System.out.println(persona.getNome());
		
		
	}
}
