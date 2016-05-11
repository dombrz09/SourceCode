//MODUŁ ADMINISTRATORA
package wypożyczalnia;

import java.util.Date;


	//Dzięki tej klasie możliwe jest wprowadzenie administratora do systemu

public class Administrator {
    
	//Zmienne z informacjami o administratorze
    
	private String imie;
	private String nazwisko;
	private String adres;
	private int pesel;
	private Date urodzenie;
	private int wyplata;
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
    
	public void setpesel(int value){
    	this.pesel=value;
	}   
	public int getpesel(){
    	return this.pesel;
	}
    
	public void seturodzenie(Date value){
    	this.urodzenie=value;
	}    
 	public Date geturodzenie(){
    	return this.urodzenie;
	}  
	 
	public void setwyplata(int value){
    	this.wyplata=value;
	}	 
	public int getwyplataA(){
    	return this.wyplata;
	}	 
    
	public void setatrybut(String value){
    	this.atrybut=value;
	}	 
	public String getatrybut(){
    	return this.atrybut;
	}  
    
}

