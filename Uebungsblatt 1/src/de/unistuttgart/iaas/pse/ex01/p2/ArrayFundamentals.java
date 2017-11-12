package de.unistuttgart.iaas.pse.ex01.p2;

import java.util.Arrays;

/*
PSE WS17/18
-----------

Lösung zu Blatt 1, Aufgaben: 2a, 2b, 2c

Vorname | Nachname | Matrikelnummer
========|==========|===============
Michael | Erdemann | 3344747
--------|----------|---------------
Tobias  | Bodamer  | 3354070
--------|----------|---------------
Tizian  | Gräber   | 3308291
 */

/**
 * Enthält die Lösungen zu Aufgaben 2a, 2b, 2c sowie Test-cases in der Main-funktion
 */
public class ArrayFundamentals {

	/**
	 * Gibt das minmale element eines Integer-Arrays zurück
	 * @param numbers Array, dessen minimum zurückgegeben werden soll
	 * @return Minimalelement
	 */
	public static int computeMin(int[] numbers) {
		if (numbers.length == 0) {
			// Sollte das Eingabearray keine Elemente enthalten wird so eine Exception verhindert.
			return 0;
		}
		
		int[] _numbers = numbers.clone(); //Kopie des Arrays anlegen, da es im nächsten Schritt verändert wird
		
		Arrays.sort(_numbers); //Zahlen im Array aufstiegend sortieren
		
		return _numbers[0]; //Das erste Element (nach Sortierung damit das kleinste) zurückgeben
	}

	/**
	 * Gibt alle Ungeraden Nummern des Übergebenen Arrays auf der Konsole aus.
	 * @param numbers Das zu untersuchende  Array
	 */
	public static void printOddNumbers(int[] numbers) {
		for (int i : numbers) {
			if (i % 2 != 0) {
				// wenn eine zahl nicht restlos durch zwei teilbar ist, ist sie ungerade
				System.out.println(i);
			}
		}
	}

	/**
	 * Gibt die Summe aller Elemente eines Integer-Arrays zurück
	 * @param numbers Array dessen Summe zurÃ¼ckgegeben
	 * @return Summe des Arrays
	 */
	public static int sumEvenElements(int[] numbers) {
		int ret = 0;
		for (int i : numbers) {
			if (i % 2 == 0) {
				// wenn eine Zahl restlos durch 2 geteilt werden kann ist sie gearde
				ret += i;
			}
		}
		return ret;
	}

	public static void main(String[] args) {
		// to test
		int[] numbers = { 2, 4, 6, 1, 3, 2, 8, 9, 43, 35, 42, 187, 99, 0, 12 };
		System.out.println("SumEvenElements:");
		System.out.println(sumEvenElements(numbers));
		System.out.println("ComputeMin:");
		System.out.println(computeMin(numbers));
		System.out.println("PrintOdd:");
		printOddNumbers(numbers);
	}
}