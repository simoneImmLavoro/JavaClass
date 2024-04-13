import java.util.InputMismatchException;
import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

public class Main {

	public static void main(String[] args) {
		//IL POLIMORFISMO
		//E' LA CAPACITA' DI UN OGGETTO DI IDENTIFICARSI (collegarsi a) CON PIU' TIPI DI DATO (molte forme)
		
		//partiamo da Studente e Insegnante che estendono persona
		
		Studente studente1 = new Studente("Luca", "Rossi");
		Studente studente2= new Studente("Franco", "Gialli");
		Insegnante insegnante1 = new Insegnante("Marco", "Fucsia");
		
		//Se proviamo a fare un Array contenente sia studenti che insegnanti non funzionenrà dichiararlo di uno dei due tipi perchè l'altro non verrà riconosciuto come dello stesso tipo dichiarato nell'array.
		//qui ci viene in aiuto il polimorfismo, sia studente che insegnante sono in grado di essere contemporaneamente di tipo Studente/Insegnante ma anche di tipo Persona, che è la classe genitore che estendono
		
		Persona[] classe = {studente1, studente2, insegnante1};
		
		//ponendo il caso che gli oggetti abbiano dei metodi in comune (con lo stesso nome) questi verranno identificati correttamente come provenienti dal tipo di oggetto giusto 
		//anche nel ciclo dichiareremo il tipo della classe che li accomuna
		//lavorando con il POLIMORFISMO è NECESSARIO che la classe in comune abbia il METODO CHE VOGLIAMO UTILIZZARE, che poi noi OVERRIDIAMO nella CLASSE FIGLIA, altrimenti non riconoscerebbe la chiamata del metodo
		
		for(Persona persona : classe) {
			persona.saluta();
		}
		
		
		//EXCEPTION HANDLING (TRY CATCH E FINALLY)
		//un'EXEPTION è una situazione specifica che noi vogliamo INTERCETTARE e in quel caso fermare il programma o ottenere qualcosa di diverso
		// per fare questo usiamo IL BLOCCO TRY
		
		Scanner scanner = new Scanner(System.in);
		
		//praticamente diciamo: "tu PROVA a fare questo"
		try {
					
			System.out.println("Inserisci un numero");
			int x = scanner.nextInt();
			
			
			System.out.println("Inserisci un altro numero");
			int y = scanner.nextInt();
			
			int result = x/ y;
			
			System.out.println("Il risultato è: " + y);
			
			//il blocco try necessita del CATCH che è il posto in cui diciamo cosa intercettare, in questo caso faremo esempio con un ARITHMETICEXEPTION per cercare un n/0 errore, gli si passa un parametro (è come se Aritmethic exeption fosse un TIPO)
			//la più grande forza di TRY/CATCH è il fatto che gestendo l'errore il programma non arriverà mai a bloccarsi
		} catch(ArithmeticException e) {
			//questo verrà stampato se la condizione del catch si verifica, è una sorta di else calibrato sull'eccezione che usiamo per gestire eroori standard
			System.out.println("Non puoi dividere per ZERO");
		} catch (InputMismatchException e) {
		//possiamo avere più catch consecutivi,altro esempioInputMismatchExeption per cercre un errore in caso di inserimento sbagliato di tipo dati. NB: Va importato ---> import java.util.InputMismatchException;
			System.out.println("Tipo di input sbagliato");
		}catch (Exception e) {
			//possiamo gestire anche eccezioni generiche
			System.out.println("C'è Stato un problema");
		} finally {
			//FINALLY è un blocco OPZIONALE che viene sempre eseguito alla fine del TRY, può contenere normale codice, good use è magari chiudere lo scanner utilizzato o dei file usati nel programma
			System.out.println("Grazie per aver usato il nostro programma");
			//chiudere lo scanner
			scanner.close();
			}
		
		
	}
}
