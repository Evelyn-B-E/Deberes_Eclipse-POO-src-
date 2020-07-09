
public class NumeroMayor {

	public static void main(String[] args) {
		int n1=20;
		int n2=16;
		int n3=14;
		
		String mensaje =  "";
		
		if(n1>n2 && n1>n3) {
			mensaje = n1 + "es el mayor";
			//System.out.println(n1 + " es el mayor");
		} else if(n2>n1 && n2>n3) {
			mensaje = n2 + "es el mayor";
			//System.out.println(n1 + "es el mayor");
		} else if(n3>n1 && n3>n2) {
			mensaje = n3 + "es el mayor";
			//System.out.println(n3 + " es el mayor");
		
		}
		
		System.out.println(mensaje);


	}

}
