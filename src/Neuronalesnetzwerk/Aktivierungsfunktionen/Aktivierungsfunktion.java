package Neuronalesnetzwerk.Aktivierungsfunktionen;

public interface Aktivierungsfunktion {
	public static Bool aktivierungsBool = new Bool();
	public static Identität aktivierungsIdentität = new Identität();
	public static Sigmoid aktivierungsSigmoid = new Sigmoid();
	public static TanH aktivierungsTanH = new TanH();
	
	public float aktiviere(float in);
}
