public class ItemPedido {
    private Produto produto;
    private int quantidade;

    // Construtor
    public ItemPedido(Produto produto, int quantidade) {
        this.produto = produto;

        if (quantidade >= 0) {
            this.quantidade = quantidade;
        }
    }

    // Métodos
    public boolean representa(Produto produto) {
        return this.produto == produto;
    }

    public double calcularSubtotal() {
        return quantidade * produto.getPreco();
    }

    public void alterarQuantidade(int novaQuantidade) {
        if (novaQuantidade > 0) {
            quantidade = novaQuantidade;
        }
    }

    public void aumentarQuantidade(int unidades) {
        if (unidades >= 0) {
            quantidade += unidades;
        }
    }

    public void reduzirQuantidade(int unidades) {
        if (quantidade - unidades >= 0) {
            quantidade -= unidades;
        }
    }

    public void exibirDados() {
        // Chama a função criada na classe p/ calcular o subtotal do pedido
        double subtotal = calcularSubtotal();
        
        System.out.printf("- Menu de Itens ---------------\n");
        System.out.printf("Descrição: %s\n", produto.getDescricao());
        System.out.printf("Preço unit.: %.2f\n", produto.getPreco());
        System.out.printf("Quantidade: %d\n", quantidade);
        System.out.printf("Subtotal: %.2f\n", subtotal);
        System.out.printf("-------------------------------\n");
    }
}
