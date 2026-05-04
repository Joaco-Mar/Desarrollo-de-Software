package Clase6.Memento;

import java.util.Stack;

public class Historial {
    private Stack<JugadorMemento> mementos = new Stack<>();

    public void salvar(JugadorMemento m) { mementos.push(m); }
    public JugadorMemento deshacer() { return mementos.pop(); }
}
