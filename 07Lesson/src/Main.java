public class Main {
    public static void main(String[] args) {
        // Gli ARRAY di OGGETTI

        // breve ripasso sulla dichiarazione degli array
        int[] numeri = new int[3];
        int[] prova = {1, 2, 3};

        // dichiarazione di un array di oggetti
        // dichiariamo la classe come tipo e array e poi il nome dell'array (consigliato plurale)

        // dichiariamo dunque che è uguale a un array di lunghezza n di NUOVI OGGETTI
        Persona[] persone = new Persona[3];

        // dichiariamo gli oggetti che saranno contenuti dall'array
        Persona persona1 = new Persona("Sara", "Sbembi", 32, "Giallo");
        Persona persona2 = new Persona("Marco", "Gnegni", 27, "Rosso");
        Persona persona3 = new Persona("Carlo", "Frenfi", 30, "Blu");

        // popoliamo l'array coi nostri oggetti
        persone[0] = persona1;
        persone[1] = persona2;
        persone[2] = persona3;
        
        //in alternativa volendolo creare già popolato
        Persona[] persone2 = {persona1, persona2, persona3};
        
        for(Persona persona: persone) {
        	//STAMPATO CON L'OVERRIDE DEL toString()
        	System.out.println(persona);
        }
        
        //UTILIZZARE OGGETTI COME PARAMETRI, usare un oggetto come parametri di un metodo
        //nella classe creiamo un metodo che partendo dalla persona in oggetto ne saluti un'altra (passata come parametro)
        
        //chiamiamo il metodo
        persona1.saluta(persona3);
        persona3.saluta(persona2);
    }
}
