package filas;

public class FilaInt {
    private class No {
        int dado;
        No prox;
        No ini, fim;
    }

    private No ini, fim;

    public void init() {
        ini = fim = null;
    }

    public boolean isEmpty() {
        return (ini == null && fim == null);
    }

    public void enqueue(int elem) {
        No novo = new No();
        novo.dado = elem;
        novo.prox = null;
        if (isEmpty()) {
            ini = novo;
        } else {
            fim.prox = novo;
        }
        fim = novo;
    }

    public int dequeue() {
        int valor = ini.dado;
        ini = ini.prox;
        if (ini == null) {
            fim = null;
        }
        return valor;
    }

    public int first() {
        return ini.dado;
    }
}
