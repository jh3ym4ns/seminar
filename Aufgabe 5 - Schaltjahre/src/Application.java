
public class Application {

	public static void main(String[] args) {
		SchaltjahrBerechner sjb = new SchaltjahrBerechner();
		for(int i = 0; i < 2100; i++) {
			if(sjb.istSchaltJahrG(i)) {
				System.out.println("Das Jahr " + i + " ist ein Schaltjahr nach dem gregorianischen Kalender!");
			}
			
			if(sjb.istSchaltJahrI(i)) {
			System.out.println("Das Jahr " + i + " ist ein Schaltjahr nach dem islamischen Kalender!");
			}
			
			if(sjb.istSchaltJahrJ(i)) {
			System.out.println("Das Jahr " + i + " ist ein Schaltjahr nach dem jüdischen Kalender!");
			}
		}
	}
}