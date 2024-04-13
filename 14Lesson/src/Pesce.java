
//su pesce IMPLEMENTIAMO ENTRAMBE LE INTERFACCE separandole con una virgola , e ne chiamiamo obbligatoriamente i metodi

public class Pesce extends Gazzella implements Preda, Predatore{

	@Override
	public void caccia() {
		System.out.println("Il Pesce grosso caccia");
		
	}

	@Override
	public void scappa() {
		System.out.println("Il Pesce piccolo scappa");		
	}

}
