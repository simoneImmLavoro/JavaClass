//in testa alla class ci dice a che pacchetto appartiene
package Pack2;
//qui possiamo dire che relazione ha con altri pack come per esempio "IMPORTA TUTTO DA PACKAGE X
//usare una notazione dot come per gli oggetti (NomePack.CosaImportare, * si usa per ALL)
import Pack1.*;

public class C extends A{
	
	//Riusciamo a prendere il nome di B perchè defaul qui lo rende visibile
	B testB = new B();
	
	public void someMethod() {
        System.out.println(testB.nomeDefault);
    }
	
	//creiamo n main di C per testare PROTECTED
	public class Main {
		public static void main(String[] args) {
			C provaC = new C();
			
			System.out.println(provaC.nomeProtected);
		}
	}
		
}
