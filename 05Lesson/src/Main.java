
public class Main {
	public static void main(String[] args) {
	
		//le FUNZIONI (o METODI)
		//i metodi sono RIUTILIZZABILI
		//Si inseriscono FUORI dalla MAIN dove abbiamo lavorato fin'ora
		
		//come in js le funzioni si richiamano con nomeFunzione(), proviamo a richiamare la nostra funzione qui in main
		
		faiPasta();
		preparaPranzo("Spaghetti");
		addizione(45, 13);
		
		int totaleSpeso = addizione(102, 3);
		
		System.out.println("Totale: " + addizione(12, 23));
		
		System.out.println("Somma int: " + somma(52, 31));
		System.out.println("Somma double: " + somma(16.345, 31));
	}
	
	//Si inserisce il tipo della funzione
	//void è legato al valore di ritorno, una funzione void non ha RETURN quindi non restituisce un valore
	
	static void faiPasta() {
		System.out.println("Sto facendo la pasta");
	}
	
	//Metodi con PARAMETRI
	//sempre necessario DICHIARARE IL TIPO del parametro
	static void preparaPranzo(String cibo) {
		System.out.println("Sto cucinando " + cibo);
	}
	
	//RETURN fa in modo da rendere disponibile all'esterno della funzione il valore che la funzione stessa restituisce(e/o il modo per ottenerlo)
	
	//anziche il tipo VOID usiamo il TIPO di VALORE restituito dal metodo 
	
	static int addizione(int a, int b) {
		int risultato = a + b;
		return risultato;
	}
	
	//OVERLOADED METHODS metodi con lo stesso nome utilizzabili in modo diverso
	
	//Partendo per esempio da un metodo chiamato SOMMA
	
	static int somma(int a, int b) {
		int risultato = a + b;
		return risultato;
	}
	
	//Possiamo creare un metodo CON LO STESSO NOME a patto che ne CAMBIAMO I PARAMETRI (una signature diversa)
	//per esempio aggiungendo un parametro il metodo viene accettato
	
	//Possiamo fare un METHOD OVERLOAD a patto che IL NUMERO o IL TIPO dei parametri sia diverso
	//Questo ci permette di creare per esempio due metodi SOMMA uno basato sugli int e uno sui double per permetterci di avere una flessibilità maggiore (cosa che per esempio in javastcript non serve perchè è debolmente tipizzato)
	
	static double somma(double a, double b) {
		double risultato = a + b;
		return risultato;
	}
	
}
