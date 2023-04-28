
package TareaProgramacion;

public class Main {
    public static void main(String[] args) {
        Matriz matriz = new Matriz(4, 4);

        matriz.imprimirMatriz();
        System.out.println("Eliminando la posicion [1][1]");
        matriz.eliminar(1, 1);
        System.out.println("Eliminando la posicion [3][4]");
        matriz.eliminar(3, 4);
        System.out.println("\n");
        matriz.imprimirMatriz();
        
        System.out.println("Buscando 109");
        System.out.println(matriz.buscar("109"));
        System.out.println("Buscando 132");
        System.out.println(matriz.buscar("132"));
        
        System.out.println("Agregando 750 en la posicion [1][1]");
        matriz.set(1, 1, new Vehiculo("750", "200", "200", "200", "200"));
        matriz.imprimirMatriz();
    }
}
