/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conex;

/**
 *
 * @author sandr
 */
public class CrudMotocicletas_electricas {
    
}


paquete  CRUD ;

importar  c2r5 . Conexión ;
importar  Java . sql . conexión ;
importar  Java . sql . DeclaraciónPreparada ;
importar  Java . sql .*;
importar  javax . columpio _ JOptionPane ;

/**
*
* @autor yang
*/
public  class  CrudMotocicletas_electricas {
    public  boolean  crearMotocicletas_electricas ( int  IdProveedor , String  fabricante , int  precioUnitarioMotocicleta , int  autonimia , int  idProducto){
        String  sql = "INSERTAR EN motocicletas_electricas(nombre_usuario_cliente, nombre_cliente,"
               + "cliente_apellidos, cliente_email, cliente_celular,"
               + "cliente_contraseña,cliente_fechaNacimiento)VALORES)VALORES(?,?,?,?,?,?,?) " ;
       probar ( Conexión  conn = Conexión . conectar ()){
             Sentencia PreparedStatement = conn . prepararDeclaración ( sql );
                    declaración _ setString ( 1 , usuario );
                    declaración _ setString ( 2 , nombresCliente );
                    declaración _ setString ( 3 , apellidosCliente );
                    declaración _ setString ( 4 , cliente de correo electrónico );
                    declaración _ setString ( 5 , celularCliente );
                    declaración _ setInt ( 6 , contrasenaCliente );
                    declaración _ setString ( 7 , fechaNacimientoCliente );
                    //actualiza la base de datos
                    
               int  filas insertadas = instrucción . ejecutarActualizar ();
               declaración _ cerrar ();
            contacto _ cerrar ();
            if ( filas insertadas > 0 ) {
                sistema _ fuera _ println ( "Registro agregado exitosamente" );
                devolver  verdadero ;
            }
            
        } catch ( Excepción  ex ){
            sistema _ fuera _ println ( "Error insertando proveedor" + ex );
        }
       devolver  falso ;
    }
    public  boolean  removerCliente ( String  usuario ){
        probar ( Conexión  conn = Conexión . conectar ()){
            String  sql = "ELIMINAR DESDE cliente DONDE cliente_username=" + usuario ;
             Sentencia PreparedStatement = conn . prepararDeclaración ( sql );
            int  clientes eliminados = declaración . ejecutarActualizar ();
            contacto _ cerrar ();
            if ( clientes eliminados > 0 ) {
                sistema _ fuera _ println ( "Registro agregado exitosamente" );
                devolver  verdadero ;
            }
            
        } catch ( Excepción  ex ){
            sistema _ fuera _ println ( "Error eliminando proveedor" + ex );
        }
        devolver  falso ;
    }
    public  booleano  modificarCliente ( Entidades . Clientes  cliente ){
        probar ( Conexión  conn = Conexión . conectar ()){
            String  sql = "UPDATE cliente SET cliente_username=?,cliente_nombre=?,cliente_apellidos=?,cliente_email=?,cliente_celular=?,cliente_contraseña=?,cliente_fechaNacimiento=?" ;
             Sentencia PreparedStatement = conn . prepararDeclaración ( sql );
                declaración _ setString ( 1 , cliente . getUsuario ());
                declaración _ setString ( 2 , cliente . getNombresCliente ());
                declaración _ setString ( 3 , cliente . getApellidosCliente ());
                declaración _ setString ( 4 , cliente . getEmailCliente ());
                declaración _ setString ( 5 , cliente . getCelularCliente ());
                declaración _ setInt ( 6 , cliente . getContrasenaCliente ());
                declaración _ setString ( 7 , cliente . getFechaNacimientoCliente ());
            int  modi = sentencia . ejecutarActualizar ();
            si ( mod > 0 ) {
                sistema _ fuera _ println ( "Registro agregado exitosamente" );
                //JOptionPane.show
                devolver  verdadero ;
            }
            contacto _ cerrar ();
        } catch ( Excepción  ex ){
            sistema _ fuera _ println ( "Error eliminando proveedor" + ex );
        }
        devolver  falso ;
    }
}
