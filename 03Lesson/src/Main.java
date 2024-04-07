import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//WHILE e DO WHILE stesso concetto di js stessa sintassi
		
		/*int i = 0;
		
		while(i <0) {
			System.out.println("while " + i);
			i++;
		}
		
		do {
			System.out.println("do while " + i);
			i++;
		} while (i < 0);*/
		
		//CICLI FOR tutto uguale praticamente, FOREACH anzichè trattarli come un metodo (.forEach(param =>) si scrivono come un  for(singolaCosa : gruppoDiCose), brake e continue
		
		/*for(int i=0; i <= 5; i++) {
			System.out.println(i);
		}*/
		
		/*for(int i=0; i <= 3; i++) {
			System.out.println("I" + i);
			for(int j=0; j <= 2; j++) {
				System.out.println("J" + j);
			}
		}*/
		
		/* int[] numeri = {10, 20, 30, 40, 50};
		for(int numero: numeri){
			System.out.println(numero+1);
		} */
		
		/* for(int i=0; i <= 5; i++) {
			if(i == 4) {
				//break; //stoppa tutto
				continue; //salta questa iterazione
			}
			System.out.println(i);
		} */
		
		//ARRAY, in java si racchiudono tra graffe {cose qui}, gli array di Java hanno una dimensione FISSA che va definita prima, quelli di javascript vengono considerati ARRAYLIST
		//gli array essendo a lunghezza fissa non hanno i vari metodi per aggingere/togliere cose dall'array
		
		
		/*//Definire un array vuoto
		int[] numeri = new int[3]; //numeri array di interi di lunghezza 3
		
		//oppure clasico da js MA SONO SEMPRE DI LUNGHEZZA FISSA DOPO L'INIZIALIZZAZIONE
		int[] numeri2 = {12, 22, 32, 42};
		
		//va poi popolato con gli elementi (maxlenght)
		numeri[0]= 10;
		numeri[1]= 20;
		numeri[2]= 30;
		
		//System.out.print(numeri.length); //lunghezza dell'array
		
		for(int i = 0; i < numeri.length; i++) {
			System.out.println(numeri[i]);
		}*/
		//ARRAY 2D o ARRAY MULTIDIMENSIONALI (ARRAY DI ARRAY), come se fosse una matrice int[][] si dichiara così
		
		//prima rappresentazione
		String[][] classi = new String[3][3]; //si dichiara la dimensione di entrambi
		
		//seconda rappresentazione 
		String[][] classi2 = {
								{"Luca","Maria","Fausto"},
								{"Sara","Gigi","Stefano"},
								{"Carlo","Anna","Sandro"}
							};
		
		classi[0][0] = "Luca";
		classi[0][1] = "Maria";
		classi[0][2] = "Fausto";
		
		classi[1][0] = "Sara";
		classi[1][1] = "Gigi";
		classi[1][2] = "Stefano";
		
		classi[2][0] = "Carlo";
		classi[2][1] = "Anna";
		classi[2][2] = "Sandro";
		
		/*
		//come stampare la matrice con il FOR
		
		for(int classe= 0; classe< classi.length; classe++){
			System.out.println();
			for(int studente = 0; studente < classi[classe].length; studente++) {
			System.out.print(classi[classe][studente] + "  ");
			}
		} */
		
		//come stampare con il forEach
		//prendiamo l'array di stringe classe dentro classi, perchè è un array di nomi (come typescript)
		for(String[] classe: classi) {
			System.out.println();
			//stessa cosa per studente, è una stringa dentro classe
			for(String studente : classe) {
				System.out.print(studente + "  ");
			}
		}
		
		
				 
		
	}

}
