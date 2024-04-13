import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//GESTIRE I FILE
		//I FILE vengono considerati un tipo di OGGETTO, quindi come se FILE fosse una classe (probabilmente lo è)
		
		//il nome del file è una STRINGA
		//File va importato
		File file = new File("prova.txt");
		
		//possiamo controllare se il file esiste e usare la cosa in una condizione
		
		if(file.exists()) {
			System.out.println("Il file esiste");
		} else {
			System.out.println("Il file non esiste");
		}
		
		//Proviamo a creare un file txt sul desktop e copiamone il percorso
		//possiamo fare vari  test per ottenerte info: getPath(), getAbsolutePath(); isFile()
		
		File file1 = new File("C:\\Users\\Simone\\Desktop\\prova1.txt");
		
		if(file1.exists()) {
			System.out.println("Il file esiste");
			//ci restituisce il percorso relativo al progetto (in questo caso è relativo all'oggetto)
			System.out.println(file1.getPath());
			//ci restituisce il percorso assoluto
			System.out.println(file1.getAbsolutePath());
			//ci restituisce se è un file (potrebbe ad es essere una cartella e quindi false)
			System.out.println(file1.isFile());
			//si può addirittura CANCELLARE il file che verrà eliminato dalla directory del progetto o DALLA MACCHINA
			file1.delete(); //commento per esigenza
		} else {
			System.out.println("Il file non esiste");
		}
		
		//FILEWRITER
		
		//con FILEWRITER invece possiamo andare ad interagire con il CONTENUTO del file e scriverci
		//va IMportato
		//ha un sistema di sicurezza obbligatorio per cui va CIRCONDATO CON UN TRY/CATCH, usare suggerimenti per velocità
		//Possiede un tipo di catch dedicato IOException
		try {
			//se non trova il file va a crearlo lui nella directory del progetto (???????)
			FileWriter fileWriter = new FileWriter(file);
			//il comando per scrivere è .write sul'oggetto creato, ATTENZIONE, va a SOVRASCRIVERE IL CONTENUTO
			fileWriter.write("Ciao Questo testo è generato da Java..... \nPAzzurdo!");
			//se vogliamo aggiungere delle righe abbiamo bisogno di usare .APPEND("testo qui")
			fileWriter.append("Questa è una riga che abbiamo aggiunto dopo");
			//va chiuso così come scanner
			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//FILEREADER
		//con FILEREADER possiamo leggere un file, va importato, necessita di TRY/CATCH e possiede il suo metodo di catch FileNotFound
		try {
			FileReader fileReader = new FileReader(file);
			//per leggere il file dobbiamo sapere che ci restituisce il file non come una STRINGA ma come una serie di CARATTERI
			//Lui ci darà una risposta basata SULL'INDICE DEI CARATTERI. Così ci renderà il primo CHAR e noi possiamo inserirlo in un while per far in modo che il programma si fermi solo quando, non trovando altri caratteri interpreterà la cosa come -1
			//va quindi dichiarato come INT
			//anche .read() è considerato pericoloso quindi chiederà di aggiungere un'ulteriore clausola IOException al catch (usa suggerimenti)
			int data = fileReader.read();
			//Questo ci restituisce il valore del primo (prossimo) CHAR del file letto			
			System.out.println(data);
			//Inseriamolo in un while data != -1 per farlo ciclare
			//Non usare LN altrimenti li incolonna
			//NB: va aggiunto un nuovo oggetto.read() per farlo andare al carattere successivo nel ciclo!!!
			/*while(data != -1) {
				System.out.println(data);
				data = fileReader.read();
			} */
			//Così noi otteniamo la lista dei valori ASCII dei CHAR, dobbiamo se vogliamo leggerli, CONVERTIRLI IN CHAR
			while(data != -1) {
				System.out.print((char)data);
				data = fileReader.read();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
