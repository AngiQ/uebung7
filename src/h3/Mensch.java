package h3;

public class Mensch {
	String name = "Gandalf";
	int gebJahr=1999, alter=26;
 
	public void setName (String sName) {
		name = sName;
	}
	
	public void setGebJahr (int sJahr) {
		gebJahr = sJahr;
	}
	
	public void setAlter () {
		alter = 2025-gebJahr;
	}
	
	public String getName () {
		return name;
	}
	
	public int getGebJahr () {
		return gebJahr;
	}
	
	public int getAlter () {
		return alter;
	}
}
