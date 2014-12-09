public class IntervallAddierer {

	Integer addiereVonBis(Integer von, Integer bis) {
		Integer summe = 0;
		Integer i = von + 1;
		Integer j = 1;
		if (von == bis) {
			summe = von + bis;
		} else {
			while (i < bis + 1) {
				summe = von + i;
				System.out.println("Addition " + j + ": " + von + " + " + i
						+ " = " + summe);
				von = von + i;
				i++;
				j++;
			}
		}
		return summe;
	}

}
