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
 Empleado de clase  pública {
     doble salario protegido ;
     Cadena protegida nombresYa protocolos;
     doble cedula protegida ;

     Empleado público ( String  nombresYa protocolos , double  cedula ) {
        // this.salario = salario;
        esta . nombresYa protocolos = nombresYa protocolos;
        esta . cedula = cedula;
    }
    
     Empleado público ( doble  salario ) {
        esta . salario = salario;
    }

    
    public  void  setNombresYa protocolos ( String  nombresYa protocolos ) {
        esta . nombresYa protocolos = nombresYa protocolos;
    }

    conjunto  vacío  público Salario ( doble  salario ) {
        esta . salario = salario;
    }

    public  void  setCedula ( doble  cedula ) {
        esta . cedula = cedula;
    }

    public  double  getSalario () {
        retorno salario;
    }

    public  String  getNombresYa protocolos () {
        volver nombresYa protocolos;
    }

    public  double  getCedula () {
        volver cedula;
    }  
}
