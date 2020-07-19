
public class ContarPositivosyNegativos {
	//Almacenar 10 números en un Arreglo.................

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int[] numeros = new int[10];
		int[] numeros = new int[] {
		    1,-3,6,8,-9,19,-20,0,17, 200	    
	};
		
    System.out.println(numeros.length);
    int Ceros = 0, Positivos = 0, Negativos =0;
    int sumaPositivos = 0, sumaNegativos = 0;
    
    for(int i=0;i<numeros.length;i++) {
    	if(numeros[i]==0)
    		Ceros++;
    	
    	else if(numeros[i]>0) {
    		Positivos++;
    		sumaPositivos += numeros[i];
    	
    	}else{
    		Negativos++;
    		sumaNegativos++;

        }
    		
   }
    System.out.println(Ceros);
    System.out.println(Positivos);
    System.out.println(Negativos);
    System.out.println("Positivos: " + sumaPositivos);
    
    }
}
