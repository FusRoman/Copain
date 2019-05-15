package Copain.NegotiationCollab;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

import projetFelix.ObjetTransportable;

public class Critere {

	private String critere;
	private String[] domaineValeur;
	private int[] preferenceValeur;

	public Critere(String critere, String...valeur) {
		this.domaineValeur = valeur;
		this.preferenceValeur = new int[valeur.length];
		this.critere = critere;
	}

	

}
