package Neuronalesnetzwerk.Aktivierungsfunktionen;

public class Bool implements Aktivierungsfunktion{

	@Override
	public float aktiviere(float in) {
		if(in<0){
			return 0;
		}else{
			return 1;
		}
	}

}
