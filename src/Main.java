import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        testVetor();
        testBubble();
        testInsertion();
        testSelection();
    }
    public static void testVetor() {
        Vetor vetor = new Vetor(5);
        vetor.adiciona(10);
        vetor.adiciona(20);
        vetor.remove(0);
        vetor.adiciona(0, 10);

        System.out.println("Tamanho atual: " + vetor.tamanho());
        System.out.println("Item na posição 0: " + vetor.busca(0));
        System.out.println("Posição do Elemento 2: " + vetor.buscaPosicao(2));

        System.out.println(vetor);
    }

    public static void testBubble() {
        Integer[] lista = {30, 10, 50, 20};
        System.out.println("Bubble\nAntes: " + Arrays.toString(lista));
        BubbleSort.sort(lista, lista.length);
        System.out.println("Depois: " + Arrays.toString(lista));
    }

    public static void testInsertion() {
        Integer[] lista = {30, 10, 50, 20};
        System.out.println("Insertion\nAntes: " + Arrays.toString(lista));
        InsertionSort.sort(lista, lista.length);
        System.out.println("Depois: " + Arrays.toString(lista));
    }

    public static void testSelection() {
        Integer[] lista = {30, 10, 50, 20};
        System.out.println("Selection\nAntes: " + Arrays.toString(lista));
        SelectionSort.sort(lista, lista.length);
        System.out.println("Depois: " + Arrays.toString(lista));
    }
}