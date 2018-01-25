package Neuronalesnetzwerk;

import Neuronalesnetzwerk.Aktivierungsfunktionen.Aktivierungsfunktion;

public class Test {
	public static void main(String[] args) {
		
		Neuron[] eingabeneuronen = Neuralesnetz.erzeugeNeuronen(5, new Neuron(8f,Aktivierungsfunktion.aktivierungsBool));
		//gewichte für 5 eingabeneuronen und 1 ausgabeneuron 
		Neuron gewichte[][][] = {{Neuralesnetz.erzeugeNeuronen(5, new Neuron(1f,(float in) -> {
				return in;
			}
			))}};
		/*
		//gewichte für 5 eingabeneuronen, 3 in erster hidden schicht und 1 ausgabeneuron 
		Neuron gewichte[][][] = 
			{{
				Neuralesnetz.erzeugeNeuronen(5, new Neuron(1f,Aktivierungsfunktion.aktivierungsIdentität)),
				Neuralesnetz.erzeugeNeuronen(5, new Neuron(1f,Aktivierungsfunktion.aktivierungsIdentität)),
				Neuralesnetz.erzeugeNeuronen(5, new Neuron(1f,Aktivierungsfunktion.aktivierungsIdentität)),
			},{
				{new Neuron(1f,Aktivierungsfunktion.aktivierungsBool)},
				{new Neuron(1f,Aktivierungsfunktion.aktivierungsBool)},
				{new Neuron(1f,Aktivierungsfunktion.aktivierungsBool)}
				}};
			
		//*/
		Neuron[] ausgabeneuron = {new Neuron(420)};
		Neuralesnetz nn = new Neuralesnetz(eingabeneuronen,gewichte, ausgabeneuron);
		
		Neuron[] ausgabe = nn.berechne();
		for(int i = 0; i<ausgabe.length;i++){
			System.out.print(ausgabe[i].getVal()+"; ");
		}
		
		//for(int i=0;i<2000;i++){
		//	nn.lerneDELTA(0.01f);
		//}
//		ausgabeneuron.display();
	
	}
}
