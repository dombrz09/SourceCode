package wypożyczalnia;

///MODUŁ PŁATNOŚCI


import java.util.Date;


/*
	Klasa ta związana jest z płatnościami w serwisie tzn. zmienna dokiedy
	reprezentuje date, którą użytkownik wybrał jak długo chce mieć dostępny film,
	zmienna zaplata przyjmuje wartość false gdy nie zapłacono za wybrany film, a
	true gdy taka zapłata została już dokonana. Klasa ta dziedziczy z klasy DVD,
	dzięki temu uzyskujemy informacje o wybranym przez użytkownika filmie.
 */
public class Platnosc extends DVD {
    
	private Date dokiedy;
	private boolean zaplata;
    
	public void setdokiedy(Date value){
    	this.dokiedy=value;
	}
	public Date getdokiedy(){
    	return this.dokiedy;
	}
    
	public void setzaplata(boolean value){
    	this.zaplata=value;
	}
    
	public boolean getzaplata(){
    	return this.zaplata;
	}
        
        public void przekierowywaniedoplatnosci(String tytul, Date naile, String sposob){
        }
    
      
}
