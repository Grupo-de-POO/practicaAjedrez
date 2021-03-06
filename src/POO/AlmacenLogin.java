package POO;

import java.io.*;
import java.util.HashSet;
import java.util.Iterator;

public class AlmacenLogin  implements Serializable{
    private static HashSet<Usuario> listaUsuarios;

    public AlmacenLogin() {
        listaUsuarios = new HashSet<>();
    }
    //String nombre, String password, int problemas_intentados, int problemas_resueltos, int errores
    public void initUsuariosPrueba(){
        listaUsuarios.add(new Usuario("Pepe","1234",2,1,2));
        listaUsuarios.add(new Usuario("Pepin","1234",3,2,4));
        listaUsuarios.add(new Usuario("Pepa","1234",5,0,5));
        listaUsuarios.add(new Usuario("Pepu","1234",9,4,0));
    }
    public static HashSet<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }
    
    public boolean setListaUsuarios(HashSet<Usuario> lista) {
        if (listaUsuarios != null) {
            listaUsuarios = lista;
            return true;
        } else {
            return false;
        }
    }

    public boolean existeUsuario(Usuario u) {
        boolean found = false;
        Iterator<Usuario> it = getListaUsuarios().iterator();
        Usuario aux;
        while ((it.hasNext()) && (!found)) {
            aux = it.next();
            found = (aux.equals(u));
        }
        return found;
    }

    public Usuario getUsuario(Usuario u) {
        Iterator<Usuario> it = getListaUsuarios().iterator();
        Usuario aux;
        while (it.hasNext()) {
            aux = it.next();
            if (aux.equals(u)) {
                return u;
            }
        }
        return null;
    }

    public Usuario getUsuario(String nombre) {
        Iterator<Usuario> it = getListaUsuarios().iterator();
        Usuario aux;
        while (it.hasNext()) {
            aux = it.next();
            if (aux.getNombre().equals(nombre)) {
                return aux;
            }
        }
        return null;
    }

    public boolean existeUsuario(String name){
        return (!(getUsuario(name)==null));
    }

    public boolean addUsuario(Usuario u) {
        if(!existeUsuario(u.getNombre())){
            listaUsuarios.add(u);
            return true;
        }else{
            return false;
        }
    }

    public void escribeAlmacenLogin(String nameFile) throws IOException{
        String n = nameFile+".bin";
        FileOutputStream fileOut = new FileOutputStream(n);
        ObjectOutputStream salida = new ObjectOutputStream(fileOut); 
            salida.writeObject(listaUsuarios);
        salida.close();
    }

    public void leerAlmacenLogin (String ruta) throws FileNotFoundException, IOException, ClassNotFoundException{
            String s = ""+ruta+".bin";
            FileInputStream fichero = new FileInputStream(s);
            ObjectInputStream input = new ObjectInputStream(fichero);
            listaUsuarios = (HashSet<Usuario>)input.readObject();
            input.close();
 
    }
    
    public boolean AlmacenLoginEnTXT(String fichero) throws IOException {
        String n = fichero+".txt";
        FileWriter fileOut = new FileWriter(n);
        BufferedWriter buffer = new BufferedWriter(fileOut);
        PrintWriter salida = new PrintWriter(buffer);
        salida.close();
        return true;
    }
    
    
}

