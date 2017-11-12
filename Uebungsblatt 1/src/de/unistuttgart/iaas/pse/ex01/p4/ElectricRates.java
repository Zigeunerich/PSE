package de.unistuttgart.iaas.pse.ex01.p4;

/*
PSE WS17/18
-----------

Lösung zu Blatt 1, Aufgaben: 4a, 4b

Vorname | Nachname | Matrikelnummer
========|==========|===============
Michael | Erdemann | 3344747
--------|----------|---------------
Tobias  | Bodamer  | 3354070
--------|----------|---------------
Tizian  | Gräber   | 3308291
 */

/**
 * Enthält die Lösungen zu Aufgaben 4a und 4b sowie Test-cases in der Main-funktion
 */
public class ElectricRates {

	/**
	 * Errechnet die monatlichen k Kosten bei einem Verbrauch n unter Tarif 1
	 * @param verbrauch der zugrunde liegende Verbrauch n
	 * @return Die erechneten Kosten k
	 */
	public static double Tarif1(double verbrauch) {
		double ret = 6.87;
		ret += 0.5 * verbrauch;
		return ret;
	}

	/**
	 * Errechnet die monatlichen k Kosten bei einem Verbrauch n unter Tarif 2
	 * @param verbrauch der zugrunde liegende Verbrauch n
	 * @return Die erechneten Kosten k
	 */
	public static double Tarif2(double verbrauch) {
		double ret = 10.87;
		ret += 0.25 * verbrauch;
		return ret;
	}

	/**
	 * Errechnet die monatlichen k Kosten bei einem Verbrauch n unter Tarif 3
	 * @param verbrauch der zugrunde liegende Verbrauch n
	 * @return Die erechneten Kosten k
	 */
	public static double Tarif3(double verbrauch) {
		double ret = 14.87;
		// Einfaches Subtrahiren wÃ¼rde bei verbrÃ¤uchen unter 10 den Preis negieren
		if (verbrauch > 10) {
			ret += 0.37 * (verbrauch - 10);
		}
		return ret;
	}

	public static void main(String[] args) {
		for (int i = 10; i <= 100; i += 10) {
			System.out.println("Tarif 1, " + i + "kw/h: " + Tarif1(i) + "€");
			System.out.println("Tarif 2, " + i + "kw/h: " + Tarif2(i) + "€");
			System.out.println("Tarif 3, " + i + "kw/h: " + Tarif3(i) + "€");
		}
	}

}

