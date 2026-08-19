public class ItemPedido {
    String descricao;
    double precoUnitario;
    int quantidade;

    double calcularSubtotal() {
        return precoUnitario * quantidade;
    }

    double aplicarDesconto(int desconto) {
        double subtotal = calcularSubtotal();
        return subtotal - ((subtotal * desconto) / 100);
    }

    void aumentarQuantidade(int unidades) {
        quantidade += unidades;
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
