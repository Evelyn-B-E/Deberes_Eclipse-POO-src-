/ *
 * Para cambiar este encabezado de licencia, elija Encabezados de licencia en Propiedades del proyecto.
* Para cambiar este archivo de plantilla, elija Herramientas | Plantillas
 * y abra la plantilla en el editor.
 * /
paquete  deberjerarquia ;

/ **
 * *
* @author destock
 * /
 clase  pública Gerente  extiende  Empleado {

    public  Gerente ( String  nombresYa protocolos , double  cedula ) {
        super (nombresYa protocolos, cedula);
    }

     Gerente público ( doble  salario ) {
        super (salario);
    }

    public  double  salarioGerente ( double  viaticosPersonales , int  anios ) {
        doble adicional;
        if (anios   ==  0 ) {
            retorno salario;
        }
        más {
            adicional = salario *  0.05 ;
            salario + = adicional + viaticosPersonales;
            retorno salario;
        }
        
    }
    
}
