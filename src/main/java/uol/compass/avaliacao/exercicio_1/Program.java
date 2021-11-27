package uol.compass.avaliacao.exercicio_1;

import uol.compass.avaliacao.exercicio_1.controller.ProdutoController;
import uol.compass.avaliacao.exercicio_1.model.Produto;

import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ProdutoController produtoController = new ProdutoController();
        Integer choice;

        do {
            System.out.println("Menu:");
            System.out.println("1 - Cadastrar três produtos");
            System.out.println("2 - Atualizar o primeiro produto");
            System.out.println("3 - Excluir o segundo produto");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    produtoController.create(new Produto("Lápis", "Lápis de escrever", 10, 0.85));
                    produtoController.create(new Produto("Borracha", "Borracha escolar", 20, 0.90));
                    produtoController.create(new Produto("Caneta", "Caneta azul", 30, 0.87));
                    break;
                case 2:
                    Produto produto = new Produto("Corretivo", "Corretivo de fita", 50, 11.61);
                    produtoController.update(produto, 1);
                    System.out.println("Produto atualizado!");
                    break;
                case 3:
                    List<Produto> produtos = produtoController.getList();
                    if (produtos.size() > 1) {
                        Integer id = produtos.get(1).getId();
                        produtoController.remove(id);
                    } else {
                        System.out.println("Operação invalida. Apenas 1 produto cadastrado.");
                    }
                    break;
                default:
                    if (choice != 0) {
                        System.out.println("\nEssa opção não existe! Tente novamente.");
                    }
            }

            System.out.println("\nSituação atual:");
            List<Produto> produtos = produtoController.getList();
            produtos.forEach(System.out::println);
            System.out.println();
        } while (choice != 0);

        System.out.println("Você saiu da aplicação. Até logo! =]");

        sc.close();
    }
}
