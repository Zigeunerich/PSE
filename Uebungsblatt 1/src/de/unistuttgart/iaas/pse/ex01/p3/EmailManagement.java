package de.unistuttgart.iaas.pse.ex01.p3;

/*
PSE WS17/18
-----------

Lösung zu Blatt 1, Aufgaben: 3b

Vorname | Nachname | Matrikelnummer
========|==========|===============
Michael | Erdemann | 3344747
--------|----------|---------------
Tobias  | Bodamer  | 3354070
--------|----------|---------------
Tizian  | Gräber   | 3308291
 */

import java.util.HashMap;
import java.util.Map;

/**
 * Enthält die Lösung von Aufgabe 2b sowie Test-cases in der Main-Funktion
 */
public class EmailManagement {

	// Map, welche alle "Name, Email" Parre enthält
	private Map<String, String> adressMap;

	/**
	 * Erstellt eine neue Instanz von EmailManagement
	 */
	public EmailManagement() {
		// Erstellt eine Neue, leere Map
		adressMap = new HashMap<String, String>();
	}

	/**
	 * Fügt ein neues Email - Name Paar hinzu
	 * @param name Hinzuzufügender Name
	 * @param email Zugehörende Email
	 */
	public void add(String name, String email) {
		// Fügt einen neuen eintrag "Name, Email" hinzu
		adressMap.put(name, email);
	}

	/**
	 * Gibt alle Name - Email Paare auf der Konsole aus
	 */
	public void printAll() {
		for (Map.Entry<String, String> i : adressMap.entrySet()) {
			String name = i.getKey(); // Der Key, bzw Name des Eintrags
			String email = i.getValue(); // Der Key, bzw Email des Eintrags
			System.out.println("Name: '" + name + "' Email: '" + email + "'");
		}
	}

	public static void main(String[] args) {
		// to test both methods
		EmailManagement management = new EmailManagement();
		management.add("Albert Schmidt", "albert.schmidt@gmx.de");
		management.add("Max Heselbach", "max.heselbach@gmx.de");
		management.add("Berta Weber", "berta.weber@gmx.de");

		management.printAll();
	}

}
