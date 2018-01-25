package Neuronalesnetzwerk;

//voll verbundenes neurlaes netz;
public class Neuralesnetz {
	//eingabeNeuronen
	private Neuron[] eingabeNeuronen;
	//Gewichte der Verbindungen
	private Neuron[][][] verbindungen;
	//ergebnis neuronen
	private Neuron[] ausgabeSoll;
	public Neuralesnetz(int anzEingabe, Neuron[][][] gewichte, int anzAusgabe){
		this(anzEingabe, anzAusgabe);
		verbindungen=gewichte;
	}
	public Neuralesnetz(Neuron[] Eingabe, Neuron[][][] gewichte, Neuron[] Ausgabe){
		eingabeNeuronen = Eingabe;
		verbindungen=gewichte;
		ausgabeSoll=Ausgabe;
	}
	public Neuralesnetz(int anzEingabe, int anzAusgabe){
		erzeugeNeuronen(anzEingabe, eingabeNeuronen);
		erzeugeNeuronen(anzAusgabe, ausgabeSoll);
		erzeugeGewichte(eingabeNeuronen.length,ausgabeSoll.length);
	}
	
	public float[] erzeugeNeuronen(int anz) {
		return new float[anz];
	}
	public Neuron[] erzeugeNeuronen(int anz, Neuron[] var) {
		var = new Neuron[anz];
		return var;
	}

	public void erzeugeGewichte(int anzeingabe,int anzausgabe) {
		add(verbindungen,new Neuron[anzeingabe][anzausgabe]);
	}
	
	private void add(Neuron[][][] a, Neuron[][] b){
		Neuron[][][] temp = new Neuron[a.length+1][][];
		coppy(a, temp);
		a=temp;
		a[a.length-1]=b;
	}
	private void coppy(Neuron[][][] s, Neuron[][][] d){
		if(d==null){d = new Neuron[s.length][][];}
		for(int i = 0;i<s.length;i++){
			d[i]=s[i];
		}
	}
	public Neuron[][] map0(Neuron[] a){
		Neuron[][] eingabe = new Neuron[a.length][1];
		for(int i = 0;i<a.length;i++){
			eingabe[i]=new Neuron[1]; eingabe[i][0]=a[i];
		}
		return eingabe;
	}
	public Neuron[][] map1(Neuron[][] a){
		Neuron[][] eingabe = new Neuron[a[0].length][a.length];
		for(int i = 0; i<a.length;i++){
			for(int j = 0; j<a[0].length;j++){
				eingabe[j][i]=a[i][j];
			}
		}
		return eingabe;
	}
	public Neuron[] berechne() {
		Neuron[] ausgabe=new Neuron[ausgabeSoll.length];
		if(verbindungen.length>1){
			Neuron[][] eingabe = map0(eingabeNeuronen);

			//berechnung der einzelnen schichten mit matrizen
			Neuron[][] result = multiplicar(verbindungen[0],eingabe);
			for(int i = 1;i<verbindungen.length-1;i++){
				result=multiplicar(verbindungen[i], result);
			}
			result=multiplicar(map1(result), verbindungen[verbindungen.length-1]);
			return result[0];
			
		}else if(verbindungen.length==1){
			Neuron[][] eingabe = map0(eingabeNeuronen);
			Neuron[][] result = multiplicar(verbindungen[0],eingabe);
			return result[0];
		}
		
		return ausgabe;
	}
    public Neuron[][] multiplicar(Neuron[][] A, Neuron[][] B) {

        int aRows = A.length;
        int aColumns = A[0].length;
        int bRows = B.length;
        int bColumns = B[0].length;

        if (aColumns != bRows) {
            throw new IllegalArgumentException("A:Rows: " + aColumns + " did not match B:Columns " + bRows + ".");
        }

        Neuron[][] C = new Neuron[aRows][bColumns];
        for (int i = 0; i < aRows; i++) {
            for (int j = 0; j < bColumns; j++) {
                C[i][j]=new Neuron(0);
            }
        }

        for (int i = 0; i < aRows; i++) { // aRow
            for (int j = 0; j < bColumns; j++) { // bColumn
                for (int k = 0; k < aColumns; k++) { // aColumn
                    C[i][j].add(A[i][k].getVal() * B[k][j].getVal());
                }
            }
        }

        return C;
    }
	
}
