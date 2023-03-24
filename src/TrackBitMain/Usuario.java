package TrackBitMain;

/**
 *
 * @author Joel
 */
public class Usuario {
    private String nombre;
    private String contrasena;
    private String tipo; //Cliente o Vendedor
    
    public Usuario(String nombre, String contrasena, String tipo) {
        this.nombre = nombre;
        this.contrasena = contrasena;
        if(tipo.equals("cliente") || tipo.equals("vendedor"))
            this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    
}
