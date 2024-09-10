import Dados.Pilha;
import Dados.Fila;

public class Main {
    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println("Aluno: Bruno Custodio de castro Silva");
        System.out.println("Professor: Brenno Pimenta");
        System.out.println("========================================");
        System.out.println(" ");
        System.out.println("Teste da Pilha:");

        Pilha pilha = new Pilha();
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);
        pilha.push(40);
        pilha.push(50);

        System.out.println("Pilha após adição de elementos: " + pilha);
        System.out.println("Elemento removido: " + pilha.pop());
        System.out.println("Elemento no topo: " + pilha.peek());
        System.out.println("A pilha está vazia? " + pilha.isEmpty());

        pilha.push(60);
        System.out.println("Pilha após adicionar mais um elemento: " + pilha);
        pilha.clear();
        System.out.println("Pilha após limpeza: " + pilha);
        System.out.println("A pilha está vazia? " + pilha.isEmpty());
        System.out.println("\nTeste da Fila:");

        Fila fila = new Fila();

        fila.add(10);
        fila.add(20);
        fila.add(30);
        fila.add(40);
        fila.add(50);

        System.out.println("Fila após adição de elementos: " + fila);
        System.out.println("Elemento removido: " + fila.remove());
        System.out.println("Tamanho da fila: " + fila.size());
        fila.shift();
        System.out.println("Fila após shift: " + fila);
        fila.add(60);
        System.out.println("Fila após adicionar mais um elemento: " + fila);
        fila.clear();
        System.out.println("Fila após limpeza: " + fila);
        System.out.println("Tamanho da fila: " + fila.size());
    }
}
