package POO;

import POO.Comparators.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;

public class Clasificacion implements Serializable{
    private ArrayList<Usuario> listaClasificacion;

    public Clasificacion(){this.listaClasificacion = new ArrayList<>(AlmacenLogin.getListaUsuarios());}
    
    public void ordenarPorcentaje(){Collections.sort(this.listaClasificacion, new PorcentajeExitosComparator());}
    public void ordenarNumProblemas(){Collections.sort(this.listaClasificacion, new NumProblemasComparator());}
    
    public ArrayList<Usuario> getLista(){return listaClasificacion;}
}