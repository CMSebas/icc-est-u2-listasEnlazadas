package models;

public class Contact  {
    private String nombre;
    private String telefono;


    public Contact(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }


    public String getNombre() {
        return nombre;
    }


  

    public String getTelefono() {
        return telefono;
    }


   


    @Override
    public String toString() {
        return "Contact [nombre=" + nombre + ", telefono=" + telefono + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        result = prime * result + ((telefono == null) ? 0 : telefono.hashCode());
        return result;
    }


    @Override
    public boolean equals(Object obj) {
    if(obj==null)return false;
    if(this==null||getClass()!=obj.getClass()){
        return false;
    }

    Contact c=(Contact) obj;
    return nombre!=null&& nombre.equals(c.getNombre());
    }

    

    
    
}
