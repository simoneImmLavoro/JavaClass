package Pack1;
import Pack2.*;

public class A {
	
	//PROTECTED lo rende disponibile alla classe e al package corrente ma ANCHE alle CLASSI FIGLIE AL DI FUORI DEL PACCKETTO
	protected String nomeProtected = "Saaahra";
		
	//PRIVATE lo rende visibile SOLO ALLA CLASSE CORRENTE, non visibile NEANCHE ALLE SOTTOCLASSI
	private String nomePrivate = "Wanna";
}
