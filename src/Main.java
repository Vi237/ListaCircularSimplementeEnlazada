import lse.ListaCircularSimplementeEnlazada;

public class Main {
    public static void main(String[] args) {
        ListaCircularSimplementeEnlazada listaCircularSimplementeEnlazada=new ListaCircularSimplementeEnlazada();
        System.out.println(listaCircularSimplementeEnlazada.estaVacia());
        listaCircularSimplementeEnlazada.insertar(5);
        listaCircularSimplementeEnlazada.insertar(58);
        listaCircularSimplementeEnlazada.insertar(12);

        listaCircularSimplementeEnlazada.mostrar(1);

        listaCircularSimplementeEnlazada.eliminar();
        listaCircularSimplementeEnlazada.eliminar();
    }
}
