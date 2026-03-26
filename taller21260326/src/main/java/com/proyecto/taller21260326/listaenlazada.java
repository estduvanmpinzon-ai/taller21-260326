class ListaEnlazada {
    private Nodo cabeza; 

    public ListaEnlazada() {
        cabeza = null;
    }


    public void agregar(int valor) {
        Nodo nuevo = new Nodo(valor);

        if (cabeza == null) {
            cabeza = nuevo; 
        } else {
            Nodo actual = cabeza;
            while (actual.siguiente != null) { 
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo; 
        }