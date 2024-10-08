/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Carlo
 */
abstract class persona {
    
    private String nombres,apellidos,direccion,telefono,fehca_nacimiento;
     private int id;
    //constructores
    public persona(){}
        public persona(int id,String nombre, String apellidos, String direccion, String telefono, String fehca_nacimiento) {
        this.id = id;
        this.nombres = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fehca_nacimiento = fehca_nacimiento;
            }

    //metodos
        
        
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombres;
    }

    public void setNombre(String nombre) {
        this.nombres = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFehca_nacimiento() {
        return fehca_nacimiento;
    }

    public void setFehca_nacimiento(String fehca_nacimiento) {
        this.fehca_nacimiento = fehca_nacimiento;
    }

//merodos Crud
 public int crear(){return 0;}
  public DefaultTableModel leer(){return null;}
   public int modificar(){return 0;}
   public int eliminar(){return 0;}
}
    

