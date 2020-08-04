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


 clase  pública Main2 {

    public  static  void  main ( String [] args ) {
        
        Oficionistas empleados [] =  nuevos  Oficionistas [ 8 ];
        SupTec supervisores [] =  nuevo  SupTec [ 4 ];
        Gerente jefe [] =  nuevo  Gerente [ 2 ];
        
        
        
        para ( Gerente jefe1 : jefe) {
            jefe1 . setNombresYa experimentados ( " JuanSuarez " );
            jefe1 . setSalario ( 2000 );
            jefe1 . salarioGerente ( 200 , 5 );
            Sistema . a cabo . println (jefe1 . getSalario ());
        }
       
        
    }
    
}
