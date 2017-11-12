package de.unistuttgart.iaas.pse.ex01.p1;

/*
PSE WS17/18
-----------

Lösung zu Blatt 1, Aufgaben: 1a, 1b

Vorname | Nachname | Matrikelnummer
========|==========|===============
Michael | Erdemann | 3344747
--------|----------|---------------
Tobias  | Bodamer  | 3354070
--------|----------|---------------
Tizian  | Gräber   | 3308291
 */

/**
 * Enthält die Lösungen zu Aufgaben 1a und 1b sowie Test-cases in der Main-funktion
 */
public class Loops {


    /**
     * Berechnet eine Annäherung der Euler'schen zahl
     * @param n Anzahl der Summendurchläufe
     * @return Errechneter Wert von e
     */
    public static double computeEuler(int n) {
		double e = 0;
		// Summe(k=0,1/!k,n)
		for (int k = 0; k <= n; k++) {
		    e += 1.0/faculty(k);
        }
		return e;
	}

    /**
     * Helper Funktion welche die Fakultät berechnet
     * @param f Zahl deren Fakultät errechnet werden soll
     * @return Fakultät von f
     */
	private static long faculty(int f) {
	    long ret = 1;
	    // !i
	    for (int i = 1;i <= f;i++) {
	        ret *= i;
        }
        return ret;
    }

    /**
     * Berechnet eine Annäherung der Euler'schen Zahl
     * @param delta wert, den 1/!k unterschreiten muss
     * @return Errechneter Wert für e
     */
	public static double computeEuler(double delta) {
		double e = 0;
		// Das momentane Delta (in einem Schleifendurchlauf)
		double curDelta = 0;
		int i = 0;
		do {
		    curDelta = 1.0/faculty(i);
		    e += curDelta;
		    i++;
        } while (delta < curDelta);
		// Sobald das Ã¼bergebene Delta Ã¼berschritten wird endet die Berechnung
		return e;
	}

    /**
     * Errechnet das QuerProdukt analog einer QuerSumme
     * @param n Zahl, deren QuerProdukt errechnet werden soll
     * @return Errrechnetes Querprodukt
     */
	public static int querProdukt(int n) {
		// wandelt die nummer in einen String und diesen in ein Char Array
	    char[] number = Integer.toString(n).toCharArray();
	    int ret = 1;
        for (char c : number) {
        	/* Char nach int gecasted ergibt den ASCII-Wert des Chars.
        	   Die ASII werte der Zahlen 0, 1,...,9 sind auf 48, 49,...,57,
        	   also gilt (ASCIIwertDerZahl)-48=Zahl
        	  */
            ret *= (int)c-48;
        }
        return ret;
	}

	public static void main(String[] args) {
		// to test
		System.out.println("50 steps: \n" + computeEuler(50));
		System.out.println("Until a divergence of 0.00000001: \n"
				+ computeEuler(0.00000001));
		System.out.println("Product of the Digits: \n" + querProdukt(123));
	}

}
