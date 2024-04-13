//per rendere una classe ASTRATTA si aggiunge la keyword ABSTRACT nella dichiarazione della classe
//un Veicolo è solo un'idea che si porta con se delle caratteristiche molto generiche che andranno a prendere senso nello specifico veicolo (macchina, moto, triciclo)
public abstract class Veicolo {
	
	//anche un metodo può essere ASTRATTO
	//I METODI ASTRATTI NON HANNO UN BODY --> {}, possiamo inizializzare il metodo ma senza poter effettivamente dire cosa fa
	//QUesto RENDE NECESSARIO per la classe che estende la classe astratta IMPLEMENTARE IL METODO ASTRATTO E DARGLI UN BODY
	
	
	//anche qui si usa ABSTRACT
	abstract void muovi();
	abstract void frena();
}
