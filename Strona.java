package wypożyczalnia;

//MODUŁ STRONY


import java.awt.Image;
import java.util.List;

/*
	Przechowuje dane o stronie i reklamach na stronie
 */
public class Strona {
    
	private List <Image> reklama;
	private String kodhtml;
    
	public void setreklama (List<Image> value){
    	this.reklama=value;
   	 
	}
	public List <Image> getreklama(){
    	return this.reklama;
	}
    
	public void setkodhtml(String value){
    	this.kodhtml=value;
	}
	public String getkodhtml(){
    	return this.kodhtml;
	}
    
}
