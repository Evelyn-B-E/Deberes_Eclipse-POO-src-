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
público  de clase  Oficionistas  extiende  Empleado {
    privado  int numeroDeIdentificacion;
     int privado codigoArea;

     Oficionistas públicos ( int  numeroDeIdentificacion , int  codigoArea , String  nombresYa accidentes , double  cedula ) {
        super (nombresYa protocolos, cedula);
        esta . numeroDeIdentificacion = numeroDeIdentificacion;
        esta . codigoArea = codigoArea;
    }

     Oficionistas públicos ( doble  salario ) {
        super (salario);
        // this.numeroDeIdentificacion = numeroDeIdentificacion;
        // this.codigoArea = codigoArea;
    }
    
    // salario = sueldo basico
    public  double  salarioOficionista () {
        retorno salario;
    }
}
