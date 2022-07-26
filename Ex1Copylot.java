import java.util.Scanner;

public class Ex1Copylot {
    Scanner sc = new Scanner(System.in);

    // Implementar os seguintes métodos:
    // Adcionar um dado no fim do vetor
    // adcionar um dado em uma dada posição do vetor
    // recuperar um dado de uma dada posição do vetor
    // remover um dado de uma dada posição do vetor
    // informar o tamanho do vetor
    // informar o numero de itens no armazenados no vetor

    public static void main(String[] args) {
        Ex1Copylot ex1 = new Ex1Copylot();
        ex1.run();
    }

    public void run() {
        int[] vetor = new int[10];
        int opcao = 0;
        int posicao = 0;
        int valor = 0;
        int tamanho = 0;
        int itens = 0;
        do {
            System.out.println("1 - Adicionar um dado no fim do vetor");
            System.out.println("2 - Adicionar um dado em uma dada posição do vetor");
            System.out.println("3 - Recuperar um dado de uma dada posição do vetor");
            System.out.println("4 - Remover um dado de uma dada posição do vetor");
            System.out.println("5 - Informar o tamanho do vetor");
            System.out.println("6 - Informar o numero de itens no armazenados no vetor");
            System.out.println("7 - Sair");
            System.out.println("Digite a opção desejada: ");
            opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Digite o valor a ser adicionado: ");
                    valor = sc.nextInt();
                    vetor = adicionar(vetor, valor);
                    break;
                case 2:
                    System.out.println("Digite a posição onde deseja adicionar o valor: ");
                    posicao = sc.nextInt();
                    System.out.println("Digite o valor a ser adicionado: ");
                    valor = sc.nextInt();
                    vetor = adicionar(vetor, valor, posicao);
                    break;
                case 3:
                    System.out.println("Digite a posição do valor que deseja recuperar: ");
                    posicao = sc.nextInt();
                    valor = recuperar(vetor, posicao);
                    System.out.println("O valor da posição " + posicao + " é: " + valor);
                    break;
                case 4:
                    System.out.println("Digite a posição do valor que deseja remover: ");
                    posicao = sc.nextInt();
                    vetor = remover(vetor, posicao);
                    break;
                case 5:
                    tamanho = tamanho(vetor);
                    System.out.println("O tamanho do vetor é: " + tamanho);
                    break;
                case 6:
                    itens = itens(vetor);
                    System.out.println("O numero de itens no vetor é: " + itens);
                    break;
                case 7:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");

            }
        } while (opcao != 7);
    }
    
    public int[] adicionar(int[] vetor, int valor) {
        int[] novoVetor = new int[vetor.length + 1];
        for (int i = 0; i < vetor.length; i++) {
            novoVetor[i] = vetor[i];
        }
        novoVetor[novoVetor.length - 1] = valor;
        return novoVetor;
    }

    public int[] adicionar(int[] vetor, int valor, int posicao) {
        int[] novoVetor = new int[vetor.length + 1];
        for (int i = 0; i < vetor.length; i++) {
            if (i < posicao) {
                novoVetor[i] = vetor[i];
            } else if (i == posicao) {
                novoVetor[i] = valor;
            } else {
                novoVetor[i] = vetor[i - 1];
            }
        }
        return novoVetor;
    }

    public int recuperar(int[] vetor, int posicao) {
        return vetor[posicao];
    }

    public int[] remover(int[] vetor, int posicao) {
        int[] novoVetor = new int[vetor.length - 1];
        for (int i = 0; i < vetor.length; i++) {
            if (i < posicao) {
                novoVetor[i] = vetor[i];
            } else if (i > posicao) {
                novoVetor[i - 1] = vetor[i];
            }
        }
        return novoVetor;
    }

    public int tamanho(int[] vetor) {
        return vetor.length;
    }

    public int itens(int[] vetor) {
        int itens = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] != 0) {
                itens++;
            }
        }
        return itens;
    }
}