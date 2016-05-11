package wypożyczalnia;

//PAKIETY


import java.util.List;

/*
	Umożliwia tworzenie pakietów filmowych w serwisie
 */
public class Pakiet {
    
	private String nazwapakietu;
	private List <DVD> cozawiera;
    
	public void setnazwapakietu(String value){
    	this.nazwapakietu=value;
	}
    
	public String getnazwapakietu(){
    	return this.nazwapakietu;
	}
    
	public void setcozawiera(List <DVD> value){
    	this.cozawiera=value;
	}
	public List <DVD> getcozawiera(){
    	return this.cozawiera;
	}
        
        public Pakiet informacjePakiet(){
            return this;
        }
    
    
}


