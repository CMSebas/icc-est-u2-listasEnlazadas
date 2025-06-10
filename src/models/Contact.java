package models;

public class Contact <T,U> {
    private T nombre;
    private U telefono;


    public Contact(T nombre, U telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }


    public T getNombre() {
        return nombre;
    }


    public void setNombre(T nombre) {
        this.nombre = nombre;
    }


    public U getTelefono() {
        return telefono;
    }


    public void setTelefono(U telefono) {
        this.telefono = telefono;
    }


    @Override
    public String toString() {
        return "Contact [nombre=" + nombre + ", telefono=" + telefono + "]";
    }

    

    
    
}
