/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.sql.PreparedStatement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Carlo
 */
public class Empleado extends persona {
    private String codigo;
    private int id_puesto;
    private conexion cn; 

    public Empleado() {}
    public Empleado( String codigo, int id_puesto,int id, String nombre, String apellidos, String direccion, String telefono, String fecha_nacimiento) {
        super(id, nombre, apellidos, direccion, telefono, fecha_nacimiento);
        this.codigo = codigo;
        this.id_puesto = id_puesto;  
    }
    
    public String getCodigo() {return codigo;}
    public void setCodigo(String codigo) {this.codigo = codigo;}

    public int getId_puesto() {return id_puesto;}
    public void setId_puesto(int id_puesto) {this.id_puesto = id_puesto;}
    
    
    public DefaultTableModel leer(){
    DefaultTableModel tabla = new DefaultTableModel();
    try{
        cn = new conexion();
        cn.abrir_conexion();
        String query = "SELECT e.id_empleados as id,e.codigo,e.nombres,e.apellidos,e.dirección,e.teléfono,e.fecha_nacimiento,p.puesto,p.id_puesto FROM empleados as e inner join puesto as p on e.id_puesto = p.id_puesto;";
        ResultSet consulta = cn.conexionBD.createStatement().executeQuery(query);
        String encabezado[] = {"Id","Codigo","Nombres","Apellidos","Direccion","Telefono","Nacimiento","Puestos","Id_puestos"};
        tabla.setColumnIdentifiers(encabezado);
        String datos[] = new String[9];
        while(consulta.next()){
            datos[0] = consulta.getString("id");
            datos[1] = consulta.getString("codigo");
            datos[2] = consulta.getString("nombres");
            datos[3] = consulta.getString("apellidos");
            datos[4] = consulta.getString("dirección");
            datos[5] = consulta.getString("teléfono");
            datos[6] = consulta.getString("fecha_nacimiento");
            datos[7] = consulta.getString("puesto");
            datos[8] = consulta.getString("id_puesto");
            tabla.addRow(datos);
        
        }
        cn.cerrar_conexion();
    }catch(SQLException ex){
        System.out.println(ex.getMessage());
    }
    return tabla;
    }
    public int agregar (){
        int retorno = 0;
    try { 
        PreparedStatement parametro;
        cn = new conexion();
        String query = "INSERT INTO empleados (codigo, nombres, apellidos, dirección, teléfono, fecha_nacimiento, id_puesto) VALUES (?, ?, ?, ?, ?, ?, ?);";
        cn.abrir_conexion();
        parametro = (PreparedStatement)cn.conexionBD.prepareStatement(query);
        
        parametro.setString(1, getCodigo());
        parametro.setString(2, getNombre());
        parametro.setString(3, getApellidos());
        parametro.setString(4, getDireccion());
        parametro.setString(5, getTelefono());
        parametro.setString(6, getFehca_nacimiento());
        parametro.setInt(7, getId_puesto());
        // Ejecutar la actualización antes de cerrar la conexión
        retorno = parametro.executeUpdate();
        // Ahora cerrar la conexión
        cn.cerrar_conexion();
    } catch (SQLException ex) {
        System.out.println(ex.getMessage());
        retorno = 0;
    }
    return retorno;

    }
    
     public int modificar (){
        int retorno = 0;
    try { 
        PreparedStatement parametro;
        cn = new conexion();
        String query = "update empleados set codigo=? , nombres=?, apellidos=?, dirección=?, teléfono=?, fecha_nacimiento=? id_puesto=? where id_empleados =? ;";
        cn.abrir_conexion();
        parametro = (PreparedStatement)cn.conexionBD.prepareStatement(query);
        
        parametro.setString(1, getCodigo());
        parametro.setString(2, getNombre());
        parametro.setString(3, getApellidos());
        parametro.setString(4, getDireccion());
        parametro.setString(5, getTelefono());
        parametro.setString(6, getFehca_nacimiento());
        parametro.setInt(7, getId_puesto());
        parametro.setInt(8, getId());
        retorno = parametro.executeUpdate();
        // Ahora cerrar la conexión
        cn.cerrar_conexion();
    } catch (SQLException ex) {
        System.out.println(ex.getMessage());
        retorno = 0;
    }
    return retorno;

    }
          public int eliminar (){
        int retorno = 0;
    try { 
        PreparedStatement parametro;
        cn = new conexion();
        String query = "delete from empleados  where id_empleados =? ;";
        cn.abrir_conexion();
        parametro = (PreparedStatement)cn.conexionBD.prepareStatement(query);
        parametro.setInt(1, getId());
        retorno = parametro.executeUpdate();
        // Ahora cerrar la conexión
        cn.cerrar_conexion();
    } catch (SQLException ex) {
        System.out.println(ex.getMessage());
        retorno = 0;
    }
    return retorno;

    }
    
}