package pe.edu.upeu.app;

import pe.edu.upeu.dao.ProductoDao;
import pe.edu.upeu.dao.UsuarioDao;
import pe.edu.upeu.dao.VentaDao;
import pe.edu.upeu.utils.LeerTeclado;

public class MenuPrincipal{
    LeerTeclado lt=new LeerTeclado();   
    ProductoDao prodDao;
    UsuarioDao uDao;
    VentaDao ventDao;


    public void mainLogin(){
      uDao=new UsuarioDao();
      if (uDao.login()) {
      String perf=lt.leer("","Ingrese el perfil (ADMINISTRADOR/VENDEDOR)");
        if(perf.equals("ADMINISTRADOR")){

          menuOpciones();

        }if(perf.equals("VENDEDOR")){

          menuOpcionesSecundario();

        }

      }else{
        System.out.println("Intente Nuevamente!!");
        mainLogin();
      }

    }


    public void menuOpciones() {        
        int opcionesA=0;
        System.out.println("-----------------------Bienvenido al menu de opciones de la gestion de ventas de un quiosco (ADMINISTRADOR)--------------------");
        String msg="\nEliga una Opcion"+ 
        "\n1=Crear Producto"+
        "\n2=Listar Producto"+
        "\n3=Editar Producto"+
        "\n4=Eliminar Producto"+
        "\n5=Crear Nuevo Usuario"+
        "\n6=Realizar una venta"+
        "\n7=Reportar Ventas"+
        "\n";        
        opcionesA=lt.leer(0, msg);  
        while(opcionesA!=0){
            switch(opcionesA) {

              case 1:{ 
                    prodDao=new ProductoDao();
                    prodDao.crearProducto();
                    } break;

            
              case 2: {
                  prodDao=new ProductoDao();
                  prodDao.reportarProductos();
              } break;  
              
              
              case 3: {
                prodDao=new ProductoDao();
                prodDao.updateProducto();
            } break; 
            

              case 4: {
                prodDao=new ProductoDao();
                prodDao.deleteProducto();
            } break;


            case 5: {
              uDao=new UsuarioDao();
              uDao.crearUsuario();
          } break;

            case 6: {
              ventDao=new VentaDao();
              ventDao.registrarVenta();
            } break;

            case 7: {
              ventDao=new VentaDao();
              ventDao.reporteVentasRangoFecha();
            } break;

              default: System.out.println("La opcion ingresada no existe!");
            }   
          System.out.println("----------------------------------------------------------------");         
          opcionesA=lt.leer(0,msg);        
        }        
    }


    public void menuOpcionesSecundario() {        
      int numOpcion=0;
      System.out.println("-----------------------Bienvenido al menu de opciones de la gestion de ventas de un quiosco (VENDEDOR)--------------------");
      String msg="\nEliga una Opcion"+ 
      "\n1=Listar Producto"+
      "\n2=Realizar una venta"+
      "\n3=Reportar Ventas"+
      "\n";        
      numOpcion=lt.leer(0, msg);  
      while(numOpcion!=0){
          switch(numOpcion) {

            case 1: {
              prodDao=new ProductoDao();
              prodDao.reportarProductos();
            } break; 

          
            case 2: {
              ventDao=new VentaDao();
              ventDao.registrarVenta();
            } break;
            
            
            case 3: {
              ventDao=new VentaDao();
              ventDao.reporteVentasRangoFecha();
            } break;
          
            default: System.out.println("La opcion ingresada no existe!");
          }   
        System.out.println("----------------------------------------------------------------");       
        numOpcion=lt.leer(0,msg);        
      }        
  }
}
