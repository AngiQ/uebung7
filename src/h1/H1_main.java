package h1;

public class H1_main {

	public static void main(String[] args) {
		Zahl e = new Zahl ();
		e.num = -122;
		e.setEven();
		e.setPositive();
		e.setSmall();
		
		System.out.println("Ist die Zahl gerade? "+ e.even);
		System.out.println("Ist die Zahl positiv? "+ e.positive);
		System.out.println("Ist die Zahl kleiner als 100? " + e.small);

		

	}

}
