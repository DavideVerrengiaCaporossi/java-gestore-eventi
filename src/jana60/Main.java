package jana60;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*1. Creare una classe Main di test, in cui si chiede all’utente di inserire un nuovo evento
		con tutti i parametri.
		2. Dopo che l’evento è stato istanziato, chiedere all’utente se e quante prenotazioni
		vuole fare e provare ad effettuarle, implementando opportuni controlli e gestendo
		eventuali eccezioni.
		3. Stampare a video il numero di posti prenotati e quelli disponibili
		4. Chiedere all’utente se e quanti posti vuole disdire
		5. Provare ad effettuare le disdette, implementando opportuni controlli e gestendo
		eventuali eccezioni
		6. Stampare a video il numero di posti prenotati e quelli disponibili*/
		
		Scanner scan = new Scanner(System.in) ;
		
		System.out.println("Benvenuto, inserisci il nome del evento");
		
		String titoloEvento = scan.nextLine();
		System.out.println("inserisci data evento giorno/mese/anno");
		
		System.out.println("giorno: ");
		int giorno = Integer.parseInt(scan.nextLine());
		
		System.out.println("mese: ");
		int mese = Integer.parseInt(scan.nextLine());
		
		System.out.println("anno :");
		int anno =Integer.parseInt(scan.nextLine());
		
		System.out.println(" inserisci Posti totali");
		int capienzaEvento = Integer.parseInt(scan.nextLine());
		
		System.out.println("inserisci posti da prenotare");
		int postiPrenotati = Integer.parseInt(scan.nextLine());
		
		//creo l'ogetto che contine data
		LocalDate dataEvento = LocalDate.of(anno,mese,giorno);
		
		
		try {
			Evento ev1 = new Evento(titoloEvento,dataEvento,capienzaEvento,postiPrenotati);

			System.out.println("vuoi fare altre penotazioni ? rispondi solo si/no");
			
		String prenotazioniEvento = scan.nextLine();
		
		if(prenotazioniEvento.equalsIgnoreCase("si")) {
			System.out.println("quante prenotazioni vuoi aggiungere?");
			
			int numeroPrenotazioniAggiuntive = Integer.parseInt(scan.nextLine());
			
			for (int i = 0; i < numeroPrenotazioniAggiuntive ; i++) {
				ev1.prenota();
				
			}
		}
		System.out.println("la capienza totale del evento e di: " +capienzaEvento+ " il numero dei posti disponibili " + (capienzaEvento - ev1.getPostiPrenotati()) );
		
			System.out.println("vuoi disdire qualche prenotazioni ? si/no"); 
			
			String risposta = scan.nextLine();
			
			if(risposta.equalsIgnoreCase("si")) {
				System.out.println("quante persone vuoi disdire?");
				int numeroPersoneDisdette = Integer.parseInt(scan.nextLine());
				for (int i = 0; i < numeroPersoneDisdette; i++) {
					ev1.disdici();
					
				}
			}
			System.out.println("la capienza totale del evento e di: " +capienzaEvento+ " il numero dei posti disponibili" + (capienzaEvento - ev1.getPostiPrenotati()) );
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
				
			
			scan.close();	
			
	}

}
