package POO;

import java.io.*;
import java.util.Iterator;
import java.util.HashSet;

public class AlmacenProblemas implements Serializable {
    private HashSet<Problema> listaProblemas;
    private Problema [] listadoProblemas; // Para pasar a Array

    public AlmacenProblemas(){
        this.listaProblemas = new HashSet<>();
    }

    public boolean existeProblema (Problema p){
        boolean found = false;
        Iterator<Problema> it = getListaProblemas().iterator();
        Problema aux;
        while ((!found) && it.hasNext()) {
            aux = it.next();
            found = aux.equals(p);
        }
        return found;
    }

    public HashSet<Problema> getListaProblemas() {
        return listaProblemas;
    }

    public boolean addProblema(Problema p) {
        if (!existeProblema(p))
            return this.getListaProblemas().add(p);
        else
            return false;
    }

    public boolean borrarProblema(Problema p) {
        if (!existeProblema(p))
            return getListaProblemas().remove(p);
        else
            return false;
    }

    public boolean validarProblema(Problema problem) {
        if (!existeProblema(problem) && EsValido(problem)) {
            return true;
        } else {
            return false;
        }
    }

    private boolean EsValido(Problema problem) {
        return true;
    } //falta implementar

    public void estadistiasProblemas(HashSet<Problema> problemas){
        problemas.toArray(listadoProblemas);
        int size = listadoProblemas.length;
        for (int i = 0; i < size; i++ ){
            System.out.println("LISTADO DE PROBLEMAS: ");
            System.out.println();
        }
    }

    // TEXTO
    public void AlmacenProblemasTXT(File fichero) throws IOException {
        FileWriter fileOut = new FileWriter(fichero);
        BufferedWriter buffer = new BufferedWriter(fileOut);
        PrintWriter salida = new PrintWriter(buffer);

        for (Problema problema : getListaProblemas())
            salida.println(problema);
        salida.close();
    }

    public void leeAlmacenProblemasTXT(File fichero) throws IOException{
        FileReader  file_in = new FileReader(fichero);
        BufferedReader  buffer = new BufferedReader (file_in);
        String s = "";
        String texto = "";
        while((s = buffer.readLine()) != null)
            texto += s + "\n";
        buffer.close();
    }

    // BINARIO
    public void escribeAlmacenProblemas(String n) throws IOException{
        FileOutputStream fileOut=new FileOutputStream(n);
        ObjectOutputStream salida=new ObjectOutputStream(fileOut);
        for (Problema p: getListaProblemas())
            salida.writeObject(p);
        salida.close();
    }

    public void leerAlmacenProblemas (File fichero) throws IOException, ClassNotFoundException{
        FileInputStream f = new FileInputStream (fichero);
        ObjectInputStream entrada = new ObjectInputStream (f);
        Problema p = (Problema) entrada.readObject ();
        this.listaProblemas = getListaProblemas();
        entrada.close();
    }
    // SERIALIZAR ALMACENLOGIN (no es definitivo)
    /*private boolean serializarAL(String n)  throws FileNotFoundException,IOException, ClassNotFoundException{
        try{
        FileInputStream fichero = new FileInputStream(n);
        ObjectInputStream input = new ObjectInputStream(fichero);

        Object aux = null;
        while ((aux = input.readObject()) !=null)
        {
            if (aux instanceof AlmacenLogin)
                this.addProblema((Problema) aux);

        }
        entrada.close();
        }
        catch (EOFException finFile){ return true;}
        catch (FileNotFoundException noEncontrado){ return false;}
        catch (IOException e){ return false;}
        return true;
      }*/
}
