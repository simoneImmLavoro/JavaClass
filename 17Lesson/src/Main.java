import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) {
		//IL CASTING DEI DATI
		//è il processo di prendere un tipo di dati a passarlo ad un altro tipo
		
		//CASTING IMPLICITO, succede automaticamente quando passiamo da un tipo di dato a un tipo di dato PIU' AMPIO (vedi tipi di dati)
		//banalmente impostando un double a valore intero la stampa del dato sarà con la virgola è una sorta id auto interpretazione di java
		double x = 9;
		
		System.out.println(x);
		
		//CASTING ESPLICITO, dobbiamo farlo NOI, è il passare da una categoria più ampia a una ristretta
		//come in js possiamo forzare il dato ad essere quello che vogliamo noi, ci saranno ovviamente delle forzature nei valori finali
		//si setta con le parentesi prima del valore da castare (tipodidato)variabile
		
		int y = (int) 9.5f;
		
		System.out.println(y);

		
		//DATE e ORA in JAVA
		//i vari metodi per usare e formattare le date e ora
		//vanno importati (segui suggerimenti automatici)
		//LocalTime e Localdate
		
		//.now() ci restituisce la data attuale
		LocalDate data = LocalDate.now();
		LocalTime time = LocalTime.now();
		System.out.println(data + " " + time);
		
		//PerFORMATTARLE c'è BISOGNO DI IMPORTARE DATETIMEFORMATTER
		//si crea un  oggetto DateTimeFormatter a cui si passa il pattern di riferimento, per i vari pattern/definizioni guardare docu
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("dd-MMM-yyyy"); //mese abbr
		DateTimeFormatter formatter4 = DateTimeFormatter.ofPattern("dd-MMMM-yyyy"); //mese completo
		DateTimeFormatter formatter5 = DateTimeFormatter.ofPattern("EEE, dd-MM-yyyy"); //nome del giorno comleto
		DateTimeFormatter formatterTime = DateTimeFormatter.ofPattern("HH:mm:ss");
		// ecc ecc ecc
		
		//si applica passando alla nostra variabile data (in questo caso) il metodo .format con il parametro dato dal formatter creato
		System.out.println(data.format(formatter));
		System.out.println(time.format(formatterTime));

		
		
		//HASHMAP
		//le hasmap a differenza delle arrayList ci permettono di salvare gli elementi con un rapporto KEY-VALUE
		//quindi assomigliano agli oggetti di JS
		//Sono COPPIE DI VALORI CORRELATI
		//si dichiara come un OGGETTOdi tipo HASHMAP  aggiungendogli un operatore diamond a cui passiamo il tipo di entrambi i parametri necessari(chiave e valore), va importato da util
		HashMap<String, String> capitali = new HashMap<String, String>();
		
		//come si aggiungono VALORI
		//il metodo per inserire valori è .put(qui vanno, i due parametri)
		
		capitali.put("Italia", "Roma");
		capitali.put("Inghilterra", "Londra");
		capitali.put("Russia", "Mosca");
		capitali.put("Germania", "Berlino");
		
		//se stampiamo tutta l'HashMap otteniamo una sorta di array contenente tutti gli accoppiamenti
		System.out.println(capitali);
		
		//per accedere ai valori similarmente alle ArrayList si usa il .get(con il valore della chiave)
		System.out.println(capitali.get("Germania"));
		
		//per rimuovere si usa una coppia di valori .remove(key), per svuotare si usa .clear()
	}
}
