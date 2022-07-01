package jana60;

import java.time.LocalDate;

public class Conferenza extends Evento {
	private String argomento ;
	private String oratore;
	public Conferenza(String titolo, LocalDate dataEveneto, int postiTotali, String argomento, String oratore)
			throws Exception {
		super(titolo, dataEveneto, postiTotali);
		this.argomento = argomento;
		this.oratore = oratore;
	}
	public String getArgomento() {
		return argomento;
	}
	public void setArgomento(String argomento) {
		this.argomento = argomento;
	}
	public String getOratore() {
		return oratore;
	}
	public void setOratore(String oratore) {
		this.oratore = oratore;
	}
@Override
public String toString() {
	return super.toString() + ("in questa conferenza parliamo di " + argomento + "ce n'è parlerà " + oratore) ;
}
}
