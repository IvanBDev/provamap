package it.prova.provamap.test;

import java.util.HashMap;
import java.util.TreeMap;

public class TestMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, String> citta = new HashMap<String, String>(); // "Lista" avene una chiave e un valore,
		citta.put("Citta.", "Milano"); // utilizzando HashMap i valori vengono stampati
		citta.put("Citta_", "Napoli"); // in ordine casuale
		citta.put("Citta@", "Roma");
		citta.put("Citta!", "Venezia");
		for (String key : citta.keySet()) {
			System.out.println(citta.get(key));
		}

		System.out.println("--------------------------------------------------------------------------------------");

		TreeMap<Integer, String> classifica = new TreeMap<Integer, String>(); // "Lista" avente una chiave e un valore
		classifica.put(1, "Juventus"); // utilizzando TreeMap i valori vengono
		classifica.put(2, "Napoli"); // stampati in modo ordinato
		classifica.put(3, "Roma");
		classifica.put(4, "Inter");
		for (Integer key : classifica.keySet()) {
			System.out.println(classifica.get(key));
		}
	}

}
