package teste;

import filas.FilaInt;

public class MainTeste {
    public static void main(String[] args) {
        FilaInt fila = new FilaInt();
        fila.init();

        //

        if (!fila.isEmpty()) {
            System.out.println("valor: " + fila.dequeue());
        } else {
            System.out.println("vazia");
        }
    }
}
