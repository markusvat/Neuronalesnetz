package Neuronalesnetzwerk;

import Neuronalesnetzwerk.Aktivierungsfunktionen.Aktivierungsfunktion;

public class Neuron{
	private float val;
	private Aktivierungsfunktion f;
	public Neuron(float val){
		this.val=val;
		f = Aktivierungsfunktion.aktivierungsIdentität;
	}
	public Neuron(float val, Aktivierungsfunktion f){
		this.val=val;
		this.f = f;
	}
	public float getVal(){
		return f.aktiviere(val);
	}
	public void add(float g) {
		val+=g;
	}
}
