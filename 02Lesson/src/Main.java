
//importare scanner
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner scanner = new Scanner(System.in);
		
		System.out.println("Come ti Chiami?");
		String nomeString = scanner.nextLine();
		System.out.println("Ciao " + nomeString + "!");
		System.out.println();
		
		System.out.println("Quanti anni hai?");
		int eta = scanner.nextInt();
		scanner.nextLine(); //inserire dopo int per creare una nuova riga, int non manda accapo
		System.out.println();
		
		System.out.println("In che città vivi?");
		String cittaString = scanner.nextLine();
		System.out.println();
		
		System.out.println("Quindi sei " + nomeString + ", vivi a " + cittaString + " e hai " + eta + " anni"); */
		
		//operatori aritmetici come in js + - * / %, incremento ++ e decremento --, += e -=
		// classe Math() uguale abs, min, max, pow, sqrt e attributo PI (pigreco)
		
		/*System.out.println(Math.max(4, 56)); //solo tra 2, idem min
		System.out.println(Math.pow(5, 3)); //numero, esponente come parametri*/
		
		// > >= < <= == != uguali a js il risultato va DICHIARATO boolean nel caso
		
		/* int x = 10;
		int y = 15;
		boolean risultato;
		
		risultato = 3 < 10;
		
		System.out.println(risultato); */
		
		//operatori logici AND && OR || NOT ! tutto uguale
		
		/* boolean x = 3 < 10 && 3 % 2 == 0;
		
		System.out.println(!x); */
		
		// OPERATORI CONDIZIONALI IF ELSE ELSE IF IF ANNIDATI, Ternary operator fondamentalmente tutto uguale

		/*String nomeString = "Frank"; 
		boolean isOnline = true;
		
		if(isOnline) {
			System.out.println("Sei online");
		} else {
			System.out.println("Non sei online");
		}
		
		if(nomeString == "Gigio") {
			System.out.println("Ciao Gigio");
		}else if(nomeString == "Lucia"){
			System.out.println("Lucia, bentornata!");
		} else {
			System.out.println("E tu chi azz sei???");
		}
		
		String xString = 3 < 10 ? "E' minore" : "E' maggiore";
		System.out.println(xString); */
		
		
		// GLI SWITCH, imparali che sono comodi
		
		/*String nome = "Luca";
		
		switch (nome) {
		case "Luca":
			System.out.println("Ciao Luca");
			break;
		case "Lucia":
			System.out.println("Ciao Lucia");
			break;
		case "Anna":
			System.out.println("Ciao Anna");
			break;
		default: System.out.println("Ma CHI sei?");
		}*/

	}

}
