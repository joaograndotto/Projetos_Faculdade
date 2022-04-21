package ProjetoFinal;

import java.util.Scanner;

public class Main extends GestaoEconomica {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Produto produto = new Produto();
        Ingredientes ing = new Ingredientes();
        GestaoEconomica gestao = new GestaoEconomica();

        //-------------- Inserção dos dados Produtos -----------------------

        System.out.println("---- Insira os dados do Produto ----");
        System.out.print("Nome do produto: ");
        produto.setNome(input.next());

        System.out.print("Validade do produto: ");
        produto.setValidade(input.next());

        System.out.print("Quantidade do produto: ");
        produto.setQuantidade(input.nextInt());

        System.out.print("Valor a ser vendido: ");
        produto.setValorProduto(input.nextDouble());

        System.out.print("Código: ");
        produto.setCodigo(input.nextInt());

        System.out.print("Deseja inserir estes produtos [true-Sim / false-Não]:");
        boolean verificacao = input.nextBoolean();
        produto.inserirProduto(verificacao);

        //------------- Inserção dos Ingredientes --------------------


        String lop = "true";
        int contador = 0;
        while (lop.equals("true")) {
            System.out.println("---- Insira os Ingredientes gastos----");

            System.out.print("Tipo de Ingrediente: ");
            ing.setTipoIngred(input.next());

            System.out.print("Quantidade: ");
            ing.setQuantIngred(input.nextInt());

            System.out.print("Valor gasto no ingrediente: ");
            ing.setValor(input.nextInt());

            System.out.print("Gostaria de inserir mais ingredientes?[true-Sim / false-Não]: ");
            lop = input.next();

            contador++;
        }
//----------------------------------------------------------------------------------------------------

        System.out.print("Deseja verificar produto? [true-Sim / false-Não]: ");
        verificacao = input.nextBoolean();

        if (verificacao == true) {
            System.out.println("Nome produto a ser inserido: ");
            String nome = input.next();
            produto.verificarProduto(nome);

            System.out.print("Deseja vender o produto?[true-Sim / false-Não]:");
            verificacao = input.nextBoolean();
            if (verificacao == true) {
                System.out.println("Insira o nome do produto e a sua quantidade:");
                nome = input.next();
                int quantidade = input.nextInt();
                produto.venderProduto(nome, quantidade);
            }

            System.out.print("Deseja excluir produtos?[true-Sim / false-Não]:");
            verificacao = input.nextBoolean();
            if (verificacao == true) {
                System.out.println("Insira o nome do produto a ser deletado:");
                nome = input.next();
                produto.deletarProduto(nome);
            }
        }

        System.out.print("Total de Lucros($) obtidos: ");
        gestao.calcularLucro(produto.getQuantidade(), produto.getValorProduto());

        System.out.println("----------------------------");

        System.out.print("Total de Gastos($) obtidos: ");
        gestao.calcularGastos(ing.getQuantIngred(), ing.getValor());


    }
}