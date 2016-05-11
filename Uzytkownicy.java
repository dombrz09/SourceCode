package wypożyczalnia;

//MODUŁ UŻYTKOWNIKA


import java.util.Date;

//Dzięki tej klasie możliwe jest wprowadzenie użytkownika  do systemu

public class Uzytkownicy {
 	//Zmienne z informacjami o użytkowniku
	private String imie;
	private String nazwisko;
	private String adres;
	private int tel;
	private Date urodzenie;
	private String email;
	private String haslo;
	private String atrybut;
    

    
	/* Funkcje, które na początku mają "set" służą do inicjalizacji/zmiany danych
	natomiast funkcje, które na początku mają "get" służą do wyświetlania danych
	*/

 	public void setimie(String value){
    	this.imie=value;
	}
	public String getimie(){
    	return this.imie;
	}
    
 	public void setnazwisko(String value){
    	this.nazwisko=value;
	}
 	public String getnazwisko(){
    	return this.nazwisko;
	}
 
	public void setadres(String value){
    	this.adres=value;
	}
	public String getadres(){
    	return this.adres;
	}
    
	public void settel(int value){
    	this.tel=value;
	}   
	public int gettel(){
    	return this.tel;
	}
    
	public void seturodzenie(Date value){
    	this.urodzenie=value;
	}    
 	public Date geturodzenie(){
    	return this.urodzenie;
	}  
	 
	public void setemail(String value){
    	this.email=value;
	}	 
	public String getemail(){
    	return this.email;
	}
	public void sethaslo(String value){
    	this.haslo=value;
	}	 
	public String gethaslo(){
    	return this.haslo;
	}  

	public void setatrybut(String value){
    	this.atrybut=value;
	}	 
	public String getatrybut(){
    	return this.atrybut;
	}   	 
    
        public void wyporzycz(String tytul, Date naile){
        }
        public Uzytkownicy informacjeUzytkownicy(){
            return this;
        }
        public void logowanie(String email, String haslo){
            
        }
        
        
    
}

