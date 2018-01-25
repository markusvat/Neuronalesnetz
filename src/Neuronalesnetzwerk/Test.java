package Neuronalesnetzwerk;


public class Test {
	public static void main(String[] args) {
		
		Neuron[] eingabeneuronen = {new Neuron(1),new Neuron(1),new Neuron(1),new Neuron(1),new Neuron(1),new Neuron(1)};
		

		//gewichte für 6 eingabeneuronen und 1 ausgabeneuron 
		Neuron gewichte[][][] = {{{new Neuron(1f), new Neuron(1f), new Neuron(1f),new Neuron(1f), new Neuron(1f), new Neuron(1f)}}};
		
		/*
		//gewichte für 5 eingabeneuronen, 3 in erster hidden schicht und 1 ausgabeneuron 
			Neuron gewichte[][][] = 
			{{{new Neuron(1f), new Neuron(1f), new Neuron(1f),new Neuron(1f), new Neuron(1f)},
				{new Neuron(1f), new Neuron(1f), new Neuron(1f), new Neuron(1f), new Neuron(1f)},
				{new Neuron(1f), new Neuron(1f), new Neuron(1f), new Neuron(1f), new Neuron(1f)}},
			
				{{new Neuron(1)},{new Neuron(1)},{new Neuron(1)}}};
		*/	
		
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
