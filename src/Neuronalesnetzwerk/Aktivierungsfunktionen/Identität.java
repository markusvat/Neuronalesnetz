package Neuronalesnetzwerk.Aktivierungsfunktionen;

public class Identität implements Aktivierungsfunktion{

	@Override
	public float aktiviere(float in) {
		return in;
	}
	
}
