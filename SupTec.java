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
público  de clase  SupTec  extiende  Empleado {
    
     SupTec público ( String  nombresYa protocolos , double  cedula ) {
        super (nombresYa protocolos, cedula);
    }

    pública  doble  salarioSupervisor ( int  anios ) {
        doble adicional;
        if (anios   ==  0 ) {
            retorno salario;
        }
        más {
            adicional = salario *  0.05 ;
            salario + = adicional;
            retorno salario;
        }
    }
    // sueldo = basico mas 5% por c / anio en el trabajo

     SupTec público ( doble  salario ) {
        super (salario);
    }
}
