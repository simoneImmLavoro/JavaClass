
public class Pizza {

	String impasto;
	String salsa;
	String formaggio;
	String extra;
	String extra2;
	
	//facciamo una bella pizza completa
	Pizza(String impasto, String salsa,	String formaggio, String extra){
		this.impasto = impasto;
		this.salsa = salsa;
		this.formaggio = formaggio;
		this.extra = extra;
	}
	
	
	//il precedente è un metodo COSTRUTTORE ma possiamo creare METODI COSTRUTTORI con SIGNATURE differenti in modo da avere accesso a COSTRUTTORI similari derivanti dalla stessa classe ma che si applicano a situazioni differenti
	
	//vogliamo una focaccia liscia? Solo impasto
	Pizza(String impasto){
		this.impasto = impasto;
	}
	
	//Vuoi una marinara? il costruttore conterrà solo impasto e salsa
	Pizza(String impasto, String salsa){
		this.impasto = impasto;
		this.salsa = salsa;
	}
	
	//per una Margherita ci serve anche la mozzarella
	Pizza(String impasto, String salsa, String formaggio){
		this.impasto = impasto;
		this.salsa = salsa;
		this.formaggio = formaggio;
	}
	
	
	//Vogliamo una pizza con DOPPIO EXTRA?? PAZZZI????
	Pizza(String impasto, String salsa,	String formaggio, String extra, String extra2){
		this.impasto = impasto;
		this.salsa = salsa;
		this.formaggio = formaggio;
		this.extra = extra;
		this.extra2 = extra2;
	}
	
	
}
