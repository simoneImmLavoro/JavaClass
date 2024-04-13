
public class Main {

	public static void main(String[] args) {
		//Le INTERFACE
		
		//concettualmente simili alle CLASSI ASTRATTE
		//la differenza è che una CLASSE PUO' ESTENDERE SOLO UNA CLASSE ma può invece estendere PIU' INTERFACCE diverse
		//questo apre molte potenzialità in termini di EREDITARIETA' perchè ci permette di implementare metodi e attributi più generici da molte interfacce che possono servirci per creare la nostra nuova classe (che a sua volta può essere una classe che eredita altro da un'altra classe)
		
		//Creeremo 3 classi per spiegare il concetto Leone Pesce Gazzella
		//creiamo 2 INTERFACE (new -> interface) Preda Predatore
		//Vogliamo praticamente descrivere: Il Leone è un predatore, la Gazzella è una preda, il PEsce può essere sia preda che predatore
		
		Leone leone = new Leone();
		Gazzella gazzella = new Gazzella();
		
		//quindi i nostri oggetti avranno come metodo disponibile quello implementato dall'interfaccia di riferimento
		leone.caccia();
		gazzella.scappa();
		
		//Creando un oggetto pesce possiamo richiamare entrambi i metodi delle interfacce PReda e Predatore
		
		Pesce pesce = new Pesce();
		
		pesce.caccia();
		pesce.scappa();
		
	}

}
