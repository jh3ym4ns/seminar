
public class Application {

	public static void main(String[] args) {
		Fehler f = new Fehler();
		f.variable1 = 10;
		f.variable2 = 10;
		f.variable3 = "20";
		f.methode1();
		f.methode2();
		f.methode3();
		System.out.println("Alle Fehler sind verschwunden!");
	
		String s = "12345";
		System.out.println(s.length());
		
		int[] array = new int[5];
		array[0] = 0;
		System.out.println(array.length);
	
	}

}
