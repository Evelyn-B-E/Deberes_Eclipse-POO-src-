
public class PruebadeVectores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numeros = new int[5];
		
		numeros[0]=1;
		numeros[1]=10;
		numeros[2]=100;
		numeros[3]=1000;
		numeros[4]=10000;
		
		System.out.println("Tama�o: " +numeros.length);
		
		for(int i = 0; i<numeros.length;i++) {
			System.out.println("[" + i + "]: " + numeros[i]);
			
		}
		System.out.println("Posici�n 4:" + numeros[4]);
		

	}

}
