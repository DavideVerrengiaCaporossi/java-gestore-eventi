package jana60;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Evento {
private String titolo;
private LocalDate dataPrenotazione;
private LocalDate dataOggi = LocalDate.now();
private int postiTotali = 400;
private int postiPrenotati = 0 ;
private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
public Evento(String titolo, LocalDate dataOggi, int postiTotali) {
	super();
	this.titolo = titolo;
	this.dataPrenotazione = dataPrenotazione;
	this.postiTotali = postiTotali;
}
public String getTitolo() {
	return titolo;
}
public void setTitolo(String titolo) {
	this.titolo = titolo;
}
public LocalDate getDataOggi() {
	return dataOggi;
}
public int getPostiTotali() {
	return postiTotali;
}
public int getPostiPrenotati() {
	return postiPrenotati;
}
public void controlloData () throws Exception {
	if(dataPrenotazione.isBefore(dataOggi)) {
	throw new Exception ("data non valida");
	}   

}
}
