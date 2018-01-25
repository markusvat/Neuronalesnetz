package Neuronalesnetzwerk.Aktivierungsfunktionen;

public class TanH implements Aktivierungsfunktion{

	@Override
	public float aktiviere(float in) {
		float epx = (float) Math.pow(Math.E, in);
		float enx = (float) Math.pow(Math.E, -in);
		return (epx-enx)/(epx+enx);
	}

}
