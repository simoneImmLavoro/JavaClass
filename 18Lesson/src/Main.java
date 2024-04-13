import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// GLI ITERATORI
		//Gli iteratori sono degli oggetti che ci permettono di iterare su una collezione di dati
		
		ArrayList<String> personeArrayList = new ArrayList<String>();
		personeArrayList.add("Luca");
		personeArrayList.add("Marco");
		personeArrayList.add("Anna");
		personeArrayList.add("Silvia");

		//l'iteratore è un entità che passa su ogni elemento e ne prende anche il tipo di dato, quindi va inizializzato con lo stesso tipo di dato con cui andrà a lavorare
		//va dichiarato che quella variabile di tipo Iterator<REFERENCE obbligatoriamente> è uguale a nostrogruppo di dati .iterator() che è il metodo che crea quell'iteratore sulla collezione di dati di riferimento
		
		Iterator<String> iterator = personeArrayList.iterator(); //è come se creasse un clone virtuale della collection e ci iterasse sopra storando il risultato a cui è arrivato
		
		//.next() è il metodo degli iteratori che passa al prossimo elemento rispetto al valore contenuto dall'iteratore partendo da nulla
		//l'iteratore conterrà in se stesso IL VALORE A CUI é ARRIVATO
		System.out.println(iterator.next()); //primo valore
		System.out.println(iterator.next()); //secondo valore
		
		//può ovviamente essere inserito in un loop, tipo un while
		//.hasNext() controlla che ci sia un valore successivo
		while(iterator.hasNext()) {
			System.out.println(iterator.next()); //NB: l'iteratore parte sempre da dove è gia arrivato. non ricomincia da 0, qui stamperà riferito anche a quei 2 print sopra
		}
		
		//L'iterator viene usato principalmente perchè JAVA SCONSIGLIA DI ELIMINARE DATI DA LISTE CON UN FOR E UN FO EACH perchè poco sicuri
		ArrayList<String> personeArrayList2 = new ArrayList<String>();
		personeArrayList.add("Luca");
		personeArrayList.add("Marco");
		personeArrayList.add("Anna");
		personeArrayList.add("Silvia");
		
		Iterator<String> iterator2 = personeArrayList.iterator();
		
		//proviamo a rimuovere con un iterator con il metodo .remove()
		while(iterator2.hasNext()) {
			String persona = iterator2.next(); //storiamo il valore in una variabile per usarla in una condizione
			if(persona == "Marco") {
				iterator2.remove();
			}
			System.out.println(iterator2.next()); //NB: l'iteratore parte sempre da dove è gia arrivato. non ricomincia da 0, qui stamperà riferito anche a quei 2 print sopra
		}
	}

}
