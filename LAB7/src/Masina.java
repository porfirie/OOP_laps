
public class Masina implements Cloneable{
  private String model;
  private String culoare;
  private int id;
  
  
  public Masina(String model,String culoare,int id) {
	  this.setModel(model);
	  this.setCuloare(culoare);
	  this.id=id;
	  
  }
  
  
  public int compareTo(Object o) {
	  Masina temp=(Masina) o;
	  if(id < temp.id) {  
	  return 1;
	  }else if (id==temp.id){
		  return 0; 
	  }else {
		  return 1;
	  }
  }
  
  public void revopsire(String culoare) {
	  this.setCuloare(culoare);
  }
  
  public String toString() {
	   return getModel()+" de culoare "+getCuloare();
  }
  
  public Masina clone() {
	  try {
		return (Masina)super.clone();
	} catch (CloneNotSupportedException e) {
	   return null;
	}
	  
  }


public String getCuloare() {
	return culoare;
}


public void setCuloare(String culoare) {
	this.culoare = culoare;
}


public String getModel() {
	return model;
}


public void setModel(String model) {
	this.model = model;
}
  
  
  
}
