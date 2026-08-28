public class ItemPedido {
    private String descricao;
    private double precoUnitario;
    private int quantidade;

    public ItemPedido(String descricao, double precoUnitario, int quantidade) {
        this.descricao = descricao;
        // Garante que o precoUnitario seja maior ou igual a 0
        if (precoUnitario >= 0) {
            this.precoUnitario = precoUnitario;
        }
        // Garante que a quantidade seja maior ou igual a 0
        if (quantidade >= 0) {
            this.quantidade = quantidade;
        }
    }

    double calcularSubtotal() {
        return precoUnitario * quantidade;
    }

    double aplicarDesconto(int desconto) {
        double subtotal = calcularSubtotal();
        return subtotal - ((subtotal * desconto) / 100);
    }

    public void aumentarQuantidade(int unidades) {
        if (unidades >= 0) {
            quantidade += unidades;
        }
    }

    public void reduzirQuantidade(int unidades) {
        if (unidades > 0 && (quantidade - unidades) >= 0) {
            quantidade -= unidades;
        }
    }

    // Getters
    public String getDescricao() {
        return descricao;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public int getQuantidade() {
        return quantidade;
    }

    void exibirDados() {
        // Chama a função criada na classe p/ calcular o subtotal do pedido
        double subtotal = calcularSubtotal();
        
        System.out.printf("- Menu de Itens ---------------\n");
        System.out.printf("Descrição: %s\n", descricao);
        System.out.printf("Preço unit.: %.2f\n", precoUnitario);
        System.out.printf("Quantidade: %d\n", quantidade);
        System.out.printf("Subtotal: %.2f\n", subtotal);
        System.out.printf("-------------------------------\n");
    }
}

