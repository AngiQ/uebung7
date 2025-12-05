package h3;

public class H3_main {

	public static void main(String[] args) {
		Mensch m = new Mensch ();
		m.setName ("Maria");
		m.setGebJahr(1896);
		m.setAlter();
		System.out.println(m.getName ());
		System.out.println(m.getGebJahr ());
		System.out.println(m.getAlter ());
		
	}

}
