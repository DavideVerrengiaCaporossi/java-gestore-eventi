package jana60;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Evento {
private String titolo;
private LocalDate dataEveneto;
private int postiTotali;
private int postiPrenotati;
private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
public Evento(String titolo, LocalDate dataPrenotazione, int postiTotali)  throws Exception{
	super();
	this.titolo = titolo;
	this.dataEveneto = dataPrenotazione;
	this.postiTotali = postiTotali;
    controlloData();
	controlloPosti();
	
}
public String getTitolo() {
	return titolo;
}
public void setTitolo(String titolo) {
	this.titolo = titolo;
}
public LocalDate getDataPrenotazione() {
	return dataEveneto;
}
public int getPostiTotali() {
	return postiTotali;
}
public int getPostiPrenotati() {
	return postiPrenotati;
}
public void controlloData () throws Exception {
	if(dataEveneto.isBefore(LocalDate.now())) {
	throw new Exception ("data non valida");
	}   
}
private void controlloPosti () throws Exception {
	if(postiTotali <= 0) {
		throw new Exception ("Errore Posti prenotati uguale o inferiore a 0");
	}

	}

/*prenota: aggiunge uno ai posti prenotati. Se l�evento � gi� passato o non ha pi�
posti disponibili deve sollevare un�eccezione*/

public int prenota() throws Exception {
	if(postiPrenotati == postiTotali ) {
		throw new Exception ("capienza massima superata ");
   	}
	if (dataEveneto.isBefore(LocalDate.now())) {
		throw new Exception ("data evento superata");
	}
	postiPrenotati +=1;
	return postiPrenotati;	 
	}
/*disdici: riduce di uno i posti prenotati. Se l�evento � gi� passato o non ci sono
prenotazioni deve sollevare un�eccezione.*/
public int disdici() throws Exception {
	if (dataEveneto.isBefore(LocalDate.now())) {
		throw new Exception ("data evento superata");
	}
	if (postiPrenotati <= 0) {
		throw new Exception ("Nessuna prenotazione presente");
	}
	
	return postiPrenotati=-1;	 
	}
/*l�override del metodo toString() in modo che venga restituita una stringa
contenente: data formattata - titolo*/
public String toString() {
	return ("la data dell'evento � " + formatter.format(LocalDate.now()));
}
}

