
public class MayorArreglo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numeros = new int[] {
				1,-3,6,8,-9,19,-20,0,17,200	
		};
		int max = numeros[0];
		int posicion = 0;
		for(int i = 0; i< numeros.length;i++) {
			if(max < numeros[i]) {
				max= numeros[i];
				posicion=i;
			}
		}
		
		System.out.println("Posicion del  numero mayor: " + posicion);
		System.out.println("Numero mayor:" + max);
		

	}

}
