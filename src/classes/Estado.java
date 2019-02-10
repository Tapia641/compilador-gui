package classes;

import javafx.util.Pair;

import java.util.HashSet;
import java.util.Iterator;

public class Estado {
    
    /* DATOS INICIALES DE UN ESTADO */
    private int ID = 0;
    private boolean EstadoAceptacion;
    private long TOKEN = 0;

    /* TODAS LAS TRANSICIONES QUE TIENE EL ESTADO */
    public Transicion Transiciones;

    public Estado() {
        this.EstadoAceptacion = false;
        this.Transiciones = new Transicion();
    }

    public long getTOKEN() {
        return TOKEN;
    }

    public void setTOKEN(long TOKEN) {
        this.TOKEN = TOKEN;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setEstadoAceptacion(boolean estadoAceptacion) {
        EstadoAceptacion = estadoAceptacion;
    }

    public String imprimeTransiciones() {
        String cadena = "";

        HashSet<Pair<Character, Estado>> t = Transiciones.getTransiciones();
        Iterator it = t.iterator();
        Pair<Character, Estado> P;
        while (it.hasNext()) {
            P = (Pair) it.next();
            cadena += (P.getKey() + " -> " + P.getValue().getID() + "\n");
        }
        return cadena;
    }

    public HashSet<Pair<Character, Estado>> getTransiciones() {
        return Transiciones.getTransiciones();
    }

}
