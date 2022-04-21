package ProjetoFinal;

public class Produto {


    private String nome;
    private String validade;
    private double quantidade;
    private double valorProduto;
    private int codigo;
    private String[] listProduto = new String[90];

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {

        this.quantidade = quantidade;
    }

    public double getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(double valorProduto) {

        this.valorProduto = valorProduto;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {

        this.codigo = codigo;
    }

    public void verificarProduto(String nomeProduto) {

        for (int i = 0; i < listProduto.length; i++) {
            if (nomeProduto.equals(listProduto[i])) {
                System.out.println("Produto Encontrado!!");

            }
            break;
        }

    }

    public void inserirProduto(boolean verificacao) {
        if (verificacao == false) {
            System.out.println("Produto não inserido!!");
        } else {
            for (int i = 0; i < getQuantidade(); i++) {
                listProduto[i] = getNome();
            }
        }

    }


    public void deletarProduto(String nomeProduto) {
        for (int i = 0; i < listProduto.length; i++) {
            if (listProduto[i].equals(nomeProduto)) {
                listProduto[i] = null;
            }


        }

    }

    public void venderProduto(String nome, int quantidadeVendida) {
        for (int i = 0; i < quantidadeVendida; i++) {
            if (nome.equals(listProduto[i])) {
                listProduto[i] = null;
                System.out.println("Produto Vendido!");
                break;
            } else {
                System.out.println("Produto não encontrado!");
                break;
            }


        }


    }
}