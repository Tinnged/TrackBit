package TrackBitMain;
import InterfacesGraficas.InicioSesion.InicioSesionMenuPrincipal;
import java.util.ArrayList;

/**
 *
 * @author gepor
 */
public class Main {
    public static ArrayList <Producto> listaDeProductos = new ArrayList<>();
    public static ArrayList <Usuario> listaDeUsuarios = new ArrayList<>();

    public static void main(String[] args) {
        //Usuarios de prueba
        listaDeUsuarios.add(new Usuario("vendedor", "vendedor123", "vendedor") );
        listaDeUsuarios.add(new Usuario("cliente", "cliente123", "cliente") );
        
        InicioSesionMenuPrincipal.getInstancia().setVisible(true);
    }
    
    public static void agregarProdcuto(String nombre, String precio){
        nombre = nombre.trim();
        if(!nombre.equals("")){
            Producto producto = new Producto(nombre, precio);
            listaDeProductos.add(producto);
            System.out.println("Se agrego el producto "+producto.getNombre());
        } else{
            System.out.println("Producto invalido");
        }
    }
    
    public static void agregarUsuario(String nombre, String contrasena, String tipo){
        listaDeUsuarios.add(new Usuario(nombre, contrasena, tipo));
    }
    
    public static boolean vereficarUsuario(String nombre, String contrasena, String tipo){
        for (int i = 0; i < listaDeUsuarios.size(); i++) {
            if( nombre.equals(listaDeUsuarios.get(i).getNombre()) &&
                contrasena.equals(listaDeUsuarios.get(i).getContrasena()) &&
                tipo.equals(listaDeUsuarios.get(i).getTipo()))
            {
                System.out.println("Se encontro");
                return true;
            }
        }
        System.out.println("No se encontro");
        return false;
    }
    
}
