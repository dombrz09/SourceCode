package wypożyczalnia;

//MODUŁ ZARZĄDZANIA ZBIOREM DVD


import java.util.Date;
import java.util.List;




/*
	Dzięki tej klasie możliwe są wszelkie operacje związane ze zbiorem DVD
	tj. dodawanie/usuwanie filmów, recenzji, kategorii, wieku dla jakiego są przeznaczone,
	informacji o reżyserze, aktorach, nagrodach, roku produkcji czy recenzji, opisów, ocen.
 */
public class DVD {
    
	//Zmienne z informacjami o filmie
	private String tytul;
	private String kategoria;
	private int wiek;
	private String rezyser;
	private List<String> aktorzy;
	private List<String> nagrody;
	private int rok;
	private String recenzja;
	private String opis;
	private List <Integer> ocena;
    
    
    
	/* Funkcje, które na początku mają "set" służą do inicjalizacji/zmiany danych
	natomiast funkcje, które na początku mają "get" służą do wyświetlania danych
	*/
        
        DVD(){};
        
        DVD(String tyt, String kat, int wiek, String rez, List<String> akt, List<String> nag, int rok){
            this.tytul=tyt;
            this.kategoria=kat;
            this.wiek=wiek;
            this.rezyser=rez;
            this.aktorzy=akt;
            this.nagrody=nag;
            this.rok=rok;
            
        }
    
	public void settytul(String value){
    	this.tytul=value;
	}
	public String gettytul(){
    	return this.tytul;
	}
    
	public void setkategoria(String value){
    	this.kategoria=value;
	}
	public String getkategoria(String value){
    	return this.kategoria;
	}
    
	public void setwiek(int value){
    	this.wiek=value;
	}
	public int getwiek(){
    	return this.wiek;
	}
    
	public void setrezyser(String value){
    	this.rezyser=value;
	}
	public String getrezyser(){
    	return this.rezyser;
	}
    
	public void setaktorzy(List <String> value){
    	this.aktorzy=value;
	}
	public List <String> getaktorzy(){
    	return this.aktorzy;
	}
    
	public void setnagrody(List<String> value){
    	this.nagrody=value;
	}
	public List<String> getnagrody(){
    	return this.nagrody;
	}
    
	public void setrok(int value){
    	this.rok=value;
	}
	public int getrok(){
    	return this.rok;
	}
    
	public void setrecenzja(String value){
    	this.recenzja=value;
	}
	public String getrecenzja(){
    	return this.recenzja;
	}
    
	public void setopis(String value){
    	this.opis=value;
	}
	public String getopis(){
    	return this.opis;
	}
    
	public void setocena(List<Integer> value){
    	this.ocena=value;
	}
	public List<Integer> getocena(){
    	return this.ocena;
	}
        
        public void informacjedowyporzyczenia(String tytul, Date naile){ 
        }
        public double sredniaocen(int ocena){
            double srednia = 0;
            return srednia;
        }
        public void dodajocene(int value){
            try{
            this.ocena.add(value);}
            catch(Exception e){
            }
        }
        public void dodajaktora(String value){
            try{
            this.aktorzy.add(value);}
            catch(Exception e){
            }
        }
        public void dodajnagroda(String value){
           try{
            this.nagrody.add(value);}
            catch(Exception e){
            }
        }
        
        public DVD informacjeoDVD(){
            return this;
        }
    
}
