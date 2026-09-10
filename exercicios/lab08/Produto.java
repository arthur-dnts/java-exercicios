public class Produto {
    private String descricao;
    private double preco;

    // Construtor com validação dos campos
    public Produto(String descricao, double preco) {
        if (descricao != "") {
            this.descricao = descricao;
        }

        if (preco >= 0.0) {
            this.preco = preco;
        }
    }

    // Getters
    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }
}
