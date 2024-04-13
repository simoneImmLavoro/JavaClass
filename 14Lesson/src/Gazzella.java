
//la PAROLA CHIAVE delle INTERFACE è IMPLEMENTS (invece di extends per le classi/class astratte)
//Sarà dunque OBBLIGATORIO l'utilizzo del metodo posseduto dall'interfaccia che stiamo IMPLEMENTANDO

public class Gazzella implements Preda{
	
	String nome = "Peropero";
	//al solito consigliato l'utilizzo di @Override
	@Override
	public void scappa() {
		System.out.println("La Gazzella scappa");
	}
}
