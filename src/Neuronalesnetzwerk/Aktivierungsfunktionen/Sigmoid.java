package Neuronalesnetzwerk.Aktivierungsfunktionen;

public class Sigmoid implements Aktivierungsfunktion{

	@Override
	public float aktiviere(float in) {
		return 1f/(1f+(float)Math.pow(Math.E, -in));
	}
	
}
